package github;

import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Remove non-alphabetic characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Check palindrome using user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring case and punctuation).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
