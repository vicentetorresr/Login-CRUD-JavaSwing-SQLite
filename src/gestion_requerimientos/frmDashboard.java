/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_requerimientos;

import img.ImagenFondo;
import javax.swing.JOptionPane;

/**
 *
 * @author Vicente
 */
public class frmDashboard extends javax.swing.JFrame {

    private String tipoCliente;

    public frmDashboard(String tipoCliente) {
        initComponents();
        this.tipoCliente = tipoCliente;
        escritorio.setBorder(new ImagenFondo());
        txtWelcome.setText("Bienvenido: " + tipoCliente);
        nivelesAcceso();
    }

    private void nivelesAcceso() {
        if (tipoCliente.equals("Admin")) {
            JOptionPane.showMessageDialog(null, "Bienvenido administrador");
        } else if (tipoCliente.equals("Bodega")) {
            jmenuUser.setEnabled(false);
            jmenuCliente.setEnabled(false);
            jmenuCaja.setEnabled(false);
        } else if (tipoCliente.equals("Cajero")) {
            jmenuUser.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        btn_borrar = new javax.swing.JButton();
        txtWelcome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuUser = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmenuCliente = new javax.swing.JMenu();
        addClient = new javax.swing.JMenuItem();
        showClient = new javax.swing.JMenuItem();
        jmenuProducto = new javax.swing.JMenu();
        addProduct = new javax.swing.JMenuItem();
        showProduct = new javax.swing.JMenuItem();
        jmenuCaja = new javax.swing.JMenu();
        Caja = new javax.swing.JMenuItem();
        registroCaja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));

        escritorio.setBackground(new java.awt.Color(0, 51, 51));
        escritorio.setPreferredSize(new java.awt.Dimension(1280, 800));

        btn_borrar.setBackground(new java.awt.Color(0, 102, 102));
        btn_borrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrar.setText("Salir");
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        txtWelcome.setText("Bienvenido: ");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 777, Short.MAX_VALUE)
                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWelcome))
                .addGap(47, 47, 47))
        );
        escritorio.setLayer(btn_borrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jmenuUser.setBackground(new java.awt.Color(0, 0, 0));
        jmenuUser.setForeground(new java.awt.Color(255, 255, 255));
        jmenuUser.setText("Usuarios");

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Administrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmenuUser.add(jMenuItem1);

        jMenuBar1.add(jmenuUser);

        jmenuCliente.setBackground(new java.awt.Color(0, 0, 0));
        jmenuCliente.setForeground(new java.awt.Color(255, 255, 255));
        jmenuCliente.setText("Clientes");

        addClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        addClient.setBackground(new java.awt.Color(0, 0, 0));
        addClient.setForeground(new java.awt.Color(255, 255, 255));
        addClient.setText("Agregar clientes");
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });
        jmenuCliente.add(addClient);

        showClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        showClient.setBackground(new java.awt.Color(0, 0, 0));
        showClient.setForeground(new java.awt.Color(255, 255, 255));
        showClient.setText("Mostrar clientes");
        showClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showClientActionPerformed(evt);
            }
        });
        jmenuCliente.add(showClient);

        jMenuBar1.add(jmenuCliente);

        jmenuProducto.setBackground(new java.awt.Color(0, 0, 0));
        jmenuProducto.setForeground(new java.awt.Color(255, 255, 255));
        jmenuProducto.setText("Productos");

        addProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        addProduct.setBackground(new java.awt.Color(0, 0, 0));
        addProduct.setForeground(new java.awt.Color(255, 255, 255));
        addProduct.setText("Agregar productos");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        jmenuProducto.add(addProduct);

        showProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        showProduct.setBackground(new java.awt.Color(0, 0, 0));
        showProduct.setForeground(new java.awt.Color(255, 255, 255));
        showProduct.setText("Mostrar productos");
        showProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductActionPerformed(evt);
            }
        });
        jmenuProducto.add(showProduct);

        jMenuBar1.add(jmenuProducto);

        jmenuCaja.setBackground(new java.awt.Color(0, 0, 0));
        jmenuCaja.setForeground(new java.awt.Color(255, 255, 255));
        jmenuCaja.setText("Cajero");

        Caja.setBackground(new java.awt.Color(0, 0, 0));
        Caja.setForeground(new java.awt.Color(255, 255, 255));
        Caja.setText("Caja");
        Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaActionPerformed(evt);
            }
        });
        jmenuCaja.add(Caja);

        registroCaja.setBackground(new java.awt.Color(0, 0, 0));
        registroCaja.setForeground(new java.awt.Color(255, 255, 255));
        registroCaja.setText("Auditoria Caja");
        registroCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroCajaActionPerformed(evt);
            }
        });
        jmenuCaja.add(registroCaja);

        jMenuBar1.add(jmenuCaja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        frmPrincipal obj = new frmPrincipal();
        obj.toFront();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mantenedorUsuarios obj = new mantenedorUsuarios();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        ingresoClientes obj = new ingresoClientes();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_addClientActionPerformed

    private void showClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showClientActionPerformed
        mostrarClientes obj = new mostrarClientes();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_showClientActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        ingresoProductos obj = new ingresoProductos();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_addProductActionPerformed

    private void showProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductActionPerformed
        mostrarProductos obj = new mostrarProductos();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_showProductActionPerformed

    private void CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaActionPerformed
        Caja obj = new Caja();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_CajaActionPerformed

    private void registroCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroCajaActionPerformed
        auditoriaCaja obj = new auditoriaCaja();
        escritorio.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_registroCajaActionPerformed

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
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Caja;
    private javax.swing.JMenuItem addClient;
    private javax.swing.JMenuItem addProduct;
    private javax.swing.JButton btn_borrar;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmenuCaja;
    private javax.swing.JMenu jmenuCliente;
    private javax.swing.JMenu jmenuProducto;
    private javax.swing.JMenu jmenuUser;
    private javax.swing.JMenuItem registroCaja;
    private javax.swing.JMenuItem showClient;
    private javax.swing.JMenuItem showProduct;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
