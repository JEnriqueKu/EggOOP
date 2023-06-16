package Ejercicio6OOP;


import java.util.Scanner;

public class Ejercicio06NespressoGuia8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cafetera cafetera = new Cafetera(1000, 500);

        System.out.println("La cafetera tiene una capacidad máxima de: " + cafetera.getCapacidadMaxima() + " unidades" +
                " de café");
        cafetera.llenarCafetera();
        System.out.println("Por favor ingrese la cantidad de café que puede contener la taza");
        int capacidadTaza = scan.nextInt();
        cafetera.servirTaza(capacidadTaza);
        System.out.println("La cafetera se ha quedado vacia " + cafetera.vaciarCafetera());
        System.out.println("Por favor ingrese la cantidad de café que desea");
        int cantidadCafe = scan.nextInt();
        cafetera.agregarCafe(cantidadCafe);

    }
}
