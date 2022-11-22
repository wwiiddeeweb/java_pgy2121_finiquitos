/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ponyseba.finiquitoscalc.view;

import com.ponyseba.finiquitoscalc.controller.ExcelController;
import com.ponyseba.finiquitoscalc.controller.FiniquitoCalcController;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Finiquito;
import model.SesionUsuario;

/**
 *
 * @author ponyta
 */
public class FormMostrarFiniquito extends javax.swing.JFrame {
    
    Finiquito finiquito;
    
    SesionUsuario sesionUsuario;
    /**
     * Creates new form FormMostrarFiniquito
     */
    public FormMostrarFiniquito() {
        initComponents();
    }
    
    public FormMostrarFiniquito(SesionUsuario sesionUsuario) {
        initComponents();
        this.sesionUsuario = sesionUsuario;
        
        this.jpnl_finiquito.setVisible(false);
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_idFiniquito = new javax.swing.JTextField();
        jbtn_buscarFiniquito = new javax.swing.JButton();
        jpnl_finiquito = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jtxt_fechaInicio = new javax.swing.JTextField();
        jtxt_fechaFin = new javax.swing.JTextField();
        jtxt_tiempoTrabajado = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jtxt_salarioAniosServicio = new javax.swing.JTextField();
        jtxt_salarioVacaciones = new javax.swing.JTextField();
        jtxt_feriadoLegal = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jtxt_indemnizacionAniosServicio = new javax.swing.JTextField();
        jtxt_indemnizacionVacaciones = new javax.swing.JTextField();
        jtxt_fechaLimitePago = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jtxt_totalSinPreaviso = new javax.swing.JTextField();
        jtxt_totalConPreaviso = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jtxt_nombreTrabajador = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ligconsolata", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Finiquito por ID");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ligconsolata", 0, 14))); // NOI18N

        jLabel2.setText("Ingrese ID de finiquito:");

        jtxt_idFiniquito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idFiniquitoActionPerformed(evt);
            }
        });

        jbtn_buscarFiniquito.setBackground(new java.awt.Color(204, 204, 204));
        jbtn_buscarFiniquito.setText("Buscar");
        jbtn_buscarFiniquito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbtn_buscarFiniquito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarFiniquitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_idFiniquito, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jbtn_buscarFiniquito, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_idFiniquito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtn_buscarFiniquito, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnl_finiquito.setBackground(new java.awt.Color(204, 204, 204));
        jpnl_finiquito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle finiquito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ligconsolata", 0, 14))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel36.setText("Fecha inicio relación laboral");

        jLabel37.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel37.setText("Fecha fin relación laboral");

        jLabel38.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel38.setText("Tiempo trabajado");

        jtxt_fechaInicio.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_fechaInicio.setBorder(null);

        jtxt_fechaFin.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_fechaFin.setBorder(null);
        jtxt_fechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_fechaFinActionPerformed(evt);
            }
        });

        jtxt_tiempoTrabajado.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_tiempoTrabajado.setBorder(null);

        jLabel39.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel39.setText("Salario por años de servicio");

        jLabel40.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel40.setText("Salario por vacaciones");

        jLabel41.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel41.setText("Feriado legal");

        jtxt_salarioAniosServicio.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_salarioAniosServicio.setBorder(null);
        jtxt_salarioAniosServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_salarioAniosServicioActionPerformed(evt);
            }
        });

        jtxt_salarioVacaciones.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_salarioVacaciones.setBorder(null);
        jtxt_salarioVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_salarioVacacionesActionPerformed(evt);
            }
        });

        jtxt_feriadoLegal.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_feriadoLegal.setBorder(null);
        jtxt_feriadoLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_feriadoLegalActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel42.setText("Indem. años de servicio");

        jLabel43.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel43.setText("Indem. de vacaciones");

        jLabel44.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel44.setText("Fecha límite de pago");

        jtxt_indemnizacionAniosServicio.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_indemnizacionAniosServicio.setToolTipText("");
        jtxt_indemnizacionAniosServicio.setBorder(null);

        jtxt_indemnizacionVacaciones.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_indemnizacionVacaciones.setBorder(null);

        jtxt_fechaLimitePago.setFont(new java.awt.Font("Ligconsolata", 0, 20)); // NOI18N
        jtxt_fechaLimitePago.setBorder(null);
        jtxt_fechaLimitePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_fechaLimitePagoActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Ligconsolata", 1, 20)); // NOI18N
        jLabel45.setText("Total indemnización sin Preaviso");

        jLabel46.setFont(new java.awt.Font("Ligconsolata", 1, 20)); // NOI18N
        jLabel46.setText("Total indemnización con Preaviso");

        jtxt_totalSinPreaviso.setFont(new java.awt.Font("Ligconsolata", 1, 30)); // NOI18N
        jtxt_totalSinPreaviso.setBorder(null);
        jtxt_totalSinPreaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_totalSinPreavisoActionPerformed(evt);
            }
        });

        jtxt_totalConPreaviso.setFont(new java.awt.Font("Ligconsolata", 1, 30)); // NOI18N
        jtxt_totalConPreaviso.setBorder(null);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jButton2.setText("Exportar a Excel");
        jButton2.setToolTipText("");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Ligconsolata", 1, 18)); // NOI18N
        jLabel47.setText("Nombre trabajador:");

        jtxt_nombreTrabajador.setFont(new java.awt.Font("Ligconsolata", 0, 22)); // NOI18N
        jtxt_nombreTrabajador.setBorder(null);

        javax.swing.GroupLayout jpnl_finiquitoLayout = new javax.swing.GroupLayout(jpnl_finiquito);
        jpnl_finiquito.setLayout(jpnl_finiquitoLayout);
        jpnl_finiquitoLayout.setHorizontalGroup(
            jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_nombreTrabajador))
                    .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                        .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37)
                                    .addComponent(jtxt_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(jtxt_salarioVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)
                                    .addComponent(jtxt_indemnizacionVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133)
                                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jtxt_tiempoTrabajado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_feriadoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_fechaLimitePago, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_finiquitoLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(106, 106, 106))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnl_finiquitoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_totalSinPreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jtxt_totalConPreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_salarioAniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_indemnizacionAniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(67, 67, 67))
        );
        jpnl_finiquitoLayout.setVerticalGroup(
            jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnl_finiquitoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtxt_nombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_tiempoTrabajado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_salarioAniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_salarioVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_feriadoLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_indemnizacionAniosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_indemnizacionVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_fechaLimitePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(jpnl_finiquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_totalSinPreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_totalConPreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("Volver al Menú Principal");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnl_finiquito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnl_finiquito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_idFiniquitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idFiniquitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idFiniquitoActionPerformed

    private void jtxt_fechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_fechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_fechaFinActionPerformed

    private void jtxt_salarioAniosServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_salarioAniosServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_salarioAniosServicioActionPerformed

    private void jtxt_salarioVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_salarioVacacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_salarioVacacionesActionPerformed

    private void jtxt_feriadoLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_feriadoLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_feriadoLegalActionPerformed

    private void jtxt_totalSinPreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_totalSinPreavisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_totalSinPreavisoActionPerformed

    private void jtxt_fechaLimitePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_fechaLimitePagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_fechaLimitePagoActionPerformed

    private void jbtn_buscarFiniquitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarFiniquitoActionPerformed
        
        FiniquitoCalcController finiquitoCalcController = new FiniquitoCalcController();
        int idFiniquito = Integer.parseInt(this.jtxt_idFiniquito.getText());
        
        finiquito = finiquitoCalcController.buscarFiniquitoPorIdFiniquito(sesionUsuario, idFiniquito);
        
        this.jtxt_nombreTrabajador.setText(finiquito.getNombreTrabajador());
        this.jtxt_fechaInicio.setText(String.valueOf(finiquito.getFechaInicioTrabajo()));
        this.jtxt_fechaFin.setText(String.valueOf(finiquito.getFechaFinTrabajo()));
        this.jtxt_tiempoTrabajado.setText(finiquito.getMesesTrabajadosTotal());
        this.jtxt_salarioAniosServicio.setText("$"+String.valueOf(finiquito.getSalarioIndemnizacion()));
        this.jtxt_salarioVacaciones.setText("$"+String.valueOf(finiquito.getSalarioVacaciones()));
        this.jtxt_feriadoLegal.setText(String.valueOf(finiquito.getFeriadoLegalHabil())+" días");
        this.jtxt_indemnizacionAniosServicio.setText("$"+String.valueOf(finiquito.getIndeminizacionAniosServicio()));
        this.jtxt_indemnizacionVacaciones.setText("$"+String.valueOf(finiquito.getIndemnizacionVacaciones()));
        this.jtxt_fechaLimitePago.setText(String.valueOf(finiquito.getFechaPagoFiniquito()));
        this.jtxt_totalSinPreaviso.setText("$"+String.valueOf(finiquito.getTotalIndemnizacion()));
        int totalConPreaviso = finiquito.getTotalIndemnizacion()+finiquito.getSalarioIndemnizacion();
        this.jtxt_totalConPreaviso.setText("$"+totalConPreaviso);
        
        this.jpnl_finiquito.setVisible(true);
        
        
    }//GEN-LAST:event_jbtn_buscarFiniquitoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ExcelController excelController = new ExcelController();
        try {
            excelController.generarFiniquitoXls(finiquito);
        } catch (IOException ex) {
            Logger.getLogger(FormMostrarFiniquito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMostrarFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMostrarFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMostrarFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMostrarFiniquito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMostrarFiniquito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_buscarFiniquito;
    private javax.swing.JPanel jpnl_finiquito;
    private javax.swing.JTextField jtxt_fechaFin;
    private javax.swing.JTextField jtxt_fechaInicio;
    private javax.swing.JTextField jtxt_fechaLimitePago;
    private javax.swing.JTextField jtxt_feriadoLegal;
    private javax.swing.JTextField jtxt_idFiniquito;
    private javax.swing.JTextField jtxt_indemnizacionAniosServicio;
    private javax.swing.JTextField jtxt_indemnizacionVacaciones;
    private javax.swing.JTextField jtxt_nombreTrabajador;
    private javax.swing.JTextField jtxt_salarioAniosServicio;
    private javax.swing.JTextField jtxt_salarioVacaciones;
    private javax.swing.JTextField jtxt_tiempoTrabajado;
    private javax.swing.JTextField jtxt_totalConPreaviso;
    private javax.swing.JTextField jtxt_totalSinPreaviso;
    // End of variables declaration//GEN-END:variables
}
