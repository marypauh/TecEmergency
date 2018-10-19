package Estructura;

public class Pacientes {
    int prioridad;
    String ficha;
    String color;
    String padecimiento;
    
    public Pacientes(int prioridad,String ficha,String color, String padecimiento){
        this.prioridad = 0;
        this.ficha = ficha;
        this.color = color;
        this.padecimiento = padecimiento;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPadecimiento() {
        return padecimiento;
    }
    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public String getFicha() {
        return ficha;
    }
    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString(){
        return "Padecimiento:  " + prioridad+ " Ficha:  "+ ficha + "\t" ;
    }   
}
