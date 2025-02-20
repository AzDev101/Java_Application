
package chapter_12.swing;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class MenuBarItemExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu bar Item Demo");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("View");
        JMenu menu4 = new JMenu("Navigate");
        JMenu menu5 = new JMenu("Source");
        
        JMenuItem newProject = new JMenuItem("New Project...");
        JMenuItem newFile = new JMenuItem("New File...");
        
        menu1.add(newProject);
        menu1.add(newFile);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);
        
        frame.setJMenuBar(menuBar);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
}
