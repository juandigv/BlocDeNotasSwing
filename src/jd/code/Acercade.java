package jd.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Acercade extends JDialog {
    private Ventana ventana;
    private JTextArea info;
    private JButton aceptar = new JButton("Aceptar");
    private JLabel imagen;
    private JLabel logo;

    public Acercade(Ventana v) {

        ventana = v;

        setLayout(null);
        imagen = new JLabel(new ImageIcon(getClass().getResource("imagen/imgdoc.png")));
        logo = new JLabel(new ImageIcon(getClass().getResource("imagen/logo.png")));
        info = new JTextArea("  Not a Microsoft Windows Product \n   Versión 1.0 (Etapa Alpha de Desarrollo)\n" +
                "   Desarrollada en Universidad Mayor de San Simón (Cochabamba - Bolivia)\n" +
                "   Creada para Taller de Desarrollo en Java, el programa y su interfaz estan \n    basados en Bloc de Notas (Microsoft Corporation. Todos los derechos reservados)\n");
        info.setBackground(getBackground());
        info.setEditable(false);
        info.setBounds(5, 130, 490, 200);
        logo.setBounds(150, 220, 200, 200);
        aceptar.setBounds(200, 420, 100, 20);
        imagen.setBounds(1, 5, 490, 130);
        add(logo);
        add(imagen);
        add(info);
        add(aceptar);


        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

    }
}

