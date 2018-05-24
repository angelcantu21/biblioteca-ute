package BuscadorDeLibros;

import java.awt.Color;
import javax.swing.JOptionPane;

public class BuscadorLibros extends javax.swing.JFrame {

 
    public BuscadorLibros() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscador de libros - Biblioteca UTE - TICSI");
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Java", "Android", "PHP", "Base de datos", "C++", "Ingenieria en Software", "Linux", ".NET", "Redes", "Diseño de sistemas", "Seguridad Informatica", "Auditoria", "C#", "JavaScript", "HTML", "HTML 5", "CSS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 55));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jDesktopPane1))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        // TODO add your handling code here:
                        int fila = jList1.getSelectedIndex();
        if(fila >=0){
            if (fila == 0) {
                Java form = new Java();
            jDesktopPane1.add(form);
            try {
            form.setMaximum(true);
            } catch (Exception e) {
            }

            form.toFront();
            form.setVisible(true);
            this.setLocationRelativeTo(null);
            } 
            if (fila == 1) {
                Android android = new Android();
                jDesktopPane1.add(android);
                try {
                android.setMaximum(true);
                } catch (Exception e) {
                }
                android.toFront();
                android.setVisible(true);
                this.setLocationRelativeTo(null); 
            }
            if (fila == 2) {
                PHP php = new PHP();
                jDesktopPane1.add(php);
                try {
                php.setMaximum(true);
                } catch (Exception e) {
                }
                php.toFront();
                php.setVisible(true);
                this.setLocationRelativeTo(null); 
            }
            if (fila == 3) {
                BaseDD mysql = new BaseDD();
                jDesktopPane1.add(mysql);
                try {
                mysql.setMaximum(true);
                } catch (Exception e) {
                }
                mysql.toFront();
                mysql.setVisible(true);
                this.setLocationRelativeTo(null);                 
            }
            if (fila == 4) {
                Cmas c = new Cmas();
                jDesktopPane1.add(c);
                try {
                c.setMaximum(true);
                } catch (Exception e) {
                }
                c.toFront();
                c.setVisible(true);
                this.setLocationRelativeTo(null); 
            }
            if (fila == 5) {
                IngenieraSoftware ing = new IngenieraSoftware();
                jDesktopPane1.add(ing);
                try {
                ing.setMaximum(true);
                } catch (Exception e) {
                }
                ing.toFront();
                ing.setVisible(true);
                this.setLocationRelativeTo(null);
            }
            if (fila == 6) {
                
            }
            if (fila == 7) {
                
            }
            if (fila == 8) {
                
            }
            if (fila == 9) {
                
            }
            if (fila == 10) {
                
            }
            if (fila == 11) {
                
            }
            if (fila == 12) {
                
            }
            if (fila == 13) {
                
            }
            if (fila == 14) {
                
            }
            if (fila == 15) {
                
            }
            if (fila == 16) {
                
            }
            if (fila == 17) {
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Elementos no encontradros");
        }
    }//GEN-LAST:event_jList1MousePressed

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
            java.util.logging.Logger.getLogger(BuscadorLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscadorLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscadorLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscadorLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscadorLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
