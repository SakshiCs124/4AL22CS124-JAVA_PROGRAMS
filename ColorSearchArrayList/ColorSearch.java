//Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not

package github;

import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");

        // Displaying the colors
        System.out.println("List of colors: " + colors);

        // Searching for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}

