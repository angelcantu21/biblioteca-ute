package conectarBD;
import java.sql.*;

/**
 *
 * @author xtiyo
 */
public class conectar {

    private Connection conexion = null;
    //private String error = null;
    private String error;

    public Connection conectar() {

        try {
            //Nombre del driver para conectar mysql
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");

        } catch (ClassNotFoundException | SQLException ex) {

            this.error = ex.getMessage();
        }
        return conexion;
    }
    public void CerrarConexion() {
        try {
            
            conexion.close();
        } catch (SQLException ex) {
        }
    }
}
