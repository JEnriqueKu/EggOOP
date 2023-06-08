package Ejercicio2OPP;

public class Ejercicio2Circunferencia {
    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia();
        Circunferencia circunferencia2 = new Circunferencia(4);

        circunferencia1.crearCircunferencia();
        circunferencia1.area();
        circunferencia1.perimetro();

        circunferencia2.area();
        circunferencia2.perimetro();
    }
}
