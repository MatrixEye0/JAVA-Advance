public class StringBufferDemo {
    public static void main(String[] args) {
        // 1. Initialize a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb); // Output: Hello

        // 2. append() - Adds text to the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. insert() - FIXED: Added quotation marks around "Java"
        sb.insert(6, "Java");
        System.out.println("After insert: " + sb); // Output: HelloJava World

        // 4. replace() - Replaces text from start index (inclusive) to end index (exclusive)
        sb.replace(0, 9, " Beautiful");
        System.out.println("After replace: " + sb); // Output: Hello Beautiful World

        // 5. delete() - Deletes characters between two indices
        sb.delete(5, 15);
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. reverse() - Reverses the sequence of characters
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH
    }
}
