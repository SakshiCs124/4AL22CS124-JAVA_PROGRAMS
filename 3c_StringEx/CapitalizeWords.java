package github;

import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+"); // Split the input by spaces
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append the rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Call the capitalizeWords function
        String result = capitalizeWords(userInput);

        // Display the result
        System.out.println("Capitalized sentence: " + result);

        scanner.close();
    }
}
