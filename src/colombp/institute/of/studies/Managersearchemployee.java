/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package colombp.institute.of.studies;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class Managersearchemployee extends javax.swing.JFrame {

    private static final String username="root";
    private static final String password="";
    private static final String dataConn="jdbc:mysql://localhost:3306/colombo_institute";
    
    java.sql.Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int n1,n2;
    
    
    public Managersearchemployee() {
        initComponents();
        viewAll();
    }

    public void viewAll(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            pst=sqlConn.prepareStatement("SELECT * FROM employee ");
            rs=pst.executeQuery();
            DefaultTableModel tbModel=(DefaultTableModel)table4.getModel();
            tbModel.setRowCount(0);
            while(rs.next()){
                String EID=String.valueOf(rs.getInt("EmployeeID"));
                String name=rs.getString("name");
                String nic=rs.getString("NIC");
                String email=rs.getString("Email");
                String department=rs.getString("Department");
                String designation=rs.getString("Designation");
                String epfno=rs.getString("EPFno");
                String tbData[]={EID,name,nic,email,department,designation,epfno};
                tbModel.addRow(tbData);
            }
           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Database Connection Error","error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void search(String str){
         DefaultTableModel tblModel=(DefaultTableModel)table4.getModel();
         TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblModel);
         table4.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(str));
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        designation1 = new javax.swing.JTextField();
        department1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        epfno1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nhr = new javax.swing.JTextField();
        nichr = new javax.swing.JTextField();
        emailhr = new javax.swing.JTextField();
        dehr = new javax.swing.JTextField();
        desihr = new javax.swing.JTextField();
        epfhr = new javax.swing.JTextField();
        emhr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-circle-70.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("HR Manager");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setText("   Search Employeees");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, -1));

        designation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                designation1KeyReleased(evt);
            }
        });
        jPanel2.add(designation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));

        department1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                department1KeyReleased(evt);
            }
        });
        jPanel2.add(department1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 130, -1));

        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                name1KeyReleased(evt);
            }
        });
        jPanel2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        epfno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                epfno1KeyReleased(evt);
            }
        });
        jPanel2.add(epfno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 150, -1));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "NIC", "Email", "Department", "Designation", "EPF no"
            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 760, 100));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("  By Department");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 120, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("EPF no");
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 100, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setText("  By Designation");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 120, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText(" By Name");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton3.setText("update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("EPF no");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, -1));

        jLabel11.setBackground(new java.awt.Color(204, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Employee ID ");
        jLabel11.setOpaque(true);
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("Name");
        jLabel12.setOpaque(true);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        jLabel13.setBackground(new java.awt.Color(204, 255, 255));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("NIC");
        jLabel13.setOpaque(true);
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        jLabel14.setBackground(new java.awt.Color(204, 255, 255));
        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("Email");
        jLabel14.setOpaque(true);
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));

        jLabel15.setBackground(new java.awt.Color(204, 255, 255));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel15.setText("Department");
        jLabel15.setOpaque(true);
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, -1));

        jLabel16.setBackground(new java.awt.Color(204, 255, 255));
        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel16.setText("Designation");
        jLabel16.setOpaque(true);
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, -1));
        jPanel3.add(nhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, -1));
        jPanel3.add(nichr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, -1));
        jPanel3.add(emailhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, -1));
        jPanel3.add(dehr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 90, -1));
        jPanel3.add(desihr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 90, -1));
        jPanel3.add(epfhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 90, -1));
        jPanel3.add(emhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 470, 170));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mcghkxu9.png"))); // NOI18N
        jLabel5.setText("Employee ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, 500));

        setSize(new java.awt.Dimension(1000, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       HRManager HRManager=new HRManager();
             HRManager.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyReleased
         search(name1.getText());
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_name1KeyReleased

    private void department1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_department1KeyReleased


        search(department1.getText());

// TODO add your handling code here:
    }//GEN-LAST:event_department1KeyReleased

    private void designation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designation1KeyReleased

        search(designation1.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_designation1KeyReleased

    private void epfno1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epfno1KeyReleased

        search(epfno1.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_epfno1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel diModel = (DefaultTableModel)table4.getModel();

        if(table4.getSelectedRowCount()==1){
            diModel.removeRow(table4.getSelectedRow());

        }else{
            if(table4.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty!!");

            }else{
                JOptionPane.showMessageDialog(this,"Please select Single Row For Delete..");
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked

        
       
int selectedRow =table4.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel)table4.getModel();
       
        
       emhr.setText(tbModel.getValueAt(selectedRow,0).toString());
       nhr.setText(tbModel.getValueAt(selectedRow,1).toString());
       emailhr.setText(tbModel.getValueAt(selectedRow,2).toString());
       nichr.setText(tbModel.getValueAt(selectedRow,3).toString());
       dehr.setText(tbModel.getValueAt(selectedRow,4).toString());
       desihr.setText(tbModel.getValueAt(selectedRow,5).toString());
       epfhr.setText(tbModel.getValueAt(selectedRow,6).toString());
     



        // TODO add your handling code here:
    }//GEN-LAST:event_table4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked


try{
        int i = table4.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel)table4.getModel();
        if(i>=0)
        {
            tbModel.setValueAt(emhr.getText(), i, 0);
            tbModel.setValueAt(nhr.getText(), i, 1);
            tbModel.setValueAt(emailhr.getText(), i, 2);
            tbModel.setValueAt(nichr.getText(), i, 3);
            tbModel.setValueAt(dehr.getText(), i, 4);
            tbModel.setValueAt(desihr.getText(), i, 5);
            tbModel.setValueAt(epfhr.getText(), i, 6);
            
             
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        }catch(Exception e){
            
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Managersearchemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managersearchemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managersearchemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managersearchemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managersearchemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dehr;
    private javax.swing.JTextField department1;
    private javax.swing.JTextField designation1;
    private javax.swing.JTextField desihr;
    private javax.swing.JTextField emailhr;
    private javax.swing.JTextField emhr;
    private javax.swing.JTextField epfhr;
    private javax.swing.JTextField epfno1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField nhr;
    private javax.swing.JTextField nichr;
    private javax.swing.JTable table4;
    // End of variables declaration//GEN-END:variables
}
