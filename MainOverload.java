public class MainOverload {
    public static void main(String msg) {
        System.out.println("Standard execution main method.");
    }
    public static void main(int a) {
        System.out.println("Overloaded main method with int: " + a);
    }
    public static void main(String[] args) {
        System.out.println("Overloaded main method with String: ");
    } // here this run first because execution start with Strings[]
}

