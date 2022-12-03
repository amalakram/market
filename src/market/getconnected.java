/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author user
 */
public class getconnected {
    public static Connection connectDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:super market.db");
            JOptionPane.showMessageDialog(null, "connect");
            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    
    
    


    
    
}   
    
    