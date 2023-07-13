
package ActividadExtra3.entidades;

import java.util.ArrayList;

public class Cliente {
    
    private int id;
    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    private String objetivo;
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad, int altura, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", objetivo='" + objetivo + '\'' +
                '}';
    }
}
