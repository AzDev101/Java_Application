
package chapter_12.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Demo"); 
        JTextArea textArea = new JTextArea(2,20); 
        JLabel label = new JLabel("Message"); 
        JPanel panel = new JPanel(); 
        JScrollPane scrollBar = new JScrollPane(textArea);
        
        panel.setBackground(Color.GRAY);
        panel.add(label);
        panel.add(scrollBar);
       
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        
        
    }
 
}
