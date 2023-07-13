package EjercicioExtra5;

import java.util.Scanner;

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class Main {
    public static void main(String[] args) {
        String[] meses = new String[12];
        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Septiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";

        String mesSecreto = meses[8];
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.println("Adivina el mes Secreto");
        String respuesta=scanner.next();

        while (!respuesta.equalsIgnoreCase(mesSecreto)){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            respuesta=scanner.next();
        }
        System.out.println("¡Ha acertado!");

    }
}
