package EjercicioExtra4;

import java.util.Scanner;

public class NIFService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public NIF crearNIF(){
        System.out.println("Ingrese el DNI");
        int dni=scanner.nextInt();

        return new NIF(dni,asignarLetra(dni));
    }
    public String asignarLetra(int dni){
        return NIF.letras[dni%23];
    }
    public void mostrar(NIF n1){
        System.out.println(n1.getDni()+"-"+n1.getLetra());
    }
}
