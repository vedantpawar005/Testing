/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empaddrec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Empaddrec21 {
    public static void main(String args[]) {
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "Meet", "Meet");
            Statement st = c.createStatement();
            int i = st.executeUpdate("insert into EMPOLYEE values('Aashu',2511,500000)");
            ResultSet rs = st.executeQuery("select * from EMPOLYEE");
            System.out.print(" Name " + "  Empid " + "Salary ");
            while (rs.next()) {
                System.out.println();
                System.out.print(rs.getString(1) + "  |  ");
                System.out.print(rs.getInt(2) + "  |  ");
                System.out.print(rs.getInt(3) + "  |  ");
            }
            System.out.println();
        } catch (Exception ee) {
            System.out.println(ee);
        }
    }
}