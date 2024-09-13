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
public class mantenedorUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form mantenedorUsuarios
     */
    public mantenedorUsuarios() {
        initComponents();
        carga();
    }

    private void carga() {
        try {
            Object[] cabeceras = {"ID", "Usuario", "Contraseña", "Tipo"};
            Object[][] cuerpo = {};
            DefaultTableModel modelo = new DefaultTableModel(cuerpo, cabeceras);
            String sql = "select * from usuario";

            conexion conn = new conexion();
            ResultSet resul = conn.consultar(sql);

            while (resul.next()) {
                Object[] elemento = {resul.getString("idUser"), resul.getString("user"),
                    resul.getString("password"), resul.getString("type")};
                modelo.addRow(elemento);
            }
            lista.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(mantenedorUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        cbBodega = new javax.swing.JRadioButton();
        cbAdmin = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cbCaja = new javax.swing.JRadioButton();

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Agregar);

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id:");

        lista.setBackground(new java.awt.Color(51, 51, 51));
        lista.setForeground(new java.awt.Color(255, 255, 255));
        lista.setModel(new javax.swing.table.DefaultTableModel(
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
        lista.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(lista);

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));

        cbBodega.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(cbBodega);
        cbBodega.setForeground(new java.awt.Color(255, 255, 255));
        cbBodega.setText("Bodega");

        cbAdmin.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(cbAdmin);
        cbAdmin.setForeground(new java.awt.Color(255, 255, 255));
        cbAdmin.setText("Admin");

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 0));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(102, 0, 102));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");

        txtID.setEditable(false);
        txtID.setForeground(new java.awt.Color(0, 0, 0));

        cbCaja.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(cbCaja);
        cbCaja.setForeground(new java.awt.Color(255, 255, 255));
        cbCaja.setText("Caja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(cbAdmin)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbBodega)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCaja))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbAdmin)
                        .addComponent(cbBodega)
                        .addComponent(cbCaja)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        char clave[] = txtPass.getPassword();
        String pass = new String(clave).toLowerCase();
        String usu = txtUser.getText().toLowerCase();
        String tipo = "";

        if (cbAdmin.isSelected()) {
            tipo = "Admin";
        } else if (cbBodega.isSelected()) {
            tipo = "Bodega";
        } else if (cbCaja.isSelected()) {
            tipo = "Cajero";
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos", null, JOptionPane.ERROR_MESSAGE);
        }

        if (cbCaja.isSelected() || cbAdmin.isSelected() || cbBodega.isSelected()) {
            if (!usu.equals("") && !pass.equals("") && !tipo.equals("")) {
                try {
                    // Verificar si el usuario ya existe
                    String checkUserQuery = "SELECT * FROM usuario WHERE user = '" + usu + "'";
                    conexion connCheck = new conexion();
                    ResultSet rs = connCheck.consultar(checkUserQuery);

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Usuario ya registrado", null, JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Si el usuario no existe, realizar la inserción
                        String insertUserQuery = "INSERT INTO usuario (user, password, type) VALUES"
                                + " ('" + usu + "','" + pass + "','" + tipo + "')";
                        conexion connInsert = new conexion();
                        connInsert.executa(insertUserQuery);

                        JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
                        carga();
                        txtUser.setText("");
                        txtPass.setText("");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al verificar/insertar usuario", null, JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String id = txtID.getText();
        String user = txtUser.getText();
        String password = txtPass.getText();
        String type = "";
        if (cbAdmin.isSelected()) {
            type = "Admin";
        } else if (cbBodega.isSelected()) {
            type = "Bodega";
        } else if (cbCaja.isSelected()) {
            type = "Cajero";
        }
        if (!user.equals("") && !password.equals("") && !type.equals("") && !id.equals("")) {
            conexion connn = new conexion();
            String sql = "UPDATE `usuario` SET `user` = '" + user + "', `password` = '" + password + "', `type` = '" + type + "' WHERE `usuario`.`idUser` = " + id + ";";
            connn.executa(sql);
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            carga();
        } else {
            JOptionPane.showMessageDialog(null, "Fallo al actualizar");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        int fila = lista.getSelectedRow();
        System.out.println(fila);
        String id = (String) lista.getValueAt(fila, 0);
        String usu = (String) lista.getValueAt(fila, 1);
        String pass = (String) lista.getValueAt(fila, 2);
        String tipo = (String) lista.getValueAt(fila, 3);
        apagarCB();
        if (tipo.equals("Admin")) {
            cbAdmin.setSelected(true);
        } else if (tipo.equals("Bodega")) {
            cbBodega.setSelected(true);
        } else if (tipo.equals("Cajero")) {
            cbCaja.setSelected(true);
        }
        txtID.setText(id);
        txtUser.setText(usu);
        txtPass.setText(pass);
    }//GEN-LAST:event_AgregarActionPerformed

    private void apagarCB() {
        cbAdmin.setSelected(false);
        cbBodega.setSelected(false);
        cbCaja.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cbAdmin;
    private javax.swing.JRadioButton cbBodega;
    private javax.swing.JRadioButton cbCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lista;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
