package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class LoginMethod {
		Connection connection = Database.connect();
		private String sql ;
  

    public boolean check(Login login) {
        try {
        	sql =  "select * from Admin where id="+login.getID()+" and password="+login.getPassword();
            PreparedStatement check=connection.prepareStatement(sql);
            ResultSet result = check.executeQuery();
                    
            if (result.next()) 
                return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
            
        } finally {
            try {
                connection.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
}
