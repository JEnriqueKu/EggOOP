package EjercicioExtra3;

public class RaicesService {
    // Devuelve el valor del discriminante (double).
    public double getDiscriminante(Raices r1){
        return Math.pow(r1.getB(),2)-(4*r1.getA()*r1.getC());
    }
    // Devuelve un booleano indicando si tiene dos soluciones,
    // para que esto ocurra, el discriminante debe ser mayor que 0.
    public boolean tieneRaices(Raices r1){
        return getDiscriminante(r1)>0;
    }
    // Devuelve un booleano indicando si tiene una única solución,
    // para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices r1){
        return getDiscriminante(r1)==0;
    }
    // Llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices r1){
        double a=r1.getA();
        double b=r1.getB();
        double c=r1.getC();

        if (tieneRaices(r1)){
            System.out.println("Solución 1: ");
            System.out.println((-b+(Math.sqrt(((Math.pow(b,2))-(4*a*c)))))/(2*a));
            System.out.println("Solución 2: ");
            System.out.println((-b-(Math.sqrt(((Math.pow(b,2))-(4*a*c)))))/(2*a));
        }
    }
    // llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    // Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices r1){
        double a=r1.getA();
        double b=r1.getB();
        double c=r1.getC();

        if (tieneRaiz(r1)){
            System.out.println("La solución es: ");
            System.out.println((-b+(Math.sqrt(((Math.pow(b,2))-(4*a*c)))))/(2*a));
        }
    }
    /*
    Llamará a tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices r1){
        if (tieneRaices(r1)) obtenerRaices(r1);
         else if (tieneRaiz(r1)) obtenerRaiz(r1);
         else System.out.println("La ecuación no tiene solución");
    }
}
