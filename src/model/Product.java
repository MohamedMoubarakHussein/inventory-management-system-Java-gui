package model;

public class Product {

    private String id;
    private String name;
    private String description;
    private String quantity;
    private String category;
    
    public Product() {
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
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
    
}