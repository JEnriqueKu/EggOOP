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
public class MovilService {
    
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){
        System.out.println("Ingrese la marca");
        String marca = leer.next();
        
        System.out.println("Ingrese el precio");
        double precio = leer.nextDouble();
        
        System.out.println("Ingrese el modelo");
        String modelo = leer.next();
        
        System.out.println("Ingrese la memoria RAM");
        int memoriaRam = leer.nextInt();
        
        System.out.println("Ingrese el almacenamiento");
        int almacenamiento = leer.nextInt();
        
       
        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, ingresarCodigo());
    }
    
    public int[] ingresarCodigo(){
        int[] codigo = new int[7];
        
        System.out.println("Ingrese el codigo de 7 digitos, uno por uno");
        for (int i = 0; i < codigo.length; i++) {
            
            codigo[i]=leer.nextInt();
        }
        
        return codigo;
    }
}
