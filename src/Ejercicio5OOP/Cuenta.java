//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
//Las operaciones asociadas a dicha clase son: 
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
//b) Agregar los métodos getters y setters correspondientes 
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//y se la sumara a saldo actual. 
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//pondrá el saldo actual en 0. 
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%. 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
package Entidad;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);

    private int numeroCuenta;
    private long dni;

    @Override
    public String toString() {
        return "Cuenta{numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void solicitarDatos() {
        System.out.println("Ingrese su numero de cuenta");
        this.numeroCuenta = leer.nextInt();

        System.out.println("Ingrese el dni");
        this.dni = leer.nextLong();

        this.saldoActual = 0;
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar  y se la sumara a saldo actual. 
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    //e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//pondrá el saldo actual en 0.
    public void retirar(double retiro) {
        if (retiro > this.saldoActual) {
            this.saldoActual = 0;
            System.out.println("No puedes retirar, el retiro excede tu saldo actual");
        } else {
            this.saldoActual -= retiro;
        }
    }
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%.

    public void extraccionRapida() {
        System.out.println("Cuanto desea retirar");
        double retirar = leer.nextDouble();
        if (retirar > this.saldoActual * 0.20) {
            System.out.println("Solo puedes retirar un 20%");
        } else {
            this.saldoActual -= retirar;
            System.out.println("Usted a retirado" + retirar);
        }
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Su saldo es: " + this.saldoActual);
    }

    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
    public void consultarDatos() {
        System.out.println("Su numero de cuenta es: " + this.numeroCuenta);
        System.out.println("Su dni es: " + this.dni);
        System.out.println("Su saldo actual es: " + this.saldoActual);
    }

}
