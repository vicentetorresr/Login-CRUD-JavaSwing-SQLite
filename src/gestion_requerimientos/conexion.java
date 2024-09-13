package gestion_requerimientos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

    private Connection conn;
    private Statement instruc;
    private String database = "inventario.db";

    public conexion() {
        try {
            String conex = "jdbc:sqlite:src/" + database;
            conn = DriverManager.getConnection(conex);
            instruc = conn.createStatement();
            System.out.println("Entro");
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No entro: " + ex);
        }
    }

    public void executa(String sql) {
        try {
            instruc.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet consultar(String sql) {
        ResultSet res = null;
        try {
            res = instruc.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
