package controller;

import model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class OrderMethod {
    
    public OrderMethod() {
        //
    }
    
    public void add(Order order, DefaultTableModel model) {
        int currentRow = order.getTable().getSelectedRow();
        Vector vector = new Vector();
        
        vector.add(order.getCustomerName());
        vector.add(order.getTable().getValueAt(currentRow, 1));
        vector.add(order.getPrice());
        vector.add(order.getQuantity());
        vector.add(order.getPrice() * order.getQuantity());
        vector.add(order.getDate());
                
        model.addRow(vector);
    }
}
