
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelExample {
    public static void main(String[] args) {
        /*Creating a label: A label is a static piece of text that people can read and often copy, but not edit. 
        Labels display text throughout the interface, in buttons, menu items, and views, 
        helping people understand the current context and what they can do next.*/
        JFrame frame = new JFrame("Label Demo");
        JLabel label = new JLabel("Learning Java is Fun",SwingConstants.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        
    }
}
