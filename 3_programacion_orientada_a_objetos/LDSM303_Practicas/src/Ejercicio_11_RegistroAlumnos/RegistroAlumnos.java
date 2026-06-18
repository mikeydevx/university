/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio_11_RegistroAlumnos;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Image; //imagenes
import java.awt.Toolkit; //imagenes
import javax.swing.ImageIcon; //imagenes.

/**
 *
 * @author mavel
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    reloj hilo1;

    Alumno[] datos = new Alumno[5];
    int i = 0;
    int total = 0;
    
    Image foto;
    

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName());

    /**
     * Creates new form RegistroAlumnos
     */
    public RegistroAlumnos() {
        initComponents();
        hilo1 = new reloj();
        hilo1.start();
        Limpiar();
    }

    public void Limpiar() {
        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextField3.setText(null);
        this.jTextField4.setText(null);
        this.jTextField5.setText(null);
        this.jTextField6.setText(null);
        this.jTextField7.setText(null);
        this.jTextField1.requestFocus();
    }

    public void guardar() {
        String matricula, nombre, pPaterno, pMaterno, grupo, carrera;
        int edad;

        matricula = this.jTextField1.getText();
        nombre = this.jTextField2.getText();
        pPaterno = this.jTextField3.getText();
        pMaterno = this.jTextField4.getText();
        grupo = this.jTextField5.getText();
        carrera = this.jTextField6.getText();
        edad = Integer.parseInt(this.jTextField7.getText());

        datos[i] = new Alumno(matricula, nombre, pPaterno, pMaterno, grupo, carrera, edad);
        foto = Toolkit.getDefaultToolkit().getImage("./src/personas/" + this.jTextField1.getText() + ".jpg");
        this.jLabel13.setIcon(new ImageIcon(foto.getScaledInstance(140, 140, 0)));
        i++;
        total = i;
        if (i>4){
            this.btnguardar.setVisible(false);
        }
    }

    public void primero(){
        if (total > 0) {
            i=0;
            mostrarDatos();
        }
        
    }
    
    public void ultimo(){
        if (total > 0) {
            i=total - 1;
            mostrarDatos();
        }
    }
    
    
    public void mostrarDatos(){
        
        this.jTextField1.setText(datos[i].getMatricula());
        this.jTextField2.setText(datos[i].getNombres());
        this.jTextField3.setText(datos[i].getPrimerApellido());
        this.jTextField4.setText(datos[i].getSegundoApellido());
        this.jTextField5.setText(datos[i].getGrupo());
        this.jTextField6.setText(datos[i].getCarrera());
        this.jTextField7.setText(String.valueOf(datos[i].getEdad()));
        foto = Toolkit.getDefaultToolkit().getImage("./src/personas/" + this.jTextField1.getText() + ".jpg");
        this.jLabel13.setIcon(new ImageIcon(foto.getScaledInstance(140, 140, 0)));
    }
    
    public void siguiente(){
        if (total == 0) {
            return;
        }
        i++;
     
        if (i>=total) {
            i = total - 1;
            mostrarDatos();
        }else{
            mostrarDatos();
        }
        
    }
    
    public void anterior(){
        if (total == 0) {
            return;
        }
        i--;
        if (i<0) {
            i=0;
            mostrarDatos();
        }else{
            mostrarDatos();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regeneprivate void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {                                         
       this.jLabel2.requestFocus();
    } rated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnterminar = new javax.swing.JButton();
        btnprimero = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btnsiguiente = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("R E G I S T R O  A L U M N O S");
        jLabel1.setBounds(240, 10, 370, 40);
        jPanel1.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha: ");
        jLabel2.setBounds(580, 10, 40, 16);
        jPanel1.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora: ");
        jLabel3.setBounds(580, 30, 40, 16);
        jPanel1.add(jLabel3);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        jLabel4.setBounds(640, 10, 80, 16);
        jPanel1.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        jLabel5.setBounds(640, 30, 80, 16);
        jPanel1.add(jLabel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A L U M N O S U T L", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });
        jTextField1.setBounds(140, 50, 280, 22);
        jPanel2.add(jTextField1);
        jTextField3.setBounds(140, 130, 280, 22);
        jPanel2.add(jTextField3);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        jTextField2.setBounds(140, 90, 280, 22);
        jPanel2.add(jTextField2);
        jTextField4.setBounds(140, 170, 280, 22);
        jPanel2.add(jTextField4);
        jTextField5.setBounds(140, 210, 280, 22);
        jPanel2.add(jTextField5);
        jTextField6.setBounds(140, 250, 280, 22);
        jPanel2.add(jTextField6);

        jLabel6.setText("Carrera");
        jLabel6.setBounds(70, 290, 50, 20);
        jPanel2.add(jLabel6);

        jLabel7.setText("Matricula: ");
        jLabel7.setBounds(70, 50, 70, 20);
        jPanel2.add(jLabel7);

        jLabel8.setText("Nombres: ");
        jLabel8.setBounds(70, 90, 70, 20);
        jPanel2.add(jLabel8);

        jLabel9.setText("A Paterno");
        jLabel9.setBounds(70, 130, 70, 20);
        jPanel2.add(jLabel9);

        jLabel10.setText("A Materno");
        jLabel10.setBounds(70, 170, 70, 20);
        jPanel2.add(jLabel10);

        jLabel11.setText("Grupo");
        jLabel11.setBounds(70, 250, 70, 20);
        jPanel2.add(jLabel11);
        jTextField7.setBounds(140, 290, 280, 22);
        jPanel2.add(jTextField7);

        jLabel12.setText("Edad");
        jLabel12.setBounds(70, 210, 70, 16);
        jPanel2.add(jLabel12);

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel13.setBounds(560, 110, 140, 140);
        jPanel2.add(jLabel13);

        btnnuevo.setText("Nuevo");
        btnnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnuevoMouseClicked(evt);
            }
        });
        btnnuevo.addActionListener(this::btnnuevoActionPerformed);
        btnnuevo.setBounds(450, 100, 90, 23);
        jPanel2.add(btnnuevo);

        btnguardar.setText("Guardar");
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.setBounds(450, 140, 90, 23);
        jPanel2.add(btnguardar);

        btnbuscar.setText("Buscar");
        btnbuscar.setBounds(450, 190, 90, 23);
        jPanel2.add(btnbuscar);

        btnterminar.setText("Terminar");
        btnterminar.setBounds(450, 240, 90, 23);
        jPanel2.add(btnterminar);

        btnprimero.setText("Primero");
        btnprimero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprimeroMouseClicked(evt);
            }
        });
        btnprimero.setBounds(60, 330, 80, 23);
        jPanel2.add(btnprimero);

        btnanterior.setText("Anterior");
        btnanterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnanteriorMouseClicked(evt);
            }
        });
        btnanterior.setBounds(150, 330, 90, 23);
        jPanel2.add(btnanterior);

        btnsiguiente.setText("Siguiente");
        btnsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseClicked(evt);
            }
        });
        btnsiguiente.setBounds(450, 330, 90, 23);
        jPanel2.add(btnsiguiente);

        btnultimo.setText("Ultimo");
        btnultimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnultimoMouseClicked(evt);
            }
        });
        btnultimo.setBounds(540, 330, 80, 23);
        jPanel2.add(btnultimo);

        jPanel2.setBounds(30, 60, 730, 370);
        jPanel1.add(jPanel2);

        jPanel1.setBounds(10, 10, 780, 440);
        getContentPane().add(jPanel1);

        setSize(820, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnnuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoMouseClicked
        Limpiar();
    }//GEN-LAST:event_btnnuevoMouseClicked

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
       
    }//GEN-LAST:event_jTextField1MouseEntered

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        this.guardar();
    }//GEN-LAST:event_btnguardarMouseClicked

    private void btnprimeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprimeroMouseClicked
        this.primero();
    }//GEN-LAST:event_btnprimeroMouseClicked

    private void btnanteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnanteriorMouseClicked
        this.anterior();
    }//GEN-LAST:event_btnanteriorMouseClicked

    private void btnsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseClicked
       this.siguiente();
    }//GEN-LAST:event_btnsiguienteMouseClicked

    private void btnultimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnultimoMouseClicked
        this.ultimo();
    }//GEN-LAST:event_btnultimoMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new RegistroAlumnos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnprimero;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JButton btnterminar;
    private javax.swing.JButton btnultimo;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    class reloj extends Thread {

        public void run() {
            while (true) {
                Date fecha = new Date();
                String formato = "hh:mm:ss";
                String formato2 = "dd-MM-yyyy";
                SimpleDateFormat ff = new SimpleDateFormat(formato2);
                SimpleDateFormat fh = new SimpleDateFormat(formato);
                jLabel4.setText(ff.format(fecha));
                jLabel5.setText(fh.format(fecha));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.getLogger(RegistroAlumnos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }
    }

}
