package model;

import controller.*;

public class Login {

    private int id;
    private String Password;
    private LoginMethod login = new LoginMethod();

    public Login() {
        //
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
