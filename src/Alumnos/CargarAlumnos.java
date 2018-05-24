package Alumnos;

import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CargarAlumnos {
    DefaultTableModel model = new DefaultTableModel();
    
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
            AlumnosTMB.jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable1.getRowCount() == 0 && AlumnosTMB.jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
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
            AlumnosTMB.jTable2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable2.getRowCount() == 0 && AlumnosTMB.jTable2.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable3.getRowCount() == 0 && AlumnosTMB.jTable3.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable4.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable4.getRowCount() == 0 && AlumnosTMB.jTable4.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
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
            AlumnosTMB.jTable5.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable5.getRowCount() == 0 && AlumnosTMB.jTable5.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable6.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable6.getRowCount() == 0 && AlumnosTMB.jTable6.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable7.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable7.getRowCount() == 0 && AlumnosTMB.jTable7.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable8.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable8.getRowCount() == 0 && AlumnosTMB.jTable8.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable9.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable9.getRowCount() == 0 && AlumnosTMB.jTable9.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable10.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable10.getRowCount() == 0 && AlumnosTMB.jTable10.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable11.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable11.getRowCount() == 0 && AlumnosTMB.jTable11.getSelectedRow() == -1) {
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
            AlumnosTMB.jTable12.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMB.jTable12.getRowCount() == 0 && AlumnosTMB.jTable12.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        //CARGAR ALUMNOS DE MODALIDAD TRADICIONAL
        void Trad1a(String nombreusuario){
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
            AlumnosTMT.jTable2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable2.getRowCount() == 0 && AlumnosTMT.jTable2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad2a(String nombreusuario){
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
            AlumnosTMT.jTable3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable3.getRowCount() == 0 && AlumnosTMT.jTable3.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad3a(String nombreusuario){
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
            AlumnosTMT.jTable4.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable4.getRowCount() == 0 && AlumnosTMT.jTable4.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad4a(String nombreusuario){
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
            AlumnosTMT.jTable5.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable5.getRowCount() == 0 && AlumnosTMT.jTable5.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad5a(String nombreusuario){
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
            AlumnosTMT.jTable6.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable6.getRowCount() == 0 && AlumnosTMT.jTable6.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad1b(String nombreusuario){
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
            AlumnosTMT.jTable8.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable8.getRowCount() == 0 && AlumnosTMT.jTable8.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad2b(String nombreusuario){
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
            AlumnosTMT.jTable9.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable9.getRowCount() == 0 && AlumnosTMT.jTable9.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad3b(String nombreusuario){
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
            AlumnosTMT.jTable10.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable10.getRowCount() == 0 && AlumnosTMT.jTable10.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    void Trad4b(String nombreusuario){
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
            AlumnosTMT.jTable11.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable11.getRowCount() == 0 && AlumnosTMT.jTable11.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    void Trad5b(String nombreusuario){
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
            AlumnosTMT.jTable12.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (AlumnosTMT.jTable12.getRowCount() == 0 && AlumnosTMT.jTable12.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
