/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studupdatem22.src.studupdatem22;

import java.sql.*;

public class Studupdatem22 {
    public static void main(String[] args) {
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "Meet", "Meet");
            Statement st = c.createStatement();
            int i = st.executeUpdate("update student set SNAME='vedant' where ROLLNO=2");
            System.out.println("no of rows deleted " + i);
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
