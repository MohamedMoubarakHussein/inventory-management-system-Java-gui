package model;

import controller.*;

public class Login {

    private int id;
    private String Password;
    private LoginMethod login = new LoginMethod();
    private static Login Instance;
    
    
    
    public static Login getInstance() {
    	if(Instance == null) {
    		Instance =new Login();
    	}
    	return Instance;
    }
  

    public void setID(int id) {
        this.id = id;
    }
    
    public int getID() {
        return id;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public boolean Check() {
        if (login.check(this))
            return true;
        else 
            return false;
    }
}
