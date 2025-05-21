package github;

import java.util.Scanner;

public class WhitespaceRemover {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the removeWhitespace function
        String result = removeWhitespace(userInput);

        // Display the result
        System.out.println("String after removing whitespaces: " + result);

        scanner.close();
    }
}
