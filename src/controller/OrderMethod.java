package controller;

import java.util.*;
import model.*;
import javax.swing.table.DefaultTableModel;

public class OrderMethod {
           
   
    
    public void add(Order order, DefaultTableModel model) {
        Vector vector = new Vector();
        
        vector.add(order.getCustomerName());
        vector.add(order.getProduct());
        vector.add(order.getPrice());
        vector.add(order.getQuantity());
        vector.add(order.getTotal());
        vector.add(order.getDate());
                
        model.addRow(vector);
    }
    
}
