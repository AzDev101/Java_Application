
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JTextFieldExample {
    public static void main(String[] args) {
        //Creating the text field( allows the user to enter a single line of text as an input.)
        JFrame frame = new JFrame("Text Field Demo");
        JTextField textField = new JTextField(50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(textField);
        frame.setVisible(true);
   
    }
}
