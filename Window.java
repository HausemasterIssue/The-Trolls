package dev.hause.perry;

import javax.swing.*;
import java.awt.*;

/**
 * @author hausemasterissue, perry
 * Started 11/16/2021.
 * code taken from shrodingers cat (stackoverflow) https://stackoverflow.com/questions/4716372/java-how-do-i-close-a-jframe-while-opening-another-one
 */
public class Window {

    public static void main(String[] args) {
        // make a new jframe with your title
        JFrame frame = new JFrame("your title here");
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // make the text that it will display on the window
        JLabel text = new JLabel("your text here.", SwingConstants.CENTER);
        // the dimensions of the window
        text.setPreferredSize(new Dimension(600, 100));
        // which part of the window to put the text on
        frame.getContentPane().add(text, BorderLayout.CENTER);

        // actually make the frame visible to the user
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
