package github;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // Step 1: Creating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Step 1: Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // Step 2: Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // Step 3: Adding multiple elements
        List<String> newFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(newFruits);
        linkedList.addAll(newFruits);

        // Step 4: Accessing elements
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

        // Step 5: Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");

        // Step 6: Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // Step 7: Searching elements
        System.out.println("Contains Mango in ArrayList? " + arrayList.contains("Mango"));
        System.out.println("Contains Mango in LinkedList? " + linkedList.contains("Mango"));

        // Step 8: List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // Step 9: Iterating using for-each loop
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("LinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Step 10: Using Iterator
        System.out.println("Iterating ArrayList using Iterator:");
        Iterator<String> itr1 = arrayList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("Iterating LinkedList using Iterator:");
        Iterator<String> itr2 = linkedList.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Step 11: Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // Step 12: Sublist
        List<String> subArrayList = arrayList.subList(1, 3);
        List<String> subLinkedList = linkedList.subList(1, 3);
        System.out.println("Sublist of ArrayList: " + subArrayList);
        System.out.println("Sublist of LinkedList: " + subLinkedList);

        // Step 13: Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}

