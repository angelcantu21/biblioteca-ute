package Interfaz;
import Reloj.Reloj;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Bloqueo extends javax.swing.JFrame {
    
        String contraseña;
   
    public Bloqueo() {
        initComponents();
        Reloj hilo=new Reloj (cajahora);//Reloj
        hilo.start();//Reloj
        cajafecha.setText(fechaActual());//fecha
        EntrarBloqueo.setVisible(false);
        this.setDefaultCloseOperation( DO_NOTHING_ON_CLOSE  );//evita cerra jframe con ALT+C
        this.setAlwaysOnTop(true);//siempre al frente
    }
    public static String fechaActual(){ //Objeto Fecha:
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
        public void ValidarBloqueo()
        {
            contraseña = new String(PassBloqueo.getPassword());
            if (contraseña.compareTo("admin")==0 ) {
                dispose();
                //this.setVisible(false); ESTO ES PARA CUANDO NO QUIERES QUE SE CIERRE LA VENTANA ANTERIOR SOLO LE DAS CLIC Y SALE LA VENTANA QUE ESTABA ANTES PERO TENGO QUE BORRAR EL dipose(); QUE DEJE EN EL BOTON DE ACTIVAR BLOQUEO
                //Ventana ventanas = new Ventana();
                //ventanas.setLocationRelativeTo(null);
                //ventanas.setVisible(true);
            }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PassBloqueo = new javax.swing.JPasswordField();
        EntrarBloqueo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cajafecha = new javax.swing.JLabel();
        cajahora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantbloqueo.png"))); // NOI18N

        PassBloqueo.setToolTipText("SOLO PERSONAL AUTORIZADO");
        PassBloqueo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PassBloqueoKeyTyped(evt);
            }
        });

        EntrarBloqueo.setBackground(new java.awt.Color(255, 255, 255));
        EntrarBloqueo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        EntrarBloqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave.png"))); // NOI18N
        EntrarBloqueo.setText("ENTRAR");
        EntrarBloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarBloqueoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONTRASEÑA:");
        jLabel2.setToolTipText("SOLO PERSONAL AUTORIZADO");

        cajafecha.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        cajafecha.setForeground(new java.awt.Color(102, 102, 102));
        cajafecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        cajafecha.setText("jLabel3");

        cajahora.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        cajahora.setForeground(new java.awt.Color(102, 102, 102));
        cajahora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/relojito.png"))); // NOI18N
        cajahora.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(628, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PassBloqueo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntrarBloqueo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(716, 716, 716))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajafecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajahora)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajafecha)
                    .addComponent(cajahora))
                .addGap(269, 269, 269)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassBloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntrarBloqueo)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarBloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarBloqueoActionPerformed
        // TODO add your handling code here:
        ValidarBloqueo();
    }//GEN-LAST:event_EntrarBloqueoActionPerformed

    private void PassBloqueoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassBloqueoKeyTyped
        // TODO add your handling code here:
        char teclaPresionada=evt.getKeyChar(); //se crea una variable de tipo char en el cual se obtiene la tecla oprimida
        if (teclaPresionada==KeyEvent.VK_ENTER) { //si la tecla presionada es igual a enter
            EntrarBloqueo.doClick();//Ejecuta elclick
        }
    }//GEN-LAST:event_PassBloqueoKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bloqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarBloqueo;
    public static javax.swing.JPasswordField PassBloqueo;
    private javax.swing.JLabel cajafecha;
    private javax.swing.JLabel cajahora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
