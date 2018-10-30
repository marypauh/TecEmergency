/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author raquelrojas
 */
public class Consultorios {
    String estado, activo;
    Pacientes pacienteAtendiendo;
    int cantPacientesAtendidos;

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    
    public Consultorios() {
        estado = "Libre";
        activo = "Activo";
    }
    public void aumentarAtendidos(){
    cantPacientesAtendidos++;
    }

    public String getEstado() {
        return estado;
    }

    public Pacientes getPacienteAtentiendo() {
        return pacienteAtendiendo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPacienteAtentiendo(Pacientes pacienteAtentiendo) {
        this.pacienteAtendiendo = pacienteAtentiendo;
    }
    
    public Pacientes atenderSigPaciente(Pacientes sigPaciente) {
        Pacientes temPacienteAtendiendo = pacienteAtendiendo;
        pacienteAtendiendo = sigPaciente;
        return temPacienteAtendiendo;
    }

    public Pacientes getPacienteAtendiendo() {
        return pacienteAtendiendo;
    }

    public int getCantPacientesAtendidos() {
        return cantPacientesAtendidos;
    }

    public void setPacienteAtendiendo(Pacientes pacienteAtendiendo) {
        this.pacienteAtendiendo = pacienteAtendiendo;
    }

    public void setCantPacientesAtendidos(int cantPacientesAtendidos) {
        this.cantPacientesAtendidos = cantPacientesAtendidos;
    }
    
    
    

}
 