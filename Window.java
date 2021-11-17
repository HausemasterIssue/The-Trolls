package dev.hause.window;

import java.awt.*; 
import javax.swing.*;

/*
* @author: HausemasterIssue
* @since: 16/11/2021
*/

public class Window {
	
	public static void main (String []args) {
		// call the makeWindow method and pass in our width and height vars
		makeWindow(600, 100);
	}
	
	public static void makeWindow(int width, int height) {
		// make a new jframe with your title
		JFrame frame = new JFrame("your title here");
		frame.setDefaultCloseOperation(JFrame.NORMAL);
		
		// make the text that it will display on the window
		JLabel text = new JLabel("your text here.", SwingConstants.CENTER);
		// the dimensions of the window
		text.setPreferredSize(new Dimension(width, height));
		// which part of the window to put the text on
		frame.getContentPane().add(text, BorderLayout.CENTER);
		
		// actually make the frame visible to the user
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}

}
