/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;


import ico.fes.modelo.Empleado.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author user
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diego"));
        lsl.append(new String("Maria"));
        lsl.append(new String("Santiag"));
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos del tipo empleado
        lsl2.append(new Empleado(1, "jose", "Perez", "Garcia", 1850.5f, 2015,4));
        lsl2.append(new Empleado(2, "Diego", "Perez", "Garcia", 1950.5f, 2017,5));
        lsl2.append(new Empleado(3, "Diana", "Perez", "Garcia", 2850.5f, 2010,7));
        lsl2.append(new Empleado(4, "Daniela", "Perez", "Garcia", 3850.5f, 2019,8));
        lsl2.transversal();
    }
    
}
