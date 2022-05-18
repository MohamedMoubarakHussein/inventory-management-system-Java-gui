package controller;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ShowDatabaseData extends DatabaseConnection {

	 
    
   
    public void DataInTable(javax.swing.JTable table, String tableName) {
        sql = "select * from " + tableName;
        ResultSet resultSet = ResultForSql(sql);
        table.setModel(DbUtils.resultSetToTableModel(resultSet));
    }
    
    
    public void DataInComboBox(javax.swing.JComboBox<String> category) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
           ResultSet resultSet = ResultForSql("select * from category");
            
            while(resultSet.next())
                category.addItem(resultSet.getString("name"));
                        
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public ResultSet ResultForSql(String sql) {
    	ResultSet notAllowed= null;
    	try {
			return database.connection.createStatement().executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return notAllowed;
    }
}