package Login;
import Interfaz.LinkJlabel;
import Interfaz.Ventana;
import Interfaz.VentanaAlumnos;
import conectarBD.Pool;
import conectarBD.MetodosLogin;
import java.awt.Color;
import javax.swing.JOptionPane;
import Reloj.Reloj;
import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Acceso extends javax.swing.JFrame {

   String contraseña;
    public Acceso() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        getContentPane().setBackground(new java.awt.Color(234,255,220));
        Completado();
        Reloj accesoReloj = new Reloj(cajahora);
        accesoReloj.start();
        cajafecha.setText(fechaActual());//fecha
        setLocation(470,0);
        user.setEnabled(false);
        pass.setEnabled(false);
        IngresarAcceso.setEnabled(false);
        tipoAdmin.setEnabled(false);
        tipoEstu.setEnabled(false);
        
    }
    void bloqueo(){ //Bloquear el acceso a todos los componentes de la ventana si la base de datos esta desconectada
    user.setEnabled(false); 
    pass.setEnabled(false);
    tipoAdmin.setEnabled(false);
    tipoEstu.setEnabled(false);
    IngresarAcceso.setEnabled(false);
}
    void Desbloquear(){ //Desbloquear el acceso a todos los componentes si la base de datos esta conectada
    user.setEnabled(true); 
    pass.setEnabled(true);
    tipoAdmin.setEnabled(true);
    tipoEstu.setEnabled(true);
    IngresarAcceso.setEnabled(true);
    }
        public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/if_bookshelf_1055107.png"));
        return retValue;
    }
        public static String fechaActual(){ //Objeto Fecha:
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
        public void Completado(){
            if (user.getText().length() >0) {
                jLabel2.setForeground(Color.BLUE);
            }else{
                jLabel2.setForeground(Color.WHITE);
            }
            if (pass.getText().length() >0) {
                jLabel6.setForeground(Color.BLUE);
            }else{
                jLabel6.setForeground(Color.WHITE);
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipodeusuario = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        conectardb1 = new javax.swing.JButton();
        SalirAcceso = new javax.swing.JButton();
        conectardb = new javax.swing.JButton();
        conectardb2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Contenido = new javax.swing.JPanel();
        tipoAdmin = new javax.swing.JRadioButton();
        tipoEstu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cajahora = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        cajafecha = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        IngresarAcceso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtbase = new javax.swing.JLabel();
        txtestado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A C C E S O  A L  S I S T E M A");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(234, 255, 220));

        conectardb1.setBackground(new java.awt.Color(0, 0, 0));
        conectardb1.setForeground(new java.awt.Color(255, 255, 255));
        conectardb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu pe.png"))); // NOI18N
        conectardb1.setToolTipText("Mostrar  acceso");
        conectardb1.setBorder(null);
        conectardb1.setBorderPainted(false);
        conectardb1.setContentAreaFilled(false);
        conectardb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conectardb1.setFocusable(false);
        conectardb1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu pe.png"))); // NOI18N
        conectardb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectardb1ActionPerformed(evt);
            }
        });

        SalirAcceso.setBackground(new java.awt.Color(0, 0, 0));
        SalirAcceso.setForeground(new java.awt.Color(255, 255, 255));
        SalirAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_power-off_1608429.png"))); // NOI18N
        SalirAcceso.setToolTipText("Cerrar programa");
        SalirAcceso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SalirAcceso.setBorderPainted(false);
        SalirAcceso.setContentAreaFilled(false);
        SalirAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirAcceso.setFocusable(false);
        SalirAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirAccesoActionPerformed(evt);
            }
        });

        conectardb.setBackground(new java.awt.Color(0, 0, 0));
        conectardb.setForeground(new java.awt.Color(255, 255, 255));
        conectardb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Conect db pe.png"))); // NOI18N
        conectardb.setToolTipText("Conectar la base de datos");
        conectardb.setBorder(null);
        conectardb.setBorderPainted(false);
        conectardb.setContentAreaFilled(false);
        conectardb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conectardb.setFocusable(false);
        conectardb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectardbActionPerformed(evt);
            }
        });

        conectardb2.setBackground(new java.awt.Color(0, 0, 0));
        conectardb2.setForeground(new java.awt.Color(255, 255, 255));
        conectardb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Cancel_1063907.png"))); // NOI18N
        conectardb2.setToolTipText("Ocultar acceso");
        conectardb2.setBorder(null);
        conectardb2.setBorderPainted(false);
        conectardb2.setContentAreaFilled(false);
        conectardb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conectardb2.setFocusable(false);
        conectardb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectardb2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_user-add-outline_216487.png"))); // NOI18N
        jButton1.setToolTipText("Agregar usuario");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(conectardb1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conectardb2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conectardb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(SalirAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SalirAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(conectardb2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(conectardb1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(conectardb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        Contenido.setBackground(new java.awt.Color(0, 0, 0));

        tipoAdmin.setBackground(new java.awt.Color(0, 0, 0));
        tipodeusuario.add(tipoAdmin);
        tipoAdmin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tipoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        tipoAdmin.setText("Administrador");

        tipoEstu.setBackground(new java.awt.Color(0, 0, 0));
        tipodeusuario.add(tipoEstu);
        tipoEstu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tipoEstu.setForeground(new java.awt.Color(255, 255, 255));
        tipoEstu.setText("Estudiante");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE DE USUARIO");

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        user.setForeground(new java.awt.Color(245, 245, 245));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setToolTipText("INGRESA UN USUARIO");
        user.setBorder(null);
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTRASEÑA");

        cajahora.setBackground(new java.awt.Color(0, 0, 0));
        cajahora.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        cajahora.setForeground(new java.awt.Color(51, 255, 0));
        cajahora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_clock_299080.png"))); // NOI18N
        cajahora.setText("jLabel1");

        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setToolTipText("INGRESA UNA CONTRASEÑA");
        pass.setBorder(null);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        cajafecha.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        cajafecha.setForeground(new java.awt.Color(51, 255, 0));
        cajafecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario_1.png"))); // NOI18N
        cajafecha.setText("jLabel7");

        IngresarAcceso.setBackground(new java.awt.Color(0, 0, 0));
        IngresarAcceso.setForeground(new java.awt.Color(255, 255, 255));
        IngresarAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios registrados.png"))); // NOI18N
        IngresarAcceso.setText("Ingresar");
        IngresarAcceso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        IngresarAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarAcceso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir usuario.png"))); // NOI18N
        IngresarAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAccesoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pcs.png"))); // NOI18N

        txtbase.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtbase.setForeground(new java.awt.Color(255, 255, 255));
        txtbase.setText("Base de datos:");

        txtestado.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtestado.setForeground(new java.awt.Color(255, 0, 0));
        txtestado.setText("Desconectada");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                        .addComponent(IngresarAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addComponent(cajafecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cajahora))
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addComponent(tipoAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(tipoEstu))))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addComponent(txtbase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtestado)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajafecha)
                    .addComponent(cajahora))
                .addGap(27, 27, 27)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tipoAdmin))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(tipoEstu))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(IngresarAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbase)
                    .addComponent(txtestado)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarAccesoActionPerformed
       MetodosLogin metodoslogin = new MetodosLogin(); //Mandamos a llamar la clase :v
    if(tipoAdmin.isSelected() == true && metodoslogin.validar_ingreso()==1){ //Si tipo de usuario es = administrador entonces es correcto
                    this.dispose();
                    Ventana formformulario1 = new Ventana();  
                    formformulario1.setLocationRelativeTo(null);
                    formformulario1.setTitle("C A P T U R A D O R   D E   D A T O S");
                    formformulario1.setVisible(true);
                    formformulario1.setResizable(false);
     }else {
            if(tipoEstu.isSelected() == true && metodoslogin.validar_ingresoInvitado()==1){ //Si no si el tipo de usuario es = alumno entonces es correcto
                    this.dispose();
                    VentanaAlumnos ventanaAlumnos = new VentanaAlumnos();  
                    ventanaAlumnos.setLocationRelativeTo(null);
                    ventanaAlumnos.setVisible(true);    

     }else{ //Si no la contraseña es incorrecta
             JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA O ERROR EN EL TIPO DE ACCESO","ERROR",JOptionPane.ERROR_MESSAGE);
                
            }
    }   
    }//GEN-LAST:event_IngresarAccesoActionPerformed
    private void SalirAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirAccesoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirAccesoActionPerformed
    private void conectardbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectardbActionPerformed
        // AQUI NOS CONECTAMOS A LA BASE DE DATOS
        
        Pool metodospool = new Pool();
        java.sql.Connection cn = null;


        try {

            cn=metodospool.dataSource.getConnection();

            if(cn!=null){
                //JOptionPane.showMessageDialog(null, "Conectado","BASE DE DATOS", JOptionPane.INFORMATION_MESSAGE);
                txtestado.setText("Conectada");
                txtestado.setForeground(Color.GREEN);
                Desbloquear();
                requestFocus();
            }

        } catch (SQLException e) {
            bloqueo();
            JOptionPane.showMessageDialog(null,"La base de datos no esta conectada","BASE DE DATOS NO CONECTADA", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);

        }finally{
                try {
                    cn.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
        }
              
    }//GEN-LAST:event_conectardbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            CrearCuentaValidar crear = new CrearCuentaValidar();
            JOptionPane.showMessageDialog(null,"Si eres alumno no puedes crear una cuenta"+"\nPara crear una cuenta necesitas contactar al administrador","PERSONAL ESTUDIANTE", JOptionPane.INFORMATION_MESSAGE);
            crear.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conectardb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectardb1ActionPerformed
        // TODO add your handling code here:
        Contenido.setVisible(true);
    }//GEN-LAST:event_conectardb1ActionPerformed

    private void conectardb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectardb2ActionPerformed
        // TODO add your handling code here:
        Contenido.setVisible(false);
    }//GEN-LAST:event_conectardb2ActionPerformed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        // TODO add your handling code here:
        Completado();
        char teclaPresionada=evt.getKeyChar(); //se crea una variable de tipo char en el cual se obtiene la tecla oprimida
        if (teclaPresionada==KeyEvent.VK_ENTER) { //si la tecla presionada es igual a enter
            IngresarAcceso.doClick();//Ejecuta elclick
        }
    }//GEN-LAST:event_userKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        // TODO add your handling code here:
        Completado();
        char teclaPresionada=evt.getKeyChar(); //se crea una variable de tipo char en el cual se obtiene la tecla oprimida
        if (teclaPresionada==KeyEvent.VK_ENTER) { //si la tecla presionada es igual a enter
            IngresarAcceso.doClick();//Ejecuta elclick
        }
    }//GEN-LAST:event_passKeyTyped

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    public static javax.swing.JButton IngresarAcceso;
    private javax.swing.JButton SalirAcceso;
    public static javax.swing.JLabel cajafecha;
    private javax.swing.JLabel cajahora;
    public static javax.swing.JButton conectardb;
    public static javax.swing.JButton conectardb1;
    public static javax.swing.JButton conectardb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JPasswordField pass;
    public static javax.swing.JRadioButton tipoAdmin;
    public static javax.swing.JRadioButton tipoEstu;
    public static javax.swing.ButtonGroup tipodeusuario;
    private javax.swing.JLabel txtbase;
    private javax.swing.JLabel txtestado;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
