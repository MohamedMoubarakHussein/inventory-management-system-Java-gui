package model;

import controller.*;

public class Customer {
    
    private int id;
    private String name;
    private String phone;
    private CustomerMethod customer = new CustomerMethod();
    
    public Customer() {
        //
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
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void add() {
        customer.add(this);
    }
    
    public void edit(javax.swing.JTable table) {
        customer.edit(this, table);
    }
    
    public void delete(javax.swing.JTable table) {
        customer.delete(this, table);
    }
    
}