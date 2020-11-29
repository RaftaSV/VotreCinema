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
import com.unab.edu.sv.DAO.ClsPersona;
import com.unab.edu.sv.DAO.ClsRoles;
import com.unab.edu.sv.Entidades.Personas;
import com.unab.edu.sv.Entidades.Roles;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class fRoles extends javax.swing.JInternalFrame {

    /**
     * Creates new form fRoles
     */
    public fRoles() {
        initComponents();
        
        MostrarTablaRoles();
        displaymember();
        ajustartabla();
        lectura();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }
    public int edicion =0;
    public void lectura(){
         if (edicion ==0){
        panelCRUD.setVisible(false);
         btnLectura.setText("Lectura");
        edicion=1;
        }else{
         panelCRUD.setVisible(true);
         btnLectura.setText("Edicion");
        edicion=0;
        }
     limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipo = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        panelCRUD = new javax.swing.JPanel();
        lblpersona = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtUsu = new javax.swing.JTextField();
        lbltiporol = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cb_Idpersona5 = new javax.swing.JComboBox<>();
        lblPass = new javax.swing.JLabel();
        btnInsertar5 = new javax.swing.JButton();
        rbAdmin = new javax.swing.JRadioButton();
        rbCliente = new javax.swing.JRadioButton();
        rbCajero = new javax.swing.JRadioButton();
        lblVer = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrarRol = new javax.swing.JTable();
        btnLectura = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelCRUD.setBackground(new java.awt.Color(0, 0, 0));

        lblpersona.setForeground(new java.awt.Color(255, 255, 255));
        lblpersona.setText("Id Persona");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtUsu.setBackground(new java.awt.Color(0, 0, 0));
        txtUsu.setBorder(null);

        lbltiporol.setForeground(new java.awt.Color(255, 255, 255));
        lbltiporol.setText("Tipo Rol");

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Usuario");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Password");

        btnInsertar5.setText("Guardar");
        btnInsertar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar5ActionPerformed(evt);
            }
        });

        rbAdmin.setBackground(new java.awt.Color(0, 0, 0));
        Tipo.add(rbAdmin);
        rbAdmin.setForeground(new java.awt.Color(255, 255, 255));
        rbAdmin.setText("Administrador");

        rbCliente.setBackground(new java.awt.Color(0, 0, 0));
        Tipo.add(rbCliente);
        rbCliente.setForeground(new java.awt.Color(255, 255, 255));
        rbCliente.setText("Cliente");

        rbCajero.setBackground(new java.awt.Color(0, 0, 0));
        Tipo.add(rbCajero);
        rbCajero.setForeground(new java.awt.Color(255, 255, 255));
        rbCajero.setText("Cajero");

        lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ojo.png"))); // NOI18N
        lblVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVer.setOpaque(true);
        lblVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerMouseClicked(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(0, 0, 0));
        txtPass.setBorder(null);

        javax.swing.GroupLayout panelCRUDLayout = new javax.swing.GroupLayout(panelCRUD);
        panelCRUD.setLayout(panelCRUDLayout);
        panelCRUDLayout.setHorizontalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDLayout.createSequentialGroup()
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(txtUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addGroup(panelCRUDLayout.createSequentialGroup()
                                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addGap(2, 2, 2)
                                .addComponent(lblVer))))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbltiporol))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCRUDLayout.createSequentialGroup()
                                .addComponent(btnInsertar5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addGroup(panelCRUDLayout.createSequentialGroup()
                                .addComponent(rbAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCajero)
                                .addGap(18, 18, 18)
                                .addComponent(rbCliente))))
                    .addGroup(panelCRUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblpersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_Idpersona5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelCRUDLayout.setVerticalGroup(
            panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Idpersona5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpersona))
                .addGap(26, 26, 26)
                .addComponent(lbltiporol)
                .addGap(16, 16, 16)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdmin)
                    .addComponent(rbCajero)
                    .addComponent(rbCliente))
                .addGap(18, 18, 18)
                .addGroup(panelCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar5)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tbMostrarRol = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };
        tbMostrarRol.setBackground(new java.awt.Color(0, 0, 0));
        tbMostrarRol.setForeground(new java.awt.Color(255, 255, 255));
        tbMostrarRol.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMostrarRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMostrarRolMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbMostrarRol);

        btnLectura.setForeground(new java.awt.Color(204, 255, 255));
        btnLectura.setText("Lectura");
        btnLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLecturaMouseClicked(evt);
            }
        });

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("roles");
        lblEncabezado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addComponent(btnLectura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnLectura)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int estado = 0;
    int id = 0;
    int dat = 0;

    public void ajustartabla() {
        // Ocultar la columna del ID de la pelicula
        tbMostrarRol.getColumnModel().getColumn(0).setMaxWidth(0);
        tbMostrarRol.getColumnModel().getColumn(0).setMinWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        tbMostrarRol.getColumnModel().getColumn(2).setMaxWidth(0);
        tbMostrarRol.getColumnModel().getColumn(2).setMinWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        tbMostrarRol.getColumnModel().getColumn(4).setMaxWidth(0);
        tbMostrarRol.getColumnModel().getColumn(4).setMinWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        tbMostrarRol.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);

        //Centrar en texto del encabezado de la tabla
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tbMostrarRol.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer al = new DefaultTableCellRenderer();
        al.setHorizontalAlignment(SwingConstants.CENTER);
        tbMostrarRol.getColumnModel().getColumn(1).setCellRenderer(al);
        tbMostrarRol.getColumnModel().getColumn(3).setCellRenderer(al);
        tbMostrarRol.getColumnModel().getColumn(5).setCellRenderer(al);

    }

    void MostrarTablaRoles() {
        String Titulos[] = {"ID", "PERSONA", "IDPERSONA", "USUARIO", "PASSWORD", "TIPO ROL"};
        DefaultTableModel df = new DefaultTableModel(null, Titulos);
        ClsRoles ClsRol = new ClsRoles();
        var MostrarRoles = ClsRol.MostrarRoles();
        String filas[] = new String[6];

        for (var iterador : MostrarRoles) {
            filas[0] = String.valueOf(iterador.getIdRol());
            filas[1] = iterador.getNombres();
            filas[2] = String.valueOf(iterador.getId_Persona());
            filas[3] = iterador.getUsuario();
            filas[4] = String.valueOf(iterador.getPasword());
            if (iterador.getTipoRol() == 0) {
                filas[5] = String.valueOf("Administrador");
            } else if (iterador.getTipoRol() == 1) {
                filas[5] = String.valueOf("Cajero");
            } else {
                filas[5] = String.valueOf("Cliente");
            }
            df.addRow(filas);
        }

        tbMostrarRol.setModel(df);
    }
    int radio = -1;

    void Button() {
        if (rbAdmin.isSelected()) {

            radio = 0;

        } else if (rbCajero.isSelected()) {

            radio = 1;
        } else if (rbCliente.isSelected()) {

            radio = 2;
        }
    }

    public void limpiar() {
        radio = -1;
        txtUsu.setText("");
        txtPass.setText("");
        estado = 0;
        id = 0;
        Tipo.clearSelection();
        cb_Idpersona5.setSelectedIndex(0);
    }
    String valuemember[];
    int contador = 1;

    void displaymember() {
        DefaultComboBoxModel Defaultcombobox = new DefaultComboBoxModel<>();
        ClsPersona persona = new ClsPersona();
        ArrayList<Personas> Persona = persona.ListaPersonas();
        valuemember = new String[Persona.size() + 1];
        String filas[] = new String[5];
        Defaultcombobox.addElement("");

        for (var i : Persona) {
            filas[0] = String.valueOf(i.getIdPersona());
            filas[1] = i.getNombres();
            valuemember[contador] = filas[0];
            Defaultcombobox.addElement(filas[1]);
            contador++;
        }
        cb_Idpersona5.setModel(Defaultcombobox);
    }


    private void tbMostrarRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMostrarRolMouseClicked
        int fila = tbMostrarRol.getSelectedRow();
        id = Integer.parseInt(String.valueOf(tbMostrarRol.getValueAt(fila, 0)));
        String usuario = String.valueOf(tbMostrarRol.getValueAt(fila, 3));
        String pasword = String.valueOf(tbMostrarRol.getValueAt(fila, 4));
        String tiporol = String.valueOf(tbMostrarRol.getValueAt(fila, 5));
        if (tiporol == "Administrador") {
            rbAdmin.setSelected(true);
            rbCajero.setSelected(false);
            rbCliente.setSelected(false);
        } else if (tiporol == "Cajero") {
            rbAdmin.setSelected(false);
            rbCajero.setSelected(true);
            rbCliente.setSelected(false);
        } else {
            rbAdmin.setSelected(false);
            rbCajero.setSelected(false);
            rbCliente.setSelected(true);
        }

        String idpersona = String.valueOf(tbMostrarRol.getValueAt(fila, 2));
        txtUsu.setText(usuario);
        txtPass.setText(pasword);
        txtUsu.setText(usuario);
        txtPass.setText(pasword);

        dat = 1;
        int selectvista = 0;
        for (var iterar : valuemember) {
            if (idpersona.equals(iterar)) {
                cb_Idpersona5.setSelectedIndex(selectvista);
            }
            selectvista += 1;
        }
        estado = 1;
    }//GEN-LAST:event_tbMostrarRolMouseClicked

    private void btnLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLecturaMouseClicked
        // TODO add your handling code here:
        lectura();
    }//GEN-LAST:event_btnLecturaMouseClicked

    private void lblVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerMouseClicked
        // TODO add your handling code here:
        if (ver == 0) {
            txtPass.setEchoChar((char)0);
            lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ciego.png")));
            ver = 1;
        } else {
            ver=0;
            txtPass.setEchoChar('*');
            lblVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ojo.png")));
        }
    }//GEN-LAST:event_lblVerMouseClicked

    private void btnInsertar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar5ActionPerformed

        if (estado == 0) {
            Button();
            Roles rol = new Roles();

            if (txtUsu.getText() == "" || txtUsu.getText().isEmpty() || txtUsu.getText() == null) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar Usuario");
                txtUsu.requestFocus();
            } else if (txtPass.getText() == "" || txtPass.getText().isEmpty() || txtPass.getText() == null) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar Password");
                txtPass.requestFocus();
            } else if (Integer.valueOf(cb_Idpersona5.getSelectedIndex()) == 0) {
                JOptionPane.showMessageDialog(null, "Es necesario seleccionar IdPersona");
                cb_Idpersona5.requestFocus();
            } else {
                if (radio != -1) {
                    rol.setTipoRol(radio);
                    ClsRoles clsrol = new ClsRoles();
                    rol.setUsuario(txtUsu.getText());
                    rol.setPasword(txtPass.getText());
                    rol.setId_Persona(Integer.parseInt(valuemember[cb_Idpersona5.getSelectedIndex()]));
                    clsrol.AgregarRol(rol);
                    limpiar();
                    MostrarTablaRoles();
                    ajustartabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un rol");
                    rbAdmin.requestFocus();
                }

            }

        } else {
            Button();
            Roles roles = new Roles();

            if (txtUsu.getText() == "" || txtUsu.getText().isEmpty() || txtUsu.getText() == null) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar Usuario");
                txtUsu.requestFocus();
            } else if (txtPass.getText() == "" || txtPass.getText().isEmpty() || txtPass.getText() == null) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar Password");
                txtPass.requestFocus();
            } else if (Integer.valueOf(cb_Idpersona5.getSelectedIndex()) == 0) {
                JOptionPane.showMessageDialog(null, "Es necesario seleccionar IdPersona");
                cb_Idpersona5.requestFocus();
            } else {
                if (radio != -1) {
                    roles.setTipoRol(radio);
                    ClsRoles clsrol = new ClsRoles();
                    roles.setIdRol(id);
                    roles.setUsuario(txtUsu.getText());
                    roles.setPasword(txtPass.getText());
                    roles.setId_Persona(Integer.parseInt(valuemember[cb_Idpersona5.getSelectedIndex()]));
                    clsrol.ActualizarRol(roles);
                    MostrarTablaRoles();
                    ajustartabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un rol");
                    rbAdmin.requestFocus();
                }

            }
        }

    }//GEN-LAST:event_btnInsertar5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (id != 0) {
            Roles rol = new Roles();
            rol.setIdRol(id);
            ClsRoles cls = new ClsRoles();
            cls.EliminarRol(rol);
            MostrarTablaRoles();
            limpiar();
            ajustartabla();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un rol a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
  int ver =0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar5;
    private javax.swing.JLabel btnLectura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cb_Idpersona5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lblpersona;
    private javax.swing.JLabel lbltiporol;
    private javax.swing.JPanel panelCRUD;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbCajero;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JTable tbMostrarRol;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
