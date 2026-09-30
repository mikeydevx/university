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
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.ImageIcon;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mavel
 */
public class Principal extends javax.swing.JFrame {
    reloj hilo1;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    DefaultComboBoxModel miCombo;
    DefaultTableModel miTabla;
    conexionmysql cm;
    Connection c;
    Statement t;
    ResultSet r;
    String idc;
    /**
     * Creates new form Principal
     */
    public Principal() throws SQLException {
        initComponents();
        hilo1 = new reloj();
        hilo1.start();
        this.setDefaultCloseOperation(
        javax.swing.WindowConstants.DISPOSE_ON_CLOSE
        );
        cm = new conexionmysql();
        cm.Conexion("proyecto_ldsm303");
        this.setLocationRelativeTo(null);
        selectConferencia();
        llenarCampos();
        configurarTabla();
    }
    
    public void graficaDeBarras() throws SQLException, MalformedURLException{
        String cadena = "https://quickchart.io/chart?cht=bvs&chs=360x480&chtt=Asistencia&chl=";
        t=null; 
        t=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT conferencia.Titulo, count(registros.IdConferencia) AS total "
                + "FROM registros INNER JOIN conferencia "
                + "ON registros.IdConferencia = conferencia.IdConferencia "
                + "GROUP BY conferencia.IdConferencia, conferencia.Titulo";
        r= t.executeQuery(sql);
        r.first();
        String titulo1, tc1, titulo2 = "", tc2 = "0";
        titulo1=r.getString(1);
        tc1= r.getString(2);
        if (r.next()) {
            titulo2=r.getString(1);
            tc2= r.getString(2);
        }
        titulo1 = URLEncoder.encode(titulo1, StandardCharsets.UTF_8);
        titulo2 = URLEncoder.encode(titulo2, StandardCharsets.UTF_8);
        cadena = cadena + titulo1 + "%7C" + titulo2;
        cadena = cadena + "&chxt=y&chd=t:" + tc1 + "," + tc2;
        jLabel1.setIcon(new ImageIcon(new URL(cadena)));
        
    }   

    public void graficaDePastel() throws SQLException, MalformedURLException{
        String cadena = "https://quickchart.io/chart?cht=p&chs=360x480&chtt=Asistencia&chl=";
        t=null;
        t=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT conferencia.Titulo, count(registros.IdConferencia) AS total "
                + "FROM registros INNER JOIN conferencia "
                + "ON registros.IdConferencia = conferencia.IdConferencia "
                + "GROUP BY conferencia.IdConferencia, conferencia.Titulo";
        r= t.executeQuery(sql);
        r.first();
        String titulo1, tc1, titulo2 = "", tc2 = "0";
        titulo1=r.getString(1);
        tc1= r.getString(2);
        if (r.next()) {
            titulo2=r.getString(1);
            tc2= r.getString(2);
        }
        titulo1 = URLEncoder.encode(titulo1, StandardCharsets.UTF_8);
        titulo2 = URLEncoder.encode(titulo2, StandardCharsets.UTF_8);
        cadena = cadena + titulo1 + "%7C" + titulo2;
        cadena = cadena + "&chd=t:" + tc1 + "," + tc2;
        jLabel1.setIcon(new ImageIcon(new URL(cadena)));
    }
    
     public void configurarTabla() {
        miTabla = new DefaultTableModel();
        this.jTable1.getModel();
        miTabla.addColumn("MATRICULA");
        miTabla.addColumn("NOMBRE ALUMNO");
        miTabla.addColumn("GRUPO");
        this.jTable1.setModel(miTabla);
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

    
    public void asistencia(String matricula) throws SQLException, MalformedURLException{
        if (matricula.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresa una matricula");
            return;
        }
        t = null;
        t= c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql= "SELECT alumno.Matricula, alumno.Nombre, alumno.Grupo from alumno WHERE Matricula ='" + matricula + "'";
        r = t.executeQuery(sql);
        if (!r.first()) {
            javax.swing.JOptionPane.showMessageDialog(this, "La matricula no existe");
            return;
        }
        miTabla = (DefaultTableModel) this.jTable1.getModel();
        Object[] datos = {r.getString(1), r.getString(2), r.getString(3)};
        miTabla.addRow(datos);
        this.jTable1.setModel(miTabla);
        
        String titulo = cmbconferencias.getSelectedItem().toString();
        Statement stTemp = c.createStatement();
        ResultSet rsTemp = stTemp.executeQuery("SELECT IdConferencia FROM conferencia WHERE Titulo='" + titulo + "'");
        String idConferencia = "";
        if (rsTemp.next()) {
            idConferencia = rsTemp.getString(1);
        }
        
        
        t = null;
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql2 = "INSERT INTO registros (Matricula, IdConferencia) VALUES ('" 
                + matricula + "', '" + idConferencia + "')";
        t.executeUpdate(sql2);
        javax.swing.JOptionPane.showMessageDialog(this, "Asistencia registrada");
        this.graficaDeBarras();
    }
    
    
    public void selectConferencia() throws SQLException {
        cm.getConnection();
        c = cm.getConnection();
        Statement tCombo;
        ResultSet rCombo;
        tCombo = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        this.cmbconferencias.setModel(new DefaultComboBoxModel());
        miCombo = (DefaultComboBoxModel) this.cmbconferencias.getModel();
        String sql = "SELECT Titulo FROM conferencia";
        rCombo = tCombo.executeQuery(sql);
        rCombo.beforeFirst();
        while (rCombo.next()) {
            miCombo.addElement(rCombo.getString(1));
            System.out.println("DEBUG: Cargada conferencia -> " + rCombo.getString(1));
        }
        this.cmbconferencias.setModel(miCombo);
    }
    
    public void llenarCampos() throws SQLException{
        if (cmbconferencias.getSelectedItem() == null) {
            return;
        }
        String titulo = cmbconferencias.getSelectedItem().toString(); 
        t = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT conferencia.Titulo, conferencia.Fecha, conferencia.Hora, conferencistas.Nombre, conferencia.Ubicacion "
                + "FROM conferencia "
                + "INNER JOIN conferencistas ON conferencia.IdConferencista = conferencistas.IdConferencista "
                + "WHERE conferencia.Titulo = '" + titulo + "'";
        r = t.executeQuery(sql);
        
        if (r.next()) {
            jLabelTitulo.setText(r.getString(1));
            jLabelFecha.setText(r.getString(2));
            jLabelHora.setText(r.getString(3));
            jLabelConferencista.setText(r.getString(4));
            jLabel12.setText(r.getString(5));
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelConferencista = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        cmbconferencias = new javax.swing.JComboBox<>();
        btnbarras = new javax.swing.JButton();
        btnpastel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblHoraActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UTL A LA VANGUARDIA EN TECNOLOGIA IoT");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Seleccionar conferencia");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Titulo: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabelTitulo.setText("jLabel4");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Fecha: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Hora:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabelFecha.setText("jLabel7");
        jLabelFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, -1));

        jLabelHora.setText("jLabel8");
        jLabelHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Conferencista");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabelConferencista.setText("jLabel10");
        jLabelConferencista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelConferencista, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ubicacion");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 120, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 360));

        jLabel13.setText("Registro de participante: ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        txtmatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatriculaKeyReleased(evt);
            }
        });
        jPanel2.add(txtmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 270, 30));

        cmbconferencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbconferencias.addActionListener(this::cmbconferenciasActionPerformed);
        jPanel2.add(cmbconferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        btnbarras.setText("Grafica barras");
        btnbarras.addActionListener(this::btnbarrasActionPerformed);
        jPanel2.add(btnbarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        btnpastel.setText("Grafica pastel");
        btnpastel.addActionListener(this::btnpastelActionPerformed);
        jPanel2.add(btnpastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 820, 480));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 320, 470));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 340, 480));

        lblFechaActual.setText("Fecha:");
        jPanel1.add(lblFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 110, 20));

        lblHoraActual.setText("Hora:");
        jPanel1.add(lblHoraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculaKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                this.asistencia(txtmatricula.getText());
                this.txtmatricula.setText(null);
                this.txtmatricula.requestFocus();
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo registrar la asistencia");
                System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (MalformedURLException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo cargar la grafica");
                System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }//GEN-LAST:event_txtmatriculaKeyReleased

    private void btnbarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbarrasActionPerformed
        try {
            this.graficaDeBarras();
           
        } catch (SQLException ex) {
            System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (MalformedURLException ex) {
            System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnbarrasActionPerformed

    private void btnpastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpastelActionPerformed
        try {
            this.graficaDePastel();
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo generar la grafica de pastel");
            System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (MalformedURLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo cargar la grafica de pastel");
            System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnpastelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void cmbconferenciasActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            llenarCampos();
        } catch (SQLException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
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
                new Principal().setVisible(true);
            } catch (SQLException ex) {
                System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbarras;
    private javax.swing.JButton btnpastel;
    private javax.swing.JComboBox<String> cmbconferencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConferencista;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblHoraActual;
    private javax.swing.JTextField txtmatricula;
    // End of variables declaration//GEN-END:variables

    class reloj extends Thread {
        public void run() {
            while (true) {
                Date fecha = new Date();
                String formato = "hh:mm:ss";
                String formato2 = "dd-MM-yyyy";
                SimpleDateFormat ff = new SimpleDateFormat(formato2);
                SimpleDateFormat fh = new SimpleDateFormat(formato);
                lblFechaActual.setText("Fecha: " + ff.format(fecha));
                lblHoraActual.setText("Hora: " + fh.format(fecha));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }
    }
}
