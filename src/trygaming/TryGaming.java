/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trygaming;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author linhsama
 */
public class TryGaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Sample frame");
        myFrame.setSize(300,400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        JPanel panel = new Game();
        myFrame.add(panel);
    }
    
}
