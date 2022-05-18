package controller;

import model.*;
import javax.swing.JTable;

public class CustomerMethod  extends DatabaseConnection{
	
    private String sql;


    public void add(Customer customer) {
       
    	String statment	= "insert into customer values(?,?,?)";
        boolean[] IntType = {true,false,false};
        String[] command = {String.valueOf(customer.getID()),customer.getName(),customer.getPhone()};
        
        database.add(statment, IntType, command);
              
    }

    public void edit(Customer customer, JTable table) {
        sql = "Update customer set name='" + customer.getName() + "' ,id='" + customer.getID() + "' ,phone='"
                + customer.getPhone() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
      
        database.edit(sql);

    }

    public void delete(Customer customer, JTable table) {
        sql = "Delete from customer where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
        
        database.edit(sql);
    }

}
