package github;

import java.util.Scanner;

public class WordCounter {

    // User-defined function to count words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces using regex
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Count words using user-defined function
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
