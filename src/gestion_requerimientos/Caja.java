/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_requerimientos;

import static gestion_requerimientos.frmDashboard.escritorio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vicente
 */
public class Caja extends javax.swing.JInternalFrame {

    float TotalTotalisimo = 0;
    boolean listoIngreso = false;

    public Caja() {
        initComponents();
        txtID.setVisible(false);
        txtCodGuardado.setVisible(false);
        txtIDPRODUCTO.setVisible(false);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjust the format as needed
        txtFecha.setText(currentDate.format(formatter));
    }

    private void verProductos() {
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
            lista.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarDatosOtraTablaCliente(String id, String nombre, String rut) {
        txtID.setText(id);
        txtNombreEncontradoCliente.setText(nombre);
        txtRutIngresado.setText(rut);
    }

    public void llenarDatosOtraTablaProducto(String id, String nombre, String stock, String precio, String codigo) {
        System.out.println("id " + id);
        System.out.println("nombre " + nombre);
        System.out.println("stock " + stock);
        System.out.println("precio " + precio);
        System.out.println("codigo " + codigo);

        txtIDPRODUCTO.setText(id);
        txtProductoEncontrado.setText(nombre);
        txtStock.setText(String.valueOf(stock));
        txtPrecio.setText(String.valueOf(precio));
        txtCodGuardado.setText(codigo);
        txtPro.setText(codigo);
    }

    private void verClientes(String consulta) {
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
            lista.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Quitar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtRutIngresado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTable();
        txtBuscarrut = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPro = new javax.swing.JTextField();
        txtBuscarCod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreEncontradoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProductoEncontrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        AgregarProducto = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        txtCodGuardado = new javax.swing.JLabel();
        txtIDPRODUCTO = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        Quitar.setText("Quitar");
        Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Quitar);

        setClosable(true);
        setIconifiable(true);
        setMinimumSize(new java.awt.Dimension(800, 800));

        jLabel1.setText("RUT CLIENTE:");

        lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_CLIENTE", "ID_PRODUCTO", "VALOR NETO", "VALOR IVA", "CANTIDAD", "TOTAL"
            }
        ));
        lista.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(lista);

        txtBuscarrut.setText("Buscar");
        txtBuscarrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarrutActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(0, 102, 102));
        btn_borrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrar.setText("Salir");
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jLabel11.setText("COD PRODUCTO:");

        txtBuscarCod.setText("Buscar");
        txtBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCodActionPerformed(evt);
            }
        });

        jLabel2.setText("CLIENTE:");

        txtNombreEncontradoCliente.setEditable(false);

        jLabel3.setText("PRODUCTO:");

        txtProductoEncontrado.setEditable(false);

        jLabel4.setText("STOCK:");

        txtStock.setEditable(false);

        jLabel5.setText("PRECIO PRODUCTO:");

        AgregarProducto.setBackground(new java.awt.Color(102, 204, 0));
        AgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        AgregarProducto.setText("Agregar");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(51, 204, 0));
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 51));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("CANTIDAD PRODUCTO:");

        spCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadStateChanged(evt);
            }
        });

        jLabel7.setText("FECHA:");

        txtFecha.setEditable(false);

        txtID.setEnabled(false);
        txtID.setFocusable(false);

        txtCodGuardado.setEnabled(false);
        txtCodGuardado.setFocusable(false);

        txtIDPRODUCTO.setEnabled(false);
        txtIDPRODUCTO.setFocusable(false);

        lblTotal.setText("Total: ");
        lblTotal.setEnabled(false);
        lblTotal.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodGuardado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel1)
                                            .addGap(10, 10, 10)
                                            .addComponent(txtRutIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarCod)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBuscarrut, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(129, 129, 129)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombreEncontradoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtProductoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFecha)
                                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(248, 248, 248)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreEncontradoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProductoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRutIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarrut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtBuscarCod))
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodGuardado)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDPRODUCTO)
                    .addGap(39, 39, 39)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        System.out.println("ingreso venta");
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void limpiarTodo() {
        txtNombreEncontradoCliente.setText("");
        txtID.setText("");
        txtRutIngresado.setText("");
        txtPro.setText("");
        txtPrecio.setText("");
        spCantidad.setValue(0);
        txtProductoEncontrado.setText("");
        txtStock.setText("");
        txtCodGuardado.setText("");
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarrutActionPerformed
        String rut = txtRutIngresado.getText();
        String nombre = "";
        int id = 0;
        conexion c = new conexion();
        ResultSet datos = c.consultar("select * FROM cliente where rutCliente='" + rut + "';");
        try {
            while (datos.next()) {
                id = datos.getInt("idCliente");
                nombre = datos.getString("nombreCliente");
            }
            if (id != 0) {
                txtNombreEncontradoCliente.setText(nombre);
                txtID.setText("" + id);
            } else {
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "No se encontró el cliente. ¿Qué desea hacer?",
                        "Cliente no encontrado",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Mostrar Clientes", "Ingresar nuevo"},
                        "Lista Clientes"
                );

                if (respuesta == 0) {
                    verClientes obj = new verClientes();
                    escritorio.add(obj);
                    obj.setVisible(true);
                } else if (respuesta == 1) {
                    ingresoClientes nuevoCliente = new ingresoClientes();
                    escritorio.add(nuevoCliente);
                    nuevoCliente.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtBuscarrutActionPerformed

    private void txtBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCodActionPerformed
        String cod = txtPro.getText();
        String nombre = "";
        int id = 0;
        int stock = 0;
        float precio = 0;
        conexion c = new conexion();
        ResultSet datos = c.consultar("select idProducto,nombreProducto,stockProducto,valorVenta FROM producto WHERE codigoProducto='" + cod + "';");
        try {
            while (datos.next()) {
                id = datos.getInt("idProducto");
                nombre = datos.getString("nombreProducto");
                stock = datos.getInt("stockProducto");
                precio = datos.getFloat("valorVenta");
            }
            if (id != 0) {
                txtProductoEncontrado.setText(nombre);
                txtCodGuardado.setText(String.valueOf(id));
                txtStock.setText(String.valueOf(stock));
                txtPrecio.setText(String.valueOf(precio));
            } else {
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "No se encontró el producto. ¿Qué desea hacer?",
                        "Producto no encontrado",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Mostrar productos", "Ingresar nuevo"},
                        "Lista producto"
                );

                if (respuesta == 0) {
                    verProductos obj = new verProductos();
                    escritorio.add(obj);
                    obj.setVisible(true);
                } else if (respuesta == 1) {
                    ingresoProductos nuevoProducto = new ingresoProductos();
                    escritorio.add(nuevoProducto);
                    nuevoProducto.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarCodActionPerformed

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
        int cantidad = (int) spCantidad.getValue();
        String precioProducto = txtPrecio.getText();
        if (cantidad > 0 && cantidad <= Integer.parseInt(txtStock.getText())) {
            float precioUnitario = Float.parseFloat(precioProducto);
            float totalAmount = (cantidad * precioUnitario) * 1.19f;
            float TotalIva = (float) Math.round(totalAmount * 100) / 100;
            TotalTotalisimo = totalAmount + TotalTotalisimo;
            float precioIvaFloat = Float.parseFloat(precioProducto) * 1.19f;
            float precioIva = (float) Math.round(precioIvaFloat * 100) / 100;
            DefaultTableModel model = (DefaultTableModel) lista.getModel();
            Object[] newRow = {
                txtID.getText(),
                txtIDPRODUCTO.getText(),
                precioProducto,
                precioIva,
                cantidad,
                String.valueOf(TotalIva)
            };
            model.addRow(newRow);
            lblTotal.setText("Total a pagar: " + TotalTotalisimo);
            txtBuscarrut.setEnabled(false);
            txtRutIngresado.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser superior al stock o inferior a 0");
        }
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void spCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantidadStateChanged
        int stock = Integer.parseInt(txtStock.getText());
        int cantidad = (int) spCantidad.getValue();
        if (cantidad < 0) {
            spCantidad.setValue(0);
            JOptionPane.showMessageDialog(null, "La cantidad ingresada no puede ser negativa");
        } else {
            if (cantidad <= stock) {
                listoIngreso = true;
            } else {
                listoIngreso = false;
            }
            if (cantidad >= stock) {
                listoIngreso = false;
                JOptionPane.showMessageDialog(null, "La cantidad ingresada es superior al stock");
                spCantidad.setValue(Integer.parseInt(txtStock.getText()));
            }
        }
    }//GEN-LAST:event_spCantidadStateChanged

    private void QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarActionPerformed
        int fila = lista.getSelectedRow();
        if (fila != -1) {
            String total = (String) lista.getValueAt(fila, 5);
            TotalTotalisimo = TotalTotalisimo - Float.parseFloat(total);
            lblTotal.setText(String.valueOf(TotalTotalisimo));
            DefaultTableModel modelo = (DefaultTableModel) lista.getModel();
            modelo.removeRow(fila);
        } else {
            System.out.println("Selecciona una fila para eliminar");
        }
    }//GEN-LAST:event_QuitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JMenuItem Quitar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable lista;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JButton txtBuscarCod;
    private javax.swing.JButton txtBuscarrut;
    private javax.swing.JLabel txtCodGuardado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtIDPRODUCTO;
    private javax.swing.JTextField txtNombreEncontradoCliente;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPro;
    private javax.swing.JTextField txtProductoEncontrado;
    private javax.swing.JTextField txtRutIngresado;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
