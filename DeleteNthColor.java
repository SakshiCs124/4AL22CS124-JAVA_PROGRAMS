package github;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNthColor {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Taking input from user for the n-th element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the element to delete (1-based index): ");
        int n = scanner.nextInt();

        // Convert n to 0-based index
        int indexToRemove = n - 1;

        // Check for valid index
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index. No element removed.");
        }

        // Display updated list
        System.out.println("Updated list of colors: " + colors);

        scanner.close();
    }
}
