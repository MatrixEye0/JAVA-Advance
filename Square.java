import java.util.Scanner;
class Square {
    int side;
    void area() {
        System.out.println("Area of Square is " + (side * side));
    }
    void parameter(){
        System.out.println("Parameter of square : "+ side*4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side of Square : ");

        Square obj = new Square();
        obj.side = sc.nextInt(); 
        obj.area();
        obj.parameter();

        sc.close();
    }
}