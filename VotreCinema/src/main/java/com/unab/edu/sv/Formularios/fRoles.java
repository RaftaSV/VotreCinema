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

        Tipo = new javax.swing.ButtonGroup();
        panelFondo = new javax.swing.JPanel();
        panelCrud = new javax.swing.JPanel();
        lblpersona = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtUsu = new javax.swing.JTextField();
        lbltiporol = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtPass = new javax.swing.JTextField();
        cb_Idpersona5 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        btnInsertar5 = new javax.swing.JButton();
        rbAdmin = new javax.swing.JRadioButton();
        rbCliente = new javax.swing.JRadioButton();
        rbCajero = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMostrarRol = new javax.swing.JTable();
        lblEncabezado = new javax.swing.JLabel();

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelCrud.setBackground(new java.awt.Color(0, 0, 0));

        lblpersona.setForeground(new java.awt.Color(255, 255, 255));
        lblpersona.setText("Id Persona");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbltiporol.setForeground(new java.awt.Color(255, 255, 255));
        lbltiporol.setText("Tipo Rol");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Usuario");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Password");

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

        javax.swing.GroupLayout panelCrudLayout = new javax.swing.GroupLayout(panelCrud);
        panelCrud.setLayout(panelCrudLayout);
        panelCrudLayout.setHorizontalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addComponent(rbAdmin)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbCajero)
                        .addGap(18, 18, 18)
                        .addComponent(rbCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrudLayout.createSequentialGroup()
                        .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33))
                            .addComponent(lblpersona))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsu)
                            .addComponent(txtPass)
                            .addComponent(cb_Idpersona5, 0, 185, Short.MAX_VALUE)))
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addComponent(btnInsertar5)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
            .addGroup(panelCrudLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lbltiporol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCrudLayout.setVerticalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrudLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpersona)
                    .addComponent(cb_Idpersona5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(lbltiporol)
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdmin)
                    .addComponent(rbCliente)
                    .addComponent(rbCajero))
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar5)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        lblEncabezado.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEncabezado.setText("roles");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEncabezado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
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

    void limpiar() {
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
                    limpiar();
                    MostrarTablaRoles();
                    ajustartabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un rol");
                    rbAdmin.requestFocus();
                }

            }
        }


    }//GEN-LAST:event_btnInsertar5ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar5;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cb_Idpersona5;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblpersona;
    private javax.swing.JLabel lbltiporol;
    private javax.swing.JPanel panelCrud;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbCajero;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JTable tbMostrarRol;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
