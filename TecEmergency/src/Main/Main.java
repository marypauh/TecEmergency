/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Estructura.ColadePrioridad;
import Interfaz.Inicio;
import Estructura.Heap;
import Estructura.Pacientes;

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
        
        ColadePrioridad cola = new ColadePrioridad();
        Pacientes paciente = new Pacientes(3,"4d","Rojo","Infarto");
        cola.enqueue(paciente);
        Pacientes paciente2 = new Pacientes(2,"4f","Verde","Infarto");
        cola.enqueue(paciente2);
        
        ColadePrioridad.bubbleSort(cola);
        
        
        System.out.println(cola);
        
        
        
    }
    
}
