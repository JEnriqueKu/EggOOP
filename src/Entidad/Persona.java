package Entidad;


import java.util.Date;

public class Persona {
    public String nombre;
    public Date fechaDeNacimiento;
    public String nacionalidad;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nacionalidad = nacionalidad;
    }
}

