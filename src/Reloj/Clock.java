package Reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

public class Clock extends Thread{
    private JTextField cajashora;
    public Clock (JTextField cajahora){
        this.cajashora=cajahora;
    }
    public Clock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void run(){
        while (true){
            Date hoy = new Date ();
            SimpleDateFormat s=new SimpleDateFormat ("hh:mm:ss");
            cajashora.setText(s.format(hoy));
            try{sleep(1000);
                
            }catch(Exception ex){
            
            }
        }
    }
}
