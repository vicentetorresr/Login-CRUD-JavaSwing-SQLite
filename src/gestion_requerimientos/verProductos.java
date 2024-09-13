/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_requerimientos;

import static gestion_requerimientos.frmDashboard.escritorio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vicente
 */
public class verProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form verProductos
     */
    public verProductos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_borrar = new javax.swing.JButton();
        btnIngresarNuevo = new javax.swing.JButton();

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Agregar);

        setBackground(new java.awt.Color(51, 51, 51));

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
        jScrollPane1.setViewportView(table);

        btn_borrar.setBackground(new java.awt.Color(204, 0, 0));
        btn_borrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Salir");
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btnIngresarNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnIngresarNuevo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnIngresarNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarNuevo.setText("AGREGAR");
        btnIngresarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btnIngresarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoActionPerformed
        int fila = table.getSelectedRow();
        if (fila >= 0) {
            String id = (String) table.getValueAt(fila, 0);
            String nom = (String) table.getValueAt(fila, 1);
            String precio = (String) table.getValueAt(fila, 4);
            String codigo = (String) table.getValueAt(fila, 5);
            String stock = (String) table.getValueAt(fila, 6);

            JInternalFrame[] frames = escritorio.getAllFrames();

            for (JInternalFrame frame : frames) {
                if (frame instanceof Caja) {
                    ((Caja) frame).llenarDatosOtraTablaProducto(id, nom, stock, precio, codigo);
                    this.dispose();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un item de la tabla");
        }
    }//GEN-LAST:event_btnIngresarNuevoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        int fila = table.getSelectedRow();
        if (fila >= 0) {
            String id = (String) table.getValueAt(fila, 0);
            String nom = (String) table.getValueAt(fila, 1);
            String precio = (String) table.getValueAt(fila, 4);
            String codigo = (String) table.getValueAt(fila, 5);
            String stock = (String) table.getValueAt(fila, 6);

            JInternalFrame[] frames = escritorio.getAllFrames();

            for (JInternalFrame frame : frames) {
                if (frame instanceof Caja) {
                    ((Caja) frame).llenarDatosOtraTablaProducto(id, nom, stock, precio, codigo);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un item de la tabla");
        }
    }//GEN-LAST:event_AgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JButton btnIngresarNuevo;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
