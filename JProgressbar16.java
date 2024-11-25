// Develop a program to demonstrate the use of JProgressBar

import javax.swing.*;

public class JProgressbar16 extends JFrame {
    JProgressBar pb;

    JProgressbar16() {
        pb = new JProgressBar(0, 2000);
        pb.setBounds(50, 50, 150, 30);
        pb.setValue(0);
        pb.setStringPainted(true);
        add(pb);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        int i = 0;
        try {
            while (i <= 2000) {
                pb.setValue(i);
                Thread.sleep(100);
                i = i + 20;
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new JProgressbar16();
    }
}
