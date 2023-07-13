
package ActividadExtra3.entidades;

import java.util.ArrayList;


public class Rutina {
    
    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;
    
    private static ArrayList<Rutina> listaRutinas = new ArrayList<>();

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static ArrayList<Rutina> getListaRutinas() {
        return listaRutinas;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", nivelDificultad='" + nivelDificultad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
