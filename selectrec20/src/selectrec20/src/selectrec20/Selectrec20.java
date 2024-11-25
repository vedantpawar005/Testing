package selectrec20.src.selectrec20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Selectrec20 {
    public static void main(String args[]) {
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "Meet", "Meet");
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            System.out.print(" Name " + "  Rollno " + "Marks ");
            while (rs.next()) {
                System.out.println();
                System.out.print(rs.getString(1) + "  |   ");
                System.out.print(rs.getInt(2) + "  |  ");
                System.out.print(rs.getInt(3) + "  |  ");
            }
            System.out.println();
        } catch (Exception ee) {
            System.out.println(ee);
        }
    }
}