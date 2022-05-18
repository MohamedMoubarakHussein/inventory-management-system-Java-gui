package controller;

import model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CategoryMethod {

    Connection connection = Database.connect();
    Methods method = new Methods();
    private String sql;

    public CategoryMethod() {
        //Database.connect();
    }

    public void add(Category category) {
        try {
            PreparedStatement add = connection.prepareStatement("insert into category values(?,?)");

            add.setInt(1, category.getID());
            add.setString(2, category.getName());
            add.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void edit(Category category, JTable table) {
        sql = "Update category set name='" + category.getName() + "' ,id='" + category.getID()
                + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
        method.edit(sql);
    }

    public void delete(Category category, JTable table) {
        sql = "Delete from category where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
        method.edit(sql);
    }
    
}
