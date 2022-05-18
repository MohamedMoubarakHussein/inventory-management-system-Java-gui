package controller;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ShowDatabaseData {
    
    private String sql;

    ResultSet resultSet = null;
    
   

    public void DataInTable(javax.swing.JTable table, String tableName) {
        try {
        	Statement  statement = Database.connect().createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void DataInComboBox(javax.swing.JComboBox<String> category) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
        	Statement statement = Database.connect().createStatement();
            resultSet = statement.executeQuery("select * from category");
            
            while(resultSet.next())
                category.addItem(resultSet.getString("name"));
                        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
