class emp {
    String name, mailid;
    int phone;

    emp(String n, String m, int p) {
        name = n;
        mailid = m;
        phone = p;
    }

    void display() {
        System.out.println(name + mailid + phone);
    }
}

public class employee {
    public static void main(String[] args) {

        emp emp1 = new emp("Vishesh", "Vishesh@96gmail.com", 86451323);
        emp1.display();
        emp emp2 = new emp("Vishesh", "Vishesh@96gmail.com", 86451323);
        emp2.display();
        emp emp3 = new emp("Vishesh", "Vishesh@96gmail.com", 86451323);
        emp3.display();
        emp emp4 = new emp("Vishesh", "Vishesh@96gmail.com", 86451323);
        emp4.display();
        emp emp5 = new emp("Vishesh", "Vishesh@96gmail.com", 86451323);
        emp5.display();

    }
}