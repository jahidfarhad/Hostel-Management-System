
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPage
     */
    public UserPage() {
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField_Father_Name = new javax.swing.JTextField();
        jTextField_Mother_Name = new javax.swing.JTextField();
        jTextField_Age = new javax.swing.JTextField();
        jLabel_Age = new javax.swing.JLabel();
        jLabel_Mother_Name = new javax.swing.JLabel();
        jLabelFather_Name = new javax.swing.JLabel();
        jLabel_User_Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Job = new javax.swing.JLabel();
        jTextField_Job = new javax.swing.JTextField();
        jLabel_Gender = new javax.swing.JLabel();
        jTextField_Gender = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_User_Name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_User_Address = new javax.swing.JLabel();
        jLabel_Phone_Number = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField_User_Phone_Number = new javax.swing.JTextField();
        jTextField_User_Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButton1.setText(" Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 65, 140, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 64, 191, 33));
        getContentPane().add(jTextField_Father_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 190, 191, 33));
        getContentPane().add(jTextField_Mother_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 240, 191, 33));

        jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AgeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 306, 191, 33));

        jLabel_Age.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Age.setText("Age");
        getContentPane().add(jLabel_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 308, -1, -1));

        jLabel_Mother_Name.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Mother_Name.setText("Mother's Name");
        getContentPane().add(jLabel_Mother_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 250, -1, -1));

        jLabelFather_Name.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabelFather_Name.setText("Father's Name");
        getContentPane().add(jLabelFather_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 200, -1, -1));

        jLabel_User_Name.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_User_Name.setText("User's Name");
        getContentPane().add(jLabel_User_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 67, -1, -1));

        jLabel_Job.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Job.setText("Job");
        getContentPane().add(jLabel_Job, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 381, -1, -1));
        getContentPane().add(jTextField_Job, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 379, 191, 33));

        jLabel_Gender.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Gender.setText("Gender");
        getContentPane().add(jLabel_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 446, -1, -1));

        jTextField_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 444, 191, 33));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("HOME");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));
        jPanel2.add(jTextField_User_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 142, 191, 33));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Password.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Password.setText("Password");
        jPanel1.add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 122, -1, -1));

        jLabel_User_Address.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_User_Address.setText("User's Address");
        jPanel1.add(jLabel_User_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel_Phone_Number.setFont(new java.awt.Font("Marcellus", 1, 18)); // NOI18N
        jLabel_Phone_Number.setText("Phone Number");
        jPanel1.add(jLabel_Phone_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Seat NO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 191, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Monthly Cost");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 191, 35));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 191, 34));
        jPanel1.add(jTextField_User_Phone_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 191, 33));
        jPanel1.add(jTextField_User_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 191, 33));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 450, 270));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    String User_ID= jTextField1.getText();
        
        Connection con;
     PreparedStatement pst;
     ResultSet rs;
        
        try {
            con = Connection1.createConnection();
            pst = con.prepareStatement("SELECT *FROM users WHERE User_ID = ?");
            pst.setString(1, User_ID);
            rs=pst.executeQuery();
           if(rs.next()){
           String add1=rs.getString("User_Name");
           jTextField_User_Name.setText(add1);
           String add2=rs.getString("Father_Name");
           jTextField_Father_Name.setText(add2);
           String add3=rs.getString("Mother_Name");
           jTextField_Mother_Name.setText(add3);
           
           String add4=rs.getString("Age");
           jTextField_Age.setText(add4);           
           String add5=rs.getString("Gender");
           jTextField_Gender.setText(add5);
           String add6=rs.getString("Job");
           jTextField_Job.setText(add6);
           String add7=rs.getString("User_Phone_Number");
           jTextField_User_Phone_Number.setText(add7);
           String add8=rs.getString("User_Address");
            jTextField_User_Address.setText(add8);
           String add9=rs.getString("Password");
            jTextFieldPassword.setText(add9);
           String add10=rs.getString("Seat_No");
            jTextField2.setText(add10);
           String add11=rs.getString("Monthly_Cost");
            jTextField3.setText(add11);
           JOptionPane.showMessageDialog(null, "SEARCH SUCCESFULLY");
           }
                    
            
            
       } catch (SQLException ex) {
            Logger.getLogger(AdminLoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AgeActionPerformed

    private void jTextField_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GenderActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
       HomePage h= new HomePage();
       h.show();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    
 
 
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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFather_Name;
    private javax.swing.JLabel jLabel_Age;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Job;
    private javax.swing.JLabel jLabel_Mother_Name;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone_Number;
    private javax.swing.JLabel jLabel_User_Address;
    private javax.swing.JLabel jLabel_User_Name;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Father_Name;
    private javax.swing.JTextField jTextField_Gender;
    private javax.swing.JTextField jTextField_Job;
    private javax.swing.JTextField jTextField_Mother_Name;
    private javax.swing.JTextField jTextField_User_Address;
    private javax.swing.JTextField jTextField_User_Name;
    private javax.swing.JTextField jTextField_User_Phone_Number;
    // End of variables declaration//GEN-END:variables
}
