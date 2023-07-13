package EjercicioExtra2;

import java.util.Scanner;

public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void crearPuntos(){
        System.out.println("Ingrese 2 coordenadas del punto 1");
        x1= scanner.nextInt();
        y1= scanner.nextByte();
        System.out.println("Ingrese 2 coordenadas del punto 2");
        x2= scanner.nextInt();
        y2= scanner.nextByte();
    }
    public void calcular(){
        System.out.println(Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
    }
}
