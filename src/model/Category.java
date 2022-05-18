package model;

import controller.*;

public class Category {
    
    private int id;
    private String name;
    private CategoryMethod category = new CategoryMethod();
    
    public Category() {
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
    
    public void add() {
        category.add(this);
    }
    
    public void edit(javax.swing.JTable table) {
        category.edit(this, table);
    }
    
    public void delete(javax.swing.JTable table) {
        category.delete(this, table);
    }
    
}
