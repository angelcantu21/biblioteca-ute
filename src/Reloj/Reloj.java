package Reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class Reloj extends Thread{
    private JLabel cajahora;
    public Reloj (JLabel cajahora){
        this.cajahora=cajahora;
        
    }

    public Reloj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void run(){
        while (true){
            Date hoy = new Date ();
            SimpleDateFormat s=new SimpleDateFormat ("hh:mm:ss");
            cajahora.setText(s.format(hoy));
            try{sleep(1000);
                
            }catch(Exception ex){
            
            }
        }
    }
}

    

    
    

