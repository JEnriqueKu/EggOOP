package EjercicioExtra6;

public class Ahorcado {
    private String[] buscar;
    private String[] encontradas;
    private int conincidencias;
    private int jugadasMax;
    private int letrasFaltantes;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar,  int jugadasMax) {
        this.buscar = buscar;
        this.conincidencias = 0;
        this.jugadasMax = jugadasMax;
        this.letrasFaltantes = buscar.length;
        this.encontradas= new String[buscar.length];
       for (int i = 0; i < encontradas.length; i++) {
            encontradas[i]=" ";
    }
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getConincidencias() {
        return conincidencias;
    }

    public void setConincidencias(int conincidencias) {
        this.conincidencias = conincidencias;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasFaltantes() {
        return letrasFaltantes;
    }

    public void setLetrasFaltantes(int letrasFaltantes) {
        this.letrasFaltantes = letrasFaltantes;
    }

    public String[] getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(String[] encontradas) {
        this.encontradas = encontradas;
    }
}
