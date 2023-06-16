package Ejercicio6OOP;

import java.util.Scanner;

public class Cafetera {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 0;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {

        cantidadActual = capacidadMaxima;
    }

    /**Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
     tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
     cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
     método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
     cuanto quedó la taza.*/

    public void servirTaza(int tamañoTaza) {

        if (cantidadActual >= tamañoTaza) {
            cantidadActual -= tamañoTaza;
            System.out.println("Sirviendo taza...");
            System.out.println("La taza se ha llenado con " + tamañoTaza);
            System.out.println("La cafetera ha quedado con " + cantidadActual + " unidades de cafe");
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            System.out.println("La taza no se pudo llenar. La cantidad en la cafetera es " + cantidadServida +
                    "unidades " +
                    "de café");
            System.out.println("La taza se sirvió con " + cantidadActual + " unidades de cafe");

        }

    }

    public int vaciarCafetera() {

        cantidadActual = 0;
        return cantidadActual;
    }

    public void agregarCafe(int cantidad) {

        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
}
