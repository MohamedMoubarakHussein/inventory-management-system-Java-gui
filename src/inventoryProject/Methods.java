package inventoryProject;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public  class Methods {
    
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
    
    public void add(SignUp s ,File f) {
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0 ; i<line ; i++){
                raf.readLine();
            }
            
            raf.writeBytes(s.getName() + "\t");
            raf.writeBytes(s.getID() + "\t");
            raf.writeBytes(s.getPassword() + "\t\n");
            

        } catch (IOException ex) {

        }
    }
    
    public void edit(User user, javax.swing.JTable table) {
        int currentRow;
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            FileWriter fw = new FileWriter(f.getMyFile());
            BufferedWriter bw = new BufferedWriter(fw);

            currentRow = table.getSelectedRow();
            model.setValueAt(user.getName(), currentRow, 0);
            model.setValueAt(user.getID(), currentRow, 1);
            model.setValueAt(user.getPassword(), currentRow, 2);

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
    
    void countLine(File f) {
        try {
            line = 1;
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            while (raf.readLine() != null) {
                line++;
            }
            System.out.println("number of line: " + line);

        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}
