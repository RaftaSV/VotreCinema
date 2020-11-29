/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import java.awt.AWTEventMulticaster;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.jfr.Event;

/**
 *
 * @author Rafael
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        btnCerrarMenu = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        btnPersonas = new javax.swing.JButton();
        btnSalas = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        panelcontenedor = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1158, 631));
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setMaximumSize(new java.awt.Dimension(0, 0));
        panelFondo.setMinimumSize(new java.awt.Dimension(0, 0));

        panelBarra.setBackground(new java.awt.Color(215, 172, 33));
        panelBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        btnCerrarMenu.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCerrarMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menu.png"))); // NOI18N
        btnCerrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMenuMouseClicked(evt);
            }
        });

        btnOcultar.setBackground(new java.awt.Color(204, 0, 0));
        btnOcultar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOcultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/minimizar.png"))); // NOI18N
        btnOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });

        btncerrar.setBackground(new java.awt.Color(204, 0, 0));
        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btncerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerca.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(204, 0, 0));
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pestana-multiple.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnCerrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenu.setBackground(new java.awt.Color(215, 172, 33));

        btnProveedores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnPeliculas.setFont(new java.awt.Font("Algerian_R", 1, 18)); // NOI18N
        btnPeliculas.setText("PELICULA");
        btnPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Algerian_R", 1, 18)); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnRoles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRoles.setText("ROLES");
        btnRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        btnPersonas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPersonas.setText("PERSONAS");
        btnPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });

        btnSalas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalas.setText("SALAS");
        btnSalas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalasActionPerformed(evt);
            }
        });

        btnHorarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHorarios.setText("HORARIOS");
        btnHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addComponent(btnPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(btnPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        panelcontenedor.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panelcontenedorLayout = new javax.swing.GroupLayout(panelcontenedor);
        panelcontenedor.setLayout(panelcontenedorLayout);
        panelcontenedorLayout.setHorizontalGroup(
            panelcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        panelcontenedorLayout.setVerticalGroup(
            panelcontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelcontenedor))
            .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelcontenedor)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int ocultarMenu = 0;
    private void btnCerrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMenuMouseClicked
        // TODO add your handling code here:
        if (ocultarMenu == 0) {
            panelMenu.setVisible(false);
            ocultarMenu = 1;
        } else {
            panelMenu.setVisible(true);
            ocultarMenu = 0;
        }
    }//GEN-LAST:event_btnCerrarMenuMouseClicked
    public int cerrar = 0;

    void cerrarjinternal() {
        try {
            proveedor.dispose();
        } catch (Exception e) {
        }
        try {
            producto.dispose();
        } catch (Exception e) {
        }
        try {
            rol.dispose();
        } catch (Exception e) {
        }
        try {
            persona.dispose();
        } catch (Exception e) {
        }
        try {
            horario.dispose();
        } catch (Exception e) {
        }
        try {
            Sala.dispose();

        } catch (Exception e) {
        }
        try {
            pelicula.dispose();
        } catch (Exception e) {
        }
    }

    public void Mostrar() {
        if (cerrar == 1) {
            cerrarjinternal();
            if (pelicula == null || pelicula.isClosed()) {
                pelicula = new fPeliculas();
                panelcontenedor.add(pelicula);
                pelicula.setVisible(true);
                try {
                    pelicula.setMaximum(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (cerrar == 2) {
                cerrarjinternal();
                if (producto == null || producto.isClosed()) {
                    producto = new fProductos();
                    panelcontenedor.add(producto);
                    producto.setVisible(true);
                    try {
                        producto.setMaximum(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                if (cerrar == 3) {
                   cerrarjinternal();
                    if (proveedor == null || proveedor.isClosed()) {
                        proveedor = new fProveedores();
                        panelcontenedor.add(proveedor);
                        proveedor.setVisible(true);
                        try {
                            proveedor.setMaximum(true);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                } else {
                    if (cerrar == 4) {
                        cerrarjinternal();
                        if (rol == null || rol.isClosed()) {
                            rol = new fRoles();
                            try {
                                rol.setMaximum(true);
                            } catch (Exception e) {
                            }
                            panelcontenedor.add(rol);
                            rol.setVisible(true);
                        }

                    } else {
                        if (cerrar == 5) {
                        cerrarjinternal();
                            if (persona == null || persona.isClosed()) {
                                persona = new fPersonas();
                                persona.edicion = 0;
                                try {
                                    persona.setMaximum(true);
                                } catch (Exception e) {
                                }
                                panelcontenedor.add(persona);
                                persona.setVisible(true);
                            }
                        } else {
                            if (cerrar == 6) {
                                cerrarjinternal();
                                if (Sala == null || Sala.isClosed()) {
                                    Sala = new fSalas();
                                    Sala.edicion = 0;
                                    try {
                                        Sala.setMaximum(true);
                                    } catch (Exception e) {
                                    }
                                    panelcontenedor.add(Sala);
                                    Sala.setVisible(true);
                                }
                            } else {
                                if (cerrar == 7) {
                                    cerrarjinternal();
                                    if (horario == null || horario.isClosed()) {
                                        horario = new fHorarios();
                                        horario.edicion = 0;
                                        horario.lectura();
                                        try {
                                            horario.setMaximum(true);
                                        } catch (Exception e) {
                                        }

                                        panelcontenedor.add(horario);
                                        horario.edicion = 0;
                                        horario.setVisible(true);
                                    }

                                }
                            }
                        }

                    }
                }
            }
        }
    }
    public fPeliculas pelicula;
    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        cerrar = 1;
         Mostrar();


    }//GEN-LAST:event_btnPeliculasActionPerformed
    public fProveedores proveedor;
    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        cerrar = 3;
         Mostrar();


    }//GEN-LAST:event_btnProveedoresActionPerformed
    public fProductos producto;
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        cerrar = 2;
        Mostrar();

    }//GEN-LAST:event_btnProductosActionPerformed
    public fRoles rol;
    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        // TODO add your handling code here:
        cerrar = 4;
        Mostrar();
    }//GEN-LAST:event_btnRolesActionPerformed
    public fPersonas persona;
    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed
        // TODO add your handling code here:
        cerrar = 5;
         Mostrar();
         
    }//GEN-LAST:event_btnPersonasActionPerformed

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        // TODO add your handling code here:

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this, "Desea salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btncerrarMouseClicked

    int minimizar = 0;
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        if (minimizar == 0) {
            this.setExtendedState(MAXIMIZED_BOTH);
            minimizar = 1;
        } else if (minimizar == 1) {
            this.setSize(1158, 631);
            this.setLocationRelativeTo(null);
            minimizar = 0;
        }
    }//GEN-LAST:event_btnMinimizarMouseClicked
    int x, y;
    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelBarraMouseDragged
    public fSalas Sala;
    private void btnSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalasActionPerformed
        // TODO add your handling code here:
        cerrar = 6;
        Mostrar();
    }//GEN-LAST:event_btnSalasActionPerformed
    public fHorarios horario;
    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        // TODO add your handling code here:
        cerrar = 7;

         Mostrar();

    }//GEN-LAST:event_btnHorariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarMenu;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JButton btnPersonas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnSalas;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JDesktopPane panelcontenedor;
    // End of variables declaration//GEN-END:variables

    private void setMaximumSize(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMinimumSize(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
