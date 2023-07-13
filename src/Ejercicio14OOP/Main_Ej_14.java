/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14OOP;

/**
 *
 * @author Jordan
 */
public class Main_Ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilService ms = new MovilService();
        
        Movil m1 = ms.cargarCelular();
        
        System.out.println(m1);
    }
    
}
