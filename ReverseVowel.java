import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseVowel {

    // Store all vowels (lowercase + uppercase)
    private static final Set<Character> VOWELS = new HashSet<>(
        Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        )
    );

    // Method to reverse only vowels in a string
    public String reverseVowels(String s) {

        // Convert String into character array
        // Because String is immutable in Java
        char[] chars = s.toCharArray();

        // Two pointers
        int left = 0;
        int right = chars.length - 1;

        // Continue until both pointers meet
        while (left < right) {

            // Move left pointer until it finds a vowel
            while (left < right && !VOWELS.contains(chars[left])) {
                left++;
            }

            // Move right pointer until it finds a vowel
            while (left < right && !VOWELS.contains(chars[right])) {
                right--;
            }

            // Swap the vowels at left and right positions
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers towards the center
            left++;
            right--;
        }

        // Convert character array back into String
        return new String(chars);
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        // Create object of class
        ReverseVowel obj = new ReverseVowel();

        // Call method and store result
        String result = obj.reverseVowels(input);

        // Display output
        System.out.println("Original String: " + input);
        System.out.println("Reversed Vowels: " + result);

        sc.close();
    }
}
