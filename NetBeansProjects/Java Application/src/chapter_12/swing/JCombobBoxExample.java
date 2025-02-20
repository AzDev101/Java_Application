
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class JCombobBoxExample {
    public static void main(String[] args) {
       String [] countries = {"Nigeria","Ghana","Togo","Norway","Belgium","USA","China","Brazil","Spain"};
       JFrame frame = new JFrame("Combo Box Demo");
       JComboBox<String> comboBox = new JComboBox<>(countries);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500, 500);
       frame.add(comboBox);
       frame.setVisible(true);
    }
}
