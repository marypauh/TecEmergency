/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author marip
 */
public class ModificarActivos extends javax.swing.JFrame {

    /**
     * Creates new form ModificarActivos
     */
    public ModificarActivos() {
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

        lblVerde = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        txtAmarillos = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtVerdes = new javax.swing.JTextField();
        txtRojos = new javax.swing.JTextField();
        txtEgresos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVerde.setText("Verdes");
        getContentPane().add(lblVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 63, -1, -1));

        lbl.setText("Amarillos");
        getContentPane().add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 98, -1, -1));

        lbl1.setText("Rojos");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 142, -1, -1));
        getContentPane().add(txtAmarillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 95, 57, -1));

        btnContinuar.setBackground(new java.awt.Color(204, 0, 0));
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 225, -1, -1));

        btnMenu.setBackground(new java.awt.Color(204, 0, 0));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setMnemonic('M');
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 225, -1, -1));

        lbl2.setText("Egresos");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 186, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtVerdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 61, -1));
        jPanel1.add(txtRojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 60, -1));
        jPanel1.add(txtEgresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 52, -1));

        jLabel1.setText("Consultorios/Puestos de atención que quedarán activos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        JOptionPane.showMessageDialog(null, "Se liberarán todos los pacientes en los consultorios a desactivar");
        if (this.txtVerdes.getText().isEmpty() == false) {
           int verdes = Integer.parseInt(txtVerdes.getText());
            if (verdes <= ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.getCantTotalConsultorios()){
                ServicioEmergencia.ServicioConsultorios.consultoriosVerdes.setCantConsultoriosActivos(verdes);
                JOptionPane.showMessageDialog(null, "Se han desactivado exitosamente los consultorios Verdes");
            }else{JOptionPane.showMessageDialog(null, "La cantidad de consultorios verdes que quedaran activos no puede ser mayor a las cantidad"
                    + "total de consultorios");}
       if (this.txtAmarillos.getText().isEmpty() == false) {
           int amarillos = Integer.parseInt(txtAmarillos.getText());
            if (amarillos <= ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getCantTotalConsultorios()){
                ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.setCantConsultoriosActivos(amarillos);
                 JOptionPane.showMessageDialog(null, "Se han desactivado exitosamente los consultorios Amarillos");
            }else{JOptionPane.showMessageDialog(null, "La cantidad de consultorios amarillos que quedaran activos no puede ser mayor a las cantidad"
                    + " total de consultorios");}
            
        } if (this.txtRojos.getText().isEmpty() == false ) {
            int rojo = Integer.parseInt(txtRojos.getText());
            if (rojo <= ServicioEmergencia.ServicioConsultorios.consultoriosRojos.getCantTotalConsultorios()){
                ServicioEmergencia.ServicioConsultorios.consultoriosRojos.setCantConsultoriosActivos(rojo);
                 JOptionPane.showMessageDialog(null, "Se han desactivado exitosamente los consultorios Rojos");
            }else{JOptionPane.showMessageDialog(null, "La cantidad de consultorios rojos que quedaran activos no puede ser mayor a las cantidad"
                    + "total de consultorios");}
        }
        } else if (this.txtEgresos.getText().isEmpty() == false){
            if (Integer.parseInt(txtEgresos.getText()) <= ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getCantTotalConsultorios()){
                ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.setCantConsultoriosActivos(Integer.parseInt(txtEgresos.getText()));
                 JOptionPane.showMessageDialog(null, "Se han desactivado exitosamente los puestos de Egresos");
            }else{JOptionPane.showMessageDialog(null, "La cantidad de puestos de atencion que quedaran activos no puede ser mayor a las cantidad"
                    + "total de consultorios");}
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Administracion menu = new Administracion();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JTextField txtAmarillos;
    private javax.swing.JTextField txtEgresos;
    private javax.swing.JTextField txtRojos;
    private javax.swing.JTextField txtVerdes;
    // End of variables declaration//GEN-END:variables
}
