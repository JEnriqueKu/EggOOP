package Ejercicio12OOP;

public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();

        Persona p1 = ps.crearPersona();


        ps.calcularEdad(p1);
        System.out.println(ps.menorQue(p1,30));
        ps.mostrarPersona(p1);

    }
}
