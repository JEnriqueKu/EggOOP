/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9OOP.Main;

import Ejercicio9OOP.Entidad.Matematica;
import Ejercicio9OOP.Service.MatematicaService;


public class Main_Ej_9 {


    public static void main(String[] args) {

        MatematicaService ms = new MatematicaService();

          double num1 = Math.random()*10;
          double num2 = Math.random()*10;
          
        Matematica m1 = new Matematica(0, 3);

        System.out.println(ms.devolverMayor(m1));
        ms.calcularPotencia(m1);

        System.out.println(ms.calculaRaiz(m1));
    }

}
