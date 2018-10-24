package Estructura;

import java.text.DateFormat;

public class Pacientes {
    int prioridad;
    String ficha;
    String color;
    String padecimiento;
    DateFormat horaEntrada;
    DateFormat horaSalida;
    
    
    public Pacientes(String ficha,String color, String padecimiento, DateFormat horaEntrada,  DateFormat horaSalida){
        this.prioridad = setPrioridad(color, padecimiento);
        this.ficha = ficha;
        this.color = color;
        this.padecimiento = padecimiento;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
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
     public DateFormat getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(DateFormat horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public DateFormat getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(DateFormat horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString(){
        return "Prioridad  " + prioridad+ " Ficha:  "+ ficha + "\t" ;
    }
    public int setPrioridad(String color, String padecimiento){
        if("rojo".equals(color)){
            prioridad = 0;
            if("Infarto".equals(padecimiento)){
            return prioridad +=0;
            }
            if("Pérdida sangre por herida".equals(padecimiento)){
            return prioridad +=1;
            }
            if("Dolor estomacal ".equals(padecimiento)){
            return prioridad +=2;
            }
            if("Parto".equals(padecimiento)){
            return prioridad +=3;
            }
            if("Quebradura".equals(padecimiento)){
            return prioridad +=4;
            }
            if("Otro".equals(padecimiento)){
            return prioridad +=5;
            }
        }
        else if("amarillo".equals(color)){
            prioridad = 6; 
            if("Infarto".equals(padecimiento)){
            return prioridad += 0;
            }
            if("Pérdida sangre por herida".equals(padecimiento)){
            return prioridad +=1;
            }
            if("Dolor estomacal ".equals(padecimiento)){
            return prioridad +=2;
            }
            if("Parto".equals(padecimiento)){
            return prioridad +=3;
            }
            if("Quebradura".equals(padecimiento)){
            return prioridad +=4;
            }
            if("Otro".equals(padecimiento)){
            return prioridad +=5;
            }
        }
        else if("verde".equals(color)){
            prioridad = 12; 
            if("Infarto".equals(padecimiento)){
            return prioridad;
            }
            if("Pérdida sangre por herida".equals(padecimiento)){
            return prioridad +=1;
            }
            if("Dolor estomacal ".equals(padecimiento)){
            return prioridad +=2;
            }
            if("Parto".equals(padecimiento)){
            return prioridad +=3;
            }
            if("Quebradura".equals(padecimiento)){
            return prioridad +=4;
            }
            if("Otro".equals(padecimiento)){
            return prioridad +=5;
            }
        }
        return 0;
    }
}
