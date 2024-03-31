/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombp.institute.of.studies;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;


public class employeeee extends javax.swing.JFrame {

    private static final String username="root";
    private static final String password="";
    private static final String dataconn="jdbc:mysql://localhost:3306/colombo_institute";
    
    
    Connection sqlconn=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    
    public employeeee() {
        initComponents();
        background();
    }

    public void background(){
         /* ImageIcon icon3=new ImageIcon("icon/save.png");
        Image img3=icon3.getImage();
        Image imgscale3=img3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleicon3=new ImageIcon(imgscale3);
        jLabel12.setIcon(scaleicon3);
        
        
        ImageIcon icon4=new ImageIcon("icon/goback.png");
        Image img4=icon4.getImage();
        Image imgscale4=img4.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon scaleicon4=new ImageIcon(imgscale4);
        jLabel22.setIcon(scaleicon4);
        
        */
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Eaddress = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        Ename = new javax.swing.JTextField();
        Epf = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        employeeid = new javax.swing.JTextField();
        department = new javax.swing.JComboBox<>();
        designation = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N
        jPanel20.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-circle-70.png"))); // NOI18N
        jPanel20.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel20.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setText("HR Manager");
        jLabel8.setOpaque(true);
        jPanel20.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Department");
        jLabel45.setOpaque(true);
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("     Add employee");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 810, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setInheritsPopupMenu(false);
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Employee ID");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("EPF no");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 20));
        jPanel2.add(Eaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 180, 30));
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));
        jPanel2.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 180, 30));
        jPanel2.add(Ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, 30));

        Epf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(Epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Designation");
        jLabel46.setOpaque(true);
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("NIC");
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 20));
        jPanel2.add(employeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, 30));

        department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentMouseClicked(evt);
            }
        });
        jPanel2.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, -1));

        designation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                designationMouseClicked(evt);
            }
        });
        jPanel2.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 180, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("submit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(815, 815, 815))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1000, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void departmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseClicked

       try{
           Class.forName("com.mysql.jdbc.Driver");
           sqlconn=DriverManager.getConnection(dataconn, username, password );
           Statement st = sqlconn.createStatement();
           ResultSet rs = st.executeQuery("Select DepartmentName from departments");
           
           while(rs.next()){
               
            
           
               String DepartmentName = rs.getString("DepartmentName");
               department.addItem(DepartmentName);
           }
         sqlconn.close();
       }catch(Exception e){
         
       }





        // TODO add your handling code here:
    }//GEN-LAST:event_departmentMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        
        if(Ename.getText().isEmpty()||employeeid.getText().isEmpty()||email.getText().isEmpty()||Epf.getText().isEmpty()||Eaddress.getText().isEmpty()||nic.getText().isEmpty()||department.getSelectedItem().toString().isEmpty()||designation.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill up the form properly","Error",JOptionPane.ERROR_MESSAGE );
            
        }else 
            
            
        try{
            
                      Class.forName("com.mysql.jdbc.Driver");
                      sqlconn=DriverManager.getConnection(dataconn, username, password );
                      pst=sqlconn.prepareStatement("insert into employee(Name,EmployeeID,Email,EPFno,Address,NIC,Department,Designation) value(?,?,?,?,?,?,?,?)");
                      pst.setString(1,Ename.getText());
                      pst.setString(2,employeeid.getText());
                      pst.setString (3,email.getText());
                      pst.setString(4,Epf.getText());
                      pst.setString(5,Eaddress.getText());
                      pst.setString(6,nic.getText());
                     pst.setString(7,department.getSelectedItem().toString());
                      pst.setString(8,designation.getSelectedItem().toString());
                      pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record added successfully");  
   
            
        }catch(Exception ex){
                       JOptionPane.showMessageDialog(this, ex);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void designationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_designationMouseClicked

        
      try{
           Class.forName("com.mysql.jdbc.Driver");
           sqlconn=DriverManager.getConnection(dataconn, username, password );
           Statement st = sqlconn.createStatement();
           ResultSet rs = st.executeQuery("Select Designationtype from job");
           
           while(rs.next()){
               
              
           
             
               String Designationtype = rs.getString("Designationtype");
               designation.addItem(Designationtype);
           }
         sqlconn.close();
         
         
       }catch(Exception e){








        // TODO add your handling code here:
    }//GEN-LAST:event_designationMouseClicked
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       HRManager HRMA = new HRManager();
       HRMA.setVisible(true);
       this.hide();
    
    }//GEN-LAST:event_jButton2MouseClicked


    
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
            java.util.logging.Logger.getLogger(employeeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Eaddress;
    private javax.swing.JTextField Ename;
    private javax.swing.JTextField Epf;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JTextField email;
    private javax.swing.JTextField employeeid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables
}


class Item{
    String DepartmentName;
    public Item(String DepartmentName){
        this.DepartmentName=DepartmentName;
        
    }
    @Override
    public String toString(){
       return DepartmentName; 
    }
    
 class Item2{
    String Designationtype;
    public Item2(String Designationtype){
        this.Designationtype=Designationtype;
        
    }
    @Override
    public String toString(){
       return Designationtype; 
    }   
    
}
}