package ActividadExtra2;

import java.time.LocalDate;

public class Alquiler {
    private String alquilada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    static Alquiler[] alquileres = new Alquiler[3];
    static int numeroAlquileres;

    public Alquiler() {
    }

    public Alquiler(String alquilada, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.alquilada = alquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getAlquilada() {
        return alquilada;
    }

    public void setAlquilada(String alquilada) {
        this.alquilada = alquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "alquilada='" + alquilada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }
}
