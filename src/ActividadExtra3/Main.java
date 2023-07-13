package ActividadExtra3;

import ActividadExtra3.servicios.ClienteService;
import ActividadExtra3.servicios.RutinaService;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

        // Registros clientes
        cs.registrarClientePorParametros(0,"Lilia",29,160,55,"Musculo");
        cs.registrarClientePorParametros(1,"Jordan",23,180,60,"Subir");

        // crear rutinas
        rs.crearRutinaPorParametro(0,"cardio",30,"easy","no");
        rs.crearRutinaPorParametro(1,"pesas",60,"medium","no");

        // mostrar clientes y rutinas
        cs.mostrarClientes();
        rs.mostrarRutinas();

        // actualizar clientes
        cs.actualizarCliente(0, "cindy", 26, 155, 65, "nuevo");
        cs.actualizarCliente(1, "anonymus", 999, 99, 99, "");

        // actualizar rutinas
        rs.actualizarRutina(0, "recreo", 0, "facil", "solo comer");
        rs.actualizarRutina(1, "spinning", 30, "Medio", "");

        // mostrar clientes y rutinas
        System.out.println("Actualizados:");
        cs.mostrarClientes();
        rs.mostrarRutinas();

        // eliminar clientes
        cs.eliminarCliente(1);

        // eliminar rutinas
        rs.eliminarRutina(0);

        // mostrar clientes y rutinas
        System.out.println("Eliminados:");
        cs.mostrarClientes();
        rs.mostrarRutinas();

    }

}
