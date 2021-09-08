package paquete;

public class Ejercicio1 {

    public static void main(String[] args) {
//        int N = 5;
//        double A = 4.56;
//        char C = 'a';
//        System.out.println("Variable N = " + N);
//        System.out.println("Variable A = " + A);
//        System.out.println("Variable C = " + C);
//        System.out.println(N + " + " + A + " = " + (N + A));
//        System.out.println(A + " - " + N + " = " + (A - N));
//        System.out.println("Valor numérico del carácter " + C + " = " + (int) C);
//        
        
        int numero1 = 12, numero2 = 2;
        double division, modulo, operacion;
        int suma, resta, multiplicacion;
        
        operacion = 9/3*5-3+8*2;
        System.out.println("El resultado de la operacion es = " + operacion);
        division = numero1/numero2;
        System.out.println("El resultado de la  division es = " + division);
        suma = numero1 + numero2; 
        System.out.println("El resultado de la suma es = " + suma);
        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es = " + resta);
        multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicacioon es = " + multiplicacion);
        modulo = numero1 % numero2;
        System.out.println("El resutado del modulo es = " + modulo);
    }
}
