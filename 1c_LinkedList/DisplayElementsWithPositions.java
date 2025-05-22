/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package github;

import java.util.LinkedList;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display elements with their positions using get(index)
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
