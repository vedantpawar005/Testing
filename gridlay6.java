
// Program to demonstrate the use of Grid layout.
import java.awt.*;

public class gridlay6 extends Frame {
    Button b;

    gridlay6() {
        setVisible(true);
        setSize(600, 300);
        setLayout(new GridLayout(3, 2, 15, 15));
        for (int i = 1; i <= 5; i++) {
            add(new Button("BUTTON " + Integer.toString(i)));
        }
    }

    public static void main(String[] args) {
        new gridlay6();
    }
}