/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/
package swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Country Selector");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList with multiple selection
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {  // Avoid duplicate triggers
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected countries:");
                    for (String country : selected) {
                        System.out.println(country);
                    }
                    System.out.println("--------");
                }
            }
        });

        // Add to frame
        frame.add(scrollPane);

        // Set frame visible
        frame.setVisible(true);
    }
}

