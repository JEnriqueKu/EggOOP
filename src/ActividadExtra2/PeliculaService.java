package ActividadExtra2;

import java.util.Arrays;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el titulo de la película");
        String titulo= leer.next();
        System.out.println("Ingrese el genero");
        String genero=leer.next();
        System.out.println("año");
        int anio= leer.nextInt();
        System.out.println("Ingrese la duración");
        double duracion= leer.nextDouble();

        Pelicula p1 = new Pelicula(titulo,genero,anio,duracion);
        ingresarPelicula(p1);
        return p1;

    }

    public void ingresarPelicula(Pelicula p1){
        p1.Peliculas[p1.numeroPeliculas]=p1;
        p1.numeroPeliculas++;
    }
    public void listarPeliculas(){
            System.out.println(Arrays.toString(Pelicula.Peliculas));
    }
    public void buscarPorTitulo(){
        System.out.println("Ingrese la pelicula que busca");
        String nombrePelicula=leer.next();
        boolean bandera=false;
        for (int i = 0; i < Pelicula.numeroPeliculas; i++) {
            if (Pelicula.Peliculas[i].getTitulo().equalsIgnoreCase(nombrePelicula)){
                bandera=true;
            }
        }
        if (bandera){
            System.out.println("Si se encuentra en las peliculas");
        } else System.out.println("No se encuentra en las peliculas");
    }
    public void buscarPorGenero(){
        System.out.println("Ingrese el género que busca");
        String genero=leer.next();
        boolean bandera=false;
        for (int i = 0; i < Pelicula.numeroPeliculas; i++) {
            if (Pelicula.Peliculas[i].getGenero().equalsIgnoreCase(genero)){
                bandera=true;
            }
        }
        if (bandera){
            System.out.println("Si se encuentra en las peliculas");
        } else System.out.println("No se encuentra en las peliculas");
    }
}
