/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookreview.admin;

import bookreview.Connect;
import bookreview.User;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AddModerator extends javax.swing.JFrame {

    /**
     * Creates new form AddModerator
     */
    Connect conn;
    private ModeratorForm moderatorForm;
    public AddModerator() {
        initComponents();
        conn = new Connect();
        tfUsername.setBackground(new java.awt.Color(0,0,0,1));
        tfFirstname.setBackground(new java.awt.Color(0,0,0,1));
        tfLastname.setBackground(new java.awt.Color(0,0,0,1));
        tfEmail.setBackground(new java.awt.Color(0,0,0,1));
        pfPassword.setBackground(new java.awt.Color(0,0,0,1));
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
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        tfFirstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        tfLastname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rSButtonRiple1 = new rojeru_san.RSButtonRiple();
        btnConfirm = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_crown_64px.png"))); // NOI18N
        jLabel3.setText("Add Moderator");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(199, 226, 255));
        lblUsername.setText("Username");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 341, -1));

        tfUsername.setFont(tfUsername.getFont().deriveFont(tfUsername.getFont().getSize()+2f));
        tfUsername.setForeground(new java.awt.Color(255, 255, 255));
        tfUsername.setBorder(null);
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 39));

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(199, 226, 255));
        lblUsername1.setText("Firstname");
        jPanel1.add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 341, -1));

        tfFirstname.setFont(tfFirstname.getFont().deriveFont(tfFirstname.getFont().getSize()+2f));
        tfFirstname.setForeground(new java.awt.Color(255, 255, 255));
        tfFirstname.setBorder(null);
        jPanel1.add(tfFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_________________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 290, 39));

        lblUsername2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(199, 226, 255));
        lblUsername2.setText("Lastname");
        jPanel1.add(lblUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 341, -1));

        tfLastname.setFont(tfLastname.getFont().deriveFont(tfLastname.getFont().getSize()+2f));
        tfLastname.setForeground(new java.awt.Color(255, 255, 255));
        tfLastname.setBorder(null);
        jPanel1.add(tfLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, 39));

        pfPassword.setFont(pfPassword.getFont().deriveFont(pfPassword.getFont().getSize()+2f));
        pfPassword.setForeground(new java.awt.Color(255, 255, 255));
        pfPassword.setBorder(null);
        pfPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 240, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 341, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 290, 40));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 40, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 40, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        lblUsername3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblUsername3.setForeground(new java.awt.Color(199, 226, 255));
        lblUsername3.setText("Email");
        jPanel1.add(lblUsername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 341, -1));

        tfEmail.setFont(tfEmail.getFont().deriveFont(tfEmail.getFont().getSize()+2f));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 240, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, 39));

        rSButtonRiple1.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonRiple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_left_arrow_32px.png"))); // NOI18N
        rSButtonRiple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRiple1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRiple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 140, 30));

        btnConfirm.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        pfPassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        pfPassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

    private void rSButtonRiple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRiple1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_rSButtonRiple1ActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        pfPassword.setEchoChar((char)8226);
        String password = String.valueOf(pfPassword.getPassword());
        boolean success = conn.registerModerator(new User(tfFirstname.getText(), tfLastname.getText(),tfUsername.getText(), password), tfEmail.getText());
        if(success) {
            this.dispose();
            addModeratorCallback();
            JOptionPane.showMessageDialog(null, "Moderator successfully added!");
        } else {
            JOptionPane.showMessageDialog(null, "Moderator already exists in the database!");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed
    
    public void setModeratorForm(ModeratorForm moderatorForm) {
        this.moderatorForm = moderatorForm;
    }
    
    public void addModeratorCallback() {
        if (moderatorForm != null) {
            moderatorForm.refreshTable();
        }
    }
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
            java.util.logging.Logger.getLogger(AddModerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddModerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddModerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddModerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddModerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnConfirm;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JPasswordField pfPassword;
    private rojeru_san.RSButtonRiple rSButtonRiple1;
    private javax.swing.JLabel show;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstname;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

}