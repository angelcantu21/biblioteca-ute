package Reportes;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;
import Login.main;


public class GenerarReportes {
        public void ReporteAlumnos(){
        try {
            JasperReport report= (JasperReport) JRLoader.loadObject("C:\\Users\\ANGEL CANTU\\Desktop\\ANGELCANTU\\PROJECTS\\JAVA\\ProyectoBibliotecaUTE\\src\\Reportes\\Alumnos.jasper");
            Map parametro = new HashMap();
            JasperPrint j = JasperFillManager.fillReport(report, parametro,main.hc.conectar());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte de usuarios");
            jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte "+e);
        }
    }
        public void ReporteLibro(){
                    try {
            JasperReport report= (JasperReport) JRLoader.loadObject("C:\\Users\\ANGEL CANTU\\Desktop\\ANGELCANTU\\PROJECTS\\JAVA\\ProyectoBibliotecaUTE\\src\\Reportes\\Libros.jasper");
            Map parametro = new HashMap();
            JasperPrint j = JasperFillManager.fillReport(report, parametro,main.hc.conectar());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte de libros");
            jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte "+e);
        }
    }
        public void ReporteUsuarios(){
                    try {
            JasperReport report= (JasperReport) JRLoader.loadObject("C:\\Users\\ANGEL CANTU\\Desktop\\ANGELCANTU\\PROJECTS\\JAVA\\ProyectoBibliotecaUTE\\src\\Reportes\\Usuarios.jasper");
            Map parametro = new HashMap();
            JasperPrint j = JasperFillManager.fillReport(report, parametro,main.hc.conectar());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte de usuarios");
            jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte "+e);
        }
    }
        public void ReporteProveedor(){
                    try {
            JasperReport report= (JasperReport) JRLoader.loadObject("C:\\Users\\ANGEL CANTU\\Desktop\\ANGELCANTU\\PROJECTS\\JAVA\\ProyectoBibliotecaUTE\\src\\Reportes\\Proveedores.jasper");
            Map parametro = new HashMap();
            JasperPrint j = JasperFillManager.fillReport(report, parametro,main.hc.conectar());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reporte de usuarios");
            jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte "+e);
        }
    }
}
