/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**  
 *
 * @author PC
 */
public class repeat_register extends javax.swing.JFrame {

    /**
     * Creates new form repeat_register
     */
    public repeat_register()  {
        initComponents();
        read_p.setVisible(false);
        writing_p.setVisible(false);
        listning_p.setVisible(false);
        listning_p1.setVisible(false);
        
        String passport=logpassport.getText();
     
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement", "root", "root");
                         
                         String sql="select * from  spotresult where pp=?";
                          String sql1="select email from  NEWINTAKEPAYMENT where passport=?";
                         
                         
                         PreparedStatement pst=con.prepareStatement(sql);
                         PreparedStatement pst1=con.prepareStatement(sql1);
                         pst.setString(1, passport);
                            pst1.setString(1, passport);
                         
                         ResultSet rs1=pst1.executeQuery();
                         ResultSet rs=pst.executeQuery();
                         
                         while(rs.next()){
                             
                             String passport1=rs.getString("passport");
                             String speaking=rs.getString("speaking");
                             String reading=rs.getString("reading");
                             String writing=rs.getString("writing");
                             String listning=rs.getString("listening");
                             
                             
                             
                             
                             pass.setText(passport1);
                             
                             
                             
                          int r=Integer.parseInt(reading);
               int w=Integer.parseInt(writing);
               int l=Integer.parseInt(listning);
               int s=Integer.parseInt(speaking);
               
               if(r<5){
                   read_p.setVisible(true);
                   
                   
               }
                 if(w<5){
                   writing_p.setVisible(true);
                   
                   
               }           
                  if(l<5){
                   listning_p.setVisible(true);
                   
                   
               }
                  if(s<5){
                   listning_p1.setVisible(true);
                   
                   
               }
                  
                  
  }
                         
                          while(rs1.next()){
                             
                             String email1=rs1.getString("email");
                             
                           email_r.setText(email1);
                             
                             
                         
                         
                         
                         
                         }
                          
                          
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
                         
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(repeat_register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(repeat_register.class.getName()).log(Level.SEVERE, null, ex);
        }
                      
        
        
        
        
        
        
        
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
        Header_full = new javax.swing.JPanel();
        Header_Internam = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logpassport = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        r_name = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        email_r = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        read_p = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        writing_p = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        Listning_p = new javax.swing.JPanel();
        listning_p = new javax.swing.JCheckBox();
        listning_p1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Header_full.setBackground(new java.awt.Color(51, 153, 255));

        Header_Internam.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JEEWA EDUCATION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Management System");

        javax.swing.GroupLayout Header_InternamLayout = new javax.swing.GroupLayout(Header_Internam);
        Header_Internam.setLayout(Header_InternamLayout);
        Header_InternamLayout.setHorizontalGroup(
            Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_InternamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Header_InternamLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(Header_InternamLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Header_InternamLayout.setVerticalGroup(
            Header_InternamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_InternamLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header_InternamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("HI.....");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("Prakash Akarshana");

        logpassport.setText("abc123456789");

        javax.swing.GroupLayout Header_fullLayout = new javax.swing.GroupLayout(Header_full);
        Header_full.setLayout(Header_fullLayout);
        Header_fullLayout.setHorizontalGroup(
            Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header_fullLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Header_Internam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Header_fullLayout.setVerticalGroup(
            Header_fullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header_fullLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Header_Internam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Header_fullLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logpassport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Header_full);
        Header_full.setBounds(0, 0, 1058, 164);

        j.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        j.setText("Name");
        jPanel1.add(j);
        j.setBounds(200, 310, 39, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Passport No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 270, 79, 19);

        pass.setText("Passport");
        jPanel1.add(pass);
        pass.setBounds(290, 270, 180, 14);

        r_name.setText("Name");
        jPanel1.add(r_name);
        r_name.setBounds(290, 310, 230, 14);

        j1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        j1.setText("Repeat Subjects");
        jPanel1.add(j1);
        j1.setBounds(578, 224, 133, 20);

        j2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        j2.setText("Email");
        jPanel1.add(j2);
        j2.setBounds(210, 350, 33, 19);

        j3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        j3.setText("Personal Details");
        jPanel1.add(j3);
        j3.setBounds(107, 224, 133, 20);

        email_r.setText("Email");
        jPanel1.add(email_r);
        email_r.setBounds(290, 350, 230, 14);

        j4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        j4.setText("Payments");
        jPanel1.add(j4);
        j4.setBounds(152, 449, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Bank");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 500, 32, 19);

        j5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        j5.setText("Branch");
        jPanel1.add(j5);
        j5.setBounds(210, 540, 45, 19);

        j6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        j6.setText("Date");
        jPanel1.add(j6);
        j6.setBounds(220, 580, 31, 19);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(320, 540, 235, 20);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(320, 580, 235, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Boc", "Sampath", "Commercial", "Peoples" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(320, 500, 235, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        read_p.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox1.setText("    Reading");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout read_pLayout = new javax.swing.GroupLayout(read_p);
        read_p.setLayout(read_pLayout);
        read_pLayout.setHorizontalGroup(
            read_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(read_pLayout.createSequentialGroup()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 221, Short.MAX_VALUE))
        );
        read_pLayout.setVerticalGroup(
            read_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        writing_p.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCheckBox2.setText("    Writing");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout writing_pLayout = new javax.swing.GroupLayout(writing_p);
        writing_p.setLayout(writing_pLayout);
        writing_pLayout.setHorizontalGroup(
            writing_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writing_pLayout.createSequentialGroup()
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        writing_pLayout.setVerticalGroup(
            writing_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Listning_p.setBackground(new java.awt.Color(255, 255, 255));

        listning_p.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        listning_p.setText("    Listning");
        listning_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listning_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Listning_pLayout = new javax.swing.GroupLayout(Listning_p);
        Listning_p.setLayout(Listning_pLayout);
        Listning_pLayout.setHorizontalGroup(
            Listning_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listning_pLayout.createSequentialGroup()
                .addComponent(listning_p, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );
        Listning_pLayout.setVerticalGroup(
            Listning_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listning_pLayout.createSequentialGroup()
                .addComponent(listning_p, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(writing_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Listning_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(read_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(read_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(writing_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Listning_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(590, 260, 420, 130);

        listning_p1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        listning_p1.setLabel("    Speaking");
        listning_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listning_p1ActionPerformed(evt);
            }
        });
        jPanel1.add(listning_p1);
        listning_p1.setBounds(630, 390, 166, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void listning_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listning_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listning_pActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void listning_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listning_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listning_p1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(repeat_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(repeat_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(repeat_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(repeat_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new repeat_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header_Internam;
    private javax.swing.JPanel Header_full;
    private javax.swing.JPanel Listning_p;
    private javax.swing.JLabel email_r;
    private javax.swing.JLabel j;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox listning_p;
    private javax.swing.JCheckBox listning_p1;
    private javax.swing.JLabel logpassport;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel r_name;
    private javax.swing.JPanel read_p;
    private javax.swing.JPanel writing_p;
    // End of variables declaration//GEN-END:variables
}