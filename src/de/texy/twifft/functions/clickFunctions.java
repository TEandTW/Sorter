package de.texy.twifft.functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class clickFunctions {
    public static Boolean aboutToExit = false;


    public clickFunctions() {
    }

    public static JMenuItem closeItem = new JMenuItem(new AbstractAction("Close") {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutToExit = true;
                System.exit(1);
            }
    });

    public static JMenuItem optionsItem = new JMenuItem(new AbstractAction("Options") {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println();
        }
    });




}
