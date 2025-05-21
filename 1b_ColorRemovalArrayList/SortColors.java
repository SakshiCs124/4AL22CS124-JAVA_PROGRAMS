package github;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        // Displaying the original list
        System.out.println("Original list of colors: " + colors);

        // Sorting the list using Collections.sort()
        Collections.sort(colors);

        // Displaying the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
