
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JFileChooser;

public class JFileChooserExample {
    public static void main(String[] args) {
       JFrame frame = new JFrame("File chooser Demo");
       JFileChooser fileChooser = new JFileChooser();
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 500);
       frame.setLocationRelativeTo(null);
       
       frame.add(fileChooser);
       frame.setVisible(true);
    }
}
