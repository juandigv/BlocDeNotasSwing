package jd.code;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        ventana.setSize(480,360);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}