/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author mylaptop
 */
public class StartScreen extends javax.swing.JFrame {

    GameScreen gs = new GameScreen();
    /**
     * Creates new form StartScreen
     */
    public StartScreen() {
        initComponents();
        setBounds(0, 0, 438, 508);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        icon.setIcon(new javax.swing.ImageIcon("/home/mylaptop/NetBeansProjects/SocketGame/src/assets/logo.png")); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(50, 30, 330, 150);

        btnStart.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(254, 254, 254));
        btnStart.setText("Start Game");
        btnStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254), 2));
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.setOpaque(false);
        btnStart.setContentAreaFilled(false);

        btnStart.setBorder(new LineBorder(Color.WHITE));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(150, 240, 140, 50);

        btnOption.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnOption.setForeground(new java.awt.Color(254, 254, 254));
        btnOption.setText("Options");
        btnOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOption.setOpaque(false);
        btnOption.setContentAreaFilled(false);

        btnOption.setBorder(new LineBorder(Color.WHITE));
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });
        getContentPane().add(btnOption);
        btnOption.setBounds(150, 310, 140, 50);

        btnExit.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(254, 254, 254));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);

        btnExit.setBorder(new LineBorder(Color.WHITE));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(150, 380, 140, 50);

        background.setIcon(new javax.swing.ImageIcon("/home/mylaptop/NetBeansProjects/SocketGame/src/assets/background.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(-1, -3, 440, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOptionActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        gs.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        gs.setVisible(false);
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel icon;
    // End of variables declaration//GEN-END:variables
}
