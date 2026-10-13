
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double basicSalary;

    Scanner sc = new Scanner(System.in);

    void acceptData() {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
    }

    double calculateBasicSalary() {
        return basicSalary;
    }
}

class PermanentEmployee extends Employee {
    double hra, da, bonus, grossSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        bonus = basicSalary * 0.05;

        grossSalary = calculateBasicSalary() + hra + da + bonus;
    }


    void displaySalary() {
        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Bonus (5%): " + bonus);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Salary {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee();

        emp.acceptData();
        emp.calculateSalary();
        emp.displayData();
        emp.displaySalary();
    }
}
