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
public class Egresos extends javax.swing.JFrame {
    
    int dato = ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getCantTotalConsultorios();

    /**
     * Creates new form Egresos
     */
    public Egresos() {
       initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero del puesto de atencion");
        modelo.addColumn("Condicion del puesto de atención");
        for(int i = 1;i<=dato;i++){
            modelo.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[i].getEstado()});
        }
        tabla_egresos.setModel(modelo);
    }
    public void actualizarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero del consultorio");
        modelo.addColumn("Condicion del consultorio");
        initComponents();
        for(int i = 1;i<=dato;i++){
            modelo.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[i].getEstado()});
        }
        tabla_egresos.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEgresos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_egresos = new javax.swing.JTable();
        btnRelease = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEgresos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEgresos.setText("Egresos");

        tabla_egresos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_egresos);

        btnRelease.setText("Dar de alta");
        btnRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReleaseActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnAtender.setText("Atender ");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(lblEgresos))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAtender)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelease)
                        .addGap(42, 42, 42)
                        .addComponent(btnMenu)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblEgresos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelease)
                    .addComponent(btnMenu)
                    .addComponent(btnAtender))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabla_egresos.getModel();
        int indice = tabla_egresos.getSelectedRow();//para obtener la fila seleccionada
        indice++;
        Pacientes paciente = ServicioEmergencia.Filas.filaEgresos.nextPaciente();
        if (paciente == null){//falta ver como validar
            JOptionPane.showMessageDialog(null, "No hay más pacientes por atender");
        }else{
            //hacer hora salida
            //duracion
            ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[indice].atenderSigPaciente(paciente);
            ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[indice].setEstado("Ocupado");
            JOptionPane.showMessageDialog(null, "Atendiendo paciente " + paciente.getFicha() + "en puesto de atención #" + indice );
        }
        actualizarTabla();
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReleaseActionPerformed
        int indice = tabla_egresos.getSelectedRow();//para obtener la fila seleccionada
        indice++;
        Pacientes pacienteAlta = ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[indice].getPacienteAtendiendo();
        if (pacienteAlta == null){//falta ver como validar
            JOptionPane.showMessageDialog(null, "No hay pacientes en ese puesto de atención");
        }else{
            Pacientes paciente = ServicioEmergencia.Filas.filaEgresos.nextPaciente();
            ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[indice].atenderSigPaciente(paciente);
            ServicioEmergencia.ServicioConsultorios.consultoriosEgresos.getConsultorios()[indice].setEstado("Ocupado");
            JOptionPane.showMessageDialog(null, "Encuesta de servicio para le paciente " + pacienteAlta.getFicha());
        }
        actualizarTabla();
    }//GEN-LAST:event_btnReleaseActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRelease;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEgresos;
    private javax.swing.JTable tabla_egresos;
    // End of variables declaration//GEN-END:variables
}
