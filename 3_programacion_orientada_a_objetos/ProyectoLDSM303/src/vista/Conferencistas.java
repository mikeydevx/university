/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.table.DefaultTableModel;
import datos.conexionmysql;
import datos.ScriptSQL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conferencista;

/**
 *
 * @author mavel
 */
public class Conferencistas extends javax.swing.JFrame {

    DefaultTableModel MiTabla;
    conexionmysql cm;
    ScriptSQL sq;
    Connection c;
    Statement t;
    ResultSet r;
    Conferencista conf;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Conferencista.class.getName());

    /**
     * Creates new form Conferencista
     */
    public Conferencistas() throws SQLException {
        initComponents();
        configurarTabla();
        setLocationRelativeTo(null);
        configurarTabla();
        cm = new conexionmysql();
        sq = new ScriptSQL();
        cm.Conexion("proyecto_ldsm303");
        this.llenarTabla();
        this.mostrarUno();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }
    
    public void limpiar() {
        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextArea1.setText(null);
        this.jTextField1.requestFocus();

    }

    public void crearConferencista() {
        String idconfe, nombre, cv;
        idconfe = jTextField1.getText();
        nombre = jTextField2.getText();
        cv = jTextArea1.getText();
        conf = new Conferencista(idconfe, nombre, cv);
    }

    public void actualizaObjeto() throws SQLException{
        String Id, No, CV;
        Id=this.jTextField1.getText();
        No=this.jTextField2.getText();
        CV=this.jTextArea1.getText();
        conf=new Conferencista(Id, No, CV);
        actualizaBase(conf);
    }
    
    public void actualizaBase(Conferencista conf) throws SQLException {
        String sql = "UPDATE Conferencistas set IdConferencista='" + conf.getIdConferencista() + "',"
                + "Nombre='" + conf.getNombre() + "', CV='" + conf.getCV() + "' where IdConferencista='"
                + conf.getIdConferencista() + "'";
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        t.executeUpdate(sql);
        configurarTabla();
        this.llenarTabla();
        this.mostrarUno();
        this.mostrarDatos();
    }
    
    public void selectTabla() throws SQLException {
        int i = this.jTable1.getSelectedRow();
        System.out.println(i);
        String x = (String) MiTabla.getValueAt(i, 0);
        System.out.println(x);
        String sql = "Select * from conferencistas Where IdConferencista='" + x + "'";
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r = t.executeQuery(sql);
        r.first();
        mostrarDatos();
    }

    public void eliminar(String id) throws SQLException {
        String sql = "Delete from conferencistas where IdConferencista='" + id + "'";
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        t.executeUpdate(sql);
        configurarTabla();
        this.llenarTabla();
        this.mostrarUno();
        this.mostrarDatos();
    }

    public void insertar(Conferencista conf) throws SQLException {
        String sql = "INSERT INTO conferencistas(IdConferencista, Nombre, cv)"
                + "values('" + conf.getIdConferencista() + "','"
                + conf.getNombre() + "','" + conf.getCV() + "')";
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        t.executeUpdate(sql);
        configurarTabla();
        this.llenarTabla();
        this.mostrarUno();
        this.mostrarDatos();

    }

    public void mostrarUno() throws SQLException {
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "Select * from conferencistas";
        r = t.executeQuery(sql);
        r.first();
        mostrarDatos();

    }

    public void mostrarDatos() throws SQLException {
        this.jTextField1.setText(r.getString(1));
        this.jTextField2.setText(r.getString(2));
        this.jTextArea1.setText(r.getString(3));
    }

    public void llenarTabla() throws SQLException {
        c = cm.getConnection();
        t = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "Select * from conferencistas";
        r = t.executeQuery(sql);
        r.beforeFirst();
        while (r.next()) {
            MiTabla = (DefaultTableModel) this.jTable1.getModel();
            Object[] datos = {r.getString(1), r.getString(2), r.getString(3)};
            MiTabla.addRow(datos);
            this.jTable1.setModel(MiTabla);
        }
    }

    public void configurarTabla() {
        MiTabla = new DefaultTableModel();
        this.jTable1.getModel();
        MiTabla.addColumn("CLAVE");
        MiTabla.addColumn("NOMBRE");
        MiTabla.addColumn("CURRICULUM");
        this.jTable1.setModel(MiTabla);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnnuevo = new javax.swing.JButton();
        btninsertar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btntodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 510, 150));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UTL A LA VANGUARDIA EN IoT - REGISTRO DE CONFERENCISTAS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 10, 580, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID_CONFERENCISTA: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setText("Nombre de conferencista: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        jLabel4.setText("Curriculum");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 200, 160));

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(this::btnnuevoActionPerformed);
        jPanel2.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(this::btninsertarActionPerformed);
        jPanel2.add(btninsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(this::btnactualizarActionPerformed);
        jPanel2.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        btntodos.setText("MOSTRAR TODOS");
        btntodos.addActionListener(this::btntodosActionPerformed);
        jPanel2.add(btntodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 520, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntodosActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiar();

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        try {
            this.crearConferencista();
            this.insertar(conf);
        } catch (SQLException ex) {
            System.getLogger(Conferencistas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
            this.actualizaObjeto();
        } catch (SQLException ex) {
            System.getLogger(Conferencistas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            this.eliminar(this.jTextField1.getText());
        } catch (SQLException ex) {
            System.getLogger(Conferencistas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try {
            this.selectTabla();
        } catch (SQLException ex) {
            System.getLogger(Conferencistas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

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
                new Conferencistas().setVisible(true);
            } catch (SQLException ex) {
                System.getLogger(Conferencista.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btntodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
