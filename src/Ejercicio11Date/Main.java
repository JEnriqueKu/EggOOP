package Ejercicio11Date;

import java.time.*;
import java.util.Date;
import java.util.Scanner;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia, mes y año");
        int dia= 14;
        int mes = 11;
        int anio = 1995;

        Date hoy = new Date();
        Date fecha = new Date(anio-1900,mes-1,14);
        System.out.println(fecha);
        System.out.println(hoy);

        LocalDate date  = LocalDate.of(1995,11,14);
        System.out.println(date);

        /*
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LocalDate fechaAct =  LocalDate.now();
        int dia, mes, anio, aniodif;
        System.out.println("Ingrese el día, mes y año");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        LocalDate fecha= LocalDate.of(anio, mes, dia);

        aniodif=fechaAct.getYear() - fecha.getYear();
        System.out.println(aniodif);

         */
    }
}
