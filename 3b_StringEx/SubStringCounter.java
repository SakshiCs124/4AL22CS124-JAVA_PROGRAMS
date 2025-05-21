package github;

import java.util.Scanner;

public class SubStringCounter {

    // User-defined function to count occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        // Call user-defined function
        int occurrences = countOccurrences(mainString, subString);

        // Display result
        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times.");

        scanner.close();
    }
}
