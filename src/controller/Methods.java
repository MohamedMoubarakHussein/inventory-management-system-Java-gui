package controller;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

public class Methods {
    
    private int line;
    Files f = new Files();
    
    public Methods() {
        //
    }
    
    public void showData(File f, DefaultTableModel model) {
        try {
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] row = line.split("\t");
                model.addRow(row);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("false");
        }
    }
   
    public static void delete(File f, javax.swing.JTable table) {
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            model.removeRow(table.getSelectedRow());
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {

                    bw.write(table.getValueAt(i, j) + "\t");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public int countLine(File f) {
        try {
            line = 1;
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            while (raf.readLine() != null) {
                line++;
            }
            return line;

        } catch (Exception ex) {
            System.out.println("Error");
        }
        return line;
    }
}
