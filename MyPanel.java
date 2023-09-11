
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
    private JButton BotonPanico;
    private JTextField cuadrotextonombredenuncia;
    private JTextField cuadrotextoplaca;
    private JTextField cuadrotextolugar ;
    private JLabel labelnombre;
    private JLabel labelplaca;
    private JLabel labellugar;
    private JButton Botonintroducciondenuncia;
    private JLabel labelayudapsicologica;
    private JTextField cuadrotextoayuda;
    private JLabel Nombreayuda;
    private JTextField cuadrocelularayuda;
    private JLabel Numeroayuda;
    private JButton botonayudapsicologica;
    private JLabel jcomp18;

    public MyPanel() {
        //construct components
        botonPlaca = new JButton ("Consutar");
        botonPlaca.addActionListener(this);
        textoconsultasplaca = new JTextField (5);
        LabelEscritorPlacas = new JLabel ("Consultar si una placa ha sido denunciada");
        BotonPanico = new JButton ("Help");
        BotonPanico.addActionListener(this);
        cuadrotextonombredenuncia = new JTextField (5);
        cuadrotextoplaca = new JTextField (5);
        cuadrotextolugar  = new JTextField (5);
        labelnombre = new JLabel ("Nombre ");
        labelplaca = new JLabel ("Placa vehículo");
        labellugar = new JLabel ("Lugar");
        Botonintroducciondenuncia = new JButton ("Denunciar");
        Botonintroducciondenuncia.addActionListener(this);
        labelayudapsicologica = new JLabel ("Ayuda Psicológica");
        cuadrotextoayuda = new JTextField (5);
        Nombreayuda = new JLabel ("Nombre");
        cuadrocelularayuda = new JTextField (5);
        Numeroayuda = new JLabel ("Numero De Celular");
        botonayudapsicologica = new JButton ("Pedir ayuda");
        botonayudapsicologica.addActionListener(this);
        jcomp18 = new JLabel ("Introduce datos para realizar una denuncia o pedir ayuda");

        //adjust size and set layout
        setPreferredSize (new Dimension (624, 462));
        setLayout (null);

        //add components
        add (botonPlaca);
        add (textoconsultasplaca);
        add (LabelEscritorPlacas);
        add (BotonPanico);
        add (cuadrotextonombredenuncia);
        add (cuadrotextoplaca);
        add (cuadrotextolugar );
        add (labelnombre);
        add (labelplaca);
        add (labellugar);
        add (Botonintroducciondenuncia);
        add (labelayudapsicologica);
        add (cuadrotextoayuda);
        add (Nombreayuda);
        add (cuadrocelularayuda);
        add (Numeroayuda);
        add (botonayudapsicologica);
        add (jcomp18);

        //set component bounds (only needed by Absolute Positioning)
        botonPlaca.setBounds (435, 185, 100, 20);
        textoconsultasplaca.setBounds (435, 135, 100, 25);
        LabelEscritorPlacas.setBounds (360, 60, 255, 75);
        BotonPanico.setBounds (55, 270, 100, 25);
        cuadrotextonombredenuncia.setBounds (50, 55, 100, 25);
        cuadrotextoplaca.setBounds (50, 115, 100, 25);
        cuadrotextolugar .setBounds (50, 185, 100, 25);
        labelnombre.setBounds (50, 25, 100, 25);
        labelplaca.setBounds (50, 85, 100, 25);
        labellugar.setBounds (50, 150, 100, 25);
        Botonintroducciondenuncia.setBounds (55, 240, 100, 25);
        labelayudapsicologica.setBounds (220, 50, 130, 20);
        cuadrotextoayuda.setBounds (220, 130, 100, 25);
        Nombreayuda.setBounds (220, 90, 130, 30);
        cuadrocelularayuda.setBounds (220, 205, 100, 25);
        Numeroayuda.setBounds (220, 170, 135, 25);
        botonayudapsicologica.setBounds (220, 255, 135, 30);
        jcomp18.setBounds (10, 0, 360, 25);
    }
     public void actionPerformed(ActionEvent e) {
        String n1;
        String n2;
        String n3;
        String n4;
        
        if (e.getSource() == Botonintroducciondenuncia) {
            n1 = cuadrotextonombredenuncia.getText();
            n2 = cuadrotextoplaca.getText();
            n3 = cuadrotextolugar.getText();
            
            String denuncia="DENUNCIA"+ "Nombre: " + n1 + " Placa: " + n2+ " Lugar: " + n3;
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
            n3 = cuadrotextolugar.getText();
            
            String denuncia="BOTÓN DE EMERGENCIA ACTIVO  " +"Nombre: " + n1 + " Placa: " + n2+ " Lugar: " + n3;
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
