/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package github;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original list of colors: " + colors);

        // Removing the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed 2nd element (index 1): " + removedElement);
        } else {
            System.out.println("List has fewer than 2 elements. Cannot remove index 1.");
        }

        // Removing color "Blue" by value
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Color 'Blue' was removed.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
