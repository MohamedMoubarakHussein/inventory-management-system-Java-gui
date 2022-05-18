package model;

import controller.*;
import javax.swing.table.DefaultTableModel;

public class Order {
    
    private String customerName;
    private String product;
    private int price;
    private int quantity;
    private int total;
    private String date;
    private OrderMethod order = new OrderMethod();
    
   
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return this.product;
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
    
    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
        
    public void add(DefaultTableModel model) {
        order.add(this, model);
    }
    
}
