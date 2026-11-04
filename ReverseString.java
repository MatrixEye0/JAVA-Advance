import java.util.Scanner;
class ReverseString {
    public String reverseWords(String s) {

        // Split string into individual words
        String[] words = s.split(" ");

        // Store the final result
        StringBuilder result = new StringBuilder();

        // Traverse each word
        for (int i = 0; i < words.length; i++) {

            // Reverse the current word
            String reversedWord = new StringBuilder(words[i]).reverse().toString();

            // Append reversed word to result
            result.append(reversedWord);

            // Add space only between words
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        // Convert StringBuilder into String
        return result.toString();
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse the words:");
        s = sc.nextLine();
        System.out.println(obj.reverseWords(s));
    }
}