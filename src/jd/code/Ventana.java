package jd.code;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ventana extends JFrame {
    private JMenuBar menubar;
    private JMenu archivo, edicion, formato, ver, ayuda;
    private JMenuItem nuevo, abrir, guardar, guardarcomo, configurar, imprimir, salir;
    private JMenuItem deshacer, cortar, copiar, pegar, eliminar, buscar, buscarsig, reemplazar, ira, plaeguis, selectodo, horayfecha;
    private JMenuItem ajustelinea, fuente;
    private JMenuItem barraestado;
    private JMenuItem verayuda, acercade;
    private JTable panel;
    private JDialog acercadeinfo;
    private JTextArea info;
    private JButton aceptar = new JButton("Aceptar");

    public Ventana() {
        super("Bloc De Notas");
        menubar = new JMenuBar();
        archivo = new JMenu("Archivo");
        edicion = new JMenu("Edición");
        formato = new JMenu("Formato");
        ver = new JMenu("Ver");
        ayuda = new JMenu("Ayuda");
        nuevo = new JMenuItem("Nuevo");
        abrir = new JMenuItem("Abrir...");
        guardar = new JMenuItem("Guardar");
        guardarcomo = new JMenuItem("Guardar como...");
        configurar = new JMenuItem("Configurar página...");
        imprimir = new JMenuItem("Imprimir...");
        salir = new JMenuItem("Salir");
        deshacer = new JMenuItem("Deshacer");
        cortar = new JMenuItem(new DefaultEditorKit.CutAction());
        cortar.setText("Cortar");
        copiar = new JMenuItem(new DefaultEditorKit.CopyAction());
        copiar.setText("Copiar");
        pegar = new JMenuItem(new DefaultEditorKit.PasteAction());
        pegar.setText("Pegar");
        eliminar = new JMenuItem("Eliminar");
        buscar = new JMenuItem("Buscar...");
        buscarsig = new JMenuItem("Buscar siguiente");
        reemplazar = new JMenuItem("Reemplazar..");
        ira = new JMenuItem("Ir a...");
        selectodo = new JMenuItem("Seleccionar todo");
        plaeguis = new JMenuItem("Darth Plaeguis");
        horayfecha = new JMenuItem("Hora y fecha");
        ajustelinea = new JMenuItem("Ajuste de línea");
        fuente = new JMenuItem("Fuente...");
        barraestado = new JMenuItem("Barra de estado");
        verayuda = new JMenuItem("Ver la Ayuda");
        acercade = new JMenuItem("Acerca del Bloc de notas");
        setBackground(Color.white);
        Image icon = new ImageIcon(getClass().getResource("imagen/logo.png")).getImage();
        setIconImage(icon);
        menubar.setBackground(Color.WHITE);
        setJMenuBar(menubar);
        menubar.add(archivo);
        menubar.add(edicion);
        menubar.add(formato);
        menubar.add(ver);
        menubar.add(ayuda);
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(guardarcomo);
        archivo.add(configurar);
        archivo.add(imprimir);
        archivo.add(salir);
        edicion.add(deshacer);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(eliminar);
        edicion.add(buscar);
        edicion.add(buscarsig);
        edicion.add(reemplazar);
        edicion.add(ira);
        edicion.add(selectodo);
        edicion.add(plaeguis);
        edicion.add(horayfecha);
        formato.add(ajustelinea);
        formato.add(fuente);
        ver.add(barraestado);
        ayuda.add(verayuda);
        ayuda.add(acercade);
        guardar.setEnabled(false);
        guardarcomo.setEnabled(false);
        configurar.setEnabled(false);
        imprimir.setEnabled(false);
        deshacer.setEnabled(false);
        plaeguis.setVisible(false);
        ajustelinea.setEnabled(false);
        fuente.setEnabled(false);
       reemplazar.setEnabled(false);
        ira.setEnabled(false);
        barraestado.setEnabled(false);

        JTextArea notas = new JTextArea();
        JScrollPane scrollNotas = new JScrollPane(notas);
        add(scrollNotas);
        notas.setBackground(Color.WHITE);
        notas.setFont(new Font("Consolas", Font.PLAIN, 15));
        Acercade ac = new Acercade(this);
        ac.setSize(500, 500);
        ac.setResizable(false);
        ac.setVisible(false);
        ac.setBackground(Color.WHITE);
        Buscar b = new Buscar(this);
        b.setSize(445, 142);
        b.setResizable(false);
        b.setVisible(false);
        nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               notas.setText("");
            }
        });
        buscarsig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setVisible(true);
            }
        });
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setVisible(true);
            }
        });
        horayfecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = new SimpleDateFormat("hh:mm  dd/MM/yyyy").format(new Date());
                int pos = notas.getCaretPosition();
                notas.insert("" + date, pos);

            }
        });
        plaeguis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int pos = notas.getCaretPosition();
                notas.insert("¿Conoces la tragedia de Darth Plaeguis el Sabio?\n" +
                        "Supongo que no... Un Jedi nunca te la contaría. Es una leyenda Sith. Darth Plagueis era un Señor Oscuro de los Sith.\n" +
                        "Era tan poderoso y tan sabio, que podía utilizar la Fuerza para influir en los Midiclorianos y crear vida. Era tal \n" +
                        "su conocimiento del Lado Oscuro, que incluso podía llegar a evitar que sus seres amados murieran.\n" +
                        "El Lado Oscuro de la Fuerza es el camino a muchas habilidades que varios consideran nada natural.\n" +
                        "Llegó a ser un hombre tan poderoso... su único temor era perder su poder,el que por supuesto perdió. Cometió el\n" +
                        "error de transmitir a su aprendiz todos sus conocimientos. Un día su aprendiz lo asesinó mientras dormía. \n" +
                        "Es irónico, fue capaz de salvar a otros de la muerte, pero no a sí mismo.", pos);
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });
        selectodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notas.selectAll();

            }

        });
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notas.replaceSelection("");
            }

        });
        ira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notas.setCaretPosition(0);
            }
        });
        verayuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Desktop dk = Desktop.getDesktop();
                    dk.browse(new URI("https://go.microsoft.com/fwlink/?LinkId=834783"));
                } catch (Exception el) {
                    System.out.println("Error al abrir" + el.getMessage());
                }
            }
        });
        acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ac.setVisible(true);
            }
        });
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setVisible(true);
            }
        });

    }



}

