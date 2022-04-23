package model;

public class Category {
    
    private String id;
    private String name;
    
    public Category() {
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
    
}
