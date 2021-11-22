package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author cris
 */
public class Conexion {
    
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "crisvv", "hola123");
            return cn;
        } catch (Exception e) {
            System.out.println("Error en conexión local" + e);
        }
        return (null);
    }


    /*
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
    private final String USER = "tobal";
    private final String PASWORD = "hola123456";

    public Connection cadena;

    public Conexion() {
         this.cadena = null;
    }

    public Connection conectar() {
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER, PASWORD);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;

    }
    
    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }*/

}