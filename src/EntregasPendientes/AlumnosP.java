package EntregasPendientes;

import conectarBD.Consultas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AlumnosP extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public AlumnosP() {
        initComponents();
        cargarAlumnos("");
        vacio();
    }

        void vacio(){
  if (this.talumnos.getRowCount() == 0 && this.talumnos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON LIBROS REGISTRADOS", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    void cargarAlumnos(String matricula){
        String [] titulos ={"MATRICULA","NOMBRE","LIBRO", "FECHA DE PEDIDO"}; //NOMBRES DE LA JTABLE
        String sql = "SELECT matricula, nombre, nombre_libro, fecha_pedido FROM libros, alumnos, libroAlumnos WHERE idAlumno = Matricula AND idLibro = idLibros AND matricula LIKE '%"+matricula+"%';"; //CONDICION SQL, HACE QUE BUSQUE CUALQUIER NOMBRE QUE EL USUARIO BUSQUE Y SE ENCUENTRE EN LA BASE DE DATOS

        model= new DefaultTableModel(null,titulos);
        Consultas cc= new Consultas(); //CONECCION A DB
        Connection cn = cc.getConnection(); //CONECCION A DB
        try {

            Statement   st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            String [] fila = new String[16];
            while(rs.next()){

                fila[0] = rs.getString("Matricula"); //COLUMNAS DE LA BASE DE DATOS
                fila[1] = rs.getString("nombre");  //COLUMNAS DE LA BASE DE DATOS
                fila[2] = rs.getString("NOMBRE_LIBRO"); //COLUMNAS DE LA BASE DE DATOS
                fila[3] = rs.getString("Fecha_pedido");
                model.addRow(fila);

            }
            talumnos.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnosP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        talumnos = new javax.swing.JTable();
        buscarLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);

        talumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(talumnos);

        buscarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarLibroKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarLibroKeyTyped
        // TODO add your handling code here:
        cargarAlumnos(buscarLibro.getText());
    }//GEN-LAST:event_buscarLibroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable talumnos;
    // End of variables declaration//GEN-END:variables
}
