package model;

public class Admin {

    private String name;
    private String id;
    private String password;
    
    public Admin() {

    }

    public Admin(String name, String id, String password) {
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

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
}
