package EjercicioExtra6;

import java.util.Scanner;

public class AhocadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Ahorcado crearJuego(){

        System.out.println("Ingrese una frase: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maxima: ");
        int cantidad = leer.nextInt();

        String[] array = new String[palabra.length()];

        for (int i = 0; i < palabra.length() ; i++) {
            array[i] = palabra.substring(i, i+1);
        }

        return new Ahorcado(array, cantidad);

    }
    public void longitud(Ahorcado h1){
        System.out.println("El tamaño de la palabra es " + h1.getBuscar().length);
    }

    public void buscarLetras(Ahorcado h1, String letra){
       boolean bandera = false;

        for (int i = 0; i < h1.getBuscar().length; i++) {
            bandera = bandera || h1.getBuscar()[i].equalsIgnoreCase(letra);
        }

        if (bandera) {
            System.out.println("La letra si se encuentra dentro de la frase");
        }else {
            System.out.println("Perdiste un intento :c");
        }
    }

    public boolean encontradas(Ahorcado h1, String letra){
        int cont = 0;
        boolean dentro = false;

        do {
            for (int i = 0; i < h1.getEncontradas().length; i++) {
                dentro = dentro || h1.getEncontradas()[i].equalsIgnoreCase(letra);
                if (dentro) {
                    System.out.println("La letra ya fue encontrada, intente con otra");
                    letra=leer.next();
                    dentro=false;
                    i=-1;
                }

            }
        } while (dentro);

        for (int i = 0; i < h1.getBuscar().length ; i++) {
            if(h1.getBuscar()[i].equalsIgnoreCase(letra)){
                cont++;
                h1.getEncontradas()[i]=letra;
            }
        }

        h1.setLetrasFaltantes(h1.getLetrasFaltantes()-cont);

        System.out.println("Se han encontrado "+ (h1.getBuscar().length-h1.getLetrasFaltantes()));
        System.out.println("Faltan por encontrar: "+h1.getLetrasFaltantes());
        
        return cont > 0;
    }

    public void restarIntentos(Ahorcado h1, String letra){
        if(!encontradas(h1,letra))
            h1.setJugadasMax(h1.getJugadasMax()-1);
    }

    public void intentos(Ahorcado h1){
        System.out.println("Te quedan " + h1.getJugadasMax() + " intentos");
    }
    public void juego(){
        Ahorcado a1 = crearJuego();

        while(a1.getJugadasMax() != 0 && a1.getLetrasFaltantes()>0){
            longitud(a1);
            intentos(a1);
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            buscarLetras(a1, letra);
            restarIntentos(a1,letra);
        }

        if (a1.getJugadasMax()==0) System.out.println("Lo sentimos, no hay más oportunidades");
        else System.out.println("Ha ganado");

    }

}
