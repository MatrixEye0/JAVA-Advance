import java.util.Scanner;

class College {
    String collegeName;
    String studentName;
    int rollNo;

    Scanner sc = new Scanner(System.in);

    // Method to take college/student input
    void input() {
        System.out.print("Enter College Name: ");
        collegeName = sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    // Method to display college/student details
    void show() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
    }
}

// MCA extends College
class MCA extends College {

    String[] subjectName;
    void mcaInput() {
        int a;
        System.out.print("Enter total Subjects: ");
        a = sc.nextInt();
        sc.nextLine();
        subjectName = new String[a];
        for (int n = 0; n < a; n++) {
            System.out.print("Enter Subject " + (n + 1) + ": ");
            subjectName[n] = sc.nextLine();
        }
    }
    void mcaShow() {
        show();
        System.out.println("Subjects:");
        for (int n = 0; n < subjectName.length; n++) {
            System.out.println((n + 1) + ". " + subjectName[n]);
        }
    }
}

// Main class
 class Inheritance {
    public static void main(String[] args) {

        MCA student = new MCA();

        student.input();       // College class method
        student.mcaInput();   // MCA class method

        System.out.println("--- Student Details ---");

        student.mcaShow();    // Display all details
    }
}

