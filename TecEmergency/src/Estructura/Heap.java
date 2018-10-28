/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.Arrays;

/**
 *
 * @author raquelrojas
 */
public class Heap {
    //La posición 0 del heap no se utiliza para mayor facilidad y usar la posicion como indice
    int currentHeapSize;//cantidad de pacientes
    final int maxSize = 101;//tamaño maximo que puede tener el heap
    Pacientes heap[] = new Pacientes[maxSize];//Declara el heap como arreglo de enteros
    
    public Heap(){
        Pacientes pacientenull = new Pacientes ("RI0","rojo","infarto",null,null);
        heap[0] = pacientenull; //se asigna un negativo por que 0 es un caso de prioridad.
    }
    public void insertarHeap(Pacientes pacienteinsert){
        int espacioLibre = ++currentHeapSize;
        while (heap[(espacioLibre/2)].prioridad > pacienteinsert.prioridad){
        heap[espacioLibre]= heap[(espacioLibre/2)];
        espacioLibre = (espacioLibre/2);
        } //compara con el padre
        heap[espacioLibre] = pacienteinsert;
        
    }
    @Override
    public String toString(){
        return Arrays.toString(heap) + " Tam: "+ currentHeapSize;
    }
    private boolean isEmpty(){
        if (currentHeapSize == 0){
           return true;
        }else{
            return false;
        }
    }
    public Pacientes getSiguiente(){
        if (this.isEmpty()){//esto debe mostrarse en un show dialog
        return null;
        }
        int min=heap[1].prioridad;
        Pacientes paciente = heap[1];
        heap[1]=heap[currentHeapSize];
        currentHeapSize--;
        hundir (1);
        return paciente;
        }
    
    private void hundir (int espacioLibre) {
        int hijo;
        boolean coloca=true;
        Pacientes tmp=heap[espacioLibre];
        while (espacioLibre*2<= currentHeapSize && coloca) {
            hijo=espacioLibre*2;
            if ((hijo!=currentHeapSize)&& (heap[hijo+1].prioridad< heap[hijo].prioridad)){ hijo++;}
            if (heap[hijo].prioridad < tmp.prioridad) { //compara con el hijo mas pequeño
            heap[espacioLibre]=heap[hijo];
            espacioLibre=hijo;
            } else {coloca=false;}
        }
        heap[espacioLibre] = tmp;// Después de comparar se asigna el valor que se hundia en el espacio libre resultante
    }
}
