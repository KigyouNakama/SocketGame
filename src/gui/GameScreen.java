/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author mylaptop
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class GameScreen extends JFrame implements KeyListener {

	/**
	 * Creates new form GameScreen
	 */
	
	private JLabel background = new JLabel();
	
	private JLabel plane1 = new JLabel();
	private JLabel plane2 = new JLabel();

	private JLabel player1Label = new JLabel();
	private JLabel player2Label = new JLabel();
	private JLabel player3Label = new JLabel();
	private JLabel player4Label = new JLabel();
	private JLabel player5Label = new JLabel();
	private JLabel player6Label = new JLabel();

	private JLabel player1Point = new JLabel();
	private JLabel player2Point = new JLabel();
	private JLabel player3Point = new JLabel();
	private JLabel player4Point = new JLabel();
	private JLabel player5Point = new JLabel();
	private JLabel player6Point = new JLabel();
	
	private JPanel panelInfo = new JPanel();

	static boolean inGame = true;

	public GameScreen() {
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

		getContentPane().setLayout(null);

		panelInfo.setOpaque(false);
		panelInfo.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
		panelInfo.setLayout(null);

		player1Label.setFont(new Font("Ubuntu", 1, 15));
		player1Label.setForeground(new Color(254, 254, 254));
		player1Label.setText("Player1:");
		panelInfo.add(player1Label);
		player1Label.setBounds(10, 40, 60, 20);

		player1Point.setFont(new Font("Ubuntu", 1, 15));
		player1Point.setForeground(new Color(254, 254, 254));
		player1Point.setText("100p");
		panelInfo.add(player1Point);
		player1Point.setBounds(90, 40, 60, 20);

		player2Label.setFont(new Font("Ubuntu", 1, 15));
		player2Label.setForeground(new Color(254, 254, 254));
		player2Label.setText("Player2:");
		panelInfo.add(player2Label);
		player2Label.setBounds(10, 80, 60, 20);

		player2Point.setFont(new Font("Ubuntu", 1, 15));
		player2Point.setForeground(new Color(254, 254, 254));
		player2Point.setText("100p");
		panelInfo.add(player2Point);
		player2Point.setBounds(90, 80, 60, 20);

		player3Label.setFont(new Font("Ubuntu", 1, 15));
		player3Label.setForeground(new Color(254, 254, 254));
		player3Label.setText("Player3:");
		panelInfo.add(player3Label);
		player3Label.setBounds(10, 120, 60, 20);

		player3Point.setFont(new Font("Ubuntu", 1, 15));
		player3Point.setForeground(new Color(254, 254, 254));
		player3Point.setText("100p");
		panelInfo.add(player3Point);
		player3Point.setBounds(90, 120, 60, 20);

		player4Label.setFont(new Font("Ubuntu", 1, 15));
		player4Label.setForeground(new Color(254, 254, 254));
		player4Label.setText("Player4:");
		panelInfo.add(player4Label);
		player4Label.setBounds(10, 160, 60, 20);

		player4Point.setFont(new Font("Ubuntu", 1, 15));
		player4Point.setForeground(new Color(254, 254, 254));
		player4Point.setText("100p");
		panelInfo.add(player4Point);
		player4Point.setBounds(90, 160, 60, 20);

		player5Label.setFont(new Font("Ubuntu", 1, 15));
		player5Label.setForeground(new Color(254, 254, 254));
		player5Label.setText("Player5:");
		panelInfo.add(player5Label);
		player5Label.setBounds(10, 200, 60, 20);

		player5Point.setFont(new Font("Ubuntu", 1, 15));
		player5Point.setForeground(new Color(254, 254, 254));
		player5Point.setText("100p");
		panelInfo.add(player5Point);
		player5Point.setBounds(90, 200, 60, 20);

		player6Label.setFont(new Font("Ubuntu", 1, 15));
		player6Label.setForeground(new Color(254, 254, 254));
		player6Label.setText("Player6:");
		panelInfo.add(player6Label);
		player6Label.setBounds(10, 240, 60, 20);

		player6Point.setFont(new Font("Ubuntu", 1, 15));
		player6Point.setForeground(new Color(254, 254, 254));
		player6Point.setText("100p");
		panelInfo.add(player6Point);
		player6Point.setBounds(90, 240, 60, 20);

		getContentPane().add(panelInfo);
		panelInfo.setBounds(0, 0, 180, 598);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		plane1.setIcon(new ImageIcon(this.getClass().getResource("/assets/plane1.png")));
		getContentPane().add(plane1);
		plane1.setBounds(420, 505, 50, 93);

		plane2.setIcon(new ImageIcon(this.getClass().getResource("/assets/plane2.png")));
		getContentPane().add(plane2);
		plane2.setBounds(420, 3, 50, 93);

		background.setIcon(new ImageIcon(this.getClass().getResource("/assets/background.jpg")));
		getContentPane().add(background);
		background.setBounds(0, 0, 900, 600);

		setBounds(0, 0, 900, 600);
		setResizable(false);
		setTitle("Fighter Jet Game");

		addKeyListener(this);
	}// </editor-fold>//GEN-END:initComponents

	public void keyReleased(KeyEvent ke){

	}

	public void keyTyped(KeyEvent ke){

	}

	public void keyPressed(KeyEvent ke) {
		int keyPad = ke.getKeyCode();
		int x = plane1.getX();
		int y = plane1.getY();

		if (keyPad == KeyEvent.VK_LEFT) {
			if(x >= 187){
				x -= 7;
				plane1.setBounds(x, y, 50, 93);
			}
		} 
		else if (keyPad == KeyEvent.VK_RIGHT) {
			if(x <= 843){
				x += 7;
				plane1.setBounds(x, y, 50, 93);
			}
		} 
		else if (keyPad == KeyEvent.VK_UP) {
			if(y >= 10){
				y -= 7;
				plane1.setBounds(x, y, 50, 93);
			}
		} 
		else if (keyPad == KeyEvent.VK_DOWN) {
			if(y <= 498){
				y += 7;
				plane1.setBounds(x, y, 50, 93);
			}
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
			java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GameScreen().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	// End of variables declaration//GEN-END:variables
}
