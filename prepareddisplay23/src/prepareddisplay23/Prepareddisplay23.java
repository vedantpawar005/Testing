/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepareddisplay23.src.prepareddisplay23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prepareddisplay23 {
    public static void main(String args[]) {
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/student", "Meet", "Meet");
            PreparedStatement st = c.prepareStatement("select * from STUDENT");
            ResultSet rs = st.executeQuery();
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