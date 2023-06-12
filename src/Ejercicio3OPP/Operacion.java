/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3OPP;

/**
 *
 * @author Jordan
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        java.util.Scanner leer = new java.util.Scanner(System.in);

        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();

        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Lo siento, no se puede multiplicar si uno de los numeros es 0.");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public int dividir() {
        if (num2 == 0) {
            System.out.println("Lo siento, no se puede divir ningun numero entre 0.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

}
