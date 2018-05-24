package BuscadorDeLibros;

import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BaseDD extends javax.swing.JInternalFrame {
    DefaultTableModel model = new DefaultTableModel();
    
    public BaseDD() {
        initComponents();
        cargarLibros("");
        vacio();
    }
    void vacio(){
  if (this.tabladedatos.getRowCount() == 0 && this.tabladedatos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON LIBROS REGISTRADOS", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    void cargarLibros(String nombrelibro){   //CONECTA A DB PARA CARGAR USUARIOS LO QUE ESTA ADENTRO DEL PARENTESIS ES EL NOMBRE DEL USUARIO     
   String [] titulos ={"ID_LIBROS","TITULO","GENERO"}; //NOMBRES DE LA JTABLE 
 String sql = "SELECT * FROM libros WHERE Genero = 'Base de datos' AND nombre_libro LIKE '%"+nombrelibro+"%'"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS


 model= new DefaultTableModel(null,titulos);
 Consultas cc= new Consultas(); //CONECCION A DB
 Connection cn = cc.getConnection(); //CONECCION A DB
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("idLibros"); //COLUMNAS DE LA BASE DE DATOS
            fila[1] = rs.getString("Nombre_libro"); //COLUMNAS DE LA BASE DE DATOS
            fila[2] = rs.getString("Genero");  //COLUMNAS DE LA BASE DE DATOS
            model.addRow(fila);
       
  }
        tabladedatos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Java.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscarLibro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladedatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        buscarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarLibroKeyTyped(evt);
            }
        });

        tabladedatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabladedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.LIBRO", "Titulo", "Genero", "Autor", "Editorial", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladedatos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabladedatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(buscarLibro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarLibroKeyTyped
        // TODO add your handling code here:
        cargarLibros(buscarLibro.getText());
    }//GEN-LAST:event_buscarLibroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladedatos;
    // End of variables declaration//GEN-END:variables
}
