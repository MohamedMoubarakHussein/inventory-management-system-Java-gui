package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerMethod {

    Connection connection = Database.connect();
    private String sql;
    
    public CustomerMethod() {
        //Database.connect();
    }

    public void add(Customer customer, javax.swing.JTable table) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into customer values(?,?,?)");

            add.setInt(1, customer.getID());
            add.setString(2, customer.getName());
            add.setString(3, customer.getPhone());
            add.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void edit(Customer customer, javax.swing.JTable table) {
        try {
            sql = "Update customer set name='" + customer.getName() + "' ,id='" + customer.getID() + "' ,phone='" + customer.getPhone() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
            PreparedStatement edit = connection.prepareStatement(sql);
            edit.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void delete(Customer customer, javax.swing.JTable table) {
        try {
            sql = "Delete from customer where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
            PreparedStatement delete = connection.prepareStatement(sql);
            delete.executeUpdate();
                                
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
