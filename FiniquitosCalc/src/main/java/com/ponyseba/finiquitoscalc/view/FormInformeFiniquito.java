/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ponyseba.finiquitoscalc.view;

import com.ponyseba.finiquitoscalc.controller.ExcelController;
import com.ponyseba.finiquitoscalc.controller.FiniquitoCalcController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Finiquito;
import model.SesionUsuario;



/**
 *
 * @author sebastiankravetz
 */
public class FormInformeFiniquito extends javax.swing.JFrame {
    
    SesionUsuario sesionUsuario;
    
    private Finiquito informeFiniquito;
    

    /**
     * Creates new form FormFormularioFiniquito
     */
    public FormInformeFiniquito(Finiquito informeFiniquito, SesionUsuario sesionUsuario) {
        initComponents();
        this.informeFiniquito = informeFiniquito;
        this.sesionUsuario = sesionUsuario;
        System.out.println(informeFiniquito);
        assignValues();
        System.out.println(sesionUsuario.toString());
        
    }

    public FormInformeFiniquito() {
    }
    
 
    
    private void assignValues(){
        this.jTextField_fechaInicio.setText(informeFiniquito.getFechaInicioTrabajo().toString());
        this.jTextField_fechaInicio.setEditable(false);
        this.jTextField_fechaTermino.setText(informeFiniquito.getFechaFinTrabajo().toString());
        this.jTextField_fechaTermino.setEditable(false);
        this.jTextField_tiempoTrabajado.setText(informeFiniquito.getMesesTrabajadosTotal());
        this.jTextField_tiempoTrabajado.setEditable(false);
        this.jTextField_feriadoLegal.setText(String.valueOf(informeFiniquito.getFeriadoLegalHabil()));
        this.jTextField_feriadoLegal.setEditable(false);
        this.jTextField_salarioIndemnizacion.setText(String.valueOf(informeFiniquito.getSalarioIndemnizacion()));
        this.jTextField_salarioIndemnizacion.setEditable(false);
        this.jTextField_indemnizacionVacaciones.setText(String.valueOf(informeFiniquito.getIndemnizacionVacaciones()));
        this.jTextField_indemnizacionVacaciones.setEditable(false);
        this.jTextField_fechaLimitePago.setText(informeFiniquito.getFechaPagoFiniquito().toString());
        this.jTextField_fechaLimitePago.setEditable(false);
        this.jTextField_indemnizacionAniosServicio.setText(String.valueOf(informeFiniquito.getIndeminizacionAniosServicio()));
        this.jTextField_indemnizacionAniosServicio.setEditable(false);
        this.jTextField_salarioVacaciones.setText(String.valueOf(informeFiniquito.getSalarioVacaciones()));
        this.jTextField_salarioVacaciones.setEditable(false);
        this.jTextField_totalSinPreAviso.setText(String.valueOf(informeFiniquito.getTotalIndemnizacion()));
        this.jTextField_totalSinPreAviso.setEditable(false);
        this.jTextField_totalConPreAviso.setText(String.valueOf(informeFiniquito.getTotalIndemnizacion()+informeFiniquito.getSalarioIndemnizacion()));
        this.jTextField_totalConPreAviso.setEditable(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_fechaTermino = new javax.swing.JTextField();
        jTextField_tiempoTrabajado = new javax.swing.JTextField();
        jTextField_fechaInicio = new javax.swing.JTextField();
        jTextField_salarioIndemnizacion = new javax.swing.JTextField();
        jTextField_feriadoLegal = new javax.swing.JTextField();
        jTextField_salarioVacaciones = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField_indemnizacionAniosServicio = new javax.swing.JTextField();
        jTextField_indemnizacionVacaciones = new javax.swing.JTextField();
        jTextField_totalConPreAviso = new javax.swing.JTextField();
        jTextField_totalSinPreAviso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_fechaLimitePago = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe Final de Finiquito");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informe Finiquito"));

        jLabel2.setText("Fecha de inicio de la relación laboral:");

        jLabel3.setText("Salario Indemnización:");

        jLabel4.setText("Indemnización por Años de Servicio:");

        jLabel5.setText("Fecha de término de la relación laboral:");

        jLabel6.setText("Salario de Vacaciones:");

        jLabel7.setText("Indemnización por Vacaciones:");

        jLabel8.setText("Tiempo trabajado:");

        jLabel9.setText("Feriado Legal:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Total sin Pre-Aviso:");

        jTextField_fechaTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fechaTerminoActionPerformed(evt);
            }
        });

        jTextField_tiempoTrabajado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tiempoTrabajadoActionPerformed(evt);
            }
        });

        jTextField_fechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fechaInicioActionPerformed(evt);
            }
        });

        jTextField_salarioIndemnizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salarioIndemnizacionActionPerformed(evt);
            }
        });

        jTextField_feriadoLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_feriadoLegalActionPerformed(evt);
            }
        });

        jTextField_salarioVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salarioVacacionesActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel13.setText("Total con Pre-Aviso:");

        jTextField_indemnizacionAniosServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_indemnizacionAniosServicioActionPerformed(evt);
            }
        });

        jTextField_indemnizacionVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_indemnizacionVacacionesActionPerformed(evt);
            }
        });

        jTextField_totalConPreAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalConPreAvisoActionPerformed(evt);
            }
        });

        jTextField_totalSinPreAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalSinPreAvisoActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha de pago límite:");

        jTextField_fechaLimitePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fechaLimitePagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_indemnizacionVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField_feriadoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextField_totalConPreAviso)
                                    .addComponent(jTextField_totalSinPreAviso)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_fechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(98, 98, 98))
                                    .addComponent(jTextField_tiempoTrabajado)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_salarioIndemnizacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_indemnizacionAniosServicio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_salarioVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jTextField_fechaLimitePago, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_fechaTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tiempoTrabajado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_salarioIndemnizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_salarioVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_feriadoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_indemnizacionAniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_indemnizacionVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_totalSinPreAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_totalConPreAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fechaLimitePago, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Exportar o Guardar"));

        jButton3.setText("Guardar en el sistema");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exportar a Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setText("Volver al Menu Principal");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_fechaTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fechaTerminoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_fechaTerminoActionPerformed

    private void jTextField_tiempoTrabajadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tiempoTrabajadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tiempoTrabajadoActionPerformed

    private void jTextField_fechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaInicioActionPerformed

    private void jTextField_salarioIndemnizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salarioIndemnizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_salarioIndemnizacionActionPerformed

    private void jTextField_feriadoLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_feriadoLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_feriadoLegalActionPerformed

    private void jTextField_salarioVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salarioVacacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_salarioVacacionesActionPerformed

    private void jTextField_indemnizacionAniosServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_indemnizacionAniosServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_indemnizacionAniosServicioActionPerformed

    private void jTextField_indemnizacionVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_indemnizacionVacacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_indemnizacionVacacionesActionPerformed

    private void jTextField_totalConPreAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalConPreAvisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalConPreAvisoActionPerformed

    private void jTextField_totalSinPreAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalSinPreAvisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalSinPreAvisoActionPerformed

    private void jTextField_fechaLimitePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fechaLimitePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaLimitePagoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String nombreTrabajador = JOptionPane.showInputDialog(rootPane, "Ingrese nombre del trabajador: ");   
        
        if(nombreTrabajador != null){
            FiniquitoCalcController finiquitoCalcController = new FiniquitoCalcController();
            
            informeFiniquito.setNombreTrabajador(nombreTrabajador);
            boolean crearFiniquitoReturn = finiquitoCalcController.crearFiniquito(informeFiniquito);
        
            if(crearFiniquitoReturn) {
                JOptionPane.showMessageDialog(rootPane, "Finiquito creado correctamente y guardado en el sistema!");
            }else {
                JOptionPane.showMessageDialog(rootPane, "Error en la creación del finiquito");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         FormPanelCentral formPanelCentral = new FormPanelCentral();
        formPanelCentral.setVisible(true);
        formPanelCentral.setAlwaysOnTop(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ExcelController excelController = new ExcelController();
        try {
            excelController.generarFiniquitoXls(informeFiniquito);
        } catch (IOException ex) {
            Logger.getLogger(FormInformeFiniquito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInformeFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInformeFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInformeFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInformeFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInformeFiniquito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_fechaInicio;
    private javax.swing.JTextField jTextField_fechaLimitePago;
    private javax.swing.JTextField jTextField_fechaTermino;
    private javax.swing.JTextField jTextField_feriadoLegal;
    private javax.swing.JTextField jTextField_indemnizacionAniosServicio;
    private javax.swing.JTextField jTextField_indemnizacionVacaciones;
    private javax.swing.JTextField jTextField_salarioIndemnizacion;
    private javax.swing.JTextField jTextField_salarioVacaciones;
    private javax.swing.JTextField jTextField_tiempoTrabajado;
    private javax.swing.JTextField jTextField_totalConPreAviso;
    private javax.swing.JTextField jTextField_totalSinPreAviso;
    // End of variables declaration//GEN-END:variables
}
