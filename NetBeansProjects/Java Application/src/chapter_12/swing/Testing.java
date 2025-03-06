
package chapter_12.swing;

import javax.swing.*;
import java.awt.*;

public class Testing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Center Panel Content");
        JPanel panel = new JPanel(new GridBagLayout()); // Use GridBagLayout

        JLabel label = new JLabel("Centered Label");
        JButton button = new JButton("Center Button");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1; // Allow horizontal expansion
        gbc.weighty = 1; // Allow vertical expansion
        gbc.anchor = GridBagConstraints.CENTER; // Center the component

        panel.add(label, gbc);

        gbc.gridy = 1;
        panel.add(button, gbc);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 

