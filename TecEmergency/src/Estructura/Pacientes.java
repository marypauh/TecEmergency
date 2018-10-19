package Estructura;

public class Pacientes {
    String prioridad;
    String ficha;
    
    public Pacientes(String prioridad,String ficha){
        this.prioridad = prioridad;
        this.ficha = ficha;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public String getFicha() {
        return ficha;
    }
    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return "Padecimiento:  " + prioridad+ " Ficha:  "+ ficha + "\t" ;
    }
    
}
