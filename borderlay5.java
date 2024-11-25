
// Program to demonstrate the use of Border layout.
import java.awt.*;

public class borderlay5 extends Frame {
    borderlay5() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(600, 600);
        add("North", new Button("North"));
        add("South", new Button("South"));
        add("East", new Button("East"));
        add("West", new Button("West"));
        add("Center", new Button("Center"));
    }

    public static void main(String[] args) {
        new borderlay5();
    }
}