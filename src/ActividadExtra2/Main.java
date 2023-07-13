package ActividadExtra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opciones;

        do {
            System.out.println("INGRESE UNA OPCION DEL SIGUIENTE MENÚ");
            System.out.println("1 - Agregar pelicula");
            System.out.println("2 - Agregar alquiler");
            System.out.println("3 - Listar películas");
            System.out.println("4 - Buscar películas por título");
            System.out.println("5 - Buscar películas por género");
            System.out.println("6 - Buscar alquiler por fecha");
            System.out.println("7 - Calcular ingreso total");
            opciones=leer.nextInt();

            switch (opciones){
                case 1: ps.crearPelicula();
                break;
                case 2: as.crearAlquiler();
                break;
                case 3: ps.listarPeliculas();
                break;
                case 4: ps.buscarPorTitulo();
                break;
                case 5: ps.buscarPorGenero();
                break;
                case 6: as.buscarPorFecha();
                break;
                case 7: as.ingresoTotal();
                break;
            }

        } while (opciones<=7);

    }
}
