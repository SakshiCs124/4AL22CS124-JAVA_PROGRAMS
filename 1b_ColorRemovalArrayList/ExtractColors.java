package github;

import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {
        // Creating an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Displaying the original list
        System.out.println("Original list of colors: " + colors);

        // Extracting 1st and 2nd elements using subList (index 0 and 1)
        List<String> subList = colors.subList(0, 2);

        // Displaying the extracted sublist
        System.out.println("Extracted elements (1st and 2nd): " + subList);
    }
}
