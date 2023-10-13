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
/**
 *
 * @author Simon
 */
public class Usuario {
    String cedula;
    String clave;
    public String getCedula(){
       return this.cedula;
   }
    public String getClave(){
       return this.clave;
   }
    public void registrar(){
    File f = new File("Usuarios.txt");
        FileWriter writer = null;
        PrintWriter pw = null;

        // Creación del archivo
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Usuarios.txt",true);
            pw = new PrintWriter(writer);
            pw.println(this.cedula + ","+ this.clave);
        }catch(IOException exception){
            System.err.println("Error abriendo el archivo");
        }finally {
            try {
                //Cierre del archivo
                if (null != writer)
                writer.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
    
    public boolean buscarUsuarios() throws java.io.IOException, FileNotFoundException  {
    String registro = "Usuarios.txt";
    
    String line = null;
 
     try {
      FileReader fileReader = new FileReader(registro);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(this.cedula) && line.contains(this.clave)) {
                    return true;
                }
                
            } }
    } catch (IOException e) {
    }
    return false;
    
    }
    public boolean confirmarRegistro() throws java.io.IOException, FileNotFoundException  {
    String registro = "Usuarios.txt";
    
    String line = null;
 
     try {
      FileReader fileReader = new FileReader(registro);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(this.cedula)) {
                    return true;
                }
                
            } }
    } catch (IOException e) {
    }
    return false;
    
    }
}
