/*2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package github;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Creating a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Display original list
        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        // Display updated list
        System.out.println("Updated LinkedList after inserting 'Pink' at the end: " + colors);
    }
}
