
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class JProgressBarExample {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Progress Bar Demo");
       JProgressBar progressBar = new JProgressBar(0,100);
       JPanel panel = new JPanel();
       
       progressBar.setValue(50);
       progressBar.setStringPainted(true);
       
       panel.add(progressBar);
       
      
       frame.add(panel);
       frame.setSize(500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       
    }
 
}
