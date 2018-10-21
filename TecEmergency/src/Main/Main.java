/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaz.Inicio;
import Estructura.Heap;

/**
 *
 * @author marip
 */
public class Main {
    
     public static void main(String args[]) {

         /**
         * SE CREA LA INSTANCIA PARA LLAMAR LA VENTANA PRINCIPAL
         */
        Inicio principal = new Inicio();
        principal.setVisible(true);
        
        //Prueba heap
        Heap prueba = new Heap();
        prueba.insertarHeap(2);
        prueba.insertarHeap(5);
        prueba.insertarHeap(1);
        prueba.insertarHeap(3);
        prueba.insertarHeap(1);
        prueba.insertarHeap(2);
        
        prueba.print();
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
        System.out.println("Siguiente" + prueba.getSiguiente());
        prueba.print();
     

        
    }
    
}
