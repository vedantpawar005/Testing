// Program to display the key pressed on Applet Window.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class keypress14 extends Applet implements KeyListener {
    String msg = "";

    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        try {
            showStatus("Key Pressed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void keyReleased(KeyEvent ke) {
        try {
            showStatus("Key Released");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void keyTyped(KeyEvent k) {
        Font f;
        f = new Font("Monotype Corsiva", Font.BOLD, 30);
        msg += k.getKeyChar();
        setFont(f);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        JFrame fr = new JFrame("Key Pressed");
        keypress14 applet1 = new keypress14();
        applet1.init();
        fr.add(applet1);
        fr.setVisible(true);
        fr.setSize(500, 600);
    }
}