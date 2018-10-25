package Estructura;

import java.util.Date;

public class Pacientes {
    int prioridad;
    String ficha;
    String color;
    String padecimiento;
    Date horaEntrada;
    Date horaSalida;
    
    
    public Pacientes(String ficha,String color, String padecimiento, Date horaEntrada,  Date horaSalida){
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
     public Date getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Date getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString(){
        return "Prioridad  " + prioridad+ " Ficha:  "+ ficha + "\t" ;
    }
    public int setPrioridad(String color, String padecimiento){
        if(null != color)switch (color) {
            case "rojo":
                prioridad = 0;
                if("Infarto".equals(padecimiento)){
                    return prioridad +=0;
                }   if("Pérdida sangre por herida".equals(padecimiento)){
                    return prioridad +=1;
                }   if("Dolor estomacal ".equals(padecimiento)){
                    return prioridad +=2;
                }   if("Parto".equals(padecimiento)){
                    return prioridad +=3;
                }   if("Quebradura".equals(padecimiento)){
                    return prioridad +=4;
                }   if("Otro".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            case "amarillo":
                prioridad = 6;
                if("Infarto".equals(padecimiento)){
                    return prioridad += 0;
                }   if("Pérdida sangre por herida".equals(padecimiento)){
                    return prioridad +=1;
                }   if("Dolor estomacal ".equals(padecimiento)){
                    return prioridad +=2;
                }   if("Parto".equals(padecimiento)){
                    return prioridad +=3;
                }   if("Quebradura".equals(padecimiento)){
                    return prioridad +=4;
                }   if("Otro".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            case "verde":
                prioridad = 12;
                if("Infarto".equals(padecimiento)){
                    return prioridad;
                }   if("Pérdida sangre por herida".equals(padecimiento)){
                    return prioridad +=1;
                }   if("Dolor estomacal ".equals(padecimiento)){
                    return prioridad +=2;
                }   if("Parto".equals(padecimiento)){
                    return prioridad +=3;
                }   if("Quebradura".equals(padecimiento)){
                    return prioridad +=4;
                }   if("Otro".equals(padecimiento)){
                    return prioridad +=5;
                }   break;
            default:
                break;
        }
        return 0;
    }
}
