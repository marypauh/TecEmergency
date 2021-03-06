/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructura.Pacientes;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marip
 */
public class ConsAmarillo extends javax.swing.JFrame {
    public static Calendar horaSalida;
    public static int promedioA;
    public static int contadorA;
    int dato = ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getCantConsultoriosActivos();
    
    public ConsAmarillo() {
        contadorA = 0;
        promedioA = 0;
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero del consultorio");
        modelo.addColumn("Condicion del consultorio");
        for(int i = 1;i<=dato;i++){
            modelo.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[i].getEstado()});
        }
        tabla_amarillos.setModel(modelo);
    }
    public void actualizarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Numero del consultorio");
        modelo.addColumn("Condicion del consultorio");
        for(int i = 1;i<=dato;i++){
            modelo.addRow(new Object[]{i, ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[i].getEstado()});
        }
        tabla_amarillos.setModel(modelo);
        modelo.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_amarillos = new javax.swing.JTable();
        btnAtender = new javax.swing.JButton();
        btnLiberarAtender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Consultorios Amarillos");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 34, -1, -1));

        tabla_amarillos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_amarillos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 75, 509, 343));

        btnAtender.setBackground(new java.awt.Color(204, 0, 0));
        btnAtender.setForeground(new java.awt.Color(255, 255, 255));
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 434, -1, -1));

        btnLiberarAtender.setBackground(new java.awt.Color(204, 0, 0));
        btnLiberarAtender.setForeground(new java.awt.Color(255, 255, 255));
        btnLiberarAtender.setText("Liberar y Antender");
        btnLiberarAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarAtenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnLiberarAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 434, -1, -1));

        jLabel1.setText("Seleccione el consultorio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 438, -1, -1));

        Salir.setBackground(new java.awt.Color(204, 0, 0));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Cerrar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 434, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLiberarAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarAtenderActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabla_amarillos.getModel();
        int indice = tabla_amarillos.getSelectedRow();//para obtener la fila seleccionada
        indice++; //aumentamos en 1 por que el arreglo empieza en 0
        Pacientes sigPaciente = ServicioEmergencia.Filas.filaAmarilla.nextPaciente();
        if (ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].getEstado() == "Ocupado"){
            Pacientes pacienteEgresos = ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].getPacienteAtendiendo();
            ServicioEmergencia.Filas.filaEgresos.insertPaciente(pacienteEgresos);
            ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].aumentarAtendidos();
            JOptionPane.showMessageDialog(null, "Paciente " + pacienteEgresos.getFicha() + "ha pasado a la fila de Egresos");
            if (sigPaciente == null) {//falta ver como validar
                ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].setEstado("Libre");
                JOptionPane.showMessageDialog(null, "No hay más pacientes por atender");
            }else{
           //Hora Salida
                horaSalida = Calendar.getInstance();
		horaSalida.setTime(new Date());
              pacienteEgresos.setHoraSalida(horaSalida);
              System.out.println("Hora Salida" + horaSalida.getTime());
               
              //Cuenta el nuevo paciente
               contadorA++;
           
           //Duracion
           Calendar horaEntrada = pacienteEgresos.getHoraEntrada();
           System.out.println("Hora Entrada" + horaEntrada.getTime());
           
           int hora, minutos, segundos;
           hora = horaSalida.get(Calendar.HOUR)- horaEntrada.get(Calendar.HOUR);
           
           if (horaSalida.get(Calendar.MINUTE) < horaEntrada.get(Calendar.MINUTE)){
               hora = hora - 1;
             minutos = horaEntrada.get(Calendar.MINUTE) - horaSalida.get(Calendar.MINUTE);
          
           } else {
               minutos = horaSalida.get(Calendar.MINUTE) - horaEntrada.get(Calendar.MINUTE);
           }
               if (horaSalida.get(Calendar.SECOND) < horaEntrada.get(Calendar.SECOND) && minutos == 1){
                   minutos = 0;
                   segundos = horaSalida.get(Calendar.SECOND) - horaEntrada.get(Calendar.SECOND);
               } else {
                    segundos = horaSalida.get(Calendar.SECOND) - horaEntrada.get(Calendar.SECOND);
               }
               
               
               System.out.println("Hora:" +hora+ " minutos:" +minutos+ " segundos:" +segundos);
               
              minutos = minutos + (hora*60);
           
             int promedio = Math.abs(segundos);
              promedio = promedio + (minutos*60);
              System.out.println("Total: " + promedio);
              
              promedioA = promedioA + promedio;
           
               
                ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].atenderSigPaciente(sigPaciente);
                ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].setEstado("Ocupado");
                JOptionPane.showMessageDialog(null, "Atendiendo paciente " + sigPaciente.getFicha() + "en consultorio #" + indice );
        }
        }else{JOptionPane.showMessageDialog(null, "Presiona Atender" );}
        actualizarTabla();
    }//GEN-LAST:event_btnLiberarAtenderActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabla_amarillos.getModel();
        int indice = tabla_amarillos.getSelectedRow();//para obtener la fila seleccionada
        indice++;
        Pacientes paciente = ServicioEmergencia.Filas.filaAmarilla.nextPaciente();
        if ((paciente == null) || ( ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].getEstado() == "Ocupado")){//falta ver como validar
            JOptionPane.showMessageDialog(null, "No hay más pacientes por atender o el consultorio no esta libre");
        }else{
             //Hora Salida
                horaSalida = Calendar.getInstance();
		horaSalida.setTime(new Date());
              paciente.setHoraSalida(horaSalida);
              System.out.println("Hora Salida" + horaSalida.getTime());
               
              //Cuenta el nuevo paciente
               contadorA++;
           
           //Duracion
           Calendar horaEntrada = paciente.getHoraEntrada();
           System.out.println("Hora Entrada" + horaEntrada.getTime());
           
            int hora, minutos, segundos;
           hora = horaSalida.get(Calendar.HOUR)- horaEntrada.get(Calendar.HOUR);
           
           if (horaSalida.get(Calendar.MINUTE) < horaEntrada.get(Calendar.MINUTE)){
               hora = hora - 1;
             minutos = horaEntrada.get(Calendar.MINUTE) - horaSalida.get(Calendar.MINUTE);
          
           } else {
               minutos = horaSalida.get(Calendar.MINUTE) - horaEntrada.get(Calendar.MINUTE);
           }
               if (horaSalida.get(Calendar.SECOND) < horaEntrada.get(Calendar.SECOND) && minutos == 1){
                   minutos = 0;
                   segundos = horaSalida.get(Calendar.SECOND) - horaEntrada.get(Calendar.SECOND);
               } else {
                    segundos = horaSalida.get(Calendar.SECOND) - horaEntrada.get(Calendar.SECOND);
               }
               
               
               System.out.println("Hora" +hora+ " minutos:" +minutos+ " segundos:" +segundos);
               
              minutos = minutos + (hora*60);
           
             int promedio = Math.abs(segundos);
              promedio = promedio + (minutos*60);
              System.out.println("Total: " + promedio);
              
              promedioA = promedioA + promedio;
              
            ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].atenderSigPaciente(paciente);
            ServicioEmergencia.ServicioConsultorios.consultoriosAmarillos.getConsultorios()[indice].setEstado("Ocupado");
            JOptionPane.showMessageDialog(null, "Atendiendo paciente " + paciente.getFicha() + "en consultorio #" + indice );
        }
        actualizarTabla();
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnLiberarAtender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabla_amarillos;
    // End of variables declaration//GEN-END:variables
}
