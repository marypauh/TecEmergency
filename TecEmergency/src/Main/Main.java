/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Estructura.ColadePrioridad;
import Estructura.FilaPacientes;
import Interfaz.Principal;
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
                
        Pacientes paciente = new Pacientes (0,"4d","verde","Infarto");
        Pacientes paciente2 = new Pacientes(0,"4f","rojo","Infarto");
        
        FilaPacientes filaHeap = new FilaPacientes("H");
        FilaPacientes filaCola = new FilaPacientes("C");
        
        filaCola.insertPaciente(paciente);
        filaCola.insertPaciente(paciente2);
        
        filaHeap.insertPaciente(paciente);
        filaHeap.insertPaciente(paciente2);
        
        System.out.println(filaHeap.toString());
        System.out.println(filaHeap.nextPaciente());
        System.out.println(filaHeap.nextPaciente());
        
        System.out.println(filaCola.toString());
        System.out.println(filaCola.nextPaciente());
        System.out.println(filaCola.nextPaciente());
        
        
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
        
        
    }
