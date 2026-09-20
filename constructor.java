class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Constructor is called automatically
        Student s1 = new Student("Jagjit", 22);

        s1.display();
    }
}