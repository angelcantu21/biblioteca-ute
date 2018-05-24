package Interfaz;

import java.awt.Desktop;
import java.net.URI;

public class LinkJlabel {
    public void Link(){
                    try{
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                if(desktop.isSupported(Desktop.Action.BROWSE)){
                    desktop.browse(new URI("http://angelcantusoftwares.comli.com/"));
                }
            }
        }catch(Exception e){
           e.printStackTrace();
        }
}
    
}
