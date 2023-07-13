package Ejercicio12OOP;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Persona persona=new Persona();
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     **/
    public Persona crearPersona(){
        Persona p1 = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento empezando por el día:");
        int dia= scanner.nextInt();
        System.out.println("Mes:");
        int mes= scanner.nextInt();
        System.out.println("Año:");
        int anio= scanner.nextInt();
        Date date = new Date(anio-1900,mes-1,dia);
        p1.setFechaNac(date);
        return p1;
    }

    /**
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.
     */
    public void calcularEdad(Persona persona){
        Date nacimiento = persona.getFechaNac();
        Date hoy = new Date();

        int edad = hoy.getYear()-nacimiento.getYear()-1;

        if (nacimiento.getMonth()<=hoy.getMonth()&&
            nacimiento.getDate()<=hoy.getDate()) edad++;

        System.out.println(edad);
    }

    /**
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(Persona persona,int edadAComparar){
        Date nacimiento = persona.getFechaNac();
        Date hoy = new Date();

        int edadP = hoy.getYear()-nacimiento.getYear()-1;

        if (nacimiento.getMonth()<=hoy.getMonth()&&
                nacimiento.getDate()<=hoy.getDate()) edadP++;

        return edadP<edadAComparar;
    }

    /**
     Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
     */
    public void mostrarPersona(Persona persona){

        System.out.println(persona.toString());
    }
}
