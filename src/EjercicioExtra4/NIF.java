package EjercicioExtra4;

public class NIF {
    private long dni;
    private String letra;
    public static String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }
    public String getLetra() {
        return letra;
    }

}
