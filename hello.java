
abstract class mca {
    abstract void display();
}

interface mca2 {
    void display2();
}

interface mca3 {
    void display3();
}

class hello extends mca implements mca2, mca3 {

    void display() {
        System.out.println("Hello World");
    }

    public void display2() {
        System.out.println("Hello Nobody");
    }

    void display3(){
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        hello obj = new hello();
        obj.display();
        obj.display2();
    }
}
