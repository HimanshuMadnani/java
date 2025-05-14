class tablePrinter implements Runnable {
    private int number;

    public tablePrinter(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table of " + number + ": " + number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new tablePrinter(5));
        Thread t2 = new Thread(new tablePrinter(7));

        t1.start();
        t2.start();
    }
}
