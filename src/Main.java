import Entidad.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan",new Date(1995,11-1,14),"Mexicana");
        System.out.println(persona2.fechaDeNacimiento);
    }
}
