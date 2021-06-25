/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author natha
 */
public class ConnectDB {
    public static Connection Connect()
     {
            try
            {
                Connection conn = null;
                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/enrollmentsystem;create=true;"
                        + "user=plm;password=123");
                return conn;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
}
