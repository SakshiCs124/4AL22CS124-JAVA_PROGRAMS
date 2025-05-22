/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package github;

import java.util.Scanner;

public class StringTruncator {

    // User-defined function to truncate string and add ellipsis
    public static String truncate(String input, int length) {
        if (input.length() <= length) {
            return input; // Return the string as is if it's shorter or equal to the desired length
        } else {
            return input.substring(0, length) + "..."; // Truncate and add ellipsis
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Get the desired length from the user
        System.out.print("Enter the length to truncate to: ");
        int length = scanner.nextInt();

        // Call the truncate function
        String result = truncate(userInput, length);

        // Display the result
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}

