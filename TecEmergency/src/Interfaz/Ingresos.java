/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructura.ListaConsultorios;
import Estructura.Pacientes;
import ServicioEmergencia.Filas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import modelo.enums.CategoriasColor;
import modelo.enums.CategoriasPadecimientos;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author marip
 */
public class Ingresos extends javax.swing.JFrame {

    Date hora = new Date();
    public static int contadorP = 0;
    
    /**
     * Creates new form Ingresos
     */
    public Ingresos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblPadecimiento = new javax.swing.JLabel();
        ComboPadecimiento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblDetalle = new javax.swing.JLabel();
        txtDetalle = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERDE", "AMARILLO" }));
        getContentPane().add(ComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        lblPadecimiento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPadecimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblPadecimiento.setText("Padecimiento:");
        getContentPane().add(lblPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        ComboPadecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFARTO", "PERDIDADESANGREPORHERIDA", "PARTO", "DOLORESTOMACAL", "QUEBRADURA", "OTRO" }));
        getContentPane().add(ComboPadecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre completo:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 280, 30));

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha de Nacimiento:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblDetalle.setForeground(new java.awt.Color(255, 255, 255));
        lblDetalle.setText("Detalles del padecimiento:");
        getContentPane().add(lblDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        getContentPane().add(txtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 170, 30));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 240, 30));

        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Paciente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 530, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     //sendSMS();
     
     //Genera el numero random para ingreso emergencia
        Random rnd = new Random();
        Double random = rnd.nextDouble();
        System.out.println("Número aleatorio entre [0,1[ : "+ random);
        
          //Obtiene fecha y hora del sistema
                Calendar fecha1 = Calendar.getInstance();
		fecha1.setTime(new Date());
               Date horaEntrada = fecha1.getTime();
               System.out.println("Hora Entrada: " + horaEntrada);
     
       String nombre, fecha, telefono, detalle, color;
       String padecimiento;
       String ficha;
       CategoriasPadecimientos categoria;
       CategoriasColor color1;
       
       nombre = txtNombre.getText();
       fecha = txtFecha.getText();
       telefono = txtTelefono.getText();
       detalle = txtDetalle.getText();
       padecimiento = ComboPadecimiento.getSelectedItem().toString();
       categoria = CategoriasPadecimientos.valueOf(ComboPadecimiento.getSelectedItem().toString());
       color1 = CategoriasColor.valueOf(ComboTipo.getSelectedItem().toString());
       Ingresos.contadorP++;
       color = ComboTipo.getSelectedItem().toString();
       
       //System.out.print(padecimiento);
       //System.out.print(CategoriasColor.valueOf(ComboTipo.getSelectedItem()).toString());
               
        
        if (random > 0.25){
            ficha = color1.getCodigoCategoria() + "-" +categoria.getCodigoCategoria() + "-" + Ingresos.contadorP;
            Pacientes paciente = new Pacientes(ficha,color, padecimiento,horaEntrada, null);
            if (("VERDE").equals(color)){
                ServicioEmergencia.Filas.filaVerde.insertPaciente(paciente);
            }if (("AMARILLO").equals(color)){
                ServicioEmergencia.Filas.filaAmarilla.insertPaciente(paciente);
            }
            paciente.setFicha(ficha);
            JOptionPane.showMessageDialog(null, "El paciente ha sido ingresado exitosamente con la ficha " + ficha);
            
        }else{
            ficha = "R-" +categoria.getCodigoCategoria() + "-" + Ingresos.contadorP;
            Pacientes paciente = new Pacientes(ficha,color, padecimiento,horaEntrada, null);
            paciente.setColor("ROJO");
            paciente.setFicha(ficha);
            ServicioEmergencia.Filas.filaRoja.insertPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Por aleatoriedad, el paciente ha pasado de " + color + " a ROJO. con la ficha " + ficha);
        }
        //ServicioEmergencia.Sendsms.sendSMS(nombre + " se le ha asignado la ficha " + ficha, telefono);
        JOptionPane.showMessageDialog(null, "Se ha enviado un mensaje de texto con la ficha asignada");
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPadecimiento;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPadecimiento;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
