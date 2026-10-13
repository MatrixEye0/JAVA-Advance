import java.util.Scanner;

class Employee {
    static Scanner sc = new Scanner(System.in);

    int empId;
    String name;
    String department;
    double basicSalary;

    void acceptData() {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
    void displayData() {
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
    double charges_daily;
    int no_of_days;
    boolean sportsClub;

    void acceptClubDetails() {
        System.out.print("Join Office Sports Club? (true/false): ");
        sportsClub = sc.nextBoolean();

        if (sportsClub) {
            System.out.print("Enter Daily Club Charges: ");
            charges_daily = sc.nextDouble();

            System.out.print("Enter Number of Days: ");
            no_of_days = sc.nextInt();
        }
    }

    void calculateSalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        bonus = basicSalary * 0.05;

        grossSalary = calculateBasicSalary() + hra + da + bonus;
    }
    double Payment() {
        if (sportsClub) {
            return charges_daily * no_of_days;
        }
        return 0;
    }

    void Deduction() {
        grossSalary = grossSalary - Payment();
    }

    void displaySalary() {
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Bonus (5%): " + bonus);
        System.out.println("Club Fee: " + Payment());
        System.out.println("Final Salary: " + grossSalary);
    }
}

class ContractEmployee extends Employee {
    int workingDays;
    double dailyRate;
    double salary;

    void acceptContractDetails() {
        System.out.print("Enter Working Days: ");
        workingDays = sc.nextInt();

        System.out.print("Enter Daily Rate: ");
        dailyRate = sc.nextDouble();
    }

    void calculateSalary() {
        salary = workingDays * dailyRate;
    }

    void displaySalary() {
        System.out.println("Working Days: " + workingDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Salary: " + salary);
    }
}

public class emp {
    public static void main(String[] args) {

        PermanentEmployee p1 = new PermanentEmployee();
        PermanentEmployee p2 = new PermanentEmployee();

        ContractEmployee c1 = new ContractEmployee();
        ContractEmployee c2 = new ContractEmployee();

        System.out.println("\n--- Permanent Employee 1 ---");
        p1.acceptData();
        p1.acceptClubDetails();

        System.out.println("\n--- Permanent Employee 2 ---");
        p2.acceptData();
        p2.acceptClubDetails();

        System.out.println("\n--- Contract Employee 1 ---");
        c1.acceptData();
        c1.acceptContractDetails();

        System.out.println("\n--- Contract Employee 2 ---");
        c2.acceptData();
        c2.acceptContractDetails();
        p1.calculateSalary();
        p1.Deduction();
        p2.calculateSalary();
        p2.Deduction();
        c1.calculateSalary();
        c2.calculateSalary();

        System.out.println("\n===== PERMANENT EMPLOYEE 1 =====");
        p1.displayData();
        p1.displaySalary();

        System.out.println("\n===== PERMANENT EMPLOYEE 2 =====");
        p2.displayData();
        p2.displaySalary();

        System.out.println("\n===== CONTRACT EMPLOYEE 1 =====");
        c1.displayData();
        c1.displaySalary();

        System.out.println("\n===== CONTRACT EMPLOYEE 2 =====");
        c2.displayData();
        c2.displaySalary();

        scClose();
    }

    static void scClose() {
        Employee.sc.close();
    }
}
