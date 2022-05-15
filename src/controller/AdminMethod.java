package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminMethod { 

    Connection connection = Database.connect();
    private String sql;
    
    public AdminMethod() {
        //Database.connect();
    }

    public void add(Admin admin) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into Admin values(?,?,?)");
            add.setInt(1, admin.getID());
            add.setString(2, admin.getName());
            add.setString(3, admin.getPassword());
            add.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfuly Created!\nGo To Login.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void edit(Admin admin, javax.swing.JTable table) {
        try {
            sql = "Update Admin set name='" + admin.getName() + "' ,id='" + admin.getID() + "' ,password='" + admin.getPassword() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void delete(Admin admin, javax.swing.JTable table) {
        try {
            sql = "Delete from Admin where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
