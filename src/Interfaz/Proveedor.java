package Interfaz;

import conectarBD.Consultas;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Reloj.Clock;

public class Proveedor extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public Proveedor() {
        initComponents();
        Proveedores("");
        Clock hilo = new Clock(cajashora);
        hilo.start();
        jTextField4.setText(fechaActual());
        botonCancelar.setVisible(false);
    }
    public static String fechaActual(){ //Objeto Fecha:
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    public void Proveedores(String nombreusuario){//MOSTRAR TELEFONOS REGISTRADOS
          String [] titulos ={"NO.PROVEEDOR","NOMBRE","E-MAIL"};
          String sql = "SELECT * FROM proveedor WHERE nombre LIKE '%"+nombreusuario+"%'";


            model= new DefaultTableModel(null,titulos);
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();
        try {
          
            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
        while(rs.next()){
        
            fila[0] = rs.getString("id_proveedor");
            fila[1] = rs.getString("Nombre");
            fila[2] = rs.getString("E_mail");            
            model.addRow(fila);
       
        }
        tablaproveedor.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelfoto = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajashora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        cod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("S E C C I O N   D E   P R O V E E D O R E S");

        labelfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelfoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelfoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelfotoMouseClicked(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N

        tablaproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NO.PROVEEDOR", "NOMBRE", "E-MAIL"
            }
        ));
        tablaproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaproveedorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproveedor);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NO. PROVEEDOR:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE COMPLETO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-MAIL:");

        botonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAgregar.setText("NUEVO");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificar.setText("Actualizar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("FECHA DE REGISTRO:");

        jTextField4.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("HORA DE REGISTRO:");

        cajashora.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonCancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cajashora))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajashora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar))
                .addGap(18, 18, 18)
                .addComponent(botonCancelar)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buscar proveedor:");

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        cod.setText("ID PROVEEDOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod)
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelfoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelfotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelfotoMouseClicked
        // TODO add your handling code here:
        JFileChooser archivo = new JFileChooser(); //LLAMAMOS AL JFILECHOOSER
        int ventana=archivo.showOpenDialog(null);
        if (ventana==JFileChooser.APPROVE_OPTION) { 
            File file = archivo.getSelectedFile(); //AGARRAMOS EL ARCHIVO SELECCIONADO
            jTextField5.setText(String.valueOf(file)); //RUTA DEL ARCHIVO
            Image foto = getToolkit().getImage(jTextField5.getText()); //SE OBTIENE LA RUTA DEL ARCHIVO PARA CONVERTIRLO EN IMAGEN
            labelfoto.setIcon(new ImageIcon(foto));//SE CARGA LA IMAGEN EN EL LABEL
        }
    }//GEN-LAST:event_labelfotoMouseClicked

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        Agregar();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); //DECLARAMOS UN EVENTO
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) { //AQUI DECIMOS QUE SOLO LOS NUMEROS DEL 0 AL 9 SE PERMITE Y LA TECLA DE REGRESAR
            evt.consume();//EJECUTAR TECLAS
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void tablaproveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproveedorMousePressed
        // TODO add your handling code here:
                int fila = tablaproveedor.getSelectedRow();
        if(fila >=0){
            jTextField1.setText(tablaproveedor.getValueAt(fila, 0).toString());
            jTextField2.setText(tablaproveedor.getValueAt(fila, 1).toString());
            jTextField3.setText(tablaproveedor.getValueAt(fila, 2).toString());
            cod.setText(tablaproveedor.getValueAt(fila, 0).toString());
            CargarImagen();
            botonAgregar.setEnabled(false);
            botonEliminar.setEnabled(true);
            botonModificar.setEnabled(true);
            botonCancelar.setVisible(true);
        }else{
            cod.setText("ID");
        }
    }//GEN-LAST:event_tablaproveedorMousePressed

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
        // TODO add your handling code here:
        Proveedores(buscar.getText());
    }//GEN-LAST:event_buscarKeyTyped

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        labelfoto.setIcon(null);
        botonAgregar.setEnabled(true);
        botonEliminar.setEnabled(false);
        botonCancelar.setVisible(false);
        botonModificar.setEnabled(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        EliminarProveedor();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        Modificar();
    }//GEN-LAST:event_botonModificarActionPerformed

    public void Agregar(){
        
        //Aqui mando a llamar a la clases Consultas y Conectar
        Consultas cc = new Consultas();
        Connection cn = cc.getConnection();
        
        //Sentencia Sql
        String sql="INSERT INTO proveedor (id_proveedor, nombre, e_mail, Imagen, ruta) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            FileInputStream archivofoto;
            psd.setString(1, jTextField1.getText());
            psd.setString(2, jTextField2.getText());
            psd.setString(3, jTextField3.getText());
            archivofoto = new FileInputStream(jTextField5.getText());
            psd.setBinaryStream(4, archivofoto);
            psd.setString(5, jTextField5.getText());
            int n=psd.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"REGISTRO CORRECTO!","CORRECTO",JOptionPane.PLAIN_MESSAGE); 
                Proveedores("");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField5.setText("");
                labelfoto.setIcon(null);
                botonModificar.setEnabled(false);                
            }else{
                JOptionPane.showMessageDialog(this,"ERROR AL REGISTRAR","ERROR",JOptionPane.ERROR_MESSAGE);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ESTE PROVEEDOR SE ENCUENTRA REGISTRADO!","ERROR",JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        void CargarImagen(){ 
        String sql = "SELECT * FROM proveedor WHERE id_proveedor = '"+jTextField1.getText()+"'"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                Blob blob =rs.getBlob("Imagen");
                Image i=javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(i);
                labelfoto.setIcon(image);
                jTextField5.setText(rs.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        void EliminarProveedor(){
                    Consultas cc= new Consultas();
                    Connection cn = cc.getConnection();

                try {
                    int a = JOptionPane.showConfirmDialog(this,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM proveedor WHERE id_proveedor='"+cod.getText()+"'");
                        pps.executeUpdate();
                       

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO PROVEEDOR","CONFIRMACION",JOptionPane.PLAIN_MESSAGE);
                        Proveedores("");
                        cod.setText("ID");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField5.setText("");
                        labelfoto.setIcon(null);
                        botonEliminar.setEnabled(false);
                        botonCancelar.setVisible(false);
                        botonModificar.setEnabled(false);
                        botonAgregar.setEnabled(true);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR PROVEEDOR","ERROR",JOptionPane.INFORMATION_MESSAGE);
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        public void Modificar(){
        Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        try {
            String sql = "UPDATE proveedor SET id_proveedor=?,"
                +"nombre=?,"
                +"E_mail=?,"
                +"Ruta=?,"
                +"Imagen=?"
                +"WHERE id_proveedor='"+cod.getText()+"'";
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, jTextField1.getText());
            psd.setString(2, jTextField2.getText());
            psd.setString(3, jTextField3.getText());
            psd.setString(4, jTextField5.getText());
            FileInputStream archivoFoto;
            archivoFoto=new FileInputStream(jTextField5.getText());
            psd.setBinaryStream(5, archivoFoto);
            int n=psd.executeUpdate();
            if (n>0){
            JOptionPane.showMessageDialog(null,"LOS DATOS HAN SIDO MODIFICADOS CON EXITO","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
            Proveedores("");
           cod.setText("ID");
           jTextField1.setText("");
           jTextField2.setText("");
           jTextField3.setText("");
           jTextField5.setText("");
           labelfoto.setIcon(null);
           botonModificar.setEnabled(false);
           botonEliminar.setEnabled(false);
           botonCancelar.setVisible(false);
           botonAgregar.setEnabled(true);
            }else{
            JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR PROVEEDOR","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField cajashora;
    private javax.swing.JLabel cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelfoto;
    private javax.swing.JTable tablaproveedor;
    // End of variables declaration//GEN-END:variables
}
