package view;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderWindow extends javax.swing.JFrame {
    int currentRow;
    
    public OrderWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exitApp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        custTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        price = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        printOrder = new javax.swing.JButton();
        addToOrder = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        custName = new javax.swing.JLabel();
        deleteOrder = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Management System");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"ORDERS\" ");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Century Schoolbook", 3, 30)); // NOI18N
        back.setForeground(new java.awt.Color(255, 51, 51));
        back.setText("←");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        exitApp.setBackground(new java.awt.Color(255, 255, 255));
        exitApp.setFont(new java.awt.Font("Century Schoolbook", 3, 27)); // NOI18N
        exitApp.setForeground(new java.awt.Color(255, 51, 51));
        exitApp.setText("X");
        exitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitAppMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Product List");

        custTable.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        custTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust id", "Name", "Phone"
            }
        ));
        custTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        custTable.setRowHeight(25);
        custTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        custTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        custTable.setShowGrid(true);
        custTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(custTable);

        productTable.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description", "Quantity", "Category"
            }
        ));
        productTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        productTable.setRowHeight(25);
        productTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        productTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        productTable.setShowGrid(true);
        jScrollPane4.setViewportView(productTable);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Customer List");

        orderTable.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Product", "Quantity", "Price", "Total"
            }
        ));
        orderTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        orderTable.setRowHeight(25);
        orderTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        orderTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        orderTable.setShowGrid(true);
        jScrollPane2.setViewportView(orderTable);

        price.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        price.setForeground(new java.awt.Color(255, 51, 51));

        date.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 51, 51));
        date.setText("Date");

        quantity.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 51, 51));

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Quantity");

        printOrder.setBackground(new java.awt.Color(255, 51, 51));
        printOrder.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        printOrder.setForeground(new java.awt.Color(255, 255, 255));
        printOrder.setText("Print Order");
        printOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printOrderMouseClicked(evt);
            }
        });

        addToOrder.setBackground(new java.awt.Color(255, 51, 51));
        addToOrder.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        addToOrder.setForeground(new java.awt.Color(255, 255, 255));
        addToOrder.setText("Add To Order");
        addToOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToOrderMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Price");

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Customer Name: ");

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Date : ");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        custName.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        custName.setForeground(new java.awt.Color(255, 51, 51));
        custName.setText("Name");

        deleteOrder.setBackground(new java.awt.Color(255, 51, 51));
        deleteOrder.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        deleteOrder.setForeground(new java.awt.Color(255, 255, 255));
        deleteOrder.setText("Delete");
        deleteOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOrderMouseClicked(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 3, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("\"Order List\"");

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4)
                        .addGap(364, 364, 364)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(date)
                                        .addGap(153, 153, 153))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addComponent(jLabel13)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(addToOrder)
                                                .addGap(26, 26, 26)
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(7, 7, 7)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(printOrder)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(143, 143, 143))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addToOrder)
                            .addComponent(clear))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(custName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(date)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printOrder)
                    .addComponent(deleteOrder))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    void getToday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dtf.format(now));
    }
    
    
    void showCust() {
        DefaultTableModel model = (DefaultTableModel) custTable.getModel();

        try {
            File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\customer.txt");
            Scanner input = new Scanner(myfile);

            while (input.hasNext()) {
                String line = input.nextLine();
                String[] row = line.split("\t");
                model.addRow(row);
            }
            

        } catch (FileNotFoundException ex) {

        }
    }
    
  
    void showProdut() {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();

        try {
            File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\product.txt");
            Scanner input = new Scanner(myfile);

            while (input.hasNext()) {
                String line = input.nextLine();
                String[] row = line.split("\t");
                model.addRow(row);
            }

        } catch (FileNotFoundException ex) {

        }
    }
    
    
//    void showOrder() {
//        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
//
//        try {
//            File myfile = new File("D:\\Z - PC\\Computer Science\\level 2\\JAVA\\Project\\myfolder\\order.txt");
//            Scanner input = new Scanner(myfile);
//
//            while (input.hasNext()) {
//                String line = input.nextLine();
//                String[] row = line.split("\t");
//                model.addRow(row);
//            }
//
//        } catch (FileNotFoundException ex) {
//
//        }
//    }
    
    private void exitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitAppMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void printOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printOrderMouseClicked
        try {
            orderTable.print();
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        price.setText("");
        quantity.setText("");
        
    }//GEN-LAST:event_printOrderMouseClicked

    private void addToOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToOrderMouseClicked
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        currentRow = productTable.getSelectedRow();
        
        Vector v = new Vector();
        
        if (custTable.getSelectedRowCount() == 1 && productTable.getSelectedRowCount() == 1 
                && custName.getText() != "Name" && !price.getText().isEmpty() && !quantity.getText().isEmpty()) {
            
            v.add(custName.getText());
            v.add(productTable.getValueAt(currentRow, 1));
            v.add(quantity.getText());
            v.add(price.getText());
            v.add(Integer.valueOf(price.getText()) * Integer.valueOf(quantity.getText()));
            
            model.addRow(v);
        }
        else
            JOptionPane.showMessageDialog(null, "Error!");
    }//GEN-LAST:event_addToOrderMouseClicked

    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custTableMouseClicked
        currentRow = custTable.getSelectedRow();
        
        if (custTable.getSelectedRowCount() == 1){
            custName.setText(custTable.getValueAt(currentRow, 1) + "");
        }
    }//GEN-LAST:event_custTableMouseClicked

    private void deleteOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOrderMouseClicked
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        currentRow = orderTable.getSelectedRow();
        
        if (orderTable.getSelectedRowCount() == 1){
            model.removeRow(orderTable.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Deleted Done!!");
        }
        else    
            JOptionPane.showMessageDialog(null, "please select only one row.");
    }//GEN-LAST:event_deleteOrderMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        price.setText("");
        quantity.setText("");
    }//GEN-LAST:event_clearMouseClicked

        
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderWindow().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrder;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JLabel custName;
    private javax.swing.JTable custTable;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteOrder;
    private javax.swing.JButton exitApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField price;
    private javax.swing.JButton printOrder;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables
}
