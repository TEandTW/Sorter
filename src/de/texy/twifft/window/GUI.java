package de.texy.twifft.window;

import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame = new JFrame();

    Container c = frame.getContentPane();

    JPanel panel = new JPanel();


    public GUI() {

        frame.setSize(450, 800); //Size of da Window

        frame.setVisible(true); //Visibility

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What is happening when pressed on "X"

        frame.getContentPane().setBackground(new Color(39, 43, 46)); //Background Color "Find die angenehm xD"

        frame.setResizable(false); //Is the Window Resizable

        frame.setTitle("Sorter"); //Title of the Window


    }




}
