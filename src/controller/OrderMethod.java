package controller;

import model.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderMethod extends Order implements Controller{
    
    @Override
    public void add(DefaultTableModel model) {
        int currentRow = this.getTable().getSelectedRow();
        Vector v = new Vector();
        
        v.add(this.getCustomerName());
        v.add(this.getTable().getValueAt(currentRow, 1));
        v.add(this.getQuantity());
        v.add(this.getprice());
        v.add(Integer.valueOf(this.getprice()) * Integer.valueOf(this.getQuantity()));
        model.addRow(v);
    }
    
    @Override
    public void edit(javax.swing.JTable table){
        //
    }
}
