package jd.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buscar extends JDialog {
    private Ventana ventana;
    private JLabel texto;
    private JLabel texto2 = new JLabel("Dirección");
    private JTextField abuscar;
    private JButton buscarsig = new JButton("Buscar siguiente");
    private JButton cancelar = new JButton("Cancelar");
    private JRadioButton arriba = new JRadioButton("Arriba", true);
    private JRadioButton abajo = new JRadioButton("Abajo", false);
    private JCheckBox coincidir = new JCheckBox("Coincidir mayúsculas y minúsculas ");

    public Buscar(Ventana v) {
        setTitle("Buscar");
        ventana = v;
        setLayout(null);
        texto = new JLabel("Buscar: ");
        abuscar = new JTextField(5);
        abuscar.setBackground(Color.WHITE);
        texto.setFont(new Font("Arial", Font.PLAIN, 11));
        texto2.setFont(new Font("Arial", Font.PLAIN, 11));
        abuscar.setFont(new Font("Arial", Font.PLAIN, 11));
        buscarsig.setFont(new Font("Arial", Font.PLAIN, 11));
        cancelar.setFont(new Font("Arial", Font.PLAIN, 11));
        arriba.setFont(new Font("Arial", Font.PLAIN, 11));
        abajo.setFont(new Font("Arial", Font.PLAIN, 11));
        coincidir.setFont(new Font("Arial", Font.PLAIN, 11));
        buscarsig.setMargin(new Insets(1, 1, 1, 1));
        abuscar.setBounds(70, 10, 250, 20);
        texto.setBounds(7, 10, 50, 20);
        buscarsig.setBounds(327, 10, 95, 20);
        cancelar.setBounds(327, 40, 95, 20);
        ButtonGroup direccion = new ButtonGroup();
        direccion.add(arriba);
        direccion.add(abajo);
        texto2.setBounds(210, 40, 55, 12);
        arriba.setBounds(205, 60, 55, 20);
        abajo.setBounds(260, 60, 53, 20);
        coincidir.setBounds(7, 65, 200, 20);

        add(coincidir);
        add(arriba);
        add(abajo);
        add(buscarsig);
        add(cancelar);
        add(abuscar);
        add(texto);
        add(texto2);


        buscarsig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("buscaremos");
            }
        });
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}


