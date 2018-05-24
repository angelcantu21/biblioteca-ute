package Alumnos;


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


public class Borrar {
    
    DefaultTableModel model = new DefaultTableModel();
    
void cargarAlumnos0(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 0 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos.getRowCount() == 0 && BorrarAlumnos.tabladedatos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    
void cargarAlumnos1(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 1 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos1.getRowCount() == 0 && BorrarAlumnos.tabladedatos1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
       }
        
        
void cargarAlumnos2(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 2 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos2.getRowCount() == 0 && BorrarAlumnos.tabladedatos2.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 


void cargarAlumnos3(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 3 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos3.getRowCount() == 0 && BorrarAlumnos.tabladedatos3.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 


void cargarAlumnos4(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 4 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos4.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos4.getRowCount() == 0 && BorrarAlumnos.tabladedatos4.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 


void cargarAlumnos5(String nombreusuario){
                String [] titulos ={"MATRICULA","PASSWORD","NOMBRE","APELLIDO","CUATRIMESTRE","GRUPO","MODALIDAD","TURNO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT * FROM alumnos WHERE cuatrimestre = 5 AND nombre LIKE '%"+nombreusuario+"%' ORDER BY grupo"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

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
            BorrarAlumnos.tabladedatos5.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosTMT.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (BorrarAlumnos.tabladedatos5.getRowCount() == 0 && BorrarAlumnos.tabladedatos5.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "NO EXITE NINGUN ALUMNO REGISTRADO!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 

void BorrarAlumno(){
                       int eliminarcaja = BorrarAlumnos.btneliminar.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave0.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


void BorrarAlumno1(){
                       int eliminarcaja = BorrarAlumnos.btneliminar1.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos1.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave1.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


void BorrarAlumno2(){
                       int eliminarcaja = BorrarAlumnos.btneliminar2.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos2.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave2.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


void BorrarAlumno3(){
                       int eliminarcaja = BorrarAlumnos.btneliminar3.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos3.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave3.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


void BorrarAlumno4(){
                       int eliminarcaja = BorrarAlumnos.btneliminar4.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos4.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave4.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


void BorrarAlumno5(){
                       int eliminarcaja = BorrarAlumnos.btneliminar5.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=BorrarAlumnos.tabladedatos5.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(null,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM alumnos WHERE Matricula='"+BorrarAlumnos.clave5.getText()+"'");
                        pps.executeUpdate();
                        //eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO ALUMNO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        //limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Borrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }


}