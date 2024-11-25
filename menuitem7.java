// Write a program which creates Menu of different colors and disable menu item for Black color.

import java.awt.*;

public class menuitem7 extends Frame {
    menuitem7() {
        setTitle("MenuBar Demo");
        setSize(500, 500);
        setLayout(null);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu mf = new Menu("BLACK");
        mb.add(mf);
        Menu ml = new Menu("BLUE");
        mb.add(ml);
        Menu ma = new Menu("GREEN");
        mb.add(ma);
        Menu mg = new Menu("RED");
        mb.add(mg);
        MenuItem mc = new MenuItem("GRAY");
        mf.add(mc);
        mc.setEnabled(false);
    }

    public static void main(String[] args) {
        menuitem7 md = new menuitem7();
        md.setVisible(true);
    }
}