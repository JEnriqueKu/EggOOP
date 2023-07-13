package Ejercicio10Arrays;

import java.util.Arrays;
import java.util.Random;

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class Main {
    public static void main(String[] args) {
        double[] a = new double[50], b = new double[20];

        llenarArray(a);

        mostrarArray(a);
        System.out.println(" ");
        a= Arrays.stream(a).sorted().toArray();
        mostrarArray(a);
        llenarArray2(a,b);
        System.out.println("");
        System.out.println("Array de 20:");
        mostrarArray(b);

    }
    public static void llenarArray(double[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) array[i]= random.nextDouble(100);
    }

    public static void mostrarArray(double[] array){
        for (int i = 0; i < array.length; i++) System.out.print(array[i]+"  ");
    }
    public static void llenarArray2(double[] array, double[] array2){
        for (int i = 0; i < array2.length; i++) if (i<10) array2[i]=array[i];
        else array2[i]=0.5;

    }
}
