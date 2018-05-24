package Interfaz;


import BuscadorDeLibros.BuscadorLibros;
import Login.Acceso;
import Reloj.Reloj;
import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class VentanaAlumnos extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public VentanaAlumnos() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(51,51,55));
        Reloj hilo=new Reloj (cajahora);//Reloj
        hilo.start();//Reloj
        NombreUsuario();
        cajafecha.setText(fechaActual());//fecha
        usuariodentro.setText(Acceso.user.getText().toUpperCase()); //Mostrar nombre de usuario
    }

        public static String fechaActual(){ //Objeto Fecha:
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }
        LinkJlabel link = new LinkJlabel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usuariodentro = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JLabel();
        cajahora = new javax.swing.JLabel();
        cajafecha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        grado = new javax.swing.JLabel();
        grupo = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        modalidad = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        BuscarLibro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cerrarsesion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SeccionAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("B I B L I O T E C A   U T E");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)), "DATOS DEL ALUMNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno.png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));

        usuariodentro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariodentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuariodentro.setText("USERNAME");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/on.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("\"Bienvenido al sistema\"");

        tipoUsuario.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        tipoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoUsuario.setText("ESTUDIANTE");

        cajahora.setFont(new java.awt.Font("DialogInput", 1, 22)); // NOI18N
        cajahora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/relojito.png"))); // NOI18N
        cajahora.setText("jLabel7");

        cajafecha.setFont(new java.awt.Font("DialogInput", 1, 22)); // NOI18N
        cajafecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        cajafecha.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("MATRICULA:");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("NOMBRE:");

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setText("DIEGO GERARDO LAUREANO MARTINEZ");

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("GRADO:");

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("GRUPO:");

        grado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grado.setText("1");

        grupo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grupo.setText("A");

        jLabel22.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("MODALIDAD:");

        modalidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modalidad.setText("TRADICIONAL");

        jLabel24.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("TURNO:");

        turno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        turno.setText("VESPERTINO");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("TIPO DE USUARIO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cajafecha)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cajahora)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(146, 146, 146)
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(modalidad)
                                            .addGap(81, 81, 81)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tipoUsuario))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nombre))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(usuariodentro)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel12)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(grado)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel13)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(grupo)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel24)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(turno))))
                                .addGap(0, 24, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cajahora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajafecha)
                                .addComponent(jLabel2)))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuariodentro)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(grado)
                            .addComponent(grupo)
                            .addComponent(jLabel24)
                            .addComponent(turno))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nombre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoUsuario)
                    .addComponent(jLabel22)
                    .addComponent(modalidad)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_letter_291048.png"))); // NOI18N
        jLabel20.setToolTipText("Haz clic aqui");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jMenu5.setText("Buscador de libros");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        BuscarLibro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        BuscarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar libro.png"))); // NOI18N
        BuscarLibro.setText("Buscar libro");
        BuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLibroActionPerformed(evt);
            }
        });
        jMenu5.add(BuscarLibro);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/power off.png"))); // NOI18N
        jMenu3.setText("Cerrar sesion");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        cerrarsesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/off.png"))); // NOI18N
        cerrarsesion.setText("Cerrar Sesion");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        jMenu3.add(cerrarsesion);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acerca de.png"))); // NOI18N
        jMenu4.setText("Acerca de");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        SeccionAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        SeccionAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        SeccionAyuda.setText("Creditos");
        SeccionAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionAyudaActionPerformed(evt);
            }
        });
        jMenu4.add(SeccionAyuda);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLibroActionPerformed
        // TODO add your handling code here:
        BuscadorLibros buscarlibros = new BuscadorLibros();
        buscarlibros.setVisible(true);
        buscarlibros.setLocationRelativeTo(null);
    }//GEN-LAST:event_BuscarLibroActionPerformed

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);//Regresa a la anterior ventana o la cierra
        JOptionPane.showMessageDialog(this, "Has cerrado sesion con exito", "CIERRE DE SESION", JOptionPane.INFORMATION_MESSAGE);
        Acceso acces = new Acceso(); //Llamar a la venta acceso
        acces.setLocationRelativeTo(null);
        acces.setVisible(true);
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void SeccionAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionAyudaActionPerformed
        // TODO add your handling code here:
        Informacion info = new Informacion();
        info.setLocationRelativeTo(null);
        info.setVisible(true);
    }//GEN-LAST:event_SeccionAyudaActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        link.Link();
    }//GEN-LAST:event_jLabel20MouseClicked

        void NombreUsuario(){ //CON ESTE VOID SE MUESTRA EL NOMBRE DEL USUARIO QUE INGRESO AL SISTEMA
            String sql = "SELECT * FROM Alumnos WHERE Matricula= '"+Acceso.user.getText()+"'";

            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
        
            usuariodentro.setText(rs.getString("Matricula").toUpperCase());
            nombre.setText(rs.getString("Nombre").toUpperCase());
            grado.setText(rs.getString("cuatrimestre").toUpperCase());
            grupo.setText(rs.getString("Grupo").toUpperCase());
            modalidad.setText(rs.getString("Modalidad").toUpperCase());
            turno.setText(rs.getString("Turno").toUpperCase());
            
                            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(VentanaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarLibro;
    private javax.swing.JMenuItem SeccionAyuda;
    public static javax.swing.JLabel cajafecha;
    public static javax.swing.JLabel cajahora;
    private javax.swing.JMenuItem cerrarsesion;
    private javax.swing.JLabel grado;
    private javax.swing.JLabel grupo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel modalidad;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tipoUsuario;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel usuariodentro;
    // End of variables declaration//GEN-END:variables
}
