package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AdminMethod {

    Connection connection = Database.connect();
    private String sql;

    

    public boolean add(Admin admin) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into Admin values(?,?,?)");
           
            add.setInt(1, admin.getID());
            add.setString(2, admin.getName());
            add.setString(3, admin.getPassword());
            add.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public void edit(Admin admin, javax.swing.JTable table) {
        sql = "Update Admin set name='" + admin.getName() + "' ,id='" + admin.getID() + "' ,password='"
                + admin.getPassword() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
        new DatabaseOperation().edit(sql);
    }

    public void delete(Admin admin, javax.swing.JTable table) {
        sql = "Delete from Admin where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
        new DatabaseOperation().delete(sql);
    }

}
