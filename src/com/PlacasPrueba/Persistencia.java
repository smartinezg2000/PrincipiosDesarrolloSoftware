/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PlacasPrueba;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.*;

public class Persistencia {
    
    public static void audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        
        
        File file = new File("audiohelp.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
     
            
 
       }
    
    public static void denuncias(String n){
        File f = new File("Denuncias.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Denuncias.txt",true);
            pw = new PrintWriter(writer);
            pw.println(n);
            
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
     public static void placas(String n){
        File f = new File("Placas.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Placas.txt",true);
            pw = new PrintWriter(writer);
            pw.println(n);
            
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public static int leerplacas(String n) throws java.io.IOException, FileNotFoundException  {
    String registro = "Placas.txt";
    
    String line = null;
      int denuncias = 0;
     try {
      FileReader fileReader = new FileReader(registro);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(n)) {
                    denuncias++ ;
                }
                
            } }
    } catch (IOException e) {
    }
    return denuncias;
    
    }
    
    public static void psicologo(String n){
        File f = new File("AyudaPsicologica.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("AyudaPsicologica.txt",true);
            pw = new PrintWriter(writer);
            pw.println(n);
            
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
}
