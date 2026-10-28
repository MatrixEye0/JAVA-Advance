// StringBuilder class is used to create mutable (modifiable) strings, working almost exactly like StringBuffer.
// The core difference is that StringBuilder is not thread-safe (not synchronized). Because it does not have the overhead of thread synchronization, 
// it runs much faster and is the preferred choice for single-threaded applications.

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1. Initialize a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original: " + sb); // Output: Hello

        // 2. append() - Adds text to the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. insert() - Inserts text at a specific index
        sb.insert(5, "Java");
        System.out.println("After insert: " + sb); // Output: HelloJava World

        // 4. replace() - Replaces text between two indices
        sb.replace(5, 9, " Beautiful");
        System.out.println("After replace: " + sb); // Output: Hello Beautiful World

        // 5. delete() - Deletes characters between two indices
        sb.delete(5, 15);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. reverse() - Reverses the character sequence
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH
    }
}
