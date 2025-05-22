/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Image Button Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label to display the result
        JLabel messageLabel = new JLabel("Click an image button");

        // Load images (Make sure the files exist in your project folder)
        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        // Create buttons with images
        JButton digitalButton = new JButton(digitalIcon);
        JButton hourGlassButton = new JButton(hourGlassIcon);

        // Set button tooltips
        digitalButton.setToolTipText("Digital Clock");
        hourGlassButton.setToolTipText("Hour Glass");

        // Action listener for digital clock button
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Action listener for hour glass button
        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to the frame
        frame.add(digitalButton);
        frame.add(hourGlassButton);
        frame.add(messageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
