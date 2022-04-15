package inventoryProject;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Files {
    
    private File myfolder = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder");
    private File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\myfile.txt");
    private File product = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\product.txt");
    private File customer = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\customer.txt");
    private File category = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\category.txt");

    
    public Files() {
        
    }
    
    public File getMyFile() {
        return this.myfile;
    }
    
    public File getProductFile() {
        return this.product;
    }
    
    public File getCustomerFile() {
        return this.customer;
    }
    
    public File getCategoryFile() {
        return this.category;
    }
    
    public void createFolder() {
        if(!myfolder.exists()) {
            myfolder.mkdirs();
        }
    }
    
    public void readOrWrite() {
        try {
            FileReader fr = new FileReader(myfile);
            System.out.println("file exists");

        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(myfile);
                System.out.println("file created");

            } catch (IOException ex1) {
                
            }
        }
    }
    
}
