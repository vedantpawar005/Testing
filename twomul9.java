// Write a program to perform Multiplication of two nos using event.

import java.awt.*;
import java.awt.event.*;

public class twomul9 extends Frame implements ActionListener {
    String msg = ""; // Initialize msg to avoid NullPointerException
    TextField t1, t2, t3;
    Button b;

    twomul9() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        t1 = new TextField(10); // Increased width
        t2 = new TextField(10); // Increased width
        t3 = new TextField(10); // Increased width
        b = new Button("Multiply");
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int n1, n2, Result = 0;
        try {
            n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t2.getText());
            if (ae.getActionCommand().equals("Multiply")) // Use equals for string comparison
                Result = n1 * n2;
            t3.setText(Integer.toString(Result));
            t3.setEditable(false);
        } catch (NumberFormatException e) {
            t3.setText("Invalid Input"); // Handle invalid input
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50); // Adjusted position to avoid drawing off-screen
    }

    public static void main(String[] args) {
        new twomul9();
    }
}