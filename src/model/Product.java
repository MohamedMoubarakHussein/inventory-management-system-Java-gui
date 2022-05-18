package model;

import controller.*;

public class Product {

    private int id;
    private String name;
    private int price;
    private String description;
    private int quantity;
    private javax.swing.JComboBox<String> category;
    private ProductMethod product = new ProductMethod();
    
   
    
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
    
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
    
    public void setCategory(javax.swing.JComboBox<String> category) {
        this.category = category;
    }

    public javax.swing.JComboBox<String> getCategory() {
        return this.category;
    }
    
    public void add() {
        product.add(this);
    }
    
    public void edit(javax.swing.JTable table) {
        product.edit(this, table);
    }
    
    public void delete(javax.swing.JTable table) {
        product.delete(this, table);
    }
    
}