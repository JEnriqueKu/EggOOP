package Ejercicio2OPP;

import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio= scanner.nextDouble();
    }
    public void area(){
        System.out.println("El radio es: "+(this.radio*this.radio*Math.PI));
    }
    public void perimetro(){
        System.out.println("El perímetro es: "+(2*Math.PI*this.radio));
    }
}

