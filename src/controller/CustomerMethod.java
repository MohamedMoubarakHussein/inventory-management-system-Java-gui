package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CustomerMethod {

    Connection connection = Database.connect();
    private String sql;


    public void add(Customer customer) {
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

    public void edit(Customer customer, JTable table) {
        sql = "Update customer set name='" + customer.getName() + "' ,id='" + customer.getID() + "' ,phone='"
                + customer.getPhone() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
        new DatabaseOperation().edit(sql);

    }

    public void delete(Customer customer, JTable table) {
        sql = "Delete from customer where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
        new DatabaseOperation().edit(sql);
    }

}
