package Login;
import Interfaz.LinkJlabel;
import com.sun.awt.AWTUtilities;
import javax.swing.Timer;
import java.awt.Image;
import java.awt.Toolkit;

public class Cargando extends javax.swing.JFrame {
    
    public Cargando() {
        initComponents();
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }
        public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/if_bookshelf_1055107.png"));
        return retValue;
    }
    Acceso acces =  new Acceso();
    LinkJlabel link = new LinkJlabel();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contador = new javax.swing.JLabel();
        txtproceso = new javax.swing.JLabel();
        barracargar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusableWindowState(false);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contador.setBackground(new java.awt.Color(0, 0, 0));
        contador.setFont(new java.awt.Font("Dialog", 1, 33)); // NOI18N
        contador.setForeground(new java.awt.Color(255, 255, 255));
        contador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contador.setText("99%");
        getContentPane().add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 90, 40));

        txtproceso.setBackground(new java.awt.Color(0, 0, 0));
        txtproceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtproceso.setText("Cargando componentes...");
        getContentPane().add(txtproceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        barracargar.setBackground(new java.awt.Color(255, 255, 255));
        barracargar.setForeground(new java.awt.Color(0, 51, 255));
        barracargar.setToolTipText("In progress...");
        barracargar.setBorderPainted(false);
        barracargar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        getContentPane().add(barracargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 640, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/splash2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     getContentPane().setBackground(new java.awt.Color(234, 255, 220));
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargando().setVisible(true);
            }
        });
    }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar barracargar;
    public static javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel txtproceso;
    // End of variables declaration//GEN-END:variables
}
