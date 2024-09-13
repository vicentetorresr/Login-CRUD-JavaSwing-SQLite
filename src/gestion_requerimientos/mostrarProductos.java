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
public class mostrarProductos extends javax.swing.JInternalFrame {

    //idProducto,nombreProducto,descripcionProducto,valorCompra,valorVenta,codigoProducto,stockProducto
    public mostrarProductos() {
        initComponents();
        actualizarTabla();
    }

    private void actualizarTabla() {
        try {
            Object[] cabeceras
                    = {
                        "ID", "Nombre", "Descripcion", "Valor Compra", "Valor Venta", "Codigo", "Stock"
                    };
            Object[][] cuerpo
                    = {};
            DefaultTableModel modelo = new DefaultTableModel(cuerpo, cabeceras);
            String sql = "select * from producto";

            conexion conn = new conexion();
            ResultSet resul = conn.consultar(sql);

            while (resul.next()) {
                Object[] elemento
                        = {
                            resul.getString("idProducto"), resul.getString("nombreProducto"), resul.getString("descripcionProducto"),
                            resul.getString("valorCompra"), resul.getString("valorVenta"), resul.getString("codigoProducto"), resul.getString("stockProducto")
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        txtVen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spStock = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCom = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Agregar);

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor Compra");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor Venta");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id:");

        txtID.setEditable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "VALOR COMPRA", "VALOR VENTA", "STOCK"
            }
        ));
        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(table);

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 153));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar Producto");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtVen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_actualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        //idProducto,nombreProducto,descripcionProducto,valorCompra,valorVenta,codigoProducto,stockProducto
        String id = txtID.getText();
        String nombre = txtNom.getText();
        String descripcion = txtDesc.getText();
        float valorCompra = Float.parseFloat(txtCom.getText());
        float valorVenta = Float.parseFloat(txtVen.getText());
        String codigo = txtCodigo.getText();
        int stock = (int) spStock.getValue();

        if (!nombre.equals("") && !descripcion.equals("") && valorCompra >= 0 && valorVenta >= 0 && stock >= 0) {
            conexion conn = new conexion();
            String sql = "UPDATE `producto` SET `nombreProducto` = '" + nombre + "', `descripcionProducto` = '" + descripcion + "', `valorCompra` = " + valorCompra + ", "
                    + "`valorVenta` = " + valorVenta + ", `codigoProducto` = '" + codigo + "', `stockProducto` = " + stock + " WHERE `producto`.`idProducto` = " + id + ";";
            conn.executa(sql);
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "Actualizado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Fallo al actualizar");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        int fila = table.getSelectedRow();
        String id = (String) table.getValueAt(fila, 0);
        String nom = (String) table.getValueAt(fila, 1);
        String desc = (String) table.getValueAt(fila, 2);
        String vc = (String) table.getValueAt(fila, 3);
        String vv = (String) table.getValueAt(fila, 4);
        String codigo = (String) table.getValueAt(fila, 5);
        String stock = (String) table.getValueAt(fila, 6);
        System.out.println(id + nom + desc + vc + vv + stock);
        txtID.setText(id);
        txtNom.setText(nom);
        txtDesc.setText(desc);
        txtCom.setText(vc);
        txtVen.setText(vv);
        txtCodigo.setText(codigo);
        spStock.setValue(Integer.parseInt(stock));
    }//GEN-LAST:event_AgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spStock;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCom;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtVen;
    // End of variables declaration//GEN-END:variables
}
