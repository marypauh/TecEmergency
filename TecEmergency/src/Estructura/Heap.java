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
    int heap[] = new int[maxSize];//Declara el heap como arreglo de enteros
    
    public Heap(){
        heap[0] = -1; //se asigna un negativo por que 0 es un caso de prioridad.
    }
    public void insertarHeap(int nuevoNum){
        int espacioLibre = ++currentHeapSize;
        while (heap[(espacioLibre/2)] > nuevoNum){
        heap[espacioLibre]= heap[(espacioLibre/2)];
        espacioLibre = (espacioLibre/2);
        } //compara con el padre
        heap[espacioLibre] = nuevoNum;
        
    }
    public void print(){
    System.out.println(Arrays.toString(heap));
    System.out.println(currentHeapSize);}
    
    private boolean isEmpty(){
        if (currentHeapSize == 0){
           return true;
        }else{
            return false;
        }
    }
    public int getSiguiente(){
        if (this.isEmpty()){
        System.out.println("No hay más pacientes en heap");//esto debe mostrarse en un show dialog
        return 0;
        }
        int min=heap[1];
        heap[1]=heap[currentHeapSize];
        currentHeapSize--;
        hundir (1);
        return min;
        }
    
    private void hundir (int espacioLibre) {
        int hijo;
        boolean coloca=true;
        int tmp=heap[espacioLibre];
        while (espacioLibre*2<= currentHeapSize && coloca) {
            hijo=espacioLibre*2;
            if ((hijo!=currentHeapSize)&& (heap[hijo+1] < heap[hijo])){ hijo++;}
            if (heap[hijo] < tmp) { //compara con el hijo mas pequeño
            heap[espacioLibre]=heap[hijo];
            espacioLibre=hijo;
            } else {coloca=false;}
        }
        heap[espacioLibre]=tmp;// Después de comparar se asigna el valor que se hundia en el espacio libre resultante
    }
}
