/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author mylaptop
 */
public class ChooseTeamScreen extends JFrame {

    public ChooseTeamScreen() {
        initComponents();
        setBounds(0, 0, 540, 360);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        team1Label = new JLabel();
        team2Label = new JLabel();
        joinTeam1Btn = new JButton();
        joinTeam2Btn = new JButton();
        team1Players = new JLabel();
        team2Players = new JLabel();
        team1Points = new JLabel();
        team2Points = new JLabel();
        background = new JLabel();

        getContentPane().setLayout(null);

        team1Label.setFont(new Font("Ubuntu", 1, 18));
        team1Label.setForeground(new Color(254, 254, 254));
        team1Label.setText("Team1");
        getContentPane().add(team1Label);
        team1Label.setBounds(59, 47, 60, 20);

        team2Label.setFont(new Font("Ubuntu", 1, 18));
        team2Label.setForeground(new Color(254, 254, 254));
        team2Label.setText("Team2");
        getContentPane().add(team2Label);
        team2Label.setBounds(60, 180, 60, 30);

        joinTeam1Btn.setFont(new Font("Ubuntu", 1, 15));
        joinTeam1Btn.setForeground(new Color(254, 254, 254));
        joinTeam1Btn.setText("Join");
        joinTeam1Btn.setBorder(new javax.swing.border.LineBorder(new Color(254, 254, 254), 2, true));
        joinTeam1Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        joinTeam1Btn.setOpaque(false);
        joinTeam1Btn.setContentAreaFilled(false);
        getContentPane().add(joinTeam1Btn);
        joinTeam1Btn.setBounds(370, 40, 70, 30);
        joinTeam1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGameScreen();
            }
        });

        joinTeam2Btn.setFont(new Font("Ubuntu", 1, 15));
        joinTeam2Btn.setForeground(new Color(254, 254, 254));
        joinTeam2Btn.setText("Join");
        joinTeam2Btn.setBorder(new javax.swing.border.LineBorder(new Color(254, 254, 254), 2, true));
        joinTeam2Btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        joinTeam2Btn.setOpaque(false);
        joinTeam2Btn.setContentAreaFilled(false);
        getContentPane().add(joinTeam2Btn);
        joinTeam2Btn.setBounds(370, 180, 70, 30);
        joinTeam2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGameScreen();
            }
        });

        team1Players.setFont(new Font("Ubuntu", 1, 15));
        team1Players.setForeground(new Color(254, 254, 254));
        team1Players.setText("12 Players");
        getContentPane().add(team1Players);
        team1Players.setBounds(130, 80, 80, 30);

        team2Players.setFont(new Font("Ubuntu", 1, 15));
        team2Players.setForeground(new Color(254, 254, 254));
        team2Players.setText("12 Players");
        getContentPane().add(team2Players);
        team2Players.setBounds(130, 220, 80, 30);

        team1Points.setFont(new Font("Ubuntu", 1, 15));
        team1Points.setForeground(new Color(254, 254, 254));
        team1Points.setText("100 Points");
        getContentPane().add(team1Points);
        team1Points.setBounds(130, 260, 80, 30);

        team2Points.setFont(new Font("Ubuntu", 1, 15));
        team2Points.setForeground(new Color(254, 254, 254));
        team2Points.setText("100 Points");
        getContentPane().add(team2Points);
        team2Points.setBounds(130, 120, 80, 30);

        background.setIcon(new ImageIcon(this.getClass().getResource("/assets/background.jpg")));
        getContentPane().add(background);
        background.setBounds(0, 0, 540, 360);
    }

    private void openGameScreen(){
        dispose();
        new GameScreen().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseTeamScreen().setVisible(true);
            }
        });
    }

    private JLabel team1Label;
    private JLabel team2Label;
    private JLabel team1Players;
    private JLabel team2Players;
    private JLabel team1Points;
    private JLabel team2Points;
    private JLabel background;
    private JButton joinTeam1Btn;
    private JButton joinTeam2Btn;
}