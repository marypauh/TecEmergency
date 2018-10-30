/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructura.FilaPacientes;
import Estructura.ListaConsultorios;
import static Interfaz.Ingresos.FichasV;
import Interfaz.Inicio;
import modelo.enums.CategoriasEstructura;
import ServicioEmergencia.ServicioConsultorios;
import javax.swing.JOptionPane;

/**
 *
 * @author marip
 */
public class Administracion extends javax.swing.JFrame {
        int FichasV, FichasA, FichasR, PromedioA, PromedioV,PromedioR;
        double PromedioE;
        
    /**
     * Creates new form Principal
     */
    public Administracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //total pacientes
        FichasV = Ingresos.FichasV;
        FichasA = Ingresos.FichasA;
        FichasR = Ingresos.FichasR;
       
        lblVerdes.setText("" + FichasV);
        lblAmarillos.setText("" + FichasA);
        lblRojos.setText("" + FichasR);
        
        //Promedio Consultorios
        if (ConsAmarillo.contadorA != 0 ){
             PromedioA = ConsAmarillo.promedioA / ConsAmarillo.contadorA;
             lblPA.setText("" + PromedioA);
             
        } if (ConsRojo.contadorR != 0){
        PromedioR = ConsRojo.promedioR / ConsRojo.contadorR;
        lblPR.setText("" + PromedioR);
    
        } else if (ConsVerde.contadorV != 0){
        PromedioV = ConsVerde.promedioV / ConsVerde.contadorV;
        lblPV.setText("" + PromedioV);
        
        }
        
        
        //Tiempo Egresos
        if (Egresos.contadorE != 0){
        
            PromedioE = Egresos.promedioE / Egresos.contadorE;
            lblPE.setText("" + PromedioE);
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

        lblVerde = new javax.swing.JLabel();
        lblAmarillo = new javax.swing.JLabel();
        lblRojo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblRojos = new javax.swing.JLabel();
        lblV = new javax.swing.JLabel();
        lblVerdes = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblAmarillos = new javax.swing.JLabel();
        gf = new javax.swing.JLabel();
        gf1 = new javax.swing.JLabel();
        gf2 = new javax.swing.JLabel();
        lblPV = new javax.swing.JLabel();
        lblPR = new javax.swing.JLabel();
        gf3 = new javax.swing.JLabel();
        lblPA = new javax.swing.JLabel();
        lblPE = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        btnActivos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVerde.setText("Consultorios Verdes:");
        getContentPane().add(lblVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 40));

        lblAmarillo.setText("Consultorios Amarillos:");
        getContentPane().add(lblAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        lblRojo.setText("Consultorios Rojos:");
        getContentPane().add(lblRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        lblTitulo.setText("Administración");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel1.setText("Promedio Egresos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        lblR.setText("Total de pacientes Rojos:");
        getContentPane().add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        lblRojos.setText("0");
        getContentPane().add(lblRojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        lblV.setText("Total de pacientes Verdes:");
        getContentPane().add(lblV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lblVerdes.setText("0");
        getContentPane().add(lblVerdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 10, -1));

        lblA.setText("Total de pacientes Amarillos:");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        lblAmarillos.setText("0");
        getContentPane().add(lblAmarillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        gf.setText("Promedio Tiempo Espera:");
        getContentPane().add(gf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        gf1.setText("Promedio Tiempo Espera:");
        getContentPane().add(gf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        gf2.setText("Promedio Tiempo Espera:");
        getContentPane().add(gf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lblPV.setText("0");
        getContentPane().add(lblPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        lblPR.setText("0");
        getContentPane().add(lblPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        gf3.setText("Promedio Tiempo Espera:");
        getContentPane().add(gf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lblPA.setText("0");
        getContentPane().add(lblPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        lblPE.setText("0");
        getContentPane().add(lblPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        btnMenu.setBackground(new java.awt.Color(204, 0, 0));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnEstado.setBackground(new java.awt.Color(204, 0, 0));
        btnEstado.setForeground(new java.awt.Color(255, 255, 255));
        btnEstado.setText("Mostrar estado consultorios");
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        btnActivos.setBackground(new java.awt.Color(204, 0, 0));
        btnActivos.setForeground(new java.awt.Color(255, 255, 255));
        btnActivos.setText("Modificar consultorios activos");
        btnActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivosActionPerformed(evt);
            }
        });
        getContentPane().add(btnActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivosActionPerformed
         ModificarActivos activos = new ModificarActivos();
        activos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnActivosActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        MostrarEstado estado = new MostrarEstado();
        estado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstadoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivos;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel gf;
    private javax.swing.JLabel gf1;
    private javax.swing.JLabel gf2;
    private javax.swing.JLabel gf3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblAmarillo;
    private javax.swing.JLabel lblAmarillos;
    private javax.swing.JLabel lblPA;
    private javax.swing.JLabel lblPE;
    private javax.swing.JLabel lblPR;
    private javax.swing.JLabel lblPV;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblRojo;
    private javax.swing.JLabel lblRojos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblV;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JLabel lblVerdes;
    // End of variables declaration//GEN-END:variables
}
