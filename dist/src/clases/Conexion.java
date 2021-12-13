package clases;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author cris
 */
public class Conexion {
    
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "skycyber4", "123");
            return cn;
        } catch (Exception e) {
            System.out.println("Error en conexión local" + e);
        }
        return (null);
    }


}