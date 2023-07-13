package EjercicioExtra3;
/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
 */
public class Raices {
    private int a;
    private int b;
    private int c;


    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }


    public int getC() {
        return c;
    }

}
