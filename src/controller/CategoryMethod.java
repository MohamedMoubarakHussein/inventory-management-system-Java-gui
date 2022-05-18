package controller;

import model.*;
import javax.swing.JTable;

public class CategoryMethod {

    private String sql;

 
    public void add(Category category) {
       
    	String statment = "insert into category values(?,?)";
    	boolean[] IntType = {true,false};
        String[] command = {String.valueOf(category.getID()),category.getName()};
        
        new DatabaseOperation().add(statment, IntType, command);
              
    }

    public void edit(Category category, JTable table) {
        sql = "Update category set name='" + category.getName() + "' ,id='" + category.getID()
                + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
        
        new DatabaseOperation().edit(sql);
    }

    public void delete(Category category, JTable table) {
        sql = "Delete from category where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
       
        new DatabaseOperation().edit(sql);
    }
    
}
