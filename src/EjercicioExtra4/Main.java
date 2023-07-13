package EjercicioExtra4;

public class Main {
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF n1 = ns.crearNIF();
        NIF n2 = ns.crearNIF();

        // 00395469-F

        ns.mostrar(n1);
        System.out.println("---");
        ns.mostrar(n2);

    }
}
