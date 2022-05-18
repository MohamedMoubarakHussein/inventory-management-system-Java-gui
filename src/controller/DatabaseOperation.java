package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class  DatabaseOperation {
    Database database ;
    Connection connection ;
    
    
    public DatabaseOperation(Database databaseAvailable) {
    		this.database = databaseAvailable;
    		connection = database.connect();
    }

    
    public boolean add(String statment , boolean IntType[] , String command[]) {
        try {
        	int id = 1;
            PreparedStatement add = connection.prepareStatement(statment);
            for(int i = 0 ; i < command.length ; i++) {
            	if(IntType[i] == true) {
            	add.setInt(id, Integer.parseInt(command[i]));
                       
            	}else {
            	add.setString(id, command[i]);
            	}
            	id++;
            }
            
             add.executeUpdate();
             
             return true;
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
		return false;
    }
    
    
    public void edit(String sql) {
        try {
            PreparedStatement edit = connection.prepareStatement(sql);
            
            edit.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        } 
    }

    
    
    public void delete(String sql) {
        try {
            PreparedStatement delete = connection.prepareStatement(sql);
         
            delete.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
  
  
  
   
}
