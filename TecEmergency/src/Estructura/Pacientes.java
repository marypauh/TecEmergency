package Estructura;

import java.util.Calendar;
import java.util.Date;

public class Pacientes {
    int prioridad;
    String ficha;
    String color;
    String padecimiento;
    Calendar horaEntrada;
    Calendar horaSalida;
    
    
    public Pacientes(String ficha,String color, String padecimiento, Calendar horaEntrada,  Calendar horaSalida){
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
     public Calendar getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(Calendar horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Calendar getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString(){
        return "Prioridad  " + prioridad+ " Ficha:  "+ ficha + "\t" ;
    }
    public int setPrioridad(String color, String padecimiento){
        if(null != color)switch (color) {
            case "ROJO":
                prioridad = 0;
                if("INFARTO".equals(padecimiento)){
                    return prioridad +=0;
                }   if("PERDIDADESANGREPORHERIDA".equals(padecimiento)){
                    return prioridad +=1;
                }   if("DOLORESTOMACAL".equals(padecimiento)){
                    return prioridad +=2;
                }   if("PARTO".equals(padecimiento)){
                    return prioridad +=3;
                }   if("QUEBRADURA".equals(padecimiento)){
                    return prioridad +=4;
                }   if("OTRO".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            case "AMARILLO":
                prioridad = 6;
                if("INFARTO".equals(padecimiento)){
                    return prioridad += 0;
                }   if("PERDIDADESANGREPORHERIDA".equals(padecimiento)){
                    return prioridad +=1;
                }   if("DOLORESTOMACAL".equals(padecimiento)){
                    return prioridad +=2;
                }   if("PARTO".equals(padecimiento)){
                    return prioridad +=3;
                }   if("QUEBRADURA".equals(padecimiento)){
                    return prioridad +=4;
                }   if("OTRO".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            case "VERDE":
                prioridad = 12;
                if("INFARTO".equals(padecimiento)){
                    return prioridad;
                }   if("PERDIDADESANGREPORHERIDA".equals(padecimiento)){
                    return prioridad +=1;
                }   if("DOLORESTOMACAL".equals(padecimiento)){
                    return prioridad +=2;
                }   if("PARTO".equals(padecimiento)){
                    return prioridad +=3;
                }   if("QUEBRADURA".equals(padecimiento)){
                    return prioridad +=4;
                }   if("OTRO".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            default:
                break;
        }
        return 0;
    }
}
