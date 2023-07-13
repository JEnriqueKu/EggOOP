package EjercicioExtra1;

public class Cancion {
    private String cancion;
    private String autor;

    public Cancion() {
        cancion="";
        autor="";
    }

    public Cancion(String cancion, String autor) {
        this.cancion = cancion;
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
