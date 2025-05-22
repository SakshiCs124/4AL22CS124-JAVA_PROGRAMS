/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package github;

import java.util.Scanner;

public class StringReversal {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        // Call the reverseString() function
        String reversed = reverseString(original);

        // Display result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
