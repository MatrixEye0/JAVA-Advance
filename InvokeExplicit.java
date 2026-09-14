class InvokeExplicit {
    public static void main(String args[]) {
        System.out.println("Welcome 1");
            }
}
class Two {
    public static void main(String args[]) {
        System.out.println("Welcome 2");
        InvokeExplicit.main(args);
    }
}

