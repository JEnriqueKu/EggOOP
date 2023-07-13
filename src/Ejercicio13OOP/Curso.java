package Ejercicio13OOP;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasdia;
    private int cantidadDiasSemana;
    private String turno;
    private double precioHora;
    private String alumnos[] = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasdia, int cantidadDiasSemana, String turno, double precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasdia = cantidadHorasdia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasdia() {
        return cantidadHorasdia;
    }

    public void setCantidadHorasdia(int cantidadHorasdia) {
        this.cantidadHorasdia = cantidadHorasdia;
    }

    public int getCantidadDiasSemana() {
        return cantidadDiasSemana;
    }

    public void setCantidadDiasSemana(int cantidadDiasSemana) {
        this.cantidadDiasSemana = cantidadDiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
