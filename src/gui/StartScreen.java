/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;

public class StartScreen extends JFrame {

    public StartScreen() {
        initComponents();
        setBounds(0, 0, 438, 508);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        icon = new JLabel();
        btnStart = new JButton();
        btnExit = new JButton();
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        icon.setIcon(new ImageIcon(this.getClass().getResource("/assets/logo.png")));
        getContentPane().add(icon);
        icon.setBounds(50, 30, 330, 150);

        btnStart.setFont(new Font("Ubuntu", 1, 18));
        btnStart.setForeground(new Color(254, 254, 254));
        btnStart.setText("Start Game");
        btnStart.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(254, 254, 254), 2));
        btnStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnStart.setOpaque(false);
        btnStart.setContentAreaFilled(false);

        btnStart.setBorder(new LineBorder(Color.WHITE));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(150, 260, 140, 50);

        btnExit.setFont(new Font("Ubuntu", 1, 18));
        btnExit.setForeground(new Color(254, 254, 254));
        btnExit.setText("Exit");
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);

        btnExit.setBorder(new LineBorder(Color.WHITE));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(150, 340, 140, 50);

        background.setIcon(new ImageIcon(this.getClass().getResource("/assets/background.jpg")));
        getContentPane().add(background);
        background.setBounds(-1, -3, 440, 510);

    }

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {
        new ChooseTeamScreen().setVisible(true);
        dispose();
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    private JLabel background;
    private JButton btnExit;
    private JButton btnStart;
    private JLabel icon;
}