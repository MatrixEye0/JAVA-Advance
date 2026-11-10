
class firstThread extends Thread {
    // this is conatructor and they call automatically when we create the object of the class so thread will start automatically
    firstThread() {
        // start automatically calls the run() method
        start();
    }
// child thread 
    public void run() {
        for (int i = 1; i <= 52; i++) {
          System.out.print(i);  
        }
    }

    // both threads run simultaneously and we can see the output of both threads in the console
    public static void main(String[] args) {
        firstThread t = new firstThread();
        // parent thread
         for (char c = 'A'; c <='Z'; c++) {
            System.out.print(c);
    }
}
}