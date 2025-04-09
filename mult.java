class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher {
    String subject;

    Teacher(String subject) {
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Subject: " + subject);
    }
}

public class mult {
    public static void main(String[] args) {
        Student stu = new Student("Vishesh", 20, 101);
        Teacher teach = new Teacher("Mathematics");
        System.out.println("Student Details:");
        stu.displayStudent();

        System.out.println("\nTeacher Details:");
        teach.displayTeacher();
    }
}