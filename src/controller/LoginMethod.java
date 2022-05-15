package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class LoginMethod {

    PreparedStatement check = null;
    ResultSet result = null;
    Connection connection = Database.connect();
    private String sql;
    
    public LoginMethod() {

    }

    public boolean check(Login login) {
        try {
            sql = "select * from Admin where id=? and password=?";
            PreparedStatement check=connection.prepareStatement(sql);
            check.setInt(1,login.getID());
            check.setString(2, login.getPassword());
            result = check.executeQuery();
                    
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
