class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Stu {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Yash", 101);
            Student s2 = new Student("Harsh", 102);
            s1.display();
            s2.display();

            Class<?> cls = Class.forName("Student");
            Student s3 = (Student) cls.getDeclaredConstructor(String.class, int.class).newInstance("Vijay", 103);
            s3.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
