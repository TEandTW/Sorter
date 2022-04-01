package de.texy.twifft.functions;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class clickFunctions {

    public clickFunctions() {
    }

    public static JMenuItem closeItem = new JMenuItem(new AbstractAction("Close") {
            @Override
            public void actionPerformed(ActionEvent e) {
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
