class constructor {

    String name;
    int age;
    String role;

    // Constructor
    constructor(String n, int a,String s) {
        name = n;
        age = a;
        role = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {

        // Constructor is called automatically
        constructor s1 = new constructor("Jagjit Singh", 22, "Principle Engineer");

        s1.display();
    }
}