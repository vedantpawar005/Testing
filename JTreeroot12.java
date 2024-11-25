
// Write a Jtree program to show root directory and its subFolders of your System.
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

public class JTreeroot12 extends JFrame {
    JTree tree;

    JTreeroot12() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(600, 600);
        DefaultMutableTreeNode Top = new DefaultMutableTreeNode("System", true);
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("C:");
        Top.add(A);
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("D:");
        Top.add(B);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Windows");
        A.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Users");
        A.add(a2);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Java");
        B.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Python");
        B.add(b2);
        tree = new JTree(Top);
        Container con = getContentPane();
        con.add(tree, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JTreeroot12 h = new JTreeroot12();
    }
}
