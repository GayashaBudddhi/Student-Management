/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Spot_Test_Manage.main;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static org.joda.time.format.ISODateTimeFormat.date;

/**
 *
 * @author MyCom
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
      
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nam = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        eml = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        pos = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tel1 = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JEEWA EDUCATION");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student  Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Employee Management");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Employee ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Email");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 60, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Telephone");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 330, 21));

        nam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });
        jPanel2.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 330, 20));

        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 327, 20));

        eml.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        eml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emlActionPerformed(evt);
            }
        });
        jPanel2.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 330, -1));

        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 330, 20));

        pos.setEditable(true);
        pos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lecturer", "Staff" }));
        pos.setBorder(null);
        pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posActionPerformed(evt);
            }
        });
        jPanel2.add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 326, 20));

        jPanel4.setBackground(new java.awt.Color(0, 51, 255));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("         Save");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Date Of Birth");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setText("Position");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        tel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(tel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 330, 20));

        date.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                dateHierarchyChanged(evt);
            }
        });
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateMouseExited(evt);
            }
        });
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 330, -1));

        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Home");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
     
    }//GEN-LAST:event_jPanel1MouseEntered

    private void dateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseExited

    }//GEN-LAST:event_dateMouseExited

    private void dateHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_dateHierarchyChanged
        String Date =((JTextField)date.getDateEditor().getUiComponent()).getText();
    }//GEN-LAST:event_dateHierarchyChanged

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        String Eid =id.getText();
        String Nam =nam.getText();
        String Add =add.getText();
        String Date =((JTextField)date.getDateEditor().getUiComponent()).getText();
        String dat= "aa";
        String Email =eml.getText();
        String Tel =pass.getText();
        String Pos1 =(String)pos.getSelectedItem();
        // JOptionPane.showMessageDialog(null, Date);

        if("".equals(Eid)) {
            id.setBackground(Color.red);
        }
        else{
            id.setBackground(Color.WHITE);
            if("".equals(Nam)){
                 nam.setBackground(Color.red);
            }
            else{
               // nam.setBackground(Color.);
                if("".equals(Add)){
               //     c.setVisible(true);
                }
                else{
                   // c.setVisible(false);
                    if("".equals(dat)){
                       // d.setVisible(true);
                    }
                    else{
                      //  d.setVisible(false);
                        if("".equals(Email)){
                       //     e.setVisible(true);

                        }
                        else{
                          //  e.setVisible(false);
                            if("".equals(Tel)){
                           //     f.setVisible(true);
                            }
                            else{
                              //  f.setVisible(false);
                                if("".equals(Pos1)){
                                  //  g.setVisible(true);
                                }
                                else{
                                  //  g.setVisible(false);
                                    try {
                                       // Class.forName("org.apache.derby.jdbc.ClientDriver");
                                       // Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Employee","root","root");
                                       
                                        if(pos.getSelectedItem()=="Lecturer"){
                                             Class.forName("org.apache.derby.jdbc.ClientDriver");
                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");
                                        String sql="insert into lectureDetails(employeeid,name,address,email,telephone,dateofbirth) values(?,?,?,?,?,?)";    
                                          PreparedStatement pst=con.prepareStatement(sql); 
                                          JOptionPane.showMessageDialog(null, "LEC");
                                        pst.setString(1, Eid);
                                        pst.setString(2, Nam);
                                        pst.setString(3, Add);
                                        pst.setString(4, Email);
                                        pst.setString(5, Tel);
                                 
                                        pst.setString(6, Date);

                                        pst.execute();
                                        }
                                        if(pos.getSelectedItem()=="Staff"){
                                             Class.forName("org.apache.derby.jdbc.ClientDriver");
                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");
                                             JOptionPane.showMessageDialog(null, "STAFF");
                                          String sql="insert into staffDetails(employeeid,address,name,email,telephone,dateofbirth) values(?,?,?,?,?,?)";  
                                             PreparedStatement pst=con.prepareStatement(sql);
                                             pst.setString(1, Eid);
                                        pst.setString(2, Add);
                                        pst.setString(3, Nam);
                                        pst.setString(4, Email);
                                        pst.setString(5, Tel);
                                 
                                        pst.setString(6, Date);
                                         pst.execute();
                                        }
                                        
                                       

                                        
                                        
                                        

                                    } catch (ClassNotFoundException ex) {
                                        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }

                        }}}           }

                    }

    }//GEN-LAST:event_jLabel14MouseClicked

    private void emlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emlActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
{                                      
        String Eid =id.getText();
        String Nam =nam.getText();
        String Add =add.getText();
        String Date =((JTextField)date.getDateEditor().getUiComponent()).getText();
        String password=pass.getText();
        String dat= "aa";
        String Email =eml.getText();
        String Tel =tel1.getText();
        String Pos1 =(String)pos.getSelectedItem();
        // JOptionPane.showMessageDialog(null, Date);

        if("".equals(Eid)) {
            id.setBackground(Color.red);
        }
        else{
            id.setBackground(Color.WHITE);
            if("".equals(Nam)){
                 nam.setBackground(Color.red);
            }
            else{
                nam.setBackground(Color.WHITE);
                if("".equals(Add)){
                   add.setBackground(Color.red);
                }
                else{
                   add.setBackground(Color.WHITE);
                    if("".equals(dat)){
                       date.setBackground(Color.red);
                    }
                    else{
                      date.setBackground(Color.WHITE);
                      Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(Email);
                        if("".equals(Email) || !matcher.find()){
                       eml.setBackground(Color.red);

                        }
                        else{
                         eml.setBackground(Color.WHITE);
                         Matcher matcher1 = Pattern.compile("^[0-9]+$", Pattern.CASE_INSENSITIVE).matcher(Tel);
                            if("".equals(Tel) || !matcher1.find()){
                         tel1.setBackground(Color.red);
                            }
                            else{
                                
                              tel1.setBackground(Color.WHITE);
                                if("".equals(Pos1)){
                                  pos.setBackground(Color.red);
                                }
                                else{
                                 pos.setBackground(Color.WHITE);
                                 if("".equals(password)){
                                 pass.setBackground(Color.red);
                                }
                                else{
                                 pass.setBackground(Color.WHITE);
                                 
                                 
                                    try {
                                       
                                        if(pos.getSelectedItem()=="Lecturer"){
                                             Class.forName("org.apache.derby.jdbc.ClientDriver");
                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement","root","root");
                                        String sql="insert into lectureDetails(employeeid,name,address,email,telephone,dateofbirth,password) values(?,?,?,?,?,?,?)";    
                                          PreparedStatement pst=con.prepareStatement(sql); 
                                          JOptionPane.showMessageDialog(null, "LEC");
                                        pst.setString(1, Eid);
                                        pst.setString(2, Nam);
                                        pst.setString(3, Add);
                                        pst.setString(4, Email);
                                        pst.setString(5, Tel);
                                 
                                        pst.setString(6, Date);
                                        pst.setString(7, password);

                                        pst.execute();
                                        }
                                        if(pos.getSelectedItem()=="Staff"){
                                             Class.forName("org.apache.derby.jdbc.ClientDriver");
                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentManagement ","root","root");
                                             JOptionPane.showMessageDialog(null, "STAFF");
                                          String sql="insert into staffDetails(employeeid,address,name,email,telephone,dateofbirth,password) values(?,?,?,?,?,?,?)";  
                                             PreparedStatement pst=con.prepareStatement(sql);
                                             pst.setString(1, Eid);
                                        pst.setString(2, Add);
                                        pst.setString(3, Nam);
                                        pst.setString(4, Email);
                                        pst.setString(5, Tel);
                                 
                                        pst.setString(6, Date);
                                        pst.setString(7, password);
                                         pst.execute();
                                        }
                                        
                                       

                                        
                                        
                                        

                                    } catch (ClassNotFoundException ex) {
                                        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }}
                            }

                        }}}           }

                    }}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        // TODO add your handling code here:
          id.setText("");
        nam.setText("");
        add.setText("");
        ((JTextField)date.getDateEditor().getUiComponent()).setText("");
        eml.setText("");
        pass.setText("");
        pos.setSelectedItem("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField eml;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JTextField nam;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> pos;
    private javax.swing.JTextField tel1;
    // End of variables declaration//GEN-END:variables
}
