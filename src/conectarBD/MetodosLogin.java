package conectarBD;
import Login.Acceso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MetodosLogin {

Pool metodospool = new Pool();

public int validar_ingreso(){

    String usuario = Acceso.user.getText();
    String clave = String.valueOf(Acceso.pass.getPassword());

    int resultado=0;
                             //tabla      //Columna                    //Columna
    String SSQL="SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND password=('"+clave+"')";

    Connection conect = null;

    try {

        conect = metodospool.dataSource.getConnection();
        Statement st = conect.createStatement();
        ResultSet rs = st.executeQuery(SSQL);

        if(rs.next()){

            resultado=1;

        }

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{


        try {

            conect.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

        }

    }

return resultado;

}

public int validar_ingresoInvitado(){

    String usuario = Acceso.user.getText();
    String clave = String.valueOf(Acceso.pass.getPassword());

    int resultado1=0;
                             //tabla      //Columna                    //Columna
    String SSQL1="SELECT * FROM alumnos WHERE Matricula='"+usuario+"' AND password=('"+clave+"')";

    Connection conect = null;

    try {

        conect = metodospool.dataSource.getConnection();
        Statement st = conect.createStatement();
        ResultSet rs = st.executeQuery(SSQL1);

        if(rs.next()){

            resultado1=1;

        }

    } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{


        try {

            conect.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

        }

    }

return resultado1;
}
}