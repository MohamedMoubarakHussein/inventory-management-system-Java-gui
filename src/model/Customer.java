package model;

public class Customer {
    
    private String id;
    private String name;
    private String phone;
    
    public Customer() {
        //
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
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    
}