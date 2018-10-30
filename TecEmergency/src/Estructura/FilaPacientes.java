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
public class FilaPacientes {
    String tipoDeFila;//H de heap o C de cola
    Heap heap;
    ColadePrioridad cola;
    
    public FilaPacientes(String tipoDeFila){
        this.tipoDeFila = tipoDeFila;
        if ("HEAP".equals(tipoDeFila)){
            heap = new Heap();
        }else{
            cola = new ColadePrioridad();
        }
    }
    
    public void insertPaciente(Pacientes paciente){
        if ("HEAP".equals(tipoDeFila)){
            heap.insertarHeap(paciente);//si es null la fila se acaba
        }else{
            cola.enqueue(paciente);
            ColadePrioridad.bubbleSort(cola);
        }
    }
    
    public Pacientes nextPaciente(){
        if ("HEAP".equals(tipoDeFila)){
            return heap.getSiguiente();
        }else{
            return cola.dequeue();//revisar si retorna el paceinte correcto
        }
    }
    
    public String nextFichaPaciente(){
        if ("HEAP".equals(tipoDeFila)){
            return heap.getSiguienteFicha();
        }else{
            return null;//revisar si retorna el paceinte correcto
        }
    }
    
        public boolean  isEmpty(){
        if ("HEAP".equals(tipoDeFila)){
            if (heap.currentHeapSize == 0){
                return true;
            }else{return false;}
        }else{
            return (cola.size == 0);
        }
    }
    
    @Override
    public String toString(){
        if ("HEAP".equals(tipoDeFila)){
            return heap.toString();
        }else{
            return cola.toString();
        }
    }
    }
