/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.sv.Formularios;

/**
 *
 * @author Rafael
 */
import com.unab.edu.sv.DAO.ClsProveedores;
import com.unab.edu.sv.Entidades.Productos;
import com.unab.edu.sv.Entidades.Proveedores;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class fProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form fProveedores
     */
    public fProveedores() {
        initComponents();
        CargarTabla();
        ajustartabla();
        Limpiar();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        TABLA = new javax.swing.JScrollPane();
        tbProveedores = new javax.swing.JTable();
        panelCRUD = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnElimanar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        fondo.setBackground(new java.awt.Color(0, 0, 0));

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PROVEEDORES");

        tbProveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbProveedores.setBackground(new java.awt.Color(0, 0, 0));
        tbProveedores.setForeground(new java.awt.Color(255, 255, 255));
        tbProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
        tbProveedores.setCellSelectionEnabled(true);
        tbProveedores.setGridColor(new java.awt.Color(0, 0, 0));
        tbProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProveedoresMouseClicked(evt);
            }
        });
        TABLA.setViewportView(tbProveedores);

        panelCRUD.setBackground(new java.awt.Color(0, 0, 0));

        lblNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnElimanar.setText("Eliminar");
        btnElimanar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimanarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCRUDLayout = new javax.swing.GroupLayout(panelCRUD);
        panelCRUD.setLayout(panelCRUDLayout);
        panelCRUDLayout.setHorizontalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnElimanar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblDireccion))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblTelefono))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblNombres)))
                .addGap(3, 10, Short.MAX_VALUE))
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnElimanar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(TABLA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
        tbProveedores.getColumnModel().getColumn(0).setMinWidth(0);
        tbProveedores.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbProveedores.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbProveedores.getColumnModel().getColumn(2).setMinWidth(150);
        tbProveedores.getColumnModel().getColumn(2).setMaxWidth(180);
        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbProveedores.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbProveedores.getColumnModel().getColumn(1).setCellRenderer(al);
        tbProveedores.getColumnModel().getColumn(2).setCellRenderer(al);
        tbProveedores.getColumnModel().getColumn(3).setCellRenderer(al);

    }

    void CargarTabla() {

        String TITULOS[] = {"ID", "Nombres", "Telefono", "Direccion"};
        ClsProveedores proveedor = new ClsProveedores();
        DefaultTableModel model = new DefaultTableModel(null, TITULOS);
        ArrayList<Proveedores> person = proveedor.ListaProveedores();
        String filas[] = new String[4];
        for (var i : person) {
            filas[0] = String.valueOf(i.getIdProveedor());
            filas[1] = i.getNombre();
            filas[2] = i.getTelefono();
            filas[3] = i.getDirecion();
            model.addRow(filas);
        }
        tbProveedores.setModel(model);

    }
    int estado = 0;
    int id = 0;
    private void tbProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProveedoresMouseClicked
        int fila = tbProveedores.getSelectedRow();
        id = Integer.valueOf(String.valueOf(tbProveedores.getValueAt(fila, 0)));
        String nombre = String.valueOf(tbProveedores.getValueAt(fila, 1));
        String telefono = String.valueOf(tbProveedores.getValueAt(fila, 2));
        String Direccion = String.valueOf(tbProveedores.getValueAt(fila, 3));
        estado = 1;
        txtNombre.setText(nombre);
        txtDireccion.setText(Direccion);
        txtTelefono.setText(telefono);
    }//GEN-LAST:event_tbProveedoresMouseClicked

    void Limpiar() {
        txtDireccion.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        estado = 0;
        id = 0;

    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (estado == 0) {
            Proveedores pro = new Proveedores();
            pro.setNombre(txtNombre.getText());
            pro.setTelefono(txtTelefono.getText());
            pro.setDirecion(txtDireccion.getText());
            ClsProveedores cls = new ClsProveedores();
            if (txtDireccion.getText() == "" || txtDireccion.getText().isEmpty() || txtDireccion.getText() == null || txtNombre.getText() == ""
                    || txtNombre.getText().isEmpty() || txtNombre.getText() == null || txtDireccion.getText() == "" || txtDireccion.getText().isEmpty() || txtDireccion.getText() == null) {
                JOptionPane.showMessageDialog(null, "todos los campos son obligatorios");
            } else {
                cls.GuardarProveedor(pro);
                Limpiar();
                CargarTabla();
                ajustartabla();
            }

        } else {
            Proveedores proo = new Proveedores();
            proo.setIdProveedor(id);
            proo.setNombre(txtNombre.getText());
            proo.setTelefono(txtTelefono.getText());
            proo.setDirecion(txtDireccion.getText());
            ClsProveedores cls = new ClsProveedores();
            if (txtDireccion.getText() == "" || txtDireccion.getText().isEmpty() || txtDireccion.getText() == null || txtNombre.getText() == ""
                    || txtNombre.getText().isEmpty() || txtNombre.getText() == null || txtDireccion.getText() == "" || txtDireccion.getText().isEmpty() || txtDireccion.getText() == null) {
                JOptionPane.showMessageDialog(null, "todos los campos son obligatorios");
            } else {
                cls.ActualizarProveedor(proo);
                Limpiar();
                CargarTabla();
                ajustartabla();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimanarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimanarActionPerformed
        if (id != 0) {
            Proveedores pro = new Proveedores();
            pro.setIdProveedor(id);
            ClsProveedores prov = new ClsProveedores();
            prov.EliminarProveedor(pro);
            CargarTabla();
            ajustartabla();
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor");
        }
    }//GEN-LAST:event_btnElimanarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TABLA;
    private javax.swing.JButton btnElimanar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JTable tbProveedores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
