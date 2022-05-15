package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CategoryMethod {

    Connection connection = Database.connect();
    private String sql;
    
    public CategoryMethod() {
        //Database.connect();
    }

    public void add(Category Category, javax.swing.JTable table) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into category values(?,?)");

            add.setInt(1, Category.getID());
            add.setString(2, Category.getName());
            add.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void edit(Category Category, javax.swing.JTable table) {
        try {
            sql = "Update category set name='" + Category.getName() + "' ,id='" + Category.getID() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(Category Category, javax.swing.JTable table) {
        try {
            sql = "Delete from category where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
