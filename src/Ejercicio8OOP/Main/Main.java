package Ejercicio8OOP.Main;

import Ejercicio8OOP.Cadena.Cadena;
import Ejercicio8OOP.Service.CadenaService;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena c1 = cs.crearFrase("José Enrique Ku May");
        Cadena c2 = cs.crearFrase("aloH");

        /*Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        c1.setFrase(scanner.next());
        c1.setLongitud(c1.getFrase().length());*/

        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1, 'e');
        cs.compararLongitud(c1,"como estas");
        cs.unirFrases(c1);
        cs.reemplazar("%",c1);
        System.out.println("");
        System.out.println(cs.contiene(c1,'o'));

        cs.compararLongitud(c1, c2.getFrase());
        cs.invertirFrase(c2);
    }
}
