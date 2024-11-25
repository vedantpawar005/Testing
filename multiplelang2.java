
// Develop a program to select multiple languages know to user (Marathi ,Hindi ,English ,Sanskrit)
import java.awt.*;
import java.awt.event.*;

public class multiplelang2 extends Frame implements ItemListener {
    String msg = " ";
    Checkbox c1, c2, c3, c4;

    multiplelang2() {
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        c1 = new Checkbox("MARATHI");
        c2 = new Checkbox("ENGLISH");
        c3 = new Checkbox("HINDI");
        c4 = new Checkbox("SANSKRIT");
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (c1.getState() == true)// && c2.getState()==false && c3.getState()==false && c4.getState()==false)
            msg = c1.getLabel();
        if (c2.getState() == true)
            msg = c2.getLabel();
        if (c3.getState() == true)
            msg = c3.getLabel();
        if (c4.getState() == true)
            msg = c4.getLabel();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("You have selected: " + msg, 100, 100);
    }

    public static void main(String[] args) {
        new multiplelang2(); // Create an instance of the Frame
    }
}
