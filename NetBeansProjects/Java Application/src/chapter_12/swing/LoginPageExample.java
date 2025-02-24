
package chapter_12.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;


public class LoginPageExample {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Login Page Demo");
       JPanel panel = new JPanel(); 
       
       JLabel label = new JLabel("LOGIN PAGE");
       
       JLabel label1 = new JLabel("First Name");
       JTextArea textArea = new JTextArea(2,35);
       
       JLabel label2 = new JLabel("Last Name"); 
       JTextArea textArea2 = new JTextArea(2,35); 
       
       JLabel label3 = new JLabel("Email Address");
       JTextArea textArea3 = new JTextArea(2,35); 
       
       JLabel label4 = new JLabel("Password");
       JPasswordField passwordField = new JPasswordField();      
       passwordField.setPreferredSize(new Dimension(500, 30)); // Preferred width 200, height 30
       passwordField.setColumns(30); // Hint of 20 character widths
       
       JLabel label5 = new JLabel("Confirm Password");
       JPasswordField passwordField2 = new JPasswordField();      
       passwordField2.setPreferredSize(new Dimension(500, 30)); // Preferred width 200, height 30
       passwordField2.setColumns(30); // Hint of 20 character widths
      
       JPanel radioButtonPanel = new JPanel(new FlowLayout()); 
       TitledBorder border = BorderFactory.createTitledBorder("Select Gender"); // The title you want 
       radioButtonPanel.setBorder(border);
       ButtonGroup genderGroup = new ButtonGroup();
       JRadioButton maleradioButton = new JRadioButton("Male"); 
       JRadioButton femaleradioButton = new JRadioButton("Female"); 
       JRadioButton otherradioButton = new JRadioButton("Others"); 
       
       genderGroup.add(maleradioButton);
       genderGroup.add(femaleradioButton);
       genderGroup.add(otherradioButton);
        
       radioButtonPanel.add(maleradioButton);
       radioButtonPanel.add(femaleradioButton);
       radioButtonPanel.add(otherradioButton);
       
       panel.add(label);
       panel.add(label1);
       panel.add(textArea);
       panel.add(label2);
       panel.add(textArea2);
       panel.add(label3);
       panel.add(textArea3);
       panel.add(label4);
       panel.add(passwordField); 
       panel.add(label5);
       panel.add(passwordField2); 
       panel.setBackground(Color.GRAY);
       panel.add(radioButtonPanel);
       
       
       String [] countries = {"Nigeria","Ghana","Togo","Norway","Belgium","USA","China","Brazil","Spain","Italy","Cameroon","France","Egypt","Ukraine","Russia",
       "Turkey","India","Pakistan","Afghanistan"};
       JComboBox<String> comboBox = new JComboBox<>(countries);
       panel.add(comboBox);
       
       JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");
       panel.add(checkBox);
       
       JButton button = new JButton("Login");//creates the button(Object)
       panel.add(button);
       
       frame.setSize(500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(panel);
       frame.setVisible(true);
       
       
       
    }
}
