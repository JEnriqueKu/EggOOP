package Ejercicio13OOP;

public class Principal {
    public static void main(String[] args) {
        CursoService s1 = new CursoService();
        Curso c1 = new Curso();
        s1.crearCurso(c1);
        s1.calcularGananciaSemanal(c1);
    }
}
