package chapter_12.swing;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;


public class JRadioButtonExample {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Radio Button Demo"); 
       JRadioButton radioButton1 = new JRadioButton("Male"); 
       JRadioButton radioButton2 = new JRadioButton("Female"); 
       JRadioButton radioButton3 = new JRadioButton("Others"); 
       ButtonGroup buttonGroup = new ButtonGroup();
       JPanel panel = new JPanel();
       
       buttonGroup.add(radioButton1);
       buttonGroup.add(radioButton2);
       
       panel.add(radioButton1);
       panel.add(radioButton2);
       
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 500);
       frame.add(panel);
       frame.setVisible(true);
       
       
    }
  
}
