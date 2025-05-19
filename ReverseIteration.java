package github;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIteration {
    public static void main(String[] args) {
        // Creating a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original LinkedList: " + colors);

        // Iterating in reverse order using descendingIterator()
        Iterator<String> reverseIterator = colors.descendingIterator();

        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
