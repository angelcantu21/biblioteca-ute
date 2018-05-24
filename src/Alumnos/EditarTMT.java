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


public class EditarTMT {
    DefaultTableModel model = new DefaultTableModel();
    void editar1a(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula1.getText()
                +"',password='"+EditarAlumnoTMT.password1.getText()+"',nombre='"+EditarAlumnoTMT.nombre1.getText()+"',apellido='"+EditarAlumnoTMT.apellido1.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri1.getText()+"', grupo='"+EditarAlumnoTMT.grupo1.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad1.getText()+"', turno='"+EditarAlumnoTMT.turno1.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod1.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula1.setText("");
            EditarAlumnoTMT.password1.setText("");
            EditarAlumnoTMT.nombre1.setText("");
            EditarAlumnoTMT.apellido1.setText("");
            EditarAlumnoTMT.cuatri1.setText("");
            EditarAlumnoTMT.grupo1.setText("");
            EditarAlumnoTMT.turno1.setText("");
            EditarAlumnoTMT.modalidad11.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula2.getText()
                +"',password='"+EditarAlumnoTMT.password2.getText()+"',nombre='"+EditarAlumnoTMT.nombre2.getText()+"',apellido='"+EditarAlumnoTMT.apellido2.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri2.getText()+"', grupo='"+EditarAlumnoTMT.grupo2.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad2.getText()+"', turno='"+EditarAlumnoTMT.turno2.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod2.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula2.setText("");
            EditarAlumnoTMT.password2.setText("");
            EditarAlumnoTMT.nombre2.setText("");
            EditarAlumnoTMT.apellido2.setText("");
            EditarAlumnoTMT.cuatri2.setText("");
            EditarAlumnoTMT.grupo2.setText("");
            EditarAlumnoTMT.turno2.setText("");
            EditarAlumnoTMT.modalidad2.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula3.getText()
                +"',password='"+EditarAlumnoTMT.password3.getText()+"',nombre='"+EditarAlumnoTMT.nombre3.getText()+"',apellido='"+EditarAlumnoTMT.apellido3.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri3.getText()+"', grupo='"+EditarAlumnoTMT.grupo3.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad3.getText()+"', turno='"+EditarAlumnoTMT.turno3.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod3.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula3.setText("");
            EditarAlumnoTMT.password3.setText("");
            EditarAlumnoTMT.nombre3.setText("");
            EditarAlumnoTMT.apellido3.setText("");
            EditarAlumnoTMT.cuatri3.setText("");
            EditarAlumnoTMT.grupo3.setText("");
            EditarAlumnoTMT.turno3.setText("");
            EditarAlumnoTMT.modalidad3.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula4.getText()
                +"',password='"+EditarAlumnoTMT.password4.getText()+"',nombre='"+EditarAlumnoTMT.nombre4.getText()+"',apellido='"+EditarAlumnoTMT.apellido4.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri4.getText()+"', grupo='"+EditarAlumnoTMT.grupo4.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad4.getText()+"', turno='"+EditarAlumnoTMT.turno4.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod4.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula4.setText("");
            EditarAlumnoTMT.password4.setText("");
            EditarAlumnoTMT.nombre4.setText("");
            EditarAlumnoTMT.apellido4.setText("");
            EditarAlumnoTMT.cuatri4.setText("");
            EditarAlumnoTMT.grupo4.setText("");
            EditarAlumnoTMT.turno4.setText("");
            EditarAlumnoTMT.modalidad4.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula5.getText()
                +"',password='"+EditarAlumnoTMT.password5.getText()+"',nombre='"+EditarAlumnoTMT.nombre5.getText()+"',apellido='"+EditarAlumnoTMT.apellido5.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri5.getText()+"',grupo='"+EditarAlumnoTMT.grupo5.getText()+"',modalidad='"+EditarAlumnoTMT.modalidad5.getText()+"', turno='"+EditarAlumnoTMT.turno5.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod5.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula5.setText("");
            EditarAlumnoTMT.password5.setText("");
            EditarAlumnoTMT.nombre5.setText("");
            EditarAlumnoTMT.apellido5.setText("");
            EditarAlumnoTMT.cuatri5.setText("");
            EditarAlumnoTMT.grupo5.setText("");
            EditarAlumnoTMT.turno5.setText("");
            EditarAlumnoTMT.modalidad5.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula7.getText()
                +"',password='"+EditarAlumnoTMT.password7.getText()+"',nombre='"+EditarAlumnoTMT.nombre7.getText()+"',apellido='"+EditarAlumnoTMT.apellido7.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri7.getText()+"', grupo='"+EditarAlumnoTMT.grupo7.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad7.getText()+"', turno='"+EditarAlumnoTMT.turno7.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod7.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula7.setText("");
            EditarAlumnoTMT.password7.setText("");
            EditarAlumnoTMT.nombre7.setText("");
            EditarAlumnoTMT.apellido7.setText("");
            EditarAlumnoTMT.cuatri7.setText("");
            EditarAlumnoTMT.grupo7.setText("");
            EditarAlumnoTMT.turno7.setText("");
            EditarAlumnoTMT.modalidad7.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula8.getText()
                +"',password='"+EditarAlumnoTMT.password8.getText()+"',nombre='"+EditarAlumnoTMT.nombre8.getText()+"',apellido='"+EditarAlumnoTMT.apellido8.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri8.getText()+"', grupo='"+EditarAlumnoTMT.grupo8.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad8.getText()+"', turno='"+EditarAlumnoTMT.turno8.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod8.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula8.setText("");
            EditarAlumnoTMT.password8.setText("");
            EditarAlumnoTMT.nombre8.setText("");
            EditarAlumnoTMT.apellido8.setText("");
            EditarAlumnoTMT.cuatri8.setText("");
            EditarAlumnoTMT.grupo8.setText("");
            EditarAlumnoTMT.turno8.setText("");
            EditarAlumnoTMT.modalidad8.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula9.getText()
                +"',password='"+EditarAlumnoTMT.password9.getText()+"',nombre='"+EditarAlumnoTMT.nombre9.getText()+"',apellido='"+EditarAlumnoTMT.apellido9.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri9.getText()+"', grupo='"+EditarAlumnoTMT.grupo9.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad9.getText()+"', turno='"+EditarAlumnoTMT.turno9.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod9.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula9.setText("");
            EditarAlumnoTMT.password9.setText("");
            EditarAlumnoTMT.nombre9.setText("");
            EditarAlumnoTMT.apellido9.setText("");
            EditarAlumnoTMT.cuatri9.setText("");
            EditarAlumnoTMT.grupo9.setText("");
            EditarAlumnoTMT.turno9.setText("");
            EditarAlumnoTMT.modalidad9.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula10.getText()
                +"',password='"+EditarAlumnoTMT.password10.getText()+"',nombre='"+EditarAlumnoTMT.nombre10.getText()+"',apellido='"+EditarAlumnoTMT.apellido10.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri10.getText()+"', grupo='"+EditarAlumnoTMT.grupo10.getText()+"', modalidad='"+EditarAlumnoTMT.modalidad10.getText()+"', turno='"+EditarAlumnoTMT.turno10.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod10.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula10.setText("");
            EditarAlumnoTMT.password10.setText("");
            EditarAlumnoTMT.nombre10.setText("");
            EditarAlumnoTMT.apellido10.setText("");
            EditarAlumnoTMT.cuatri10.setText("");
            EditarAlumnoTMT.grupo10.setText("");
            EditarAlumnoTMT.turno10.setText("");
            EditarAlumnoTMT.modalidad10.setText("");
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
            pps = cn.prepareStatement("UPDATE alumnos SET Matricula='"+EditarAlumnoTMT.Matricula11.getText()
                +"',password='"+EditarAlumnoTMT.password11.getText()+"',nombre='"+EditarAlumnoTMT.nombre11.getText()+"',apellido='"+EditarAlumnoTMT.apellido11.getText()+"',cuatrimestre='"+EditarAlumnoTMT.cuatri11.getText()+"',grupo='"+EditarAlumnoTMT.grupo11.getText()+"',modalidad='"+EditarAlumnoTMT.modalidad11.getText()+"', turno='"+EditarAlumnoTMT.turno11.getText()+"'WHERE Matricula='"+EditarAlumnoTMT.cod1.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            EditarAlumnoTMT.Matricula11.setText("");
            EditarAlumnoTMT.password11.setText("");
            EditarAlumnoTMT.nombre11.setText("");
            EditarAlumnoTMT.apellido11.setText("");
            EditarAlumnoTMT.cuatri11.setText("");
            EditarAlumnoTMT.grupo11.setText("");
            EditarAlumnoTMT.turno11.setText("");
            EditarAlumnoTMT.modalidad11.setText("");
        } 
        catch (SQLException ex) {
            Logger.getLogger(EditarTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        //CARGAR ALUMNOS
    void cargar1a(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 1 AND grupo = 'A' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable3.getRowCount() == 0 && EditarAlumnoTMT.jTable3.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar2a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 2 AND grupo = 'A' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable4.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable4.getRowCount() == 0 && EditarAlumnoTMT.jTable4.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar3a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 3 AND grupo = 'A' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable5.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable5.getRowCount() == 0 && EditarAlumnoTMT.jTable5.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar4a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 4 AND grupo = 'A' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable6.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable6.getRowCount() == 0 && EditarAlumnoTMT.jTable6.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar5a(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 5 AND grupo = 'A' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable7.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable7.getRowCount() == 0 && EditarAlumnoTMT.jTable7.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar1b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 1 AND grupo = 'B' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable9.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable9.getRowCount() == 0 && EditarAlumnoTMT.jTable9.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar2b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 2 AND grupo = 'B' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable10.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable10.getRowCount() == 0 && EditarAlumnoTMT.jTable10.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar3b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 3 AND grupo = 'B' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable11.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable11.getRowCount() == 0 && EditarAlumnoTMT.jTable11.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    void cargar4b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 4 AND grupo = 'B' AND turno='matutino' AND modalidad ='Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable12.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable12.getRowCount() == 0 && EditarAlumnoTMT.jTable12.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void cargar5b(String nombreusuario){
        String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 5 AND grupo = 'B' AND turno = 'Matutino' AND modalidad = 'Tradicional' AND nombre LIKE '%"+nombreusuario+"%' ORDER BY Apellido"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            EditarAlumnoTMT.jTable13.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (EditarAlumnoTMT.jTable13.getRowCount() == 0 && EditarAlumnoTMT.jTable13.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
