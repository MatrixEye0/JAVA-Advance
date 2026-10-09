public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Call the custom logic method to reverse the array in-place
        reverse(numbers);

        // Print the reversed array manually without using Arrays.toString()
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Loop until the two pointers meet in the middle
        while (start < end) {
            // Swap elements using a single temporary variable
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers closer to the center
            start++;
            end--;
        }
    }
}
