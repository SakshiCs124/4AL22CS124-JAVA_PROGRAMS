/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package swing;
import javax.swing.*;
import java.awt.*;
import javax.swing.SwingConstants;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Welcome Message");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: Font(name, style, size)
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame
        frame.add(label);

        // Set frame size and close operation
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true); // Make it visible
    }
}
