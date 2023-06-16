/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9OOP.Service;

import Ejercicio9OOP.Entidad.Matematica;


public class MatematicaService {

    Matematica m1 = new Matematica();

    public double devolverMayor(Matematica m1) {
        return Math.max(m1.getNum1(), m1.getNum2());
    }

    public void calcularPotencia(Matematica m1) {
        double mayor = Math.round(devolverMayor(m1));
        double menor = Math.round(Math.min(m1.getNum1(), m1.getNum2()));

        System.out.println(mayor + " mayor");

        System.out.println("La potencia es: " + Math.pow(mayor, menor));
    }

    public double calculaRaiz(Matematica m1) {

        double menor = Math.abs(Math.min(m1.getNum1(), m1.getNum2()));

        return Math.sqrt(menor);
    }

}
