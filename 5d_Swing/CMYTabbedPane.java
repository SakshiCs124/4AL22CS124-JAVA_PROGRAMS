/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/

package swing;

import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane {

    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("CMY Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Cyan panel
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        // Create Magenta panel
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        // Create Yellow panel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add panels to the tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
