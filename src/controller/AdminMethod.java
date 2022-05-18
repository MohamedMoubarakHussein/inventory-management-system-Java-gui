package controller;

import model.*;


public class AdminMethod {

    private String sql;

    

    public boolean add(Admin admin) {
    	
    	String statment ="insert into Admin values(?,?,?)";
        boolean[] IntType = {true,false,false};
        String[] command = {String.valueOf(admin.getID()),admin.getName(),admin.getPassword()};
        boolean Success = new DatabaseOperation().add(statment, IntType, command);
            
        return Success;
    }

    
    
    public void edit(Admin admin, javax.swing.JTable table) {
        sql = "Update Admin set name='" + admin.getName() + "' ,id='" + admin.getID() + "' ,password='"
                + admin.getPassword() + "' where id ='" + table.getValueAt(table.getSelectedRow(), 0) + "'";
       
        new DatabaseOperation().edit(sql);
    }

    
    public void delete(Admin admin, javax.swing.JTable table) {
        sql = "Delete from Admin where id='" + table.getValueAt(table.getSelectedRow(), 0) + "' ";
       
        new DatabaseOperation().delete(sql);
    }

}
