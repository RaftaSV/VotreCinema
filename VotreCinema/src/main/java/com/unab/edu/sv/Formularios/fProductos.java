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
import com.unab.edu.sv.DAO.ClsProductos;
import com.unab.edu.sv.DAO.ClsProveedores;
import com.unab.edu.sv.Entidades.Productos;
import com.unab.edu.sv.Entidades.Proveedores;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class fProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form fProductos
     */
    public fProductos() {
        initComponents();
        displaymember();
        CargarDatos();
        ajustartabla();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        lectura();
          tbProductos.setRowSelectionAllowed(false);
        tbProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
    }
    int indicador = 0;
    int id = 0;

    public void Limpiar() {
        txtCantidad.setText(null);
        txtPrecio.setText(null);
        txtNombre.setText(null);
        cmbProveedor.setSelectedIndex(0);
        indicador = 0;
        id = 0;

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
        lblEncabezado = new javax.swing.JLabel();
        panelCRUD = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnLectura = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFondoMouseClicked(evt);
            }
        });

        lblEncabezado.setFont(new java.awt.Font("Algerian_R", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("PRODUCTOS");

        panelCRUD.setBackground(new java.awt.Color(0, 0, 0));
        panelCRUD.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("NOMBRE");

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("PRECIO");

        txtPrecio.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("CANTIDAD");

        txtCantidad.setBackground(new java.awt.Color(0, 0, 0));
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(null);
        txtCantidad.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("PROVEEDOR");

        cmbProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setOpaque(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setOpaque(false);
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
                        .addGap(134, 134, 134)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCRUDLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCantidad)
                            .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                                .addComponent(lblPrecio)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                                .addComponent(lblCantidad)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                                .addComponent(lblProveedor)
                                .addGap(118, 118, 118))))))
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        tbProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbProductos.setBackground(new java.awt.Color(0, 0, 0));
        tbProductos.setForeground(new java.awt.Color(255, 255, 255));
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProductos.setGridColor(new java.awt.Color(0, 0, 0));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbProductosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbProductos);

        btnLectura.setForeground(new java.awt.Color(204, 255, 255));
        btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lectura.png"))); // NOI18N
        btnLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLecturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLectura)
                .addGap(6, 6, 6))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLectura)
                    .addComponent(lblEncabezado))
                .addGap(48, 48, 48)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tbProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tbProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbProductos.getColumnModel().getColumn(4).setMaxWidth(0);
        tbProductos.getColumnModel().getColumn(4).setMinWidth(0);
        tbProductos.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tbProductos.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);

        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbProductos.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbProductos.getColumnModel().getColumn(1).setCellRenderer(al);
        tbProductos.getColumnModel().getColumn(2).setCellRenderer(al);
        tbProductos.getColumnModel().getColumn(3).setCellRenderer(al);
        tbProductos.getColumnModel().getColumn(5).setCellRenderer(al);

    }

    void CargarDatos() {
        String[] Titulos = {"ID", "PRODUCTO", "PRECIO", "CANTIDAD", "IDPROV", "PROVEEDOR"};
        ClsProductos cls = new ClsProductos();
        DefaultTableModel model = new DefaultTableModel(null, Titulos);
        ArrayList<Productos> lista = cls.MostrarProductos();
        String fila[] = new String[6];
        for (var i : lista) {
            fila[0] = String.valueOf(i.getIdProductos());
            fila[1] = i.getNombreprod();
            fila[2] = String.valueOf(i.getPrecio());
            fila[3] = String.valueOf(i.getCantidad());
            fila[4] = String.valueOf(i.getIdProveedor());
            fila[5] = i.getNombre();
            model.addRow(fila);

        }

        tbProductos.setModel(model);
    }
    String valuemember[];
    int contador = 1;

    void displaymember() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsProveedores cls = new ClsProveedores();
        ArrayList<Proveedores> proveedor = cls.ListaProveedores();
        valuemember = new String[proveedor.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");

        for (var i : proveedor) {
            filas[0] = String.valueOf(i.getIdProveedor());
            filas[1] = i.getNombre();
            valuemember[contador] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contador++;
        }
        cmbProveedor.setModel(Defaultcombobox);
    }

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        // TODO add your handling code here:
        try {
            int cantidad = Integer.valueOf(txtCantidad.getText());
        } catch (Exception e) {
            txtCantidad.setText("");
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProveedorActionPerformed

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
        try {
            double precio = Double.valueOf(txtPrecio.getText());
        } catch (Exception e) {
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (indicador == 0) {
            if (txtNombre.getText() == "" || txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de asignar el nombre");
                txtNombre.requestFocus();
            } else {
                if (txtCantidad.getText() == "" || txtCantidad == null || txtCantidad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe de asignar la cantidad");
                    txtCantidad.requestFocus();
                } else {
                    if (txtPrecio.getText() == "" || txtPrecio.getText() == null || txtPrecio.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe de agirnar el precio ");
                        txtPrecio.requestFocus();
                    } else {
                        if (Integer.valueOf(cmbProveedor.getSelectedIndex()) == 0) {
                            JOptionPane.showMessageDialog(null, "Debe de asignar un proveedor");
                            cmbProveedor.requestFocus();
                        } else {
                            Productos pro = new Productos();
                            pro.setNombreprod(txtNombre.getText());
                            pro.setCantidad(Integer.valueOf(txtCantidad.getText()));
                            pro.setPrecio(Double.parseDouble(txtPrecio.getText()));
                            pro.setIdProveedor(Integer.parseInt(valuemember[cmbProveedor.getSelectedIndex()]));
                            ClsProductos cls = new ClsProductos();
                            cls.GuardarProducto(pro);
                            Limpiar();
                            CargarDatos();
                            ajustartabla();
                        }

                    }
                }

            }

        } else {
            if (txtNombre.getText() == "" || txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de asignar el nombre");
                txtNombre.requestFocus();
            } else {
                if (txtCantidad.getText() == "" || txtCantidad == null || txtCantidad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe de asignar la cantidad");
                    txtCantidad.requestFocus();
                } else {
                    if (txtPrecio.getText() == "" || txtPrecio.getText() == null || txtPrecio.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe de agirnar el precio ");
                        txtPrecio.requestFocus();
                    } else {
                        if (Integer.valueOf(cmbProveedor.getSelectedIndex()) == 0) {
                            JOptionPane.showMessageDialog(null, "Debe de asignar un proveedor");
                            cmbProveedor.requestFocus();
                        } else {
                            Productos prod = new Productos();
                            prod.setIdProductos(id);
                            prod.setNombreprod(txtNombre.getText());
                            prod.setCantidad(Integer.valueOf(txtCantidad.getText()));
                            prod.setPrecio(Double.parseDouble(txtPrecio.getText()));
                            prod.setIdProveedor(Integer.parseInt(valuemember[cmbProveedor.getSelectedIndex()]));
                            ClsProductos cls = new ClsProductos();
                            cls.ActualiarProducto(prod);
                            CargarDatos();
                            ajustartabla();
                        }

                    }
                }

            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (id != 0) {
            Productos produc = new Productos();
            produc.setIdProductos(id);
            ClsProductos cls = new ClsProductos();
            cls.EliminarProducto(produc);
            Limpiar();
            CargarDatos();
            ajustartabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debe de seleccionar un producto");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public int edicion = 0;

    public void lectura() {
        if (edicion == 0) {
            panelCRUD.setVisible(false);
            btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png")));
            edicion = 1;
        } else {
            panelCRUD.setVisible(true);
            btnLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/lectura.png")));
            edicion = 0;
        }
        Limpiar();
    }
    private void panelFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_panelFondoMouseClicked

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked

    }//GEN-LAST:event_tbProductosMouseClicked

    private void btnLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLecturaMouseClicked
        // TODO add your handling code here:
        lectura();
    }//GEN-LAST:event_btnLecturaMouseClicked

    private void tbProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseReleased
        // TODO add your handling code here:
        int fila = tbProductos.getSelectedRow();
        String idp = String.valueOf(tbProductos.getValueAt(fila, 0));
        id = Integer.valueOf(idp);
        String nombre = String.valueOf(tbProductos.getValueAt(fila, 1));
        String precio = String.valueOf(tbProductos.getValueAt(fila, 2));
        String cantidad = String.valueOf(tbProductos.getValueAt(fila, 3));
        String idprov = String.valueOf(tbProductos.getValueAt(fila, 4));
        indicador = 1;
        txtNombre.setText(nombre);
        txtPrecio.setText(precio);
        txtCantidad.setText(cantidad);

        int selectvista = 0;
        for (var iterar : valuemember) {
            if (idprov.equals(iterar)) {
                cmbProveedor.setSelectedIndex(selectvista);
            }
            selectvista += 1;
        }
    }//GEN-LAST:event_tbProductosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnLectura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
