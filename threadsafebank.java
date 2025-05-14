import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class Account {
    private int balance;
    private final Lock lock = new ReentrantLock();

    public Account(int initial) {
        balance = initial;
    }

    public boolean withdraw(int amt) {
        if (lock.tryLock()) {
            try {
                if (balance >= amt) {
                    balance -= amt;
                    return true;
                }
                return false;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public void deposit(int amt) {
        lock.lock();
        try {
            balance += amt;
        } finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public Lock getLock() {
        return lock;
    }
}

public class threadsafebank {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account(10_000);
        Account b = new Account(10_000);

        Runnable transferAB = () -> transfer(a, b, 1, 10_000);
        Runnable transferBA = () -> transfer(b, a, 1, 10_000);

        Thread t1 = new Thread(transferAB, "A→B");
        Thread t2 = new Thread(transferBA, "B→A");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("Final Balances: A=%d, B=%d%n", a.getBalance(), b.getBalance());
    }

    static void transfer(Account from, Account to, int amt, int reps) {
        for (int i = 0; i < reps; i++) {
            while (true) {
                if (from.getLock().tryLock()) {
                    try {
                        if (to.getLock().tryLock()) {
                            try {
                                if (from.withdraw(amt)) {
                                    to.deposit(amt);
                                }
                                break;
                            } finally {
                                to.getLock().unlock();
                            }
                        }
                    } finally {
                        from.getLock().unlock();
                    }
                }
                // back off a bit
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ignored) {
                }
            }
        }
        System.out.printf("%s done%n", Thread.currentThread().getName());
    }
}
