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
        if ("H".equals(tipoDeFila)){
            heap = new Heap();
        }else{
            cola = new ColadePrioridad();
        }
    }
    
    public void insertPaciente(Pacientes paciente){
        if ("H".equals(tipoDeFila)){
            heap.insertarHeap(paciente);//si es null la fila se acaba
        }else{
            cola.enqueue(paciente);
            ColadePrioridad.bubbleSort(cola);
        }
    }
    
    public Pacientes nextPaciente(){
        if ("H".equals(tipoDeFila)){
            return heap.getSiguiente();
        }else{
            return cola.dequeue();//revisar si retorna el paceinte correcto
        }
    }
    
    @Override
    public String toString(){
        if ("H".equals(tipoDeFila)){
            return heap.toString();
        }else{
            return cola.toString();
        }
    }
    }
