package Spot_Test_Manage;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;

import org.jfree.chart.*;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakashakarshana
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Report() {
        initComponents();
    }
    
    public Report(String par) {
        initComponents();
        
        
       
       namereq.setText(par);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        week = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        namereq = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 252, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Report");

        week.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Passport Number");

        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passport", "Name", "Email", "Week 1 Avg", "Week 2 Avg", "Week 3 Avg", "Week 4 Avg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportTable);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Update Average ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("View Progress Bar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout weekLayout = new javax.swing.GroupLayout(week);
        week.setLayout(weekLayout);
        weekLayout.setHorizontalGroup(
            weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(weekLayout.createSequentialGroup()
                .addGroup(weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(weekLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(weekLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton4))
                    .addGroup(weekLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        weekLayout.setVerticalGroup(
            weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(weekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 102, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(900, 135));

        jLabel32.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("JEEWA EDUCATION");

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Student Management System");

        namereq.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        namereq.setForeground(new java.awt.Color(255, 255, 0));

        jLabel35.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 0));
        jLabel35.setText("Hi..........");

        jLabel36.setText("LOGOUT");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Jeewa-O.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel37)
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel36))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namereq, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namereq, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addGap(45, 45, 45)))
                        .addComponent(jLabel37))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(week, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(week, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
            
            
            
        

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        String namee=namereq.getText();
        new lecture(namee).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Exit application?")==JOptionPane.OK_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String pass= pp.getText();
        
      
        
      
        try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");
           
                                   String resultsql = "select * from spotResult where pp=?"; 
                                    
                                   
                                    PreparedStatement rst=con.prepareStatement(resultsql);
                                    rst.setString(1, pass);
                                    
                                    
                                    ResultSet rs=rst.executeQuery();
                                   
                                 
                                        ReportTable.setModel(DbUtils.resultSetToTableModel(rs));
                                        
                                       
                                    
                                
            
            
            
            
        }catch(ClassNotFoundException | SQLException e){
            
       
        }
       
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String pass= pp.getText();
        double w1=0;
        double w2=0;
        double w3=0;
        double w4=0;
        
       int week1 =1;
        int week2 =2;
        int week3 =3;
       int week4 =4;
        
        
        try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");
           
                      String namesql1 = "select * from spotResult where pp=? AND week=?"; 
                      PreparedStatement pst0=con.prepareStatement(namesql1);
                      
                      pst0.setString(1, pass);
                      pst0.setInt(2, week1);
                      
                      
                      ResultSet rs0=pst0.executeQuery();
                      
                                    while(rs0.next()){
                                        
                                         w1=rs0.getDouble(7);
                                      
                                    }
                                    
                                    
                      String namesql2 = "select * from spotResult where pp=? AND week=?";
                      PreparedStatement pst2=con.prepareStatement(namesql2);
                      pst2.setString(1, pass);
                      pst2.setInt(2, week2);
                      
                      
                      ResultSet rs2=pst2.executeQuery();
                      
                                    while(rs2.next()){
                                        
                                        w2=rs2.getDouble(7);
                                    }
                                    
                                    
                       String namesql3 = "select * from spotresult where pp=? AND week=?";
                       PreparedStatement pst3=con.prepareStatement(namesql3);
                      pst3.setString(1, pass);
                      pst3.setInt(2, week3);
                      
                      
                      ResultSet rs3=pst3.executeQuery();
                      
                                    while(rs3.next()){
                                        
                                        w3=rs3.getDouble(7);
                                    }
                                 
                                    
                       String namesql4 = "select * from spotresult where pp=? AND week=?";
                       PreparedStatement pst4=con.prepareStatement(namesql4);
                      pst4.setString(1, pass);
                      pst4.setInt(2, week4);
                      
                      
                      ResultSet rs4=pst4.executeQuery();
                      
                                    while(rs4.next()){
                                        
                                        w4=rs4.getDouble(7);
                                    }
        
                                   
                                        
                         JOptionPane.showMessageDialog(null , w1);
                         
                      String sqlUpdate="insert into average(pp,average1,average2,average3,average4) values(?,?,?,?,?)";
               
        PreparedStatement pstUpdate=con.prepareStatement(sqlUpdate);
             pstUpdate.setString(1, pass);
             pstUpdate.setDouble(2, w1);
             pstUpdate.setDouble(3, w2);
             pstUpdate.setDouble(4, w3);
             pstUpdate.setDouble(5, w4);
                    pstUpdate.execute();
                                        
                      
                      
        
    }//GEN-LAST:event_jButton3MouseClicked
        catch(ClassNotFoundException | SQLException e){
            
       
        }
    }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String pass= pp.getText();
        
        try {
                                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");

                                   String namesql="select * from average where pp=?";
                                    
                                    PreparedStatement pst=con.prepareStatement(namesql);
                                    pst.setString(1, pass);
                                    
                                    
                                    
                                    ResultSet rs=pst.executeQuery();
                                    while(rs.next()){
                                    double we1 = rs.getDouble(2);
                                    double we2 = rs.getDouble(3);
                                    double we3 = rs.getDouble(4);
                                    double we4 = rs.getDouble(5);
                                     
                                   
        
        
        
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        barchartdata.setValue(we1,"Week 1", pass);
        barchartdata.setValue(we2,"Week 2", pass);
        barchartdata.setValue(we3,"Week 3", pass);
        barchartdata.setValue(we4,"Week 4", pass);
        
        
        
        
        JFreeChart barchart = ChartFactory.createBarChart("Progress", "weeks", "Average", barchartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchar = barchart.getCategoryPlot();
        barchar.setRangeGridlinePaint(Color.BLACK);
        
        
        ChartFrame frame = new ChartFrame("Progress chart For Student", barchart);
        frame.setVisible(true);
        frame.setSize(500,350);
        
        
    
      }
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SQLException ex) {
                                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                }
        
        
        
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        new main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        String namee=namereq.getText();
        new lecture(namee).setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked
    
    

    
    
    
    
    
    
    
    public void setColor(JPanel panel){
    
    panel.setBackground(new java.awt.Color(153,153,153));
}

 private void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(252,166,217));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
     
              
              
          
                
                
              
                new Report().setVisible(true);
                
                 
               
               
            }
        });
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel namereq;
    private javax.swing.JTextField pp;
    private javax.swing.JPanel week;
    // End of variables declaration//GEN-END:variables

   
}
