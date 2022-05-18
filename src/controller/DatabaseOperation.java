package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;
import model.Admin;
import model.Product;

public class  DatabaseOperation {
    
    Connection connection = Database.connect();

  
    
    
    public void edit(String sql) {
        try {
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void delete(String sql) {
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
