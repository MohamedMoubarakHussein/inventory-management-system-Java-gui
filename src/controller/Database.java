package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Database {
        
    private static Connection connection = null;
    
   
    
    public static Connection connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            return connection;
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
