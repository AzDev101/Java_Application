package chapter_12.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Insets; // Import Insets for padding
import javax.swing.JOptionPane;

public class LoginPageExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page Demo");
        JPanel panel = new JPanel(new GridBagLayout()); // Use GridBagLayout

        JLabel label = new JLabel("Sign-Up Page");
        Font largerFont = new Font("Arial", Font.BOLD, 24);
        label.setFont(largerFont);

        JLabel firstName = new JLabel("First Name");
        JTextField textArea = new JTextField(35);

        JLabel lastName = new JLabel("Last Name");
        JTextField textArea2 = new JTextField(35);

        JLabel emailAddress = new JLabel("Email Address");
        JTextField textArea3 = new JTextField(35);

        JLabel password = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(500, 30));
        passwordField.setColumns(30);

        JLabel confirmPassword = new JLabel("Confirm Password");
        JPasswordField passwordField2 = new JPasswordField();
        passwordField2.setPreferredSize(new Dimension(500, 30));
        passwordField2.setColumns(30);

        JPanel radioButtonPanel = new JPanel(new GridBagLayout()); //GridBagLayout for the radio buttons
        TitledBorder border = BorderFactory.createTitledBorder("Select Gender");
        radioButtonPanel.setBorder(border);
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleradioButton = new JRadioButton("Male");
        JRadioButton femaleradioButton = new JRadioButton("Female");
        JRadioButton otherradioButton = new JRadioButton("Others");

        genderGroup.add(maleradioButton);
        genderGroup.add(femaleradioButton);
        genderGroup.add(otherradioButton);

        // Add radio buttons to radioButtonPanel with GridBagConstraints
        GridBagConstraints radioGbc = new GridBagConstraints();
        radioGbc.gridx = 0;
        radioGbc.gridy = 0;
        radioButtonPanel.add(maleradioButton, radioGbc);

        radioGbc.gridx = 1;
        radioButtonPanel.add(femaleradioButton, radioGbc);

        radioGbc.gridx = 2;
        radioButtonPanel.add(otherradioButton, radioGbc);

        String[] countries = {"Select Country of Residence","Nigeria", "Ghana", "Togo", "Norway", "Belgium", "USA", "China", "Brazil", "Spain", "Italy", "Cameroon", "France", "Egypt", "Ukraine", "Russia",
                "Turkey", "India", "Pakistan", "Afghanistan"};
        JComboBox<String> comboBox = new JComboBox<>(countries);

        JCheckBox checkBox = new JCheckBox("I have read and agreed to your Terms and Conditions");

        JButton button = new JButton("Sign Up");
 
        // Add components to the main panel with GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Span two columns for the title
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        panel.add(label, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1; // Reset to one column
        gbc.anchor = GridBagConstraints.WEST; // Align labels to the left
        panel.add(firstName, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST; // Align text fields to the left
        panel.add(textArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(lastName, gbc);

        gbc.gridx = 1;
        panel.add(textArea2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(emailAddress, gbc);

        gbc.gridx = 1;
        panel.add(textArea3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(password, gbc);

        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(confirmPassword, gbc);

        gbc.gridx = 1;
        panel.add(passwordField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2; // Span two columns for the radio button panel
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(radioButtonPanel, gbc);

        gbc.gridy = 7;
        panel.add(comboBox, gbc);

        gbc.gridy = 8;
        panel.add(checkBox, gbc);

        gbc.gridy = 9;
        panel.add(button, gbc);

        panel.setBackground(Color.white);

        frame.setSize(800, 800); //Adjusted frame size.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}