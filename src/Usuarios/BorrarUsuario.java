package Usuarios;

import Usuarios.AgregarUsuario;
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


public class BorrarUsuario extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public BorrarUsuario() {
        initComponents();
    }
    
    String Item="";
    void eliminardetalles(){
     Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
            try {
             
                    PreparedStatement pps= cn.prepareStatement("DELETE FROM usuarios WHERE idUsuarios='"+clave.getText()+"'");
                    pps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(BorrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    void cargarclienteB(String nombreusuario){   //CONECTA A DB PARA CARGAR USUARIOS LO QUE ESTA ADENTRO DEL PARENTESIS ES EL NOMBRE DEL USUARIO     
   String [] titulos ={"No. FICHA","USUARIO","NOMBRE"}; //NOMBRES DE LA JTABLE 
 String sql = "SELECT * FROM usuarios WHERE nombre LIKE '%"+nombreusuario+"%'"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS


 model= new DefaultTableModel(null,titulos);
 Consultas cc= new Consultas(); //CONECCION A DB
 Connection cn = cc.getConnection(); //CONECCION A DB
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("idUsuarios"); //COLUMNAS DE LA BASE DE DATOS
            fila[1] = rs.getString("usuario"); //COLUMNAS DE LA BASE DE DATOS
            fila[2] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
      model.addRow(fila);
       
  }
        tabladedatos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btneliminar = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();
        clave = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.setTitle("B O R R A R    U S U A R I O");
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jInternalFrame1.setVisible(true);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BORRAR USUARIOS");

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 0, 0));
        btneliminar.setFont(new java.awt.Font("DialogInput", 2, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MOSTRAR OPCIONES ----->", "ELIMINAR" }));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. FICHA", "USUARIO", "NOMBRE", "APELLIDO"
            }
        ));
        tabladedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabladedatos);

        clave.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        clave.setForeground(new java.awt.Color(204, 0, 0));
        clave.setText("0");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jButton3.setText("MOSTRAR USUARIOS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setText("NO. FICHA:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        int eliminarcaja = btneliminar.getSelectedIndex();
        if(eliminarcaja==1){
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

            int fila=tabladedatos.getSelectedRow();

            if(fila>=0){
                try {
                    int a = JOptionPane.showConfirmDialog(this,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM usuarios WHERE idUsuarios='"+clave.getText()+"'");
                        pps.executeUpdate();
                        eliminardetalles();

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EQUIPO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
                        limpiaTablaC();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BorrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null,"SELECCIONE LO QUE DESEA ELIMINAR DE LA TABLA","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cargarclienteB("");
        JOptionPane.showMessageDialog(null,"LISTA ACTUALIZADA","ACTUALIZADO",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabladedatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladedatosMousePressed
        // TODO add your handling code here:
        int fila = tabladedatos.getSelectedRow();
        if(fila>=0){
            clave.setText(tabladedatos.getValueAt(fila, 0).toString());
        }
    }//GEN-LAST:event_tabladedatosMousePressed
    
     void limpiaTablaC(){
  DefaultTableModel model=(DefaultTableModel)tabladedatos.getModel();
   while (model.getRowCount()>0){
       for(int i = 0; i<model.getRowCount();i++){
           model.removeRow(i);
           
       }
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
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox btneliminar;
    private javax.swing.JLabel clave;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabladedatos;
    // End of variables declaration//GEN-END:variables
}
