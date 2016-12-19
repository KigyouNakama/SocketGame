/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author mylaptop
 */
public class DetailsDialog {
	
	public static void display(int i) {
		String[] args = {"", ""};
		
		String[] items = {"1", "2", "3", "4", "5", "6"};
		
		JComboBox<String> combobox = new JComboBox<String>(items);
		JPanel panel = new JPanel(new GridLayout(0, 1));
		JTextField host_ip = new JTextField(" ");
		if(i == 0){
			panel.add(new JLabel("Number of Human Player:"));
			panel.add(combobox);
		}
		else{
			panel.add(new JLabel("Host IP Address:"));
			panel.add(host_ip);	
		}

		int result = JOptionPane.showConfirmDialog(null, panel, "FlightJetGame",
			JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {
			if(StartScreen.isHost()){
				int numberPlayers = Integer.valueOf((String) combobox.getSelectedItem());
				if(numberPlayers <= 6 && numberPlayers != 1){
					int humanPlayer = numberPlayers;

					if(StartScreen.isHost()){
						args[0] = "0";
						args[1] = Integer.toString(humanPlayer - 1);
					}
					else{
						args[0] = "1";
						args[1] =  host_ip.getText();
						args[1] = args[1].trim();
					}
					//Game game = new Game(Integer.parseInt(args[0]), args);
					//game.setVisible(true);
				}
				else{
					if(StartScreen.isHost()){
						if(numberPlayers > 6){
							ToastMessage toastMessage = new DetailsDialog().new ToastMessage("Error: MAX 6 Player Allowed!", 5000);
							toastMessage.setVisible(true);
							display(i);
						}
						else if(numberPlayers == 1){
							ToastMessage toastMessage = new DetailsDialog().new ToastMessage("Error: AT LEAST 2 Player!", 5000);
							toastMessage.setVisible(true);
							display(i);
						}
					}
				}
			}
			else{
				args[0] = "1";
				args[1] =  host_ip.getText();
				args[1] = args[1].trim();
				
				//Game game = new Game(Integer.parseInt(args[0]), args);
				//game.setVisible(true);
			}
		}
	}
	public class ToastMessage extends JDialog{
		int miliseconds;
		public ToastMessage(String toastString, int time) {
			this.miliseconds = time;
			setUndecorated(true);
			getContentPane().setLayout(new BorderLayout(0, 0));

			JPanel panel = new JPanel();
			panel.setBackground(Color.GRAY);
			panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
			getContentPane().add(panel, BorderLayout.CENTER);

			JLabel toastLabel = new JLabel("");
			toastLabel.setText(toastString);
			toastLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			toastLabel.setForeground(Color.WHITE);

			setBounds(100, 100, toastLabel.getPreferredSize().width + 20, 31);


			setAlwaysOnTop(true);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			int y = dim.height / 2 - getSize().height / 2;
			int half = y / 2;
			setLocation(dim.width / 2-getSize().width / 2, y + half);
			panel.add(toastLabel);
			setVisible(false);

			new Thread(){
				public void run() {
					try {
						Thread.sleep(miliseconds);
						dispose();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}