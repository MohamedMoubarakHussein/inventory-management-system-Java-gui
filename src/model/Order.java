package model;

public class Order {
    private String customerName;
    private String price;
    private String quantity;
    private javax.swing.JTable table;
    
    public Order() {
        //
    }
    
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public String getprice() {
        return this.price;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }
    
    public void setTable(javax.swing.JTable table) {
        this.table = table;
    }

    public javax.swing.JTable getTable() {
        return this.table;
    }
    
}
