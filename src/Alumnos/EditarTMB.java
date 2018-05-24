package Alumnos;

import Interfaz.Ventana;
import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditarTMB {
    DefaultTableModel model = new DefaultTableModel();
    
    void editar0a(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula.getText()
                +"',password='"+EditarAlumnosTMB.password.getText()+"',nombre='"+EditarAlumnosTMB.nombre.getText()+"',apellido='"+EditarAlumnosTMB.apellido.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri.getText()+"', grupo='"+EditarAlumnosTMB.grupo.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad.getText()+"', turno='"+EditarAlumnosTMB.turno.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula.setText("");
            EditarAlumnosTMB.password.setText("");
            EditarAlumnosTMB.nombre.setText("");
            EditarAlumnosTMB.apellido.setText("");
            EditarAlumnosTMB.cuatri.setText("");
            EditarAlumnosTMB.grupo.setText("");
            EditarAlumnosTMB.turno.setText("");
            EditarAlumnosTMB.modalidad.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar1a(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula1.getText()
                +"',password='"+EditarAlumnosTMB.password1.getText()+"',nombre='"+EditarAlumnosTMB.nombre1.getText()+"',apellido='"+EditarAlumnosTMB.apellido1.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri1.getText()+"', grupo='"+EditarAlumnosTMB.grupo1.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad1.getText()+"', turno='"+EditarAlumnosTMB.turno1.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod1.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula1.setText("");
            EditarAlumnosTMB.password1.setText("");
            EditarAlumnosTMB.nombre1.setText("");
            EditarAlumnosTMB.apellido1.setText("");
            EditarAlumnosTMB.cuatri1.setText("");
            EditarAlumnosTMB.grupo1.setText("");
            EditarAlumnosTMB.turno1.setText("");
            EditarAlumnosTMB.modalidad1.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar2a(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula2.getText()
                +"',password='"+EditarAlumnosTMB.password2.getText()+"',nombre='"+EditarAlumnosTMB.nombre2.getText()+"',apellido='"+EditarAlumnosTMB.apellido2.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri2.getText()+"', grupo='"+EditarAlumnosTMB.grupo2.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad2.getText()+"', turno='"+EditarAlumnosTMB.turno2.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod2.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula2.setText("");
            EditarAlumnosTMB.password2.setText("");
            EditarAlumnosTMB.nombre2.setText("");
            EditarAlumnosTMB.apellido2.setText("");
            EditarAlumnosTMB.cuatri2.setText("");
            EditarAlumnosTMB.grupo2.setText("");
            EditarAlumnosTMB.turno2.setText("");
            EditarAlumnosTMB.modalidad2.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar3a(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula3.getText()
                +"',password='"+EditarAlumnosTMB.password3.getText()+"',nombre='"+EditarAlumnosTMB.nombre3.getText()+"',apellido='"+EditarAlumnosTMB.apellido3.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri3.getText()+"', grupo='"+EditarAlumnosTMB.grupo3.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad3.getText()+"', turno='"+EditarAlumnosTMB.turno3.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod3.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula3.setText("");
            EditarAlumnosTMB.password3.setText("");
            EditarAlumnosTMB.nombre3.setText("");
            EditarAlumnosTMB.apellido3.setText("");
            EditarAlumnosTMB.cuatri3.setText("");
            EditarAlumnosTMB.grupo3.setText("");
            EditarAlumnosTMB.turno3.setText("");
            EditarAlumnosTMB.modalidad3.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar4a(){
                Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula4.getText()
                +"',password='"+EditarAlumnosTMB.password4.getText()+"',nombre='"+EditarAlumnosTMB.nombre4.getText()+"',apellido='"+EditarAlumnosTMB.apellido4.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri4.getText()+"', grupo='"+EditarAlumnosTMB.grupo4.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad4.getText()+"', turno='"+EditarAlumnosTMB.turno4.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod4.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula4.setText("");
            EditarAlumnosTMB.password4.setText("");
            EditarAlumnosTMB.nombre4.setText("");
            EditarAlumnosTMB.apellido4.setText("");
            EditarAlumnosTMB.cuatri4.setText("");
            EditarAlumnosTMB.grupo4.setText("");
            EditarAlumnosTMB.turno4.setText("");
            EditarAlumnosTMB.modalidad4.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar5a(){
                Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula5.getText()
                +"',password='"+EditarAlumnosTMB.password5.getText()+"',nombre='"+EditarAlumnosTMB.nombre5.getText()+"',apellido='"+EditarAlumnosTMB.apellido5.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri5.getText()+"',grupo='"+EditarAlumnosTMB.grupo5.getText()+"',modalidad='"+EditarAlumnosTMB.modalidad5.getText()+"', turno='"+EditarAlumnosTMB.turno5.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod5.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula5.setText("");
            EditarAlumnosTMB.password5.setText("");
            EditarAlumnosTMB.nombre5.setText("");
            EditarAlumnosTMB.apellido5.setText("");
            EditarAlumnosTMB.cuatri5.setText("");
            EditarAlumnosTMB.grupo5.setText("");
            EditarAlumnosTMB.turno5.setText("");
            EditarAlumnosTMB.modalidad5.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        void editar0b(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula6.getText()
                +"',password='"+EditarAlumnosTMB.password6.getText()+"',nombre='"+EditarAlumnosTMB.nombre6.getText()+"',apellido='"+EditarAlumnosTMB.apellido6.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri6.getText()+"', grupo='"+EditarAlumnosTMB.grupo6.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad6.getText()+"', turno='"+EditarAlumnosTMB.turno6.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod6.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula6.setText("");
            EditarAlumnosTMB.password6.setText("");
            EditarAlumnosTMB.nombre6.setText("");
            EditarAlumnosTMB.apellido6.setText("");
            EditarAlumnosTMB.cuatri6.setText("");
            EditarAlumnosTMB.grupo6.setText("");
            EditarAlumnosTMB.turno6.setText("");
            EditarAlumnosTMB.modalidad6.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar1b(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula7.getText()
                +"',password='"+EditarAlumnosTMB.password7.getText()+"',nombre='"+EditarAlumnosTMB.nombre7.getText()+"',apellido='"+EditarAlumnosTMB.apellido7.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri7.getText()+"', grupo='"+EditarAlumnosTMB.grupo7.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad7.getText()+"', turno='"+EditarAlumnosTMB.turno7.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod7.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula7.setText("");
            EditarAlumnosTMB.password7.setText("");
            EditarAlumnosTMB.nombre7.setText("");
            EditarAlumnosTMB.apellido7.setText("");
            EditarAlumnosTMB.cuatri7.setText("");
            EditarAlumnosTMB.grupo7.setText("");
            EditarAlumnosTMB.turno7.setText("");
            EditarAlumnosTMB.modalidad7.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar2b(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula8.getText()
                +"',password='"+EditarAlumnosTMB.password8.getText()+"',nombre='"+EditarAlumnosTMB.nombre8.getText()+"',apellido='"+EditarAlumnosTMB.apellido8.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri8.getText()+"', grupo='"+EditarAlumnosTMB.grupo8.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad8.getText()+"', turno='"+EditarAlumnosTMB.turno8.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod8.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula8.setText("");
            EditarAlumnosTMB.password8.setText("");
            EditarAlumnosTMB.nombre8.setText("");
            EditarAlumnosTMB.apellido8.setText("");
            EditarAlumnosTMB.cuatri8.setText("");
            EditarAlumnosTMB.grupo8.setText("");
            EditarAlumnosTMB.turno8.setText("");
            EditarAlumnosTMB.modalidad8.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar3b(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula9.getText()
                +"',password='"+EditarAlumnosTMB.password9.getText()+"',nombre='"+EditarAlumnosTMB.nombre9.getText()+"',apellido='"+EditarAlumnosTMB.apellido9.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri9.getText()+"', grupo='"+EditarAlumnosTMB.grupo9.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad9.getText()+"', turno='"+EditarAlumnosTMB.turno9.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod9.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula9.setText("");
            EditarAlumnosTMB.password9.setText("");
            EditarAlumnosTMB.nombre9.setText("");
            EditarAlumnosTMB.apellido9.setText("");
            EditarAlumnosTMB.cuatri9.setText("");
            EditarAlumnosTMB.grupo9.setText("");
            EditarAlumnosTMB.turno9.setText("");
            EditarAlumnosTMB.modalidad9.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar4b(){
                Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula10.getText()
                +"',password='"+EditarAlumnosTMB.password10.getText()+"',nombre='"+EditarAlumnosTMB.nombre10.getText()+"',apellido='"+EditarAlumnosTMB.apellido10.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri10.getText()+"', grupo='"+EditarAlumnosTMB.grupo10.getText()+"', modalidad='"+EditarAlumnosTMB.modalidad10.getText()+"', turno='"+EditarAlumnosTMB.turno10.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod10.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula10.setText("");
            EditarAlumnosTMB.password10.setText("");
            EditarAlumnosTMB.nombre10.setText("");
            EditarAlumnosTMB.apellido10.setText("");
            EditarAlumnosTMB.cuatri10.setText("");
            EditarAlumnosTMB.grupo10.setText("");
            EditarAlumnosTMB.turno10.setText("");
            EditarAlumnosTMB.modalidad10.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void editar5b(){
                Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnosTMB.Matricula11.getText()
                +"',password='"+EditarAlumnosTMB.password11.getText()+"',nombre='"+EditarAlumnosTMB.nombre11.getText()+"',apellido='"+EditarAlumnosTMB.apellido11.getText()+"',cuatrimestre='"+EditarAlumnosTMB.cuatri11.getText()+"',grupo='"+EditarAlumnosTMB.grupo11.getText()+"',modalidad='"+EditarAlumnosTMB.modalidad11.getText()+"', turno='"+EditarAlumnosTMB.turno11.getText()+"'WHERE Matricula='"+EditarAlumnosTMB.cod1.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnosTMB.Matricula11.setText("");
            EditarAlumnosTMB.password11.setText("");
            EditarAlumnosTMB.nombre11.setText("");
            EditarAlumnosTMB.apellido11.setText("");
            EditarAlumnosTMB.cuatri11.setText("");
            EditarAlumnosTMB.grupo11.setText("");
            EditarAlumnosTMB.turno11.setText("");
            EditarAlumnosTMB.modalidad11.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    //CARGAR ALUMNOS
    void cargar0a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 0 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void cargar1a(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 1 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable2.getRowCount() == 0 && EditarAlumnosTMB.jTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar2a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 2 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable3.getRowCount() == 0 && EditarAlumnosTMB.jTable3.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar3a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 3 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable4.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void cargar4a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 4 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable5.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable5.getRowCount() == 0 && EditarAlumnosTMB.jTable5.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar5a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 5 AND grupo = 'A' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable6.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable6.getRowCount() == 0 && EditarAlumnosTMB.jTable6.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar0b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 0 AND grupo = 'B' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable7.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable7.getRowCount() == 0 && EditarAlumnosTMB.jTable7.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar1b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 1 AND grupo = 'B' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable8.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable8.getRowCount() == 0 && EditarAlumnosTMB.jTable8.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar2b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 2 AND grupo = 'B' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable9.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable9.getRowCount() == 0 && EditarAlumnosTMB.jTable9.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar3b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 3 AND grupo = 'B' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable10.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable10.getRowCount() == 0 && EditarAlumnosTMB.jTable10.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    void cargar4b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 4 AND grupo = 'B' AND turno='matutino' AND modalidad ='BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable11.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable11.getRowCount() == 0 && EditarAlumnosTMB.jTable11.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar5b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 5 AND grupo = 'B' AND turno = 'Matutino' AND modalidad = 'BIS' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("password"); //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("apellido"); //COLUMNAS DE LA BASE DE DATOS
                fila[4] = rs.getString("cuatrimestre"); //COLUMNAS DE LA BASE DE DATOS
                fila[5] = rs.getString("grupo"); //COLUMNAS DE LA BASE DE DATOS
                fila[6] = rs.getString("modalidad"); //COLUMNAS DE LA BASE DE DATOS
                fila[7] = rs.getString("turno"); //COLUMNAS DE LA BASE DE DATOS
                model.addRow(fila);

            }
            EditarAlumnosTMB.jTable12.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnosTMB.jTable12.getRowCount() == 0 && EditarAlumnosTMB.jTable12.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
