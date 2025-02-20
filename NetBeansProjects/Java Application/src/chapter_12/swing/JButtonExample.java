
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonExample {
    public static void main(String[] args) {
        //Creating a button
        JFrame frame = new JFrame("Button Demo");
        JButton button = new JButton("Click Me");//creates the button(Object)
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setVisible(true);//makes the button visible
    }
  
}
