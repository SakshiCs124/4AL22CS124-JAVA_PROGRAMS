/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package github;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2
        colors.add("Yellow");  // index 3

        // Display original list
        System.out.println("Original LinkedList: " + colors);

        // Swap first (index 0) and third (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display updated list
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
