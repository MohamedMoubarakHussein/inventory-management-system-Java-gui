package controller;

import model.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminMethod extends Admin {
    
    Methods method = new Methods();
    Files file = new Files();
    
    public AdminMethod() {
        
    }
    
    public void add() {
        try {
            RandomAccessFile raf = new RandomAccessFile(file.getMyFile(), "rw");
            for(int i=0 ; i<method.countLine(file.getMyFile()) ; i++){
                raf.readLine();
            }
            raf.writeBytes(this.getName() + "\t");
            raf.writeBytes(this.getID() + "\t");
            raf.writeBytes(this.getPassword() + "\t\n");

        } catch (IOException ex) {
        }
    }
    
    public void edit(javax.swing.JTable table) {
        int currentRow;
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            FileWriter fw = new FileWriter(file.getMyFile());
            BufferedWriter bw = new BufferedWriter(fw);

            currentRow = table.getSelectedRow();
            model.setValueAt(this.getName(), currentRow, 0);
            model.setValueAt(this.getID(), currentRow, 1);
            model.setValueAt(this.getPassword(), currentRow, 2);

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
            JOptionPane.showMessageDialog(null, "Error!!");
        }
    }
    
}
