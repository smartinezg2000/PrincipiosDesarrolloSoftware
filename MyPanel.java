
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;


public class MyPanel extends JPanel implements ActionListener   {
    private JButton botonPlaca;
    private JTextField textoconsultasplaca;
    private JLabel LabelEscritorPlacas;
    private JList listaplacas;
    private JButton BotonPanico;
    private JTextField cuadrotextonombredenuncia;
    private JTextField cuadrotextoplaca;
    private JTextField cuadrotextolugar ;
    private JLabel labelnombre;
    private JLabel labelplaca;
    private JLabel comuna;
    private JButton Botonintroducciondenuncia;
    private JLabel labelayudapsicologica;
    private JTextField cuadrotextoayuda;
    private JLabel Nombreayuda;
    private JTextField cuadrocelularayuda;
    private JLabel Numeroayuda;
    private JButton botonayudapsicologica;
    private JComboBox seleccioncomuna;
    private JLabel jcomp20;
    private JLabel calle;

    public MyPanel() {
        //construct preComponents
        String[] listaplacasItems = {"Placa1", "Placa2", "Placa3"};
        String[] seleccioncomunaItems = {"Comuna 1 - Popular", "Comuna 2 - Santa Cruz", "Comuna 3 - Manrique", "Comuna 4 - Aranjuez", "Comuna 5 - Castilla", "Comuna 6 - Doce de Octubre", "Comuna 7 - Robledo", "Comuna 8 - Villa Hermosa", "Comuna 9 - Buenos Aires", "Comuna 10 - La Candelaria", "Comuna 11 - Laureles - Estadio", "Comuna 12 - La América", "Comuna 13 - San Javier", "Comuna 14 - El Poblado", "Comuna 15 - Guayabal", "Comuna 16 - Belén"};

        //construct components
        botonPlaca = new JButton ("Consutar");
        botonPlaca.addActionListener(this);
        textoconsultasplaca = new JTextField (5);
        LabelEscritorPlacas = new JLabel ("Consultar si una placa ha sido denunciada");
        listaplacas = new JList (listaplacasItems);
        BotonPanico = new JButton ("Help");
        BotonPanico.addActionListener(this);
        cuadrotextonombredenuncia = new JTextField (5);
        cuadrotextoplaca = new JTextField (5);
        cuadrotextolugar  = new JTextField (5);
        labelnombre = new JLabel ("Nombre ");
        labelplaca = new JLabel ("Placa vehículo");
        comuna = new JLabel ("Comuna");
        Botonintroducciondenuncia = new JButton ("Denunciar");
        Botonintroducciondenuncia.addActionListener(this);
        labelayudapsicologica = new JLabel ("Ayuda Psicológica");
        cuadrotextoayuda = new JTextField (5);
        Nombreayuda = new JLabel ("Nombre");
        cuadrocelularayuda = new JTextField (5);
        Numeroayuda = new JLabel ("Numero De Celular");
        botonayudapsicologica = new JButton ("Pedir ayuda");
        botonayudapsicologica.addActionListener(this);
        seleccioncomuna = new JComboBox (seleccioncomunaItems);
        
        jcomp20 = new JLabel ("");
        calle = new JLabel ("Info. adicional");

        //set components properties
        listaplacas.setToolTipText ("PlacasIngresadas");

        //adjust size and set layout
        setPreferredSize (new Dimension (624, 361));
        setLayout (null);

        //add components
        add (botonPlaca);
        add (textoconsultasplaca);
        add (LabelEscritorPlacas);
        add (listaplacas);
        add (BotonPanico);
        add (cuadrotextonombredenuncia);
        add (cuadrotextoplaca);
        add (cuadrotextolugar );
        add (labelnombre);
        add (labelplaca);
        add (comuna);
        add (Botonintroducciondenuncia);
        add (labelayudapsicologica);
        add (cuadrotextoayuda);
        add (Nombreayuda);
        add (cuadrocelularayuda);
        add (Numeroayuda);
        add (botonayudapsicologica);
        add (seleccioncomuna);
        add (jcomp20);
        add (calle);

        //set component bounds (only needed by Absolute Positioning)
        botonPlaca.setBounds (425, 115, 100, 20);
        textoconsultasplaca.setBounds (425, 65, 100, 25);
        LabelEscritorPlacas.setBounds (355, 0, 255, 75);
        listaplacas.setBounds (345, 380, 100, 75);
        BotonPanico.setBounds (210, 290, 180, 60);
        cuadrotextonombredenuncia.setBounds (50, 55, 100, 25);
        cuadrotextoplaca.setBounds (50, 115, 100, 25);
        cuadrotextolugar .setBounds (50, 240, 100, 25);
        labelnombre.setBounds (50, 25, 100, 25);
        labelplaca.setBounds (50, 85, 100, 25);
        comuna.setBounds (50, 150, 100, 25);
        Botonintroducciondenuncia.setBounds (50, 290, 100, 25);
        labelayudapsicologica.setBounds (215, 25, 130, 20);
        cuadrotextoayuda.setBounds (220, 100, 100, 25);
        Nombreayuda.setBounds (220, 65, 130, 30);
        cuadrocelularayuda.setBounds (220, 160, 100, 25);
        Numeroayuda.setBounds (225, 130, 135, 25);
        botonayudapsicologica.setBounds (220, 220, 135, 30);
        seleccioncomuna.setBounds (20, 180, 180, 25);
        jcomp20.setBounds (35, 210, 170, 25);
        calle.setBounds (35, 210, 170, 25);
    }
     public void actionPerformed(ActionEvent e) {
        String n1;
        String n2;
        String n3;
        String n4;
        String n5;
        
        if (e.getSource() == Botonintroducciondenuncia) {
            n1 = cuadrotextonombredenuncia.getText();
            n2 = cuadrotextoplaca.getText();
            n3 = String.valueOf(seleccioncomuna.getSelectedItem());
            n5 = cuadrotextolugar.getText();
            
            String denuncia="DENUNCIA "+ "Nombre: " + n1 + " Placa: " + n2+ " Lugar: " + n3 + " " + n5;
            n2= n2.toUpperCase();
            ModuloPlacas.guardar(n2);
            ModuloDenuncias.guardar(denuncia);
            System.out.println("Denuncia realizada");
            }            
            
            
        
 
        if (e.getSource() == botonPlaca) {
           n4 = textoconsultasplaca.getText();
            if(n4.length()<6){
                System.out.println("entrada no valida");
                
            }
            else{
            n4= n4.toUpperCase();
            try
            {
                System.out.println(buscadorplacas.leerplacas(n4));
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }
           }           
            
            
        }
        if (e.getSource() == BotonPanico) {
            n1 = cuadrotextonombredenuncia.getText();
            n2 = cuadrotextoplaca.getText();
            n3 = String.valueOf(seleccioncomuna.getSelectedItem());
            n5 = cuadrotextolugar.getText();
            
            String denuncia="BOTÓN DE EMERGENCIA ACTIVADO  " +" Nombre: " + n1 + " Placa: " + n2+ " Lugar: " + n3 + n5;
            n2= n2.toUpperCase();
            ModuloPlacas.guardar(n2);
            ModuloDenuncias.guardar(denuncia);
            System.out.println("Las autoridades van en camino");
            
            try
            {
                try
                {
                    try
                    {
                        sonido.alerta();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                    }
                }
                catch (UnsupportedAudioFileException uafe)
                {
                    uafe.printStackTrace();
                }
            }
            catch (LineUnavailableException lue)
            {
                lue.printStackTrace();
            }
        }
        if (e.getSource() == botonayudapsicologica) {
            String a1 = cuadrocelularayuda.getText();
            String a2 = cuadrotextoayuda.getText();
            
            
            String a3= "Nombre: "+ a2 + " Celular:" + a1;
            
            ModuloAyuda.guardar(a3);
            
            System.out.println("Pronto nos contactaremos");
            
            
        }
        
        
    }
    

    public static void main (String[] args) {
        
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
