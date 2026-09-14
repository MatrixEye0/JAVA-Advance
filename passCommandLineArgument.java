public class passCommandLineArgument {
    public static void main(String[] args) {

        System.out.println("Inside One");

        // Pass command-line arguments to Two
        Two.main(args);
    }
}

class second {
    public static void main(String[] args) {

        System.out.println("Inside Two");

        System.out.println("Argument 1: " + args[0]);
        System.out.println("Argument 2: " + args[1]);
    }
}