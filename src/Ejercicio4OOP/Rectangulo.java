package Ejercicio4OOP;

import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {
    private int base;
    private int altura;
    Scanner scanner = new Scanner(System.in);

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // método para crear el rectángulo con los datos del Rectángulo dados por el usuario
    public void crearRectangulo(){
        System.out.println("Ingrese la base y la altura");
        this.base=scanner.nextInt();
        this.altura= scanner.nextInt();
    }

    // calcular la superficie del rectángulo
    public void area(){
        System.out.println("El área es: " +(this.base*this.altura));
    }
    // calcular el perímetro del rectángulo
    public void perimetro(){
        System.out.println("El perímetro es: " +((this.base*2)+(this.altura*2)));
    }
    //dibujará el rectángulo mediante asteriscos usando la base y la altura
    public void dibujarRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
