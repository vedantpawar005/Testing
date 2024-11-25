
// Develop  an applet using List components to add names of 10 different cities.
import java.awt.*;

public class diff10cities4 extends Frame {
    diff10cities4() {
        setSize(200, 300);
        setVisible(true);
        List l = new List(10, true);
        l.add("Pune");
        l.add("Mumbai");
        l.add("Chennai");
        l.add("Delhi");
        l.add("Kolhapur");
        l.add("Sangli");
        l.add("Satara");
        l.add("Bangolre");
        l.add("Nashik");
        l.add("Lonavala");
        add(l);
    }

    public static void main(String[] args) {
        new diff10cities4();
    }
}
