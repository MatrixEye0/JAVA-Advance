import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input placement announcement
        System.out.print("Enter placement announcement: ");
        String initialAnnouncement = scanner.nextLine();

        // Initialize StringBuffer with the input string
        StringBuffer sb = new StringBuffer(initialAnnouncement);

        // 2. Display length
        System.out.println("Length: " + sb.length());

        // 3. Display initial capacity
        System.out.println("Capacity: " + sb.capacity());

        // 4. Ensure capacity (matching the output screenshot where it becomes 130)
        sb.ensureCapacity(130);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 5. Prompt for index to modify
        System.out.print("Enter index to modify (-1 to skip): ");
        int index = scanner.nextInt();
        
        if (index != -1) {
            // Optional modification handling if user inputs a valid index
            scanner.nextLine(); // consume newline
            System.out.print("Enter replacement character/string: ");
            String replacement = scanner.nextLine();
            sb.setCharAt(index, replacement.charAt(0));
        }

        // 6. Append additional details using append() to build the final output
        sb.append("\nCoordinator Contact: 9876543210");
        sb.append("\nInterview Venue: College Auditorium");

        // 7. Display Final Output
        System.out.println("\nFinal Announcement:");
        System.out.println(sb.toString());

        // 8. Display updated length and capacity
        System.out.println("Updated Length: " + sb.length());
        System.out.println("Updated Capacity: " + sb.capacity());

        scanner.close();
    }
}