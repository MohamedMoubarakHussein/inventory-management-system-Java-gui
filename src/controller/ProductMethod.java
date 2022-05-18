package controller;

import model.*;
import javax.swing.JTable;

public class ProductMethod extends DatabaseConnection{
	  
    private String sql;


    public void add(Product product) {
       
    	String statment  ="insert into product values(?,?,?,?,?,?)";
        boolean[] IntType = {true,false,true,true,false,false};
        String[] command = {String.valueOf(product.getID()),product.getName(),String.valueOf(product.getPrice()) ,String.valueOf( product.getQuantity())
        		    ,product.getDescription() , product.getCategory().getSelectedItem().toString()};
        
        
        database.add(statment, IntType, command);    
    }

    public void edit(Product product, JTable table) {
        sql = "Update product set name='" + product.getName() + "' ,id='" + product.getID() + "' ,price='"
                + product.getPrice() + "' ,quantity='" + product.getQuantity() + "' ,description='"
                + product.getDescription() + "' ,category='" + product.getCategory().getSelectedItem()
                + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
       
        database.edit(sql);
    }

    public void delete(Product product, JTable table) {
        sql = "Delete from Product where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
       
        database.delete(sql);
    }

}
