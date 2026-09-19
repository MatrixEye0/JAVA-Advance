import java.util.Scanner;

class Circle {
    int radius;
    double pie = 3.14;
    void area() {
        System.out.println("Area of Circle is " + (pie*radius*radius) );
    }
    void circumference(){
        System.out.println("Circumference of square : "+ (2*pie*radius));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");

        Circle obj = new Circle();
        obj.radius = sc.nextInt(); 
        obj.area();
        obj.circumference();

        sc.close();
    }
    
}
