
// Write a program to create three buttons with captions (OK, Cancel , Reset).
import java.awt.*;

public class buttonokcancel1 extends Frame {
    Button b1, b2, b3;

    buttonokcancel1() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        b1 = new Button("OK");
        b2 = new Button("CANCEL");
        b3 = new Button("RESET");
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String[] args) {
        new buttonokcancel1();
    }
}
