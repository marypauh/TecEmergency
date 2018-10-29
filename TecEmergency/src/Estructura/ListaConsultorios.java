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
public class ListaConsultorios {
    String color;
    int cantTotalConsultorios;//cantidad de consultorios
    int cantConsultoriosActivos;//cantidad de consultorios activos. Debe ser menor o igual a cantTotalConsutorios
    final int maxSize = 101;//tamaño maximo que puede tener el array
    Consultorios consultorios[] = new Consultorios[maxSize];
    
    public ListaConsultorios(String color, int cantConsultorios){
        this.color = color;
        cantTotalConsultorios = cantConsultorios;
        cantConsultoriosActivos = cantTotalConsultorios;
        for (int i = 1; i <= cantTotalConsultorios; i++) {
            Consultorios consultorio = new Consultorios();
            consultorios[i] = consultorio;
        }
    }
    
    public void setCantConsultoriosActivos( int cantActivos) {
        //precondición. Los consultorios que se van a desactivar deben estar desocupados.
        if (cantActivos <= cantTotalConsultorios) {
            cantConsultoriosActivos = cantActivos;
        }
    }

    public Consultorios[] getConsultorios() {
        return consultorios;
    }

    public int getCantTotalConsultorios() {
        return cantTotalConsultorios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantConsultoriosActivos() {
        return cantConsultoriosActivos;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setCantTotalConsultorios(int cantTotalConsultorios) {
        this.cantTotalConsultorios = cantTotalConsultorios;
    }

    public void setConsultorios(Consultorios[] consultorios) {
        this.consultorios = consultorios;
    }
    
    
    @Override
    public String toString() {
        return "ListaConsultorios{" + "color=" + color + ", cantTotalConsultorios=" + cantTotalConsultorios + ", cantConsultoriosActivos=" + cantConsultoriosActivos + ", consultorios=" + consultorios + '}';
    }
    
    
    
    
}
