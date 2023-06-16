package Ejercicio8OOP.Service;

import Ejercicio8OOP.Cadena.Cadena;

import java.util.Scanner;

public class CadenaService {

    /**
     *
     * @param frase
     * @return Objeto Cadena
     */
    public Cadena crearFrase(String frase){
        Cadena c1 = new Cadena();
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        return c1;
    }

    /**
     *
     * @param c1
     */
    public void mostrarVocales(Cadena c1) {
        int cont = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            String letra = c1.getFrase().substring(i, i + 1).toUpperCase();

            if (letra.equalsIgnoreCase("A") ||
                    letra.equalsIgnoreCase("E") ||
                    letra.equalsIgnoreCase("I") ||
                    letra.equalsIgnoreCase("O") ||
                    letra.equalsIgnoreCase("U")) cont++;
        }
        System.out.println("La frase contiene " + cont + " vocales");
    }
    public void invertirFrase(Cadena c1) {
        String invertida = "";

        for (int i = c1.getLongitud(); i > 0; i--) invertida += c1.getFrase().substring(i - 1, i);

        System.out.println(invertida);
    }
    public void vecesRepetido (Cadena c1, char c) {
        int i, totalRepetida=0;

        for (i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == c) {
                totalRepetida++;
            }

        }
        System.out.println("El caracter se repite " + totalRepetida);
    }

    /**
     *
     * @param c1
     * @param frase
     */
    public void compararLongitud(Cadena c1, String frase) {

        int longitudFrase = frase.length();

        if (c1.getLongitud() > longitudFrase) {
            System.out.println("La frase ingresada es mas corta ");
        }else if (c1.getLongitud() < longitudFrase) {
            System.out.println("La frase ingresada es más larga");
        } else {
            System.out.println("La longitud de las 2 frases son iguales ");
        }
    }

    public void unirFrases(Cadena c1) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una nueva frase");
        String fraseNueva = scanner.next();

        String concatenar = c1.getFrase().concat(" ").concat(fraseNueva);
        System.out.println("La frase resultante es: " + concatenar);
    }

    public void reemplazar(String letra, Cadena c1){

        String letraFrase;

        for (int i = 0; i < c1.getLongitud(); i++) {
            letraFrase = c1.getFrase().substring(i, i+1).toLowerCase();

            switch (letraFrase) {
                case "a":
                    System.out.print(letra);
                    break;
                default:
                    System.out.print(c1.getFrase().substring(i,i+1));
            }

        }
    }

    public boolean contiene(Cadena c1, char car){
        boolean bandera = false;
        for (int i = 0; i < c1.getLongitud() ; i++) {
            bandera = bandera || (car == c1.getFrase().charAt(i));
        }
        return bandera;

    }
}