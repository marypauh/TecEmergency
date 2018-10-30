/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructura.Pacientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marip
 */
public class MostrarEstado extends javax.swing.JFrame {
        int datoVerde = ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.getCantTotalConsultorios();
        int datoAmarillo = ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getCantTotalConsultorios();
        int datoRojo = ServicioEmergencia.ServicioConsultorios.consultoriosRojos.getCantTotalConsultorios();
        
        
        

    /**
     * Creates new form MostrarEstado
     */
    public MostrarEstado() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero del consultorio");
        modelo.addColumn("Condicion del consultorio");
        modelo.addColumn("Activo o inactivo");
        modelo.addColumn("Cant Pacientes Atendidos");
        for(int i = 1;i<=datoVerde;i++){
            modelo.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.getConsultorios()[i].getEstado(), 
            ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.getConsultorios()[i].getActivo(),
             ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.getConsultorios()[i].getCantPacientesAtendidos()});
        }
        tableVerdes.setModel(modelo);
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Numero del consultorio");
        modelo1.addColumn("Condicion del consultorio");
        modelo1.addColumn("Activo o inactivo");
        modelo1.addColumn("Cantidad de Pacientes Atendidos");
        for(int i = 1;i<=datoAmarillo;i++){
            modelo1.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[i].getEstado(), 
            ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[i].getActivo(),
            ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[i].getCantPacientesAtendidos()});
        }
        tableAmarillos.setModel(modelo1);
        
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Numero del consultorio");
        modelo2.addColumn("Condicion del consultorio");
        modelo2.addColumn("Activo o inactivo");
        modelo2.addColumn("Cantidad de Pacientes Atendidos");
        for(int i = 1;i<=datoRojo;i++){
            modelo2.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosRojos.getConsultorios()[i].getEstado(), 
            ServicioEmergencia.ServicioConsultorios.consultoriosRojos.getConsultorios()[i].getActivo(),
            ServicioEmergencia.ServicioConsultorios.consultoriosRojos.getConsultorios()[i].getCantPacientesAtendidos()});
        }
        tableRojos.setModel(modelo2);
        
        String tipoV, tipoA, tipoR, tipoE;
        int cantidadV, cantidadA, cantidadR, cantidadE;
        
        tipoV = Principal.tipoV;
        tipoA = Principal.tipoA;
        tipoR = Principal.tipoR;
        tipoE = Principal.tipoE;
        
        lblTipoV.setText(tipoV);
        lblTipoA.setText(tipoA);
        lblTipoR.setText(tipoR);
        lblTipoE.setText(tipoE);
        
        cantidadV = Ingresos.FichasV;
        cantidadA = Ingresos.FichasA;
        cantidadR = Ingresos.FichasR;
        cantidadE = Egresos.contadorE;
        
        if (Ingresos.FichasV != 0){
            lblCV.setText(""+cantidadV);
        }
        if (Ingresos.FichasA != 0){
            lblCA.setText(""+cantidadA);
        }
        if (Ingresos.FichasR != 0){
            lblCR.setText(""+cantidadR);
        }
        if (Egresos.contadorE != 0){
            lblCE.setText(""+cantidadE);
        }
        
        //Fichas
        if (Ingresos.totalV != "") {
            txtFichasV.setText(Ingresos.totalV);
        }
        if (Ingresos.totalA != ""){
            txtFichasA.setText(Ingresos.totalA);
        }
        if (Ingresos.totalR != ""){
            txtFichasR.setText(Ingresos.totalR);
        }
        
        if ((ServicioEmergencia.Filas.filaRoja.nextFichaPaciente() == null)){
            lblSR.setText("No hay más pacientes por atender");
        } else {
            lblSR.setText(ServicioEmergencia.Filas.filaRoja.nextFichaPaciente());
        }
        if (ServicioEmergencia.Filas.filaAmarilla.nextFichaPaciente() == null){
            lblSA.setText("No hay más pacientes por atender");
        } else {
            lblSA.setText(ServicioEmergencia.Filas.filaAmarilla.nextFichaPaciente());
        }
        if (ServicioEmergencia.Filas.filaVerde.nextFichaPaciente() == null) {
            lblSV.setText("No hay más pacientes por atender");
        } else {
            lblSV.setText(ServicioEmergencia.Filas.filaVerde.nextFichaPaciente());
        }
        
        if ( ServicioEmergencia.Filas.filaEgresos.nextFichaPaciente() == null) {
            lblSE.setText("No hay más pacientes por atender");
        } else {
            lblSE.setText(ServicioEmergencia.Filas.filaVerde.nextFichaPaciente());
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableVerdes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAmarillos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTipoV = new javax.swing.JLabel();
        lblTipoA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCA = new javax.swing.JLabel();
        lblCV = new javax.swing.JLabel();
        lblCR = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSV = new javax.swing.JLabel();
        lblSA = new javax.swing.JLabel();
        lblSR = new javax.swing.JLabel();
        lblSE = new javax.swing.JLabel();
        lblTipoR = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTipoE = new javax.swing.JLabel();
        txtFichasR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFichasV = new javax.swing.JTextField();
        txtFichasA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRojos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableVerdes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableVerdes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 50, 389, 180));

        tableAmarillos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableAmarillos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 50, 387, 180));

        jLabel1.setText("Amarillos tipo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 21, -1, -1));

        jLabel2.setText("Verdes tipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 21, -1, -1));
        getContentPane().add(lblTipoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        getContentPane().add(lblTipoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel4.setText("Egresos tipo: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel5.setText("Cantidad de pacientes:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jLabel6.setText("Cantidad de pacientes:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel7.setText("Cantidad de pacientes:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        lblCA.setText("0");
        getContentPane().add(lblCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        lblCV.setText("0");
        getContentPane().add(lblCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lblCR.setText("0");
        getContentPane().add(lblCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, -1));

        jLabel3.setText("Rojos tipo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel8.setText("Cantidad de pacientes: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, 20));

        lblCE.setText("0");
        getContentPane().add(lblCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel9.setText("Siguiente cliente:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel10.setText("Siguiente cliente:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel11.setText("Siguiente cliente:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel12.setText("Siguiente cliente:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));
        getContentPane().add(lblSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));
        getContentPane().add(lblSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));
        getContentPane().add(lblSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));
        getContentPane().add(lblSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));
        getContentPane().add(lblTipoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));
        getContentPane().add(lblTipoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        txtFichasR.setEditable(false);
        txtFichasR.setText("No hay");
        getContentPane().add(txtFichasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 380, -1));

        jLabel13.setText("Fichas Rojas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));

        jLabel14.setText("Fichas Verdes");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        txtFichasV.setEditable(false);
        txtFichasV.setText("No hay");
        getContentPane().add(txtFichasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 380, -1));

        txtFichasA.setEditable(false);
        txtFichasA.setText("No hay");
        txtFichasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFichasAActionPerformed(evt);
            }
        });
        getContentPane().add(txtFichasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 380, -1));

        jLabel15.setText("Fichas Amarillas");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        tableRojos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableRojos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 389, 198));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Administracion menu = new Administracion();
        menu.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFichasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFichasAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFichasAActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCA;
    private javax.swing.JLabel lblCE;
    private javax.swing.JLabel lblCR;
    private javax.swing.JLabel lblCV;
    private javax.swing.JLabel lblSA;
    private javax.swing.JLabel lblSE;
    private javax.swing.JLabel lblSR;
    private javax.swing.JLabel lblSV;
    private javax.swing.JLabel lblTipoA;
    private javax.swing.JLabel lblTipoE;
    private javax.swing.JLabel lblTipoR;
    private javax.swing.JLabel lblTipoV;
    private javax.swing.JTable tableAmarillos;
    private javax.swing.JTable tableRojos;
    private javax.swing.JTable tableVerdes;
    private javax.swing.JTextField txtFichasA;
    private javax.swing.JTextField txtFichasR;
    private javax.swing.JTextField txtFichasV;
    // End of variables declaration//GEN-END:variables
}
