package de.texy.twifft.window;

import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame = new JFrame();

    Container c = frame.getContentPane();

    JPanel panel = new JPanel();

    ImageIcon iconImg;


    public GUI() {
        loadImg();
        Cursor cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);


        frame.setSize(450, 800); //Size of da Window

        frame.setVisible(true); //Visibility

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What is happening when pressed on "X"

        frame.getContentPane().setBackground(new Color(39, 43, 46)); //Background Color "Find die angenehm xD"

        frame.setResizable(false); //Is the Window Resizable

        frame.setTitle("Sorter"); //Title of the Window

        frame.setCursor(cursor);

        frame.setIconImage(iconImg.getImage());

        MenuBar mb = new MenuBar();

        Menu menu = new Menu();

      //  frame.setMenuBar(mb.add(new Menu()));



    }

    public void loadImg() {
        iconImg = new ImageIcon("ressources/icon.png");

    }







}
