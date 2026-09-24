// ===============================
// 1. INTERFACE
// ===============================
interface Workable {
    void work();   // abstract method
}


// ===============================
// 2. ABSTRACT CLASS
// ===============================
abstract class Person {

    // Encapsulation: private variables
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Abstract method
    abstract void showRole();

    // Normal method
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// ===============================
// 3. INHERITANCE
// ===============================
class Student extends Person implements Workable {

    private int rollNo;

    // static variable
    static String college = "JIMS Rohini";

    // final variable
    final String course = "MCA";

    // Constructor
    Student(String name, int age, int rollNo) {

        // Calling parent constructor
        super(name, age);

        this.rollNo = rollNo;
    }

    // Method Overriding
    void showRole() {
        System.out.println("Role: Student");
    }

    // Interface method implementation
    public void work() {
        System.out.println("Student is studying.");
    }

    // Method Overloading
    void study() {
        System.out.println("Student is studying Java.");
    }

    void study(int hours) {
        System.out.println("Student studied for " + hours + " hours.");
    }

    void study(String subject) {
        System.out.println("Student is studying " + subject);
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }
}


// ===============================
// 4. ANOTHER CHILD CLASS
// ===============================
class Teacher extends Person implements Workable {

    private String subject;

    Teacher(String name, int age, String subject) {

        super(name, age);

        this.subject = subject;
    }

    // Method Overriding
    void showRole() {
        System.out.println("Role: Teacher");
    }

    // Interface method
    public void work() {
        System.out.println("Teacher is teaching " + subject);
    }
}


// ===============================
// 5. MAIN CLASS
// ===============================
public class Main {

    public static void main(String[] args) {

        // ===============================
        // OBJECT
        // ===============================
        Student s1 = new Student("Jagjit", 22, 101);

        System.out.println("----- STUDENT -----");

        s1.displayStudent();

        System.out.println();


        // ===============================
        // ENCAPSULATION
        // ===============================

        s1.setAge(23);

        System.out.println("Updated Age: " + s1.getAge());

        System.out.println();


        // ===============================
        // METHOD OVERLOADING
        // ===============================

        System.out.println("----- METHOD OVERLOADING -----");

        s1.study();

        s1.study(5);

        s1.study("DSA");

        System.out.println();


        // ===============================
        // ABSTRACTION
        // ===============================

        System.out.println("----- ABSTRACTION -----");

        s1.showRole();

        System.out.println();


        // ===============================
        // INTERFACE
        // ===============================

        System.out.println("----- INTERFACE -----");

        s1.work();

        System.out.println();


        // ===============================
        // INHERITANCE + POLYMORPHISM
        // ===============================

        System.out.println("----- POLYMORPHISM -----");

        Person p1 = new Student("Rahul", 21, 102);

        Person p2 = new Teacher("Amit", 40, "Java");

        p1.showRole();

        p2.showRole();

        System.out.println();


        // ===============================
        // OBJECT OF TEACHER
        // ===============================

        Teacher t1 = new Teacher(
                "Amit",
                40,
                "Java"
        );

        t1.displayPerson();
        t1.showRole();
        t1.work();


        // ===============================
        // STATIC
        // ===============================

        System.out.println();

        System.out.println("College: " + Student.college);


        // ===============================
        // FINAL
        // ===============================

        System.out.println("Course: " + s1.course);
    }
}