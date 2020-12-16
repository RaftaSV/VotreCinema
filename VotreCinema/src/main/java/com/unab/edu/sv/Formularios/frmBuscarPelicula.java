/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

import com.unab.edu.sv.DAO.ClsPeliculas;
import com.unab.edu.sv.Entidades.Carteleras;
import com.unab.edu.sv.Entidades.Peliculas;
import com.unab.edu.sv.Entidades.Render;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Rafael
 */
public class frmBuscarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form frmBuscarPelicula
     */
    public frmBuscarPelicula() {
        initComponents();
        cargartabla();
        ajustartabla();
        this.setLocationRelativeTo(null);
        txtBuscar.setText("");
        tbPeliculas.setColumnSelectionAllowed(false);
        tbPeliculas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      

    }

    public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbPeliculas.getColumnModel().getColumn(0).setMaxWidth(0);
        tbPeliculas.getColumnModel().getColumn(0).setMinWidth(0);
        tbPeliculas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbPeliculas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbPeliculas.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar el contenido de la tabla
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbPeliculas.getColumnModel().getColumn(2).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(3).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(4).setCellRenderer(al);
        tbPeliculas.getColumnModel().getColumn(5).setCellRenderer(al);

        //Ajustar el tamaño de la celdas
        TableColumn columna1;
        columna1 = tbPeliculas.getColumnModel().getColumn(1);
        columna1.setPreferredWidth(150);
        tbPeliculas.setRowHeight(320);
    }
    Peliculas p = new Carteleras();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        TABLA = new javax.swing.JScrollPane();
        tbPeliculas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PELICULAS");

        tbPeliculas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbPeliculas.setBackground(new java.awt.Color(0, 0, 0));
        tbPeliculas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        tbPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPeliculas.setCellSelectionEnabled(true);
        tbPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbPeliculas.setGridColor(new java.awt.Color(255, 255, 255));
        tbPeliculas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbPeliculas.setShowGrid(true);
        tbPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPeliculasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbPeliculasMouseReleased(evt);
            }
        });
        TABLA.setViewportView(tbPeliculas);

        txtBuscar.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscarb.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(426, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 345, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    SimpleDateFormat formato = new SimpleDateFormat("d MMM y");

    public void cargartabla() {
        p.setNombre(txtBuscar.getText());
        String[] Titulos = {"ID", "PORTADA", "NOMBRE", "DURACION", "CLASIFICACION", "TIPO"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        tbPeliculas.setDefaultRenderer(Object.class, new Render());
        ClsPeliculas cls = new ClsPeliculas();
        ArrayList<Peliculas> lista = cls.ListaPeliculasBuscar(p);
        Object fila[] = new Object[8];
        for (var i : lista) {
            fila[0] = i.getIdPelicula();
            try {
                // Cargar la imagen en formato byte
                byte[] bi = i.getPortada();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                //La imagen redimencionarla al tamaño que se mostrara en la jTable
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(180, 300, Image.SCALE_SMOOTH));
                fila[1] = new JLabel(imgi);

            } catch (Exception e) {
                fila[1] = new JLabel("No hay imagen");
            }
            // En las jTables se puede utilizar codigo html, en este caso estamos alineando el texto 
            // a justicifado
            fila[2] = "<HTML>" + "<p align=\"justify\">" + i.getNombre() + "</HTML>";
            fila[3] = "<HTML>" + "<p align=\"justify\">" + i.getDuracion() + "</HTML>";
            if (i.getClasificacion() == 0) {
                fila[4] = "<HTML>" + "<p align=\"justify\">" + "Para toda la familia" + "</HTML>";
            } else if (i.getClasificacion() == 1) {
                fila[4] = "<HTML>" + "<p align=\"justify\">" + "Para mayores de 15 años" + "</HTML>";
            } else if (i.getClasificacion() == 2) {
                fila[4] = "<HTML>" + "<p align=\"justify\">" + "Para mayores de 18 años" + "</HTML>";
            }
            if (i.getTipo() == 0) {
                fila[5] = "<HTML>" + "<p align=\"justify\">" + "2D" + "</HTML>";
            } else if (i.getTipo() == 1) {
                fila[5] = "<HTML>" + "<p align=\"justify\">" + "3D" + "</HTML>";
            }
            modelo.addRow(fila);
        }
        tbPeliculas.setModel(modelo);

    }
    private void tbPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeliculasMouseClicked


    }//GEN-LAST:event_tbPeliculasMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        cargartabla();
        ajustartabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbPeliculasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPeliculasMouseReleased
        // TODO add your handling code here:

        int res = JOptionPane.showConfirmDialog(null, "¿Desea Elegir esta pelicula?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            int fila = tbPeliculas.getSelectedRow();
            String idd = String.valueOf(tbPeliculas.getValueAt(fila, 0));
            int id = Integer.valueOf(idd);
            frmLogin l = new frmLogin();
            JLabel j = (JLabel) tbPeliculas.getModel().getValueAt(fila, 1);
            Icon imgi = j.getIcon();
            String nombre = String.valueOf(tbPeliculas.getValueAt(fila, 2));
            String nombrer = nombre.replaceAll("<HTML>", "").replaceAll("<p align=\"justify\">", "").replaceAll("</HTML>", "");
            l.principal.cartelera.insertar.txtpelicula.setText(nombrer);
            l.principal.cartelera.insertar.lblPelicula.setIcon(imgi);
            l.principal.cartelera.insertar.idpelicula = id;
            this.dispose();

        } else {

        }
    }//GEN-LAST:event_tbPeliculasMouseReleased

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
            java.util.logging.Logger.getLogger(frmBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JTable tbPeliculas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
