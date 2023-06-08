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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}

