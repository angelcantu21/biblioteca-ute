package Interfaz;
import EntregasPendientes.Entregas;
import EntregasPendientes.EntregarPendiente;
import Alumnos.AgregarAlumnos;
import Libros.Libros;
import BuscadorDeLibros.BuscadorLibros;
import Login.Acceso;
import java.awt.Image;
import java.awt.Toolkit;
import Alumnos.AlumnosTMB;
import Alumnos.AlumnosTMT;
import Alumnos.BorrarAlumnos;
import Alumnos.EditarAlumnoTMT;
import Alumnos.EditarAlumnosTMB;
import Reloj.Clock;
import javax.swing.JOptionPane;
import Reloj.Reloj;
import Reportes.GenerarReportes;
import Usuarios.AgregarUsuario;
import Usuarios.BorrarUsuario;
import Usuarios.EditarUsuario;
import Usuarios.VerUsuarios;
import com.mxrck.autocompleter.TextAutoCompleter;
import conectarBD.Consultas;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public Ventana() {
        initComponents();
        AutoCompletarNombre();
        getContentPane().setBackground(new java.awt.Color(240, 240, 240));
        phones();
        NombreUsuario();
        Reloj hilo=new Reloj (cajahora);//Reloj
        hilo.start();//Reloj
        Clock reloj = new Clock(cajashora);
        reloj.start();
        cod.setVisible(false);
        botonCancelar.setVisible(false);
        cajafecha.setText(fechaActual());//fecha
        botonEliminar.setEnabled(false);
        botonModificar.setEnabled(false);
        usuariodentro.setCursor(Cursor.getPredefinedCursor(12)); //al momento de pasar el cursor por el jtext se conviernte en la mano
        this.setDefaultCloseOperation( DO_NOTHING_ON_CLOSE  );
    }
        public static String fechaActual(){ //Objeto Fecha:
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }
        public Image getIconImage() { //CON ESTO PONEMOS UN ICONO A NUESTRO PROGRAMA Y SE MOSTRARA EN LA BARRA.
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/if_bookshelf_1055107.png"));
        return retValue;
    }       
        public void AutoCompletarNombre(){//FILTRAR DATOS EN UN JTEXTFIELD
            TextAutoCompleter autocompletar = new TextAutoCompleter(matricula);
            String sql = "SELECT*FROM Alumnos";
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();
            try{
            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                autocompletar.addItem(rs.getString("Matricula"));
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        GenerarReportes reportes = new GenerarReportes();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator22 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usuariodentro = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        ficha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AgregarNombre = new javax.swing.JTextField();
        AgregarNumero = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CategoriaCap = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        capturar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        matricula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Capturador = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cuatri = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        turno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        modalidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cajashora = new javax.swing.JTextField();
        lblLibros = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jdt = new com.toedter.calendar.JDateChooser();
        cajahora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        toogle = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        cajafecha = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrarsesion = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        BuscarLibro = new javax.swing.JMenuItem();
        Utilidades = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenu17 = new javax.swing.JMenu();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenu15 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenu27 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu28 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SeccionAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 255, 220));
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATOS DEL ADMINISTRADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photoprofile.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usuariodentro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariodentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuariodentro.setText("USERNAME");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/on.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("\"BIENVENIDO AL SISTEMA\"");

        tipoUsuario.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        tipoUsuario.setForeground(new java.awt.Color(255, 0, 0));
        tipoUsuario.setText("ADMINISTRADOR");

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setText("ID -");

        ficha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ficha.setText("FICHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoUsuario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ficha)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuariodentro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id)
                            .addComponent(ficha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuariodentro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "TELEFONO DE PROVEEDORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "NOMBRE", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        AgregarNombre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        AgregarNombre.setForeground(new java.awt.Color(153, 153, 153));
        AgregarNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgregarNombre.setText("NOMBRE");

        AgregarNumero.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        AgregarNumero.setForeground(new java.awt.Color(153, 153, 153));
        AgregarNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgregarNumero.setText("NUMERO");

        botonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ok.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(0, 0, 0));
        botonModificar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1499228206_icon-136-document-edit.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(0, 0, 0));
        botonEliminar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(0, 0, 0));
        botonCancelar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgregarNombre)
            .addComponent(AgregarNumero)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AgregarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonModificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonCancelar))
                .addGap(24, 24, 24))
        );

        jPanel3.setBackground(new java.awt.Color(240, 240, 220));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL DE BIBLIOTECA TICSI");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1490771141_Library.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Capturador \"Biblioteca de TICSI\"");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(240, 240, 220));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar informacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Titulo del libro:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 23));

        titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tituloKeyTyped(evt);
            }
        });
        jPanel4.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 427, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Categoria:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 71, -1, -1));

        CategoriaCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar", "Java", "Android", "PHP", "MySQL", "C++", "Ingenieria en Software", "Linux", "Base de datos", ".NET", "Redes", "Diseño de sistemas", "Seguridad Informatica", "Auditoria", "C#", "JavaScript", "HTML", "HTML 5", "CSS" }));
        jPanel4.add(CategoriaCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 71, 373, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre del alumno:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 188, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Matricula de Alumno:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 129, -1, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Grupo del Alumno:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 23));
        jPanel4.add(grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 62, -1));

        capturar.setBackground(new java.awt.Color(240, 240, 220));
        capturar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        capturar.setText("Capturar");
        capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturarActionPerformed(evt);
            }
        });
        jPanel4.add(capturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 385, 182, 41));

        jButton1.setBackground(new java.awt.Color(240, 240, 220));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 181, 41));
        jPanel4.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 133, 201, -1));
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 188, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Capturó:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 344, -1, -1));

        Capturador.setEditable(false);
        Capturador.setBackground(new java.awt.Color(250, 250, 250));
        Capturador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(Capturador, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 345, 540, 22));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_update_678134.png"))); // NOI18N
        jButton2.setToolTipText("Cargar datos");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_update_678134 (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 21, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cuatrimestre:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        jPanel4.add(cuatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 61, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Turno:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));
        jPanel4.add(turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 140, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Modalidad:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        jPanel4.add(modalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 152, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Apellido:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        jPanel4.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 171, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Hora:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        cajashora.setEditable(false);
        jPanel4.add(cajashora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 209, -1));

        lblLibros.setText("ID");
        jPanel4.add(lblLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Fecha:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel4.add(jdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 280, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(47, 47, 47))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cajahora.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cajahora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/relojito.png"))); // NOI18N
        cajahora.setText("jLabel7");

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Buscar libros                            Ctrl+Q", "Capturar Entrega                    Ctrl+C", "Entregas Pendientes               Ctrl+E", "Actualizar DB                           Ctrl+A", "Bloquear pantalla                    Ctrl+K", "Cerrar sesion                          Ctrl+H", "Acerca del programa              Ctrl+O" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        toogle.setBackground(new java.awt.Color(240, 240, 239));
        toogle.setText("OCULTAR");
        toogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toogleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COMANDOS BASICOS");

        cajafecha.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        cajafecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        cajafecha.setText("jLabel7");

        cod.setText("ID");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(572, 40));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_power-button_353434.png"))); // NOI18N
        jMenu1.setText("Cerrar/Apagar");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_power-button_353434 (1).png"))); // NOI18N

        cerrarsesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        cerrarsesion.setText("Cerrar Sesion");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        jMenu1.add(cerrarsesion);

        jSeparator7.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.add(jSeparator7);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/power off.png"))); // NOI18N
        jMenuItem3.setText("Apagar sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jSeparator11.setBackground(new java.awt.Color(240, 240, 240));
        jMenu1.add(jSeparator11);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_magnifyingglass_1055031.png"))); // NOI18N
        jMenu5.setText("Buscar libros");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        Utilidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_compose_1055085.png"))); // NOI18N
        Utilidades.setText("Herramientas");
        Utilidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_books-edit_83523.png"))); // NOI18N
        jMenuItem11.setText("Capturar Entrega");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Utilidades.add(jMenuItem11);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros  prestados.png"))); // NOI18N
        jMenuItem10.setText("Entregas Pendientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Utilidades.add(jMenuItem10);

        jMenuBar1.add(Utilidades);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_gear_1055051.png"))); // NOI18N
        jMenu3.setText("Gestion de biblioteca");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu3.add(jSeparator12);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios registrados.png"))); // NOI18N
        jMenu8.setText("Panel de usuarios");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jMenuItem13.setText("AGREGAR USUARIO");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem13);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jMenuItem15.setText("MODIFICAR USUARIO");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jMenuItem16.setText("BORRAR USUARIO");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caot.png"))); // NOI18N
        jMenuItem23.setText("USUARIOS REGISTRADOS");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem23);
        jMenu8.add(jSeparator17);

        jMenu3.add(jMenu8);
        jMenu3.add(jSeparator8);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenu7.setText("Panel de Alumnos");

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Login.png"))); // NOI18N
        jMenuItem17.setText("AGREGAR ALUMNO");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jMenu11.setText("MODIFICAR ALUMNO");

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduated.png"))); // NOI18N
        jMenu14.setText("TSU");

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letra m.png"))); // NOI18N
        jMenu16.setText("MATUTINO");

        jMenu19.setText("TRADICIONAL");

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem18.setText("Alumnos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem18);

        jMenu16.add(jMenu19);
        jMenu16.add(jSeparator21);

        jMenu20.setText("BIS");

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem19.setText("Alumnos");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem19);

        jMenu16.add(jMenu20);

        jMenu14.add(jMenu16);
        jMenu14.add(jSeparator20);

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/letra v.png"))); // NOI18N
        jMenu17.setText("VESPERTINO");
        jMenu14.add(jMenu17);

        jMenu11.add(jMenu14);
        jMenu11.add(jSeparator18);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduated1.png"))); // NOI18N
        jMenu15.setText("INGENIERIA");

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letra n.png"))); // NOI18N
        jMenu18.setText("NOCTURNO");
        jMenu15.add(jMenu18);

        jMenu11.add(jMenu15);

        jMenu7.add(jMenu11);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jMenuItem20.setText("BORRAR ALUMNO");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios registrados.png"))); // NOI18N
        jMenu13.setText("ALUMNOS REGISTRADOS");

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduated.png"))); // NOI18N
        jMenu9.setText("TSU");

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letra m.png"))); // NOI18N
        jMenu10.setText("MATUTINO");

        jMenu21.setText("TRADICIONAL");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem1.setText("Alumnos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem1);

        jMenu10.add(jMenu21);
        jMenu10.add(jSeparator3);

        jMenu22.setText("BIS");

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem21.setText("Alumnos");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem21);

        jMenu10.add(jMenu22);
        jMenu10.add(jSeparator4);

        jMenu9.add(jMenu10);
        jMenu9.add(jSeparator5);

        jMenu23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/letra v.png"))); // NOI18N
        jMenu23.setText("VESPERTINO");

        jMenu24.setText("TRADICIONAL");

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem22.setText("Alumnos");
        jMenu24.add(jMenuItem22);

        jMenu23.add(jMenu24);

        jMenu9.add(jMenu23);
        jMenu9.add(jSeparator6);

        jMenu13.add(jMenu9);
        jMenu13.add(jSeparator19);

        jMenu25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graduated1.png"))); // NOI18N
        jMenu25.setText("INGENIERIA");

        jMenu26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letra n.png"))); // NOI18N
        jMenu26.setText("NOCTURNO");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem5.setText("Alumnos");
        jMenu26.add(jMenuItem5);

        jMenu25.add(jMenu26);

        jMenu13.add(jMenu25);

        jMenu7.add(jMenu13);

        jMenu3.add(jMenu7);
        jMenu3.add(jSeparator9);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros disponibles.png"))); // NOI18N
        jMenuItem14.setText("Panel de libreria");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);
        jMenu3.add(jSeparator10);

        jMenuBar1.add(jMenu3);

        jMenu27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_provider_45019.png"))); // NOI18N
        jMenu27.setText("Proveedores");
        jMenu27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_provider_45069.png"))); // NOI18N
        jMenuItem2.setText("Agregar proveedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem2);

        jMenuBar1.add(jMenu27);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_lock_1991.png"))); // NOI18N
        jMenu2.setText("Bloqueo de pantalla");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ok.png"))); // NOI18N
        jMenuItem6.setText("Activar bloqueo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_window-system_299093.png"))); // NOI18N
        jMenu12.setText("Mantenimiento DB");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Update_984748.png"))); // NOI18N
        jMenuItem12.setText("Actualizar base de datos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem12);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_0_filled_71676.png"))); // NOI18N
        jMenuItem24.setText("Resetear base de datos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem24);

        jMenuBar1.add(jMenu12);

        jMenu28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Print_1493286.png"))); // NOI18N
        jMenu28.setText("Reportes");
        jMenu28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconpdf.png"))); // NOI18N
        jMenu6.setText("Reportes");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros disponibles.png"))); // NOI18N
        jMenuItem4.setText("Libros registrados");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumnos registrados.png"))); // NOI18N
        jMenuItem8.setText("Alumnos registrados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios registrados.png"))); // NOI18N
        jMenuItem9.setText("Usuarios registrados");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_provider_45069.png"))); // NOI18N
        jMenuItem7.setText("Proveedores registrados");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenu28.add(jMenu6);

        jMenuBar1.add(jMenu28);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/if_Info_Circle_Symbol_Information_Letter_1396823.png"))); // NOI18N
        jMenu4.setText("Informacion del sistema");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        SeccionAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cajafecha)
                        .addGap(49, 49, 49)
                        .addComponent(cod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajahora))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toogle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajahora)
                                    .addComponent(cod))
                                .addGap(5, 5, 5)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toogle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);//Regresa a la anterior ventana o la cierra
        JOptionPane.showMessageDialog(this, "Has cerrado sesion con exito", "CIERRE DE SESION", JOptionPane.INFORMATION_MESSAGE);
        Acceso acces = new Acceso(); //Llamar a la venta acceso
        acces.setVisible(true);
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void SeccionAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionAyudaActionPerformed
        // TODO add your handling code here:
                Informacion info = new Informacion();
                info.setLocationRelativeTo(null);
                info.setVisible(true);
    }//GEN-LAST:event_SeccionAyudaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Bloqueo bloquear = new Bloqueo();
        bloquear.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void BuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLibroActionPerformed
        // TODO add your handling code here:
        BuscadorLibros buscarlibros = new BuscadorLibros();
        buscarlibros.setVisible(true);
        buscarlibros.setLocationRelativeTo(null);
    }//GEN-LAST:event_BuscarLibroActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        EntregarPendiente dialog = new EntregarPendiente(); //Esta manda a la siguiente ventana que es la de No entregado
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Entregas dialog = new Entregas();//Manda a la ventana de Entregados
        dialog.setTitle("Capturador de entregas");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
       Consultas cc= new Consultas();
        Connection cn = cc.getConnection();

        //variables a guardar
        String nombre,num;
        String sql="";
        //cajas
     nombre =AgregarNombre.getText();
     num = AgregarNumero.getText();
    
  

        //obligatorios
        if(AgregarNumero.getText().equals("NUMERO")){
            JOptionPane.showMessageDialog(null,"INGRESE UN NUMERO!","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        if(AgregarNombre.getText().equals("NOMBRE")){
            JOptionPane.showMessageDialog(null,"INGRESE UN NOMBRE DEL AREA!","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //sentencia SQL

        sql="INSERT INTO telefonos(nombre,numero)VALUES(?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, nombre);
            psd.setString(2, num);
            
            int n=psd.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"NUMERO TELEFONICO GUARDADO!","CORRECTO",JOptionPane.PLAIN_MESSAGE);
            phones();
            AgregarNombre.setText("NOMBRE");
            AgregarNumero.setText("NUMERO");
            botonModificar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this,"ERROR AL REGISTRAR","ERROR",JOptionPane.ERROR_MESSAGE);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ESTE NUMERO YA SE ENCUENTRA ALMACENADO!","ERROR",JOptionPane.INFORMATION_MESSAGE);
            // Logger.getLogger(IngresoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
       Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE telefonos SET nombre='"+AgregarNombre.getText()
                +"',numero='"+AgregarNumero.getText()+"'WHERE numero='"+cod.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"ACTUALIZADO","CORRECTO",JOptionPane.PLAIN_MESSAGE);
           phones();
           cod.setText("ID");
           AgregarNombre.setText("NOMBRE");
           AgregarNumero.setText("NUMERO");
           botonModificar.setEnabled(false);
           botonEliminar.setEnabled(false);
           botonCancelar.setVisible(false);
           botonAgregar.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
       Consultas cc= new Consultas();
            Connection cn = cc.getConnection();

                try {
                    int a = JOptionPane.showConfirmDialog(this,"¿ESTA SEGURO?");
                    if(a==JOptionPane.YES_OPTION){
                        PreparedStatement pps= cn.prepareStatement("DELETE FROM telefonos WHERE Numero='"+cod.getText()+"'");
                        pps.executeUpdate();
                       

                        JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EQUIPO","CONFIRMACION",JOptionPane.PLAIN_MESSAGE);
                    phones();
                    cod.setText("ID");
                    AgregarNombre.setText("NOMBRE");
                    AgregarNumero.setText("NUMERO");
                    botonEliminar.setEnabled(false);
                    botonCancelar.setVisible(false);
                    botonModificar.setEnabled(false);
                    botonAgregar.setEnabled(true);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR NUMERO","ERROR",JOptionPane.INFORMATION_MESSAGE);
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Libros libros = new Libros();
        libros.setLocationRelativeTo(null);
        libros.setVisible(true);
        libros.requestFocus();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
                int fila = jTable1.getSelectedRow();
        
        if(fila >=0){
            AgregarNombre.setText(jTable1.getValueAt(fila, 0).toString());
            AgregarNumero.setText(jTable1.getValueAt(fila, 1).toString());
            cod.setText(jTable1.getValueAt(fila, 1).toString());
            botonAgregar.setEnabled(false);
            botonEliminar.setEnabled(true);
            botonModificar.setEnabled(true);
            botonCancelar.setVisible(true);
        }else{
            cod.setText("ID");
            botonAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
         AgregarNombre.setText("NOMBRE");
        AgregarNumero.setText("NUMERO");
        botonAgregar.setEnabled(true);
        botonEliminar.setEnabled(false);
        botonCancelar.setVisible(false);
        botonModificar.setEnabled(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        AgregarAlumnos agregar = new AgregarAlumnos();
        agregar.setLocationRelativeTo(null);
        agregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        EditarAlumnoTMT editar = new EditarAlumnoTMT();
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        EditarAlumnosTMB editar = new EditarAlumnosTMB();
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        BorrarAlumnos borrar = new BorrarAlumnos();
        borrar.setLocationRelativeTo(null);
        borrar.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AlumnosTMT cero = new AlumnosTMT();
        cero.setLocationRelativeTo(cero);
        cero.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        AlumnosTMB uno = new AlumnosTMB();
        uno.setLocationRelativeTo(null);
        uno.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        AgregarUsuario adduser = new AgregarUsuario();
        adduser.setLocationRelativeTo(null);
        adduser.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        EditarUsuario edituser = new EditarUsuario();
        edituser.setLocationRelativeTo(null);
        edituser.setVisible(true);
        edituser.requestFocus();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        BorrarUsuario borrar = new BorrarUsuario();
        borrar.setLocationRelativeTo(null);
        borrar.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        VerUsuarios todosUsuarios = new VerUsuarios();
        todosUsuarios.setLocationRelativeTo(null);
        todosUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void toogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toogleActionPerformed
        // TODO add your handling code here:
            if(toogle.isSelected()){
            toogle.setText("MOSTRAR");
            jList1.setVisible(false);
            toogle.setBackground(new java.awt.Color(240,240,240));}
        else{
            toogle.setText("OCULTAR");
            jList1.setVisible(true);
            toogle.setBackground(new java.awt.Color(240,240,240));}         
    }//GEN-LAST:event_toogleActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void capturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El libro es: "+titulo.getText()+"\nCategoria: "+CategoriaCap.getSelectedItem()+"\nNombre del alumno: "+nombre.getText()+"\nMatricula: "+matricula.getText()+"\nGrupo: "+grupo.getText()+"\nCapturó: "+Capturador.getText());        
        //Aqui mando a llamar a la clases Consultas y Conectar
        Consultas cc = new Consultas();
        Connection cn = cc.getConnection();
        //Variables a guardar
        //String fecha;
        int Matricula, idLibro;
        //Cajas donde agrege valor a la variables creadas :v
        Matricula = Integer.parseInt(matricula.getText());
        idLibro = Integer.parseInt(lblLibros.getText());
        String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes+ "-" + dia+" "+cajashora.getText());
        //fecha = cajafecha.getText()+" "+cajahora.getText();
        //Sentencia Sql
        String sql="INSERT INTO LibroAlumnos VALUES(?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setInt(1, Matricula);
            psd.setInt(2, idLibro);
            psd.setString(3, fecha);
            int n=psd.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"REGISTRO CORRECTO!","CORRECTO",JOptionPane.PLAIN_MESSAGE);
                //DEJAR EN BLANCO LOS JTEXTFIELD
                        titulo.setText(null);
        nombre.setText(null);
        matricula.setText(null);
        grupo.setText(null);
        cuatri.setText(null);
        turno.setText(null);
        modalidad.setText(null);
        CategoriaCap.setSelectedIndex(0);
        lblLibros.setText("ID-LIBROS");
        apellido.setText(null);

            }else{
                JOptionPane.showMessageDialog(this,"ERROR AL REGISTRAR","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ESTE ALUMNO YA SE ENCUENTRA REGISTRADO","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_capturarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        titulo.setText(null);
        nombre.setText(null);
        matricula.setText(null);
        grupo.setText(null);
        cuatri.setText(null);
        turno.setText(null);
        modalidad.setText(null);
        CategoriaCap.setSelectedIndex(0);
        nombre.setEditable(true);
        apellido.setEditable(true);
        grupo.setEditable(true);
        cuatri.setEditable(true);
        turno.setEditable(true);
        modalidad.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            String sql = "SELECT*FROM Alumnos WHERE Matricula= '"+matricula.getText()+"'";
            Consultas cc= new Consultas();
            Connection cn = cc.getConnection();
            try{
            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                nombre.setText(rs.getString("Nombre"));
                apellido.setText(rs.getString("Apellido"));
                grupo.setText(rs.getString("Grupo"));
                cuatri.setText(rs.getString("Cuatrimestre"));
                turno.setText(rs.getString("Turno"));
                modalidad.setText(rs.getString("Modalidad"));
                
                nombre.setEditable(false);
                apellido.setEditable(false);
                grupo.setEditable(false);
                cuatri.setEditable(false);
                turno.setEditable(false);
                modalidad.setEditable(false);
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "No se encontro ningun alumno");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(null,"CONFIRME SU CLAVE DE ADMINISTRADOR");
        verificacion(input); 
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "BASE DE DATOS ACTUALIZADA","ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Proveedor clientes = new Proveedor();
        clientes.setLocationRelativeTo(null);
        clientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        reportes.ReporteAlumnos();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        reportes.ReporteLibro();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        reportes.ReporteUsuarios();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        reportes.ReporteProveedor();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void tituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tituloKeyTyped
        // TODO add your handling code here:
         String sql = "SELECT * FROM libros WHERE nombre_libro= '"+titulo.getText()+"'";

 Consultas cc= new Consultas();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
  while(rs.next()){
        
            lblLibros.setText(rs.getString("IdLibros").toUpperCase());
            
  }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tituloKeyTyped

    void phones(){//MOSTRAR TELEFONOS REGISTRADOS
  String [] titulos ={"PROVEEDOR "," NUMERO"};
 String sql = "SELECT * FROM telefonos";


 model= new DefaultTableModel(null,titulos);
 Consultas cc= new Consultas();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("Nombre");
            fila[1] = rs.getString("Numero");
            
      model.addRow(fila);
       
  }
        jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void NombreUsuario(){ //CON ESTE VOID SE MUESTRA EL NOMBRE DEL USUARIO QUE INGRESO AL SISTEMA
 String sql = "SELECT * FROM usuarios WHERE usuario= '"+Acceso.user.getText()+"'";

 Consultas cc= new Consultas();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
  while(rs.next()){
        
            usuariodentro.setText(rs.getString("Nombre").toUpperCase());
            Capturador.setText(rs.getString("Nombre"));
            ficha.setText(rs.getString("idUsuarios"));
            
  }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void borrar(){//RESETEAR LA BASE DE DATOS
    int quest = JOptionPane.showConfirmDialog(null,"ESTA SEGURO DE REINICIAR SU BASE DE DATOS?\n LE RECUERDO QUE TODOS SUS DATOS ALMACENADO SERAN ELIMINADOS");
       if(quest == JOptionPane.YES_OPTION){
         Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
        String sql="DELETE FROM usuarios";
        String sqle="DELETE FROM alumnos";
        String sqld="DELETE FROM libros";
        String sqlf="DELETE FROM telefonos";
 try{
    PreparedStatement psd =cn.prepareStatement(sql);
    psd.executeUpdate(); 
    PreparedStatement pss=cn.prepareStatement(sqle);
    pss.executeUpdate();
    PreparedStatement pee=cn.prepareStatement(sqld);
    pee.executeUpdate();
    PreparedStatement pdd = cn.prepareStatement(sqlf);
    pdd.executeUpdate();
      JOptionPane.showMessageDialog(null,"BASE DE DATOS LIMPIA Y RESTABLECIDA ","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
      this.dispose();
      Acceso nn = new Acceso();
    nn.setVisible(true);
 }catch(Exception e){
     System.out.print(e);
 }
       }if(quest == JOptionPane.NO_OPTION){
           return;
       }
        
        
        
        }
void verificacion(String password){
    Connection conexion=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    //coneccion a base de datos y acceso al administrador
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
    consulta=conexion.createStatement();
    tabla=consulta.executeQuery("SELECT*FROM usuarios WHERE password='"+password+"'");
    if(tabla.next()){  
    JOptionPane.showMessageDialog(null,"ACCESO CONCEDIDO", "CLAVE",JOptionPane.INFORMATION_MESSAGE);
    borrar();
    }

    else{
    JOptionPane.showMessageDialog(null,"SU CLAVE NO ES DE ADMINISTRADOR","ERROR",JOptionPane.ERROR_MESSAGE);
return;

    }
    
}catch(ClassNotFoundException|SQLException e ){
JOptionPane.showMessageDialog(null,"BASE DE DATOS NO DISPONIBLE"+e,"ERROR",JOptionPane.INFORMATION_MESSAGE);

    
}
}    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgregarNombre;
    private javax.swing.JTextField AgregarNumero;
    private javax.swing.JMenuItem BuscarLibro;
    private javax.swing.JTextField Capturador;
    public static javax.swing.JComboBox<String> CategoriaCap;
    private javax.swing.JMenuItem SeccionAyuda;
    private javax.swing.JMenu Utilidades;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    public static javax.swing.JLabel cajafecha;
    public static javax.swing.JLabel cajahora;
    private javax.swing.JTextField cajashora;
    private javax.swing.JButton capturar;
    private javax.swing.JMenuItem cerrarsesion;
    private javax.swing.JLabel cod;
    private javax.swing.JTextField cuatri;
    private javax.swing.JLabel ficha;
    public static javax.swing.JTextField grupo;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdt;
    private javax.swing.JLabel lblLibros;
    public static javax.swing.JTextField matricula;
    private javax.swing.JTextField modalidad;
    public static javax.swing.JTextField nombre;
    private javax.swing.JLabel tipoUsuario;
    public static javax.swing.JTextField titulo;
    private javax.swing.JToggleButton toogle;
    private javax.swing.JTextField turno;
    private javax.swing.JLabel usuariodentro;
    // End of variables declaration//GEN-END:variables

}
