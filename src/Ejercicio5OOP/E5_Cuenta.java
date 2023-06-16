
package cuenta;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class E5_Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.solicitarDatos();
        
        System.out.println("Cuanto desea ingresar");
        double ingresar = leer.nextDouble();
        cuenta1.ingresar(ingresar);
        cuenta1.consultarSaldo();
        
        System.out.println("Cuanto desea retirar");
        double retirar = leer.nextDouble();
        cuenta1.retirar(retirar);
        cuenta1.consultarSaldo();
        
        cuenta1.extraccionRapida();
        cuenta1.consultarSaldo();
        
        //Con el metodo consultar dato
        System.out.println("");
        cuenta1.consultarDatos();
        
        //Para usar con el toString
        System.out.println("");
        Cuenta cuenta2 = new Cuenta(1234,2345,1000);
        System.out.println(cuenta2.toString());
        
        
    }
    
}
