/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.PlacasPrueba;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class InterfazDenuncias extends javax.swing.JFrame {
    private static Usuario usuario;
    
    /**
     * Creates new form InterfazDenuncias
     */
    public InterfazDenuncias() {
        initComponents();
    }
    public static void transferenciaDatos(Usuario s){
        usuario=s;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonEmergencia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        nombrePsicologo = new javax.swing.JTextField();
        numeroPsicologo = new javax.swing.JTextField();
        detalles = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        botonDenuncia = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comuna = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        placaConsulta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ayudaPsicologica = new javax.swing.JButton();
        botonPsicologo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        botonEmergencia1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Realizar una denuncia formal");

        botonEmergencia.setBackground(new java.awt.Color(255, 51, 153));
        botonEmergencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEmergencia.setForeground(new java.awt.Color(255, 255, 255));
        botonEmergencia.setText("Emergencia");
        botonEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmergenciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Detalles");

        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });

        nombrePsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePsicologoActionPerformed(evt);
            }
        });

        numeroPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPsicologoActionPerformed(evt);
            }
        });

        detalles.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        detalles.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        labelCedula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCedula.setText("C.C " + usuario.cedula);

        botonDenuncia.setBackground(new java.awt.Color(255, 51, 153));
        botonDenuncia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonDenuncia.setForeground(new java.awt.Color(255, 255, 255));
        botonDenuncia.setText("Denunciar");
        botonDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDenunciaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Contacto de posibles testigos, narración corta de los sucesos, ubicación, etc.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Si ha sufrido repercusiones psicológicas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("En caso de tener una emergencia llenar datos y oprimir el botón de emergencia.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ubicación");

        comuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Comuna 1  Popular\"", "\"Comuna 2  Santa Cruz\"", "\"Comuna 3  Manrique\"", "\"Comuna 4  Aranjuez\"", "\"Comuna 5  Castilla\",", "\"Comuna 6  Doce de Octubre\"", "\"Comuna 7  Robledo\",", "\"Comuna 8  Villa Hermosa\"", "\"Comuna 9  Buenos Aires\"", "\"Comuna 10  La Candelaria\"", "\"Comuna 11  Laureles - Estadio\"", "\"Comuna 12  La América\"", "\"Comuna 13  San Javier\"", "\"Comuna 14  El Poblado\"", " \"Comuna 15  Guayabal\"", " \"Comuna 16 - Belén\"" }));
        comuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comunaActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/PlacasPrueba/taxis.jpg"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Placa de vehiculo");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Numero de Contacto");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Consultar Vehículo ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Escribe la placa del vehículo");

        ayudaPsicologica.setBackground(new java.awt.Color(255, 51, 153));
        ayudaPsicologica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ayudaPsicologica.setForeground(new java.awt.Color(255, 255, 255));
        ayudaPsicologica.setText("Pedir Ayuda Psicológica");
        ayudaPsicologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaPsicologicaActionPerformed(evt);
            }
        });

        botonPsicologo.setBackground(new java.awt.Color(255, 51, 153));
        botonPsicologo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPsicologo.setForeground(new java.awt.Color(255, 255, 255));
        botonPsicologo.setText("Consultar");
        botonPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPsicologoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonEmergencia1.setBackground(new java.awt.Color(255, 51, 153));
        botonEmergencia1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEmergencia1.setForeground(new java.awt.Color(255, 255, 255));
        botonEmergencia1.setText("Volver");
        botonEmergencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmergencia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCedula)
                    .addComponent(jLabel3)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(botonEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ayudaPsicologica, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(nombrePsicologo, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonEmergencia1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrePsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numeroPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ayudaPsicologica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonEmergencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(595, 595, 595))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addComponent(botonDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(botonEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonPsicologo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(818, 818, 818))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmergenciaActionPerformed
    
    String pla = placa.getText().toUpperCase();
        String det = detalles.getText();
        String com = String.valueOf(comuna.getSelectedItem());
        
        
        if(pla.length()<6||pla.length()>6){
            JOptionPane.showMessageDialog(this, "Placa no Valida");    
            }
            else{
            String s ="C.C "+usuario.cedula+" - "+ pla+" - "+det+" - "+com+" - "+"EMERGENCIA";
        
            Persistencia.denuncias(s);
        
        Persistencia.placas(pla);
        JOptionPane.showMessageDialog(this, "Botón de emergencia Activado");
        
   
            }
    
    }//GEN-LAST:event_botonEmergenciaActionPerformed

    private void botonDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDenunciaActionPerformed
        String pla = placa.getText().toUpperCase();
        String det = detalles.getText();
        String com = String.valueOf(comuna.getSelectedItem());
        
        
        if(pla.length()<6||pla.length()>6){
            JOptionPane.showMessageDialog(this, "Placa no Valida");    
            }
            else{
            String s = "C.C "+usuario.cedula+"-"+ pla+" - "+det+" - "+com+" - "+"denuncia";
        Persistencia.denuncias(s);
        Persistencia.placas(pla);
        JOptionPane.showMessageDialog(this, "Denuncia Registrada");
        
   
            }
        
        
    }//GEN-LAST:event_botonDenunciaActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detallesActionPerformed

    private void ayudaPsicologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaPsicologicaActionPerformed
        String datos = usuario.cedula+"-"+nombrePsicologo.getText()+"-"+numeroPsicologo.getText();
      
        
              Persistencia.psicologo(datos);
        
       JOptionPane.showMessageDialog(this, "Proximamente nos contactaremos");
    }//GEN-LAST:event_ayudaPsicologicaActionPerformed

    private void botonPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPsicologoActionPerformed
       String pla = placaConsulta.getText().toUpperCase();
       int n = 0;
        try {
            n = Persistencia.leerplacas(pla);
        } catch (IOException ex) {
            Logger.getLogger(InterfazDenuncias.class.getName()).log(Level.SEVERE, null, ex);
        }
       JOptionPane.showMessageDialog(this, "Esta Placa tienes "+ n +" Denuncia(s)");
    }//GEN-LAST:event_botonPsicologoActionPerformed

    private void nombrePsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePsicologoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePsicologoActionPerformed

    private void numeroPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPsicologoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPsicologoActionPerformed

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

    private void botonEmergencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmergencia1ActionPerformed
          Frame newframe = new Frame();
            newframe.setVisible(true);
            this.dispose();
            
    }//GEN-LAST:event_botonEmergencia1ActionPerformed

    private void comunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comunaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDenuncias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayudaPsicologica;
    private javax.swing.JButton botonDenuncia;
    private javax.swing.JButton botonEmergencia;
    private javax.swing.JButton botonEmergencia1;
    private javax.swing.JButton botonPsicologo;
    private javax.swing.JComboBox<String> comuna;
    private javax.swing.JTextField detalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JTextField nombrePsicologo;
    private javax.swing.JTextField numeroPsicologo;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField placaConsulta;
    // End of variables declaration//GEN-END:variables
}
