/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsalemanagement;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class loginform extends javax.swing.JFrame {

    Connection con = null;
    
    public loginform() {
        initComponents();
        createConnection();   
    }
    
    
    
    void createConnection(){
        String className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver loaded Successfully");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","9823Nan@831");
            System.out.println("Connection Successfull");
      
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver loding Failed");
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            System.out.println(ex.getMessage());
        }
    }
    
    public void validateUser(){
        ResultSet rs;
        String username= usernamet.getText();
        String password= passt.getText();
        
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(("SELECT * from register WHERE username='"+username+"' AND password='"+password+"'"));
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(this,"Incorrect Username or Password");
            }else{
                if(username.equals("admin")){
                    Welcome jf = new Welcome();
                    jf.show();
                    dispose();
                }else{
                    UserWelcome jf = new UserWelcome();
                    jf.show();
                    dispose();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginform.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernamet = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(73, 31, 61));
        jPanel3.setPreferredSize(new java.awt.Dimension(210, 300));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("ABC");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(189, 76, 84));
        jLabel5.setText("  NextGenerationAutomobile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        jPanel5.setBackground(new java.awt.Color(189, 76, 84));
        jPanel5.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 5, -1, 20));

        usernamet.setBackground(new java.awt.Color(186, 79, 84));
        usernamet.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        usernamet.setForeground(new java.awt.Color(255, 255, 255));
        usernamet.setText("Username");
        usernamet.setBorder(null);
        usernamet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernametFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernametFocusLost(evt);
            }
        });
        usernamet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernametMouseClicked(evt);
            }
        });
        usernamet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametActionPerformed(evt);
            }
        });
        usernamet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernametKeyPressed(evt);
            }
        });
        jPanel5.add(usernamet, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 218, 29));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 115, 218, -1));

        passt.setBackground(new java.awt.Color(186, 79, 84));
        passt.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        passt.setForeground(new java.awt.Color(255, 255, 255));
        passt.setText("Password");
        passt.setBorder(null);
        passt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passtFocusLost(evt);
            }
        });
        passt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passtMouseClicked(evt);
            }
        });
        passt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtActionPerformed(evt);
            }
        });
        passt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passtKeyPressed(evt);
            }
        });
        jPanel5.add(passt, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 152, 218, 28));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 186, 221, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Signin");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 85, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Signup");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 85, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 300, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametActionPerformed

    private void passtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void usernametFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametFocusGained
        if(usernamet.getText().equals("Username")){
           usernamet.setText(null);
           usernamet.requestFocus();
           
       }
    }//GEN-LAST:event_usernametFocusGained

    private void passtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtFocusGained
        if(passt.getText().equals("Password")){
           passt.setText(null);
           passt.requestFocus();
           
       }
    }//GEN-LAST:event_passtFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         validateUser(); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ResultSet rs1;
        Statement st1;
        String admin= "admin";
        try {
            st1 = con.createStatement();
            rs1 = st1.executeQuery("SELECT * from register WHERE username='"+admin+"'");
            
            if(!rs1.next()){
                registationform jf = new registationform();
                jf.show();
                dispose();
            }else{
                adminlogin jf = new adminlogin();
                jf.show();
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usernametKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernametKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            passt.requestFocus();
        }
    }//GEN-LAST:event_usernametKeyPressed

    private void passtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            validateUser();
        }
    }//GEN-LAST:event_passtKeyPressed

    private void usernametFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametFocusLost
         if(usernamet.getText().length()==0){
           usernamet.setText("Username");
       }
    }//GEN-LAST:event_usernametFocusLost

    private void passtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtFocusLost
        if(passt.getText().length()==0){
           passt.setText("Password");
       }
    }//GEN-LAST:event_passtFocusLost

    private void usernametMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernametMouseClicked
        
    }//GEN-LAST:event_usernametMouseClicked

    private void passtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtMouseClicked
        
    }//GEN-LAST:event_passtMouseClicked

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
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passt;
    private javax.swing.JTextField usernamet;
    // End of variables declaration//GEN-END:variables
}
