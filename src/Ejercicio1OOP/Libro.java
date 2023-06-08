/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.

*/
package Ejercicio1OOP;

import java.util.Scanner;

public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    /**
     * //funcion para guardar datos del libro
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numPaginas 
     */
    
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.print("ISBN: ");
        this.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.print("Titulo: ");
        this.titulo = leer.nextLine();
        System.out.print("Autor: ");
        this.autor = leer.nextLine();
        System.out.print("Numero de paginas: ");
        this.numPaginas = leer.nextInt();
    }
    
    public void imprimirLibro() {
        System.out.println("ISBN= " + this.ISBN);
        System.out.println("Titulo= " + this.titulo);
        System.out.println("Autor= " + this.autor);
        System.out.println("Numero de Paginas= " + this.numPaginas);
    }
}
