/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioEmergencia;

import Estructura.Pacientes;
import java.util.Arrays;
import Estructura.Consultorios;

/**
 *
 * @author raquelrojas
 */
public class ServicioConsultorios {
    //La posición 0 del heap no se utiliza para mayor facilidad y usar la posicion como indice
    int cantConsultorios;//cantidad de pacientes
    final int maxSize = 101;//tamaño maximo que puede tener el array
    Consultorios array[] = new Consultorios[maxSize];//Declara el heap como arreglo de enteros
    
    public ServicioConsultorios(){
        Consultorios consultorio0 = new Consultorios();
        array[0] = consultorio0; //se asigna un negativo por que 0 es un caso de prioridad.
    }
    public void crearConsultorios(int newCant){
        int pos = 0;
        while (newCant != 0){
            array[pos] = new Consultorios();
            pos++;
            newCant--;
            cantConsultorios++;
        }
    }
    public boolean esPosibleEliminar(int newCant){
        if (newCant > cantConsultorios){
            return false;
        }else{
            cantConsultorios = cantConsultorios - newCant;
            return true;
        }
    }
}