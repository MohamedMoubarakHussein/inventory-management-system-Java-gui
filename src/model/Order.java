package model;

import controller.*;
import javax.swing.table.DefaultTableModel;

public class Order {
    
    private String customerName;
    private int price;
    private int quantity;
    private String date;
    private javax.swing.JTable table;
    private OrderMethod order = new OrderMethod();
    
    public Order() {
        //
    }
    
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
    
    public void setTable(javax.swing.JTable table) {
        this.table = table;
    }

    public javax.swing.JTable getTable() {
        return this.table;
    }
    
    public void add(DefaultTableModel model) {
        order.add(this, model);
    }
    
}
