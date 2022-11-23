package rt;

import java.awt.Color;
import javax.swing.JOptionPane;
import img.scimage;
import java.awt.event.KeyEvent;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        implementasi2 imp = new implementasi2();
        tst.setText(imp.jargon());
        butLogin.setBackground(Color.white);
        butExit.setBackground(Color.white);
//        scalenow();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tst = new javax.swing.JLabel();
        butExit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        butLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tst.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        tst.setText("p");
        getContentPane().add(tst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 360, 20));

        butExit.setText("EXIT");
        butExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butExitMouseExited(evt);
            }
        });
        butExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExitActionPerformed(evt);
            }
        });
        getContentPane().add(butExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 330, 80));

        txtUser.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 24)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("username");
        txtUser.setBorder(null);
        txtUser.setBackground (new java.awt.Color(0,0,0,1));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUserMouseExited(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 240, 50));
        txtUser.getAccessibleContext().setAccessibleName("");

        butLogin.setForeground(new java.awt.Color(51, 51, 0));
        butLogin.setText("LOGIN");
        butLogin.setBorder(null);
        butLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butLoginMouseExited(evt);
            }
        });
        butLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLoginActionPerformed(evt);
            }
        });
        getContentPane().add(butLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 330, 80));

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("password");
        txtPass.setBorder(null);
        txtPass.setBackground (new java.awt.Color(0,0,0,1));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPassMouseExited(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fixLogin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExitActionPerformed
        //        JPanel
        System.exit(0);
    }//GEN-LAST:event_butExitActionPerformed

    private void butLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLoginActionPerformed
        
        implementasi2 impel = new implementasi2();
        impel.setPassword();
        if(txtUser.getText().equals("admin")&& txtPass.getText().equals(impel.getPassword())){
            new mainmenu().show();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Masukkan Username dan Password dengan benar");
        }
    }//GEN-LAST:event_butLoginActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseEntered

//        txtUser.
        if (txtUser.getText().equals("username") || txtUser.getText() == ""){
            txtUser.setForeground(Color.BLACK);
            txtUser.setText("");
        }
        
    }//GEN-LAST:event_txtUserMouseEntered

    private void butLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butLoginMouseEntered
        // TODO add your handling code here:
        butLogin.setBackground(Color.gray);
    }//GEN-LAST:event_butLoginMouseEntered

    private void butLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butLoginMouseExited
        // TODO add your handling code here:
        butLogin.setBackground(Color.white);
    }//GEN-LAST:event_butLoginMouseExited

    private void butExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExitMouseEntered
        // TODO add your handling code here:
        butExit.setBackground(Color.gray);
    }//GEN-LAST:event_butExitMouseEntered

    private void butExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butExitMouseExited
        // TODO add your handling code here:
        butExit.setBackground(Color.white);
    }//GEN-LAST:event_butExitMouseExited

    private void txtUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseExited
        // TODO add your handling code here:
        if (txtUser.getText().equals("")){
            txtUser.setText("username");
            txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMouseExited

    private void txtPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseEntered
        // TODO add your handling code here:
        if (txtPass.getText().equals("password") || txtPass.getText() == ""){
            txtPass.setForeground(Color.BLACK);
            txtPass.setText("");
        }
    }//GEN-LAST:event_txtPassMouseEntered

    private void txtPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseExited
        // TODO add your handling code here:
        if (txtPass.getText().equals("")){
            txtPass.setText("password");
            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassMouseExited

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
                // TODO add your handling code here:
        if (txtUser.getText().equals("username") || txtUser.getText() == ""){
            txtUser.setForeground(Color.BLACK);
            txtUser.setText("");
        }
    }//GEN-LAST:event_txtUserKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butExit;
    private javax.swing.JButton butLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tst;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void scalenow(){
        scimage s = new scimage ();
        
//        imgBg.setIcon(s.Scale(imgBg, "img/a.jpg"));
//        imgUser.setIcon(s.Scale(imgUser, "img/u.png"));
    }
}
