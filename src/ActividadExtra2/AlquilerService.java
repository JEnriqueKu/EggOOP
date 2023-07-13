package ActividadExtra2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AlquilerService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler crearAlquiler(){
        System.out.println("Ingrese el nombre de la pelicula alquilada");
        String alquilada= leer.next();
        System.out.println("Ingrese la fecha de inicio (año, mes, dia)");
        int anio= leer.nextInt();
        int mes= leer.nextInt();
        int dia= leer.nextInt();
        LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese la fecha de fin (año, mes, dia)");
        int anioF= leer.nextInt();
        int mesF= leer.nextInt();
        int diaF= leer.nextInt();
        LocalDate fechaFin = LocalDate.of(anioF, mesF, diaF);
        System.out.println("Ingrese el precio");
        double precio= leer.nextDouble();

        Alquiler a1 = new Alquiler(alquilada,fechaInicio,fechaFin,precio);
        ingresarAlquiler(a1);

        return a1;
    }

    public void ingresarAlquiler(Alquiler a1){
        Alquiler.alquileres[Alquiler.numeroAlquileres]=a1;
        Alquiler.numeroAlquileres++;
    }
    public void listarAlquileres(){
        System.out.println(Arrays.toString(Alquiler.alquileres));
    }
    public void buscarPorFecha(){
        System.out.println("Ingrese la fecha que busca (año, mes, dia)");
        int anio= leer.nextInt();
        int mes= leer.nextInt();
        int dia= leer.nextInt();
        LocalDate fechaIngresada = LocalDate.of(anio,mes,dia);
        boolean bandera=false;
        int ubicacionAlquiler=0;

        for (int i = 0; i < Alquiler.numeroAlquileres; i++) {
            if (Alquiler.alquileres[i].getFechaInicio().equals(fechaIngresada)){
                bandera=true;
                ubicacionAlquiler=i;
            }
            if (Alquiler.alquileres[i].getFechaFin().equals(fechaIngresada)){
                bandera=true;
                ubicacionAlquiler=i;
            }
            if (bandera){
                System.out.println("Si existe el alquiler y es: ");
                System.out.println(Alquiler.alquileres[ubicacionAlquiler].getFechaInicio());
            } else System.out.println("No existe el alquiler");
        }
    }
    public void ingresoTotal(){
        double total=0;
        int diasDeRenta;

        for (int i = 0; i < Alquiler.numeroAlquileres; i++) {
            diasDeRenta = Alquiler.alquileres[i].getFechaFin().compareTo(Alquiler.alquileres[i].getFechaInicio());
            System.out.println("Dias de renta: "+diasDeRenta);
            if (diasDeRenta<=3){
                total+=10;
            } else {
                total+=10;
                for (int j = 0; j < diasDeRenta-3; j++) {
                    total+=total*.10;
                }
            }
        }
        System.out.println("El ingreso total es: "+total);
    }
}
