
package ActividadExtra3.servicios;

import ActividadExtra3.entidades.Cliente;

import java.util.ArrayList;

public class ClienteService {
    
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    
    public void registrarCliente(){
        Cliente c1 = new Cliente();
        
        System.out.println("Ingrese el id del cliente");
        c1.setId(leer.nextInt());
        
        System.out.println("Ingrese el nombre del cliente");
        c1.setNombre(leer.next());
        
        System.out.println("Ingrese la edad del cliente");
        c1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura del cliente");
        c1.setAltura(leer.nextInt());
        
        System.out.println("Ingrese el peso del cliente");
        c1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese el objetivo del cliente");
        c1.setObjetivo(leer.next());
        
        Cliente.getListaClientes().add(c1);
        
        System.out.println("Cliente registrado");
    }

    public void registrarClientePorParametros(int id, String nombre, int edad, int altura, double peso, String objetivo){
        Cliente c1 = new Cliente(id,nombre,edad,altura,peso,objetivo);

        Cliente.getListaClientes().add(c1);
    }

    public ArrayList<Cliente> obtenerClientes(){
        return Cliente.getListaClientes();
    }
    
    public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo){
        Cliente.getListaClientes().get(id).setNombre(nombre);
        Cliente.getListaClientes().get(id).setEdad(edad);
        Cliente.getListaClientes().get(id).setAltura(altura);
        Cliente.getListaClientes().get(id).setPeso(peso);
        Cliente.getListaClientes().get(id).setObjetivo(objetivo);
    }
    
    public void eliminarCliente(int id){
        Cliente.getListaClientes().remove(id);
    }
    
    public void mostrarClientes(){
        for (Cliente cliente : Cliente.getListaClientes()) System.out.println(cliente);
    }
}
