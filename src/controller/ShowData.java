package controller;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ShowData {
    
    private String sql;
    Statement statement = null;
    ResultSet resultSet = null;
    
    public ShowData() {
        //Database.connect();
    }

    public void DataInTable(javax.swing.JTable table, String tableName) {
        sql = "select * from " + tableName;
        try {
            statement = Database.connect().createStatement();
            resultSet = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void DataInComboBox(javax.swing.JComboBox<String> category) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
            statement = Database.connect().createStatement();
            resultSet = statement.executeQuery("select * from category");
            
            while(resultSet.next())
                category.addItem(resultSet.getString("name"));
                        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
