package Login;

import javax.swing.JOptionPane;
import conectarBD.conectar;
import java.awt.Color;

public class main {
    
    public static conectar hc;
 
    public static void main(String[] args) {
        try {
            hc=new conectar();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error de reportes "+e);
        }
        Cargando inicio = new Cargando();
        Acceso acceso = new Acceso();
        inicio.setVisible(true);
        try{
            for(int i = 0;i <= 100;i++){
                Thread.sleep(50);
                inicio.contador.setText(Integer.toString(i)+"%");
                inicio.barracargar.setValue(i); 
                if(i==0){
                    inicio.txtproceso.setText("Cargando Componentes del Sistema");
                }
                if (i==20) {
                    inicio.txtproceso.setText("Conectandose a la Base de Datos...");
                }
                if(i==40){
                    inicio.txtproceso.setText("Cargando Modulos..");
                }
                if (i==60) {
                    inicio.txtproceso.setText("Carga de Modulos Terminada");
                }
                if (i==80) {
                    inicio.txtproceso.setText("Cargando Interfaces..");
                }
                if (i==90) {
                    inicio.txtproceso.setText("Interfaces Cargadas");
                }
                if(i==100){
                    inicio.txtproceso.setText("Bienvenido al sistema");
                    inicio.setVisible(false);
                    acceso.setVisible(true);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
    }
    
}
