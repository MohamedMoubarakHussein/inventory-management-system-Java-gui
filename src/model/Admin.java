package model;

import controller.*;

public class Admin {

    private String name;
    private int id;
    private String password;
    private AdminMethod admin = new AdminMethod();
    
    public Admin() {

    }

    public Admin(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
    public boolean add() {
        if(admin.add(this))
            return true;
        else 
            return false;
    }
    
    public void edit(javax.swing.JTable table) {
        admin.edit(this, table);
    }
    
    public void delete(javax.swing.JTable table) {
        admin.delete(this, table);
    }
    
}
