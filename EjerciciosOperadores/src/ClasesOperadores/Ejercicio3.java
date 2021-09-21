package ClasesOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUno = 8, numeroDos =  2;
        System.out.println("numeroUno = " + numeroUno +" numeroDos = " + numeroDos);
        int x = numeroUno;
        numeroUno = numeroDos;
        numeroDos = x;
        System.out.println("El valor de numeroUno es: " + numeroUno + ", el valor de numeroDos es: " + numeroDos);
    }
}
