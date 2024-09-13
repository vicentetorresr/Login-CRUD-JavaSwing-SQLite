/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_requerimientos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vicente
 */
public class mostrarClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form mostrarClientes
     */
    public mostrarClientes() {
        initComponents();
        actualizarTabla("where estadoCliente='Activo';");
    }

    private void actualizarTabla(String consulta) {
        try {
            Object[] cabeceras
                    = {
                        "ID", "Rut", "Nombre", "Telefono", "Correo", "Tipo", "Estado"
                    };
            Object[][] cuerpo
                    = {};
            DefaultTableModel modelo = new DefaultTableModel(cuerpo, cabeceras);
            String sql = "select * from cliente " + consulta;

            conexion conn = new conexion();
            ResultSet resul = conn.consultar(sql);

            while (resul.next()) {
                Object[] elemento
                        = {
                            resul.getString("idCliente"), resul.getString("rutCliente"), resul.getString("nombreCliente"),
                            resul.getString("telefonoCliente"), resul.getString("correoCliente"), resul.getString("tipoCliente"), resul.getString("estadoCliente")
                        };
                modelo.addRow(elemento);
            }
            table.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(mostrarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jLabel6 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JCheckBox();
        btn_actualizar = new javax.swing.JButton();
        cbCliente = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Agregar);

        Eliminar.setText("Eliminar");
        jPopupMenu1.add(Eliminar);

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("id");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rut:");

        cbEstado.setForeground(new java.awt.Color(0, 0, 0));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de telefono:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo Electronico:");

        buttonGroup1.add(cbProveedor);
        cbProveedor.setForeground(new java.awt.Color(0, 0, 0));
        cbProveedor.setText("Proveedor");

        btn_actualizar.setBackground(new java.awt.Color(0, 102, 102));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar Cliente");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbCliente);
        cbCliente.setForeground(new java.awt.Color(0, 0, 0));
        cbCliente.setText("Cliente");

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(table);

        txtID.setEditable(false);
        txtID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Completo:");

        btnMostrar.setBackground(new java.awt.Color(102, 204, 0));
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar Inactivos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo)
                            .addComponent(txtNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbProveedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCliente))
                                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProveedor)
                    .addComponent(cbCliente))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // idCliente,rutCliente,nombreCliente,telefonoCliente,correoCliente,tipoCliente,estadoCliente

        String id = txtID.getText();
        String rut = txtRut.getText();
        String nombre = txtNombre.getText();
        String telefono = txtNum.getText();
        String correo = txtCorreo.getText();
        String tipo = "";
        if (cbCliente.isSelected()) {
            tipo = "Normal";
        } else if (cbProveedor.isSelected()) {
            tipo = "Proveedor";
        } else {
            tipo = "";
        }
        String estado = (String) cbEstado.getSelectedItem();
        if (!id.equals("") && !rut.equals("") && !nombre.equals("") && !telefono.equals("") && !correo.equals("") && !tipo.equals("") && !estado.equals("")) {
            conexion connn = new conexion();
            String sql = "UPDATE `cliente` SET `rutCliente` = '" + rut + "', `nombreCliente` = '" + nombre + "', `telefonoCliente` = '" + telefono + "', "
                    + "`correoCliente` = '" + correo + "', `tipoCliente` = '" + tipo + "', `estadoCliente` = '" + estado + "' WHERE `cliente`.`idCliente` = " + id + ";";
            connn.executa(sql);
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            actualizarTabla("where estadoCliente='Activo';");
        } else {
            JOptionPane.showMessageDialog(null, "Fallo al actualizar");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        actualizarTabla("");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        int fila = table.getSelectedRow();
        String tipo = (String) table.getValueAt(fila, 5);
        cbCliente.setSelected(false);
        cbProveedor.setSelected(false);

        if (tipo.equals("Normal")) {
            cbCliente.setSelected(true);
        } else if (tipo.equals("Proveedor")) {
            cbProveedor.setSelected(true);
        }

        String id = (String) table.getValueAt(fila, 0);
        String rut = (String) table.getValueAt(fila, 1);
        String nom = (String) table.getValueAt(fila, 2);
        String tel = (String) table.getValueAt(fila, 3);
        String correo = (String) table.getValueAt(fila, 4);
        String estado = (String) table.getValueAt(fila, 6);

        txtID.setText(id);
        txtRut.setText(rut);
        txtNombre.setText(nom);
        txtNum.setText(tel);
        txtCorreo.setText(correo);
        cbEstado.setSelectedItem(estado);
    }//GEN-LAST:event_AgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbCliente;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JCheckBox cbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
