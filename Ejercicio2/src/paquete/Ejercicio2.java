package paquete;

public class Ejercicio2 {
    public static void main(String[] args) {
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
