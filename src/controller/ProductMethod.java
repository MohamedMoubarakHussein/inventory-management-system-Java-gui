package controller;

import model.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ProductMethod extends Product implements Controller{
    
    Methods method = new Methods();
    Files file = new Files();
    
    public ProductMethod() {
        //
    }
    
    @Override
    public void add(DefaultTableModel model) {
        try {
            RandomAccessFile raf = new RandomAccessFile(file.getProductFile(), "rw");
            for(int i=0 ; i<method.countLine(file.getProductFile()) ; i++){
                raf.readLine();
            }
            
            raf.writeBytes(this.getID() + "\t");
            raf.writeBytes(this.getName() + "\t");
            raf.writeBytes(this.getDescription() + "\t");
            raf.writeBytes(this.getQuantity() + "\t");
            raf.writeBytes(this.getCategory() + "\t\n");
            
            Scanner input = new Scanner(file.getProductFile());

            model.setNumRows(0);
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] row = line.split("\t");
                model.addRow(row);
            }
        } catch (Exception ex) {
        }
    }
    
    @Override
    public void edit(javax.swing.JTable table) {
        int currentRow;
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            FileWriter fw = new FileWriter(file.getProductFile());
            BufferedWriter bw = new BufferedWriter(fw);

            currentRow = table.getSelectedRow();
            model.setValueAt(this.getID(), currentRow, 0);
            model.setValueAt(this.getName(), currentRow, 1);
            model.setValueAt(this.getDescription() , currentRow, 2);
            model.setValueAt(this.getQuantity(), currentRow, 3);
            model.setValueAt(this.getCategory(), currentRow, 4);

            if (table.getSelectedRowCount() == 1) {
                for (int i = 0; i < table.getRowCount(); i++) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        bw.write(table.getValueAt(i, j) + "\t");
                    }
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }
        } catch (Exception ex) {
        }
    }
}
