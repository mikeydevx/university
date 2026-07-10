/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Conferencia;
import modelo.Conferencista;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import datos.conexionmysql;

/**
 *
 * @author mavel
 */
public class Conferencias extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Conferencias.class.getName());
    DefaultComboBoxModel miCombo;
    DefaultTableModel miTabla;
    conexionmysql cm;
    Connection c;
    Statement t;
    ResultSet r;

    /**
     * Creates new form Conferencias
     */
    public Conferencias() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        cm = new conexionmysql();
        cm.Conexion("proyecto_ldsm303");
        selectConferencista();
        configurarTabla();
        llenarTabla();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    public void selectConferencista() throws SQLException {
        cm.getConnection();
        c = cm.getConnection();
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        this.cmbconferencista.setModel(new DefaultComboBoxModel());
        miCombo = (DefaultComboBoxModel) this.cmbconferencista.getModel();
        String sql = "SELECT Nombre FROM conferencistas";
        r = t.executeQuery(sql);
        r.beforeFirst();
        while (r.next()) {
            miCombo.addElement(r.getString(1));
        }
        this.cmbconferencista.setModel(miCombo);
    }

    public void llenarTabla() throws SQLException {
    c = cm.getConnection();
    t = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    String sql = "Select conferencia.IdConferencia, conferencia.Titulo, conferencia.Ubicacion, conferencia.Fecha, conferencia.Hora, conferencistas.Nombre"
            + " FROM conferencia inner join conferencistas on(conferencia.IdConferencista=conferencistas.IdConferencista)";
    r = t.executeQuery(sql);
    r.beforeFirst();
    miTabla.setRowCount(0);
    while (r.next()) {
        miTabla = (DefaultTableModel) this.jTable1.getModel();
        Object[] datos = {r.getString(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getString(6)};
        miTabla.addRow(datos);
        this.jTable1.setModel(miTabla);
    }
}

    public void configurarTabla() {
        miTabla = new DefaultTableModel();
        this.jTable1.getModel();
        miTabla.addColumn("ID CONFERENCIA");
        miTabla.addColumn("TITULO");
        miTabla.addColumn("UBICACION");
        miTabla.addColumn("FECHA");
        miTabla.addColumn("HORA");
        miTabla.addColumn("NOMBRE CONFERENCISTA");
        this.jTable1.setModel(miTabla);
    }
    
   
    
    public void registrarConferencia(Conferencia conf) throws SQLException{
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "INSERT INTO conferencia (IdConferencia, Titulo, Fecha, Hora, Ubicacion, IdConferencista) VALUES ('"
        + conf.getIdConferencia() + "', '" 
        + conf.getTitulo() + "', '" 
        + conf.getFecha() + "', '" 
        + conf.getHora() + "', '" 
        + conf.getUbicacion() + "', '" 
        + conf.getIdConferencista() + "')";
        t.executeUpdate(sql);
    }
    
    public void eliminarConferencia(String id) throws SQLException{
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "DELETE FROM conferencia WHERE IdConferencia = '" + id + "'";
        t.executeUpdate(sql);
    }
    
    public void editarConferencia(Conferencia conf) throws SQLException {
    t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    String sql = "UPDATE conferencia SET "
            + "Titulo='" + conf.getTitulo() + "', "
            + "Fecha='" + conf.getFecha() + "', "
            + "Hora='" + conf.getHora() + "', "
            + "Ubicacion='" + conf.getUbicacion() + "', "
            + "IdConferencista='" + conf.getIdConferencista() + "' "
            + "WHERE IdConferencia='" + conf.getIdConferencia() + "'";
    t.executeUpdate(sql);
}
    
    public void selectTabla() throws SQLException{
        int i = this.jTable1.getSelectedRow();
        String x = (String) miTabla.getValueAt(i, 0);
        String sql = "SELECT * FROM conferencia WHERE IdConferencia='" + x + "'";
        t = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r = t.executeQuery(sql);
        r.first();
        mostrarUno();
    }
   
    public void mostrarUno() throws SQLException{
        txtidconferencia.setText(r.getString(1));
        txttitulo.setText(r.getString(2));
        txtubicacion.setText(r.getString(5));
        txtfecha.setText(r.getString(3));
        txthora.setText(r.getString(4));   
    }

    public void borrarCajas(){
        txtidconferencia.setText(null);
        txttitulo.setText(null);
        txtubicacion.setText(null);
        txtfecha.setText(null);
        txthora.setText(null);
    }
    
    public String obtenerConferencista(String nombre) throws SQLException{
        Statement stTemp = c.createStatement();
        
        String sql = "SELECT IdConferencista FROM conferencistas WHERE Nombre = '" + 
                nombre + "'";
        
        ResultSet rsTemp = stTemp.executeQuery(sql);
        
        if (rsTemp.next()) {
            return rsTemp.getString(1);
        }
        return null; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidconferencia = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtubicacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbconferencista = new javax.swing.JComboBox<>();
        btnnueva = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnmostrartodo = new javax.swing.JButton();
        txtfecha = new javax.swing.JFormattedTextField();
        txthora = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de conferencias");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRO DE CONFERENCIAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("ID conferencia: ");

        jLabel3.setText("Titulo conferencia: ");

        jLabel4.setText("Ubicacion: ");

        jLabel5.setText("Fecha: ");

        jLabel6.setText("Hora");

        jLabel7.setText("Conferencista");

        cmbconferencista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbconferencista.addActionListener(this::cmbconferencistaActionPerformed);

        btnnueva.setText("Nueva");
        btnnueva.addActionListener(this::btnnuevaActionPerformed);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(this::btnagregarActionPerformed);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(this::btneliminarActionPerformed);

        jLabel8.setText("jLabel8");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(this::btnactualizarActionPerformed);

        btnmostrartodo.setText("Mostrar Todo");
        btnmostrartodo.addActionListener(this::btnmostrartodoActionPerformed);

        try {
            txtfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txthora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txthora))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfecha))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtidconferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txttitulo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtubicacion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmostrartodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbconferencista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidconferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnueva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnactualizar)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnmostrartodo)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbconferencista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 520, 250));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 520, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String id = txtidconferencia.getText();
        try { 
            eliminarConferencia(id);
            llenarTabla();
            borrarCajas();
        } catch (SQLException ex) {
            System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void cmbconferencistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbconferencistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbconferencistaActionPerformed

    private void btnnuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaActionPerformed
        borrarCajas();
    }//GEN-LAST:event_btnnuevaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            selectTabla();
        } catch (SQLException ex) {
            System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    String IdConferencia = txtidconferencia.getText();
    String titulo = txttitulo.getText();
    String ubicacion = txtubicacion.getText();
    String fecha = txtfecha.getText();
    String hora = txthora.getText();
    String nombreConferencista = (String) cmbconferencista.getSelectedItem();
      
        try {
            String idConferencista = obtenerConferencista(nombreConferencista);
            Conferencia conf = new Conferencia(IdConferencia, titulo, fecha, hora, ubicacion, idConferencista);
            editarConferencia(conf);
            llenarTabla();
            borrarCajas();
        } catch (SQLException ex) {
            System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnmostrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartodoActionPerformed
     try {
        llenarTabla(); // Vuelve a consultar y recargar la lista de la base de datos
        borrarCajas(); // Limpia todos los campos de texto
    } catch (SQLException ex) {
        System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
    }
    }//GEN-LAST:event_btnmostrartodoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
      String IdConferencia, titulo, ubicacion, fecha, hora, nombreConferencista; 
      
      IdConferencia = txtidconferencia.getText();
      titulo = txttitulo.getText();
      ubicacion = txtubicacion.getText();
      fecha = txtfecha.getText();
      hora= txthora.getText();
      nombreConferencista = (String) cmbconferencista.getSelectedItem();
      
        try {
            String idConferencista = obtenerConferencista(nombreConferencista);
            Conferencia conf = new Conferencia(IdConferencia, titulo, fecha, hora, ubicacion, idConferencista);
            registrarConferencia(conf);
            llenarTabla();
            borrarCajas();
        } catch (SQLException ex) {
            System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
      
      
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Conferencias().setVisible(true);
            } catch (SQLException ex) {
                System.getLogger(Conferencias.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmostrartodo;
    private javax.swing.JButton btnnueva;
    private javax.swing.JComboBox<String> cmbconferencista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JFormattedTextField txthora;
    private javax.swing.JTextField txtidconferencia;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtubicacion;
    // End of variables declaration//GEN-END:variables
}
