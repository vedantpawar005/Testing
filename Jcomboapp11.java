
// Write a program using swing to display a JcomboBox in an applet
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JApplet;

public class Jcomboapp11 extends JApplet implements ItemListener {
    JComboBox<String> cb;
    JLabel l;

    public void init() {
        l = new JLabel("");
        String city[] = { "Solapur", "Pune", "Bangalore", "Mumbai" };
        cb = new JComboBox<>(city);
        setLayout(null);
        cb.setBounds(50, 50, 90, 20);
        l.setBounds(50, 70, 190, 20); // Corrected height to fit the label
        add(cb);
        add(l);
        setSize(400, 200); // Adjusted size for better fit
        cb.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) { // Check for selection change
            String s1 = "You have Selected: ";
            l.setText(s1 + cb.getSelectedItem()); // Simplified to use getSelectedItem()
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example"); // Create a JFrame to host the applet
        Jcomboapp11 applet = new Jcomboapp11();
        frame.add(applet);
        applet.init();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application closes properly
    }
}