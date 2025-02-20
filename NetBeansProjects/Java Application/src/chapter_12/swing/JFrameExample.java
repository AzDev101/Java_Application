
package chapter_12.swing;
import javax.swing.JFrame;


public class JFrameExample {
    public static void main(String[] args) {
        //Setting the frame of the project. FYI a frame is the outermost box of the project.
        JFrame frame = new JFrame("Test Frame"); // sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the Frame entirely after the closed button is clicked
        frame.setSize(500,500); // sets the size of the frame ( width and height)       
        frame.setVisible(true); // Decides wether the frame should be visible or not
        
       /* //Creating a button
        JButton button = new JButton("Click Me");//creates the button(Object)
        frame.add(button);//creates the main button
        frame.setVisible(true);//makes the button visible*/ 
        
        /*Creating a label: A label is a static piece of text that people can read and often copy, but not edit. 
        Labels display text throughout the interface, in buttons, menu items, and views, 
        helping people understand the current context and what they can do next.
        JLabel label1 = new JLabel("Enter first name: ");
        JLabel label2 = new JLabel("Enter Second name: ");
        frame.add(label1);
        frame.add(label2);*/
        
        /*Creating the text field( allows the user to enter a single line of text as an input.)
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        frame.add(textField1); 
        frame.add(textField2);*/
        
    }
 
}
