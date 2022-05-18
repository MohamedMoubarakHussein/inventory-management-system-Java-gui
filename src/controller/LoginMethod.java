package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class LoginMethod extends DatabaseConnection {
	
  
	  public PreparedStatement checkLogin(String sql) {
	    	PreparedStatement Check = null ;
	    	try {
				Check = database.connection.prepareStatement(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	return Check;
	    }

    public boolean check(Login login) {
        try {
        	sql =  "select * from Admin where id="+login.getID()+" and password="+login.getPassword();
            PreparedStatement check=checkLogin(sql);
            ResultSet result = check.executeQuery();
                    
            if (result.next()) 
                return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
            
        } finally {
            try {
            
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
}
