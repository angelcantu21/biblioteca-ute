package Alumnos;

import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BorrarAlumnos extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public BorrarAlumnos() {
        initComponents();
        model.addColumn("MATRICULA");
        model.addColumn("PASSWORD");
        model.addColumn("NOMBRE");;
        model.addColumn("CUATRIMESTRE");
        model.addColumn("GRUPO");
        model.addColumn("MODALIDAD");
        model.addColumn("TURNO");
        this.tabladedatos.setModel(model);
    }
            Borrar borrar = new Borrar();
    String Item="";
    void eliminardetalles(){
     Consultas cc= new Consultas();
        Connection cn = cc.getConnection();
            try {
             
                    PreparedStatement pps= cn.prepareStatement("DELETE FROM usuarios WHERE idUsuarios='"+clave0.getText()+"'");
                    pps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(BorrarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
          void limpiaTablaC(){
  DefaultTableModel model=(DefaultTableModel)tabladedatos.getModel();
   while (model.getRowCount()>0){
       for(int i = 0; i<model.getRowCount();i++){
           model.removeRow(i); 
       }
    }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();
        btnMostrar0 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clave0 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        clave1 = new javax.swing.JLabel();
        btneliminar1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladedatos1 = new javax.swing.JTable();
        btnMostrar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        buscar1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        clave2 = new javax.swing.JLabel();
        btneliminar2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabladedatos2 = new javax.swing.JTable();
        btnMostrar2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buscar2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clave3 = new javax.swing.JLabel();
        btneliminar3 = new javax.swing.JComboBox<>();
        btnMostrar3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabladedatos3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        buscar3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        clave4 = new javax.swing.JLabel();
        btneliminar4 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabladedatos4 = new javax.swing.JTable();
        btnMostrar4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        buscar4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        clave5 = new javax.swing.JLabel();
        btneliminar5 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabladedatos5 = new javax.swing.JTable();
        btnMostrar5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        buscar5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BORRAR ALUMNOS");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BORRAR ALUMNO");

        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabladedatos);

        btnMostrar0.setText("MOSTRAR ALUMNOS");
        btnMostrar0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar0ActionPerformed(evt);
            }
        });

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setText("NO. FICHA:");

        clave0.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave0.setForeground(new java.awt.Color(0, 0, 255));
        clave0.setText("0");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setText("Buscar:");

        btneliminar.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clave0))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btneliminar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMostrar0)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clave0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar0)
                .addContainerGap())
        );

        jTabbedPane1.addTab("0", jPanel1);

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel3.setText("NO. FICHA:");

        clave1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave1.setForeground(new java.awt.Color(0, 0, 255));
        clave1.setText("0");

        btneliminar1.setBackground(new java.awt.Color(0, 0, 0));
        btneliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar1ActionPerformed(evt);
            }
        });

        tabladedatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatos1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabladedatos1);

        btnMostrar1.setText("MOSTRAR ALUMNOS");
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel9.setText("Buscar:");

        buscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btnMostrar1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clave1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clave1))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btneliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrar1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("1", jPanel2);

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel4.setText("NO. FICHA:");

        clave2.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave2.setForeground(new java.awt.Color(0, 0, 255));
        clave2.setText("0");

        btneliminar2.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar2ActionPerformed(evt);
            }
        });

        tabladedatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatos2MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabladedatos2);

        btnMostrar2.setText("MOSTRAR ALUMNOS");
        btnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel10.setText("Buscar:");

        buscar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(btnMostrar2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clave2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(clave2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btneliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnMostrar2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("2", jPanel3);

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("NO. FICHA:");

        clave3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave3.setForeground(new java.awt.Color(0, 0, 255));
        clave3.setText("0");

        btneliminar3.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar3ActionPerformed(evt);
            }
        });

        btnMostrar3.setText("MOSTRAR ALUMNOS");
        btnMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar3ActionPerformed(evt);
            }
        });

        tabladedatos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatos3MousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tabladedatos3);

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel11.setText("Buscar:");

        buscar3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(btnMostrar3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clave3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(clave3))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(buscar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btneliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("3", jPanel4);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setText("NO. FICHA:");

        clave4.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave4.setForeground(new java.awt.Color(0, 0, 255));
        clave4.setText("0");

        btneliminar4.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar4ActionPerformed(evt);
            }
        });

        tabladedatos4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatos4MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tabladedatos4);

        btnMostrar4.setText("MOSTRAR ALUMNOS");
        btnMostrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel12.setText("Buscar:");

        buscar4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(btnMostrar4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clave4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clave4))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(buscar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btneliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("4", jPanel5);

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel7.setText("NO. FICHA:");

        clave5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        clave5.setForeground(new java.awt.Color(0, 0, 255));
        clave5.setText("0");

        btneliminar5.setBackground(new java.awt.Color(255, 51, 51));
        btneliminar5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOSTRAR OPCIONES --------->", "ELIMINAR" }));
        btneliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar5ActionPerformed(evt);
            }
        });

        tabladedatos5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "CUATRIMESTRE", "GRUPO", "MODALIDAD"
            }
        ));
        tabladedatos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabladedatos5MousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(tabladedatos5);

        btnMostrar5.setText("MOSTRAR ALUMNOS");
        btnMostrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel13.setText("Buscar:");

        buscar5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(btnMostrar5))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clave5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(clave5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(buscar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btneliminar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnMostrar5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("5", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>

    private void btnMostrar0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos0("");
    }

    private void tabladedatosMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
                int fila = tabladedatos.getSelectedRow();
        if(fila>=0){
            clave0.setText(tabladedatos.getValueAt(fila, 0).toString());
        }
    }

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno();
    }

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos0(buscar.getText());
    }

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos1("");
    }

    private void tabladedatos1MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
       int fila = tabladedatos1.getSelectedRow();
        if(fila>=0){
            clave1.setText(tabladedatos1.getValueAt(fila, 0).toString());
        }
    }

    private void btneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno1();
    }

    private void buscar1KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos1(buscar1.getText());
    }

    private void btneliminar2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno2();
    }

    private void tabladedatos2MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
               int fila = tabladedatos2.getSelectedRow();
        if(fila>=0){
            clave2.setText(tabladedatos2.getValueAt(fila, 0).toString());
        }
    }

    private void btnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos2("");
    }

    private void buscar2KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos2(buscar2.getText());
    }

    private void btnMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos3("");
    }

    private void tabladedatos3MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int fila = tabladedatos3.getSelectedRow();
        if(fila>=0){
            clave3.setText(tabladedatos3.getValueAt(fila, 0).toString());
        }
    }

    private void btneliminar3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno3();
    }

    private void buscar3KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos3(buscar3.getText());
    }

    private void btnMostrar4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos4("");
    }

    private void tabladedatos4MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int fila = tabladedatos4.getSelectedRow();
        if(fila>=0){
            clave4.setText(tabladedatos4.getValueAt(fila, 0).toString());
        }
    }

    private void btneliminar4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno4();
    }

    private void buscar4KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos4(buscar4.getText());
    }

    private void btnMostrar5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos5("");
    }

    private void tabladedatos5MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int fila = tabladedatos5.getSelectedRow();
        if(fila>=0){
            clave5.setText(tabladedatos5.getValueAt(fila, 0).toString());
        }
    }

    private void btneliminar5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        borrar.BorrarAlumno5();
    }

    private void buscar5KeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        borrar.cargarAlumnos5(buscar5.getText());
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
            java.util.logging.Logger.getLogger(BorrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar0;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JButton btnMostrar2;
    private javax.swing.JButton btnMostrar3;
    private javax.swing.JButton btnMostrar4;
    private javax.swing.JButton btnMostrar5;
    public static javax.swing.JComboBox<String> btneliminar;
    public static javax.swing.JComboBox<String> btneliminar1;
    public static javax.swing.JComboBox<String> btneliminar2;
    public static javax.swing.JComboBox<String> btneliminar3;
    public static javax.swing.JComboBox<String> btneliminar4;
    public static javax.swing.JComboBox<String> btneliminar5;
    public static javax.swing.JTextField buscar;
    private javax.swing.JTextField buscar1;
    private javax.swing.JTextField buscar2;
    private javax.swing.JTextField buscar3;
    private javax.swing.JTextField buscar4;
    private javax.swing.JTextField buscar5;
    public static javax.swing.JLabel clave0;
    public static javax.swing.JLabel clave1;
    public static javax.swing.JLabel clave2;
    public static javax.swing.JLabel clave3;
    public static javax.swing.JLabel clave4;
    public static javax.swing.JLabel clave5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tabladedatos;
    public static javax.swing.JTable tabladedatos1;
    public static javax.swing.JTable tabladedatos2;
    public static javax.swing.JTable tabladedatos3;
    public static javax.swing.JTable tabladedatos4;
    public static javax.swing.JTable tabladedatos5;
    // End of variables declaration//GEN-END:variables
}
