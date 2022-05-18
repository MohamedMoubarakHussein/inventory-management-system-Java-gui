package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ProductMethod {

    Connection connection = Database.connect();
    private String sql;

    public ProductMethod() {

    }

    public void add(Product product) {
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

    public void edit(Product product, JTable table) {
        sql = "Update product set name='" + product.getName() + "' ,id='" + product.getID() + "' ,price='"
                + product.getPrice() + "' ,quantity='" + product.getQuantity() + "' ,description='"
                + product.getDescription() + "' ,category='" + product.getCategory().getSelectedItem()
                + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
       
        new DatabaseOperation().edit(sql);
    }

    public void delete(Product product, JTable table) {
        sql = "Delete from Product where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
        new DatabaseOperation().delete(sql);
    }

}
