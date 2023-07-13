
package ActividadExtra3.servicios;

import ActividadExtra3.entidades.Rutina;

import java.util.ArrayList;

public class RutinaService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public void crearRutina() {
        Rutina r1 = new Rutina();

        System.out.println("Ingrese el id de la rutina");
        r1.setId(leer.nextInt());

        System.out.println("Ingrese el nombre de la rutina");
        r1.setNombre(leer.next());

        System.out.println("Ingrese la duración");
        r1.setDuracion(leer.nextInt());

        System.out.println("Ingrese el nivel de dificultad");
        r1.setNivelDificultad(leer.next());

        System.out.println("Ingrese la descripción");
        r1.setDescripcion(leer.next());

        Rutina.getListaRutinas().add(r1);
    }

    public void crearRutinaPorParametro(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        Rutina r1 = new Rutina(id,nombre,duracion,nivelDificultad,descripcion);
        Rutina.getListaRutinas().add(r1);
    }

    public ArrayList<Rutina> obtenerRutinas() {
        return Rutina.getListaRutinas();
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        Rutina.getListaRutinas().get(id).setNombre(nombre);
        Rutina.getListaRutinas().get(id).setDuracion(duracion);
        Rutina.getListaRutinas().get(id).setNivelDificultad(nivelDificultad);
        Rutina.getListaRutinas().get(id).setDescripcion(descripcion);
    }

    public void eliminarRutina(int id) {
        Rutina.getListaRutinas().remove(id);
    }

    public void mostrarRutinas(){
        for (Rutina rutina: Rutina.getListaRutinas()) System.out.println(rutina);
    }

}
