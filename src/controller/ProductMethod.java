package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductMethod {

    Connection connection = Database.connect();
    private String sql;
    
    public ProductMethod() {

    }

    public void add(Product product, javax.swing.JTable table) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into product values(?,?,?,?,?,?)");
            
            add.setInt(1, product.getID());
            add.setString(2, product.getName());
            add.setInt(3, product.getPrice());
            add.setInt(4, product.getQuantity());
            add.setString(5, product.getDescription());
            add.setString(6, product.getCategory().getSelectedItem().toString());
            add.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void edit(Product product, javax.swing.JTable table) {
        try {
            sql = "Update product set name='" + product.getName() + "' ,id='" + product.getID() +  "' ,price='" + product.getPrice() + "' ,quantity='" + product.getQuantity() + "' ,description='" + product.getDescription() +  "' ,category='" + product.getCategory().getSelectedItem().toString() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(Product product, javax.swing.JTable table) {
        try {
            sql = "Delete from Product where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
                        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
