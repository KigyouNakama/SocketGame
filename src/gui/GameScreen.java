package gui;

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

public class GameScreen extends JFrame implements KeyListener{

	private JLabel background = new JLabel();
	private JLabel plane1 = new JLabel();
	private JLabel plane2 = new JLabel();
	private JLabel team1Label = new JLabel();
	private JLabel team1PointLabel = new JLabel();
	private JLabel team2Label = new JLabel();
	private JLabel team2PointLabel = new JLabel();
	private JLabel team1Player = new JLabel();
	private JLabel team1Point = new JLabel();
	private JLabel team2Player = new JLabel();
	private JLabel team2Point = new JLabel();
	private JPanel panelInfo = new JPanel();

	public GameScreen() {
		initComponents();
	}

	private void initComponents() {

		getContentPane().setLayout(null);

		panelInfo.setOpaque(false);
		panelInfo.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
		panelInfo.setLayout(null);

		team1Label.setFont(new Font("Ubuntu", 1, 15));
		team1Label.setForeground(new Color(254, 254, 254));
		team1Label.setText("Team1:");
		panelInfo.add(team1Label);
		team1Label.setBounds(10, 40, 51, 20);

		team1PointLabel.setFont(new Font("Ubuntu", 1, 15));
		team1PointLabel.setForeground(new Color(254, 254, 254));
		team1PointLabel.setText("Point");
		panelInfo.add(team1PointLabel);
		team1PointLabel.setBounds(10, 80, 40, 18);

		team2Label.setFont(new Font("Ubuntu", 1, 15));
		team2Label.setForeground(new Color(254, 254, 254));
		team2Label.setText("Team2:");
		panelInfo.add(team2Label);
		team2Label.setBounds(10, 140, 51, 18);

		team2PointLabel.setFont(new Font("Ubuntu", 1, 15));
		team2PointLabel.setForeground(new Color(254, 254, 254));
		team2PointLabel.setText("Point");
		panelInfo.add(team2PointLabel);
		team2PointLabel.setBounds(10, 180, 40, 18);

		team1Player.setFont(new Font("Ubuntu", 1, 15));
		team1Player.setForeground(new Color(254, 254, 254));
		team1Player.setText("12p");
		panelInfo.add(team1Player);
		team1Player.setBounds(80, 40, 49, 18);

		team1Point.setFont(new Font("Ubuntu", 1, 15));
		team1Point.setForeground(new Color(254, 254, 254));
		team1Point.setText("100");
		panelInfo.add(team1Point);
		team1Point.setBounds(80, 80, 40, 18);

		team2Player.setFont(new Font("Ubuntu", 1, 15));
		team2Player.setForeground(new Color(254, 254, 254));
		team2Player.setText("12p");
		panelInfo.add(team2Player);
		team2Player.setBounds(80, 140, 49, 18);

		team2Point.setFont(new Font("Ubuntu", 1, 15));
		team2Point.setForeground(new Color(254, 254, 254));
		team2Point.setText("100");
		panelInfo.add(team2Point);
		team2Point.setBounds(80, 180, 49, 18);

		getContentPane().add(panelInfo);
		panelInfo.setBounds(0, 0, 180, 598);

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
		setTitle("Fighter Jet Game");

		addKeyListener(this);
	}

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
}