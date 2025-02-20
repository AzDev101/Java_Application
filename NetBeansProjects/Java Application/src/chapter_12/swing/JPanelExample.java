
package chapter_12.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

//A panel is like a container where you organise other components on the JFrame.
//So we'll add the components to the panel and then add the panel to the frame.
public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Demo");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("First Name: ");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click Me");
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.setBackground(Color.GRAY);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
