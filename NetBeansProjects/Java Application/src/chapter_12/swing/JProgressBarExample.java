
package chapter_12.swing;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarExample {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Progress Bar Demo");
       JProgressBar progressBar = new JProgressBar(0,100);
       
       progressBar.setValue(40);
       progressBar.setStringPainted(true);
       
       frame.add(progressBar);
       frame.setSize(500,50);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       
    }
 
}
