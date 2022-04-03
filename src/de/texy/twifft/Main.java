package de.texy.twifft;

import de.texy.twifft.window.GUI;
import de.texy.twifft.functions.readDirectorys;
import de.texy.twifft.functions.clickFunctions;
public class Main {

    public static void main(String[] args) {
	// write your code here
        new GUI();

        new clickFunctions();

        new readDirectorys();
    }



}
