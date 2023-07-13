package Ejercicio13OOP;

import java.util.Scanner;

public class CursoService {
    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c1){
        String nombres[] = new String[c1.getAlumnos().length];
        System.out.println("Ingrese el nombre de 5 alumnos: ");
        for (int i = 0; i < nombres.length ; i++) {
                nombres[i] = leer.next();
        }
        c1.setAlumnos(nombres);
    }

    public Curso crearCurso(Curso c1){
        System.out.println("Ingrese el nombre del curso: ");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día:");
        c1.setCantidadHorasdia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días por semana:");
        c1.setCantidadDiasSemana(leer.nextInt());
        System.out.println("Ingrese el Turno:");
        c1.setTurno(validarTurno(leer.next()));
        System.out.println("Ingrese el precio por hora del curso:");
        c1.setPrecioHora(leer.nextDouble());
        cargarAlumnos(c1);

        return c1;

    }
    public String validarTurno(String cadena){
        while(!cadena.equalsIgnoreCase("Matutino" )&&!cadena.equalsIgnoreCase("Vespertino")){
            System.out.println("Ingrese un turno valido:");
            cadena = leer.next();
        }
        return cadena;
    }
    public void calcularGananciaSemanal(Curso c1){
        System.out.println("Las ganancias de la semana fueron " + c1.getCantidadHorasdia()*c1.getPrecioHora()*c1.getAlumnos().length * c1.getCantidadDiasSemana());
    }

}
