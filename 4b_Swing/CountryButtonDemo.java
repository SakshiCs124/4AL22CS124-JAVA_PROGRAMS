/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label to display the result
        JLabel label = new JLabel("Press a button");

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Add ActionListener for India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Add ActionListener for Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to the frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
