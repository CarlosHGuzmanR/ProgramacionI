package PruebasScanner;

import java.util.Scanner;

public class Ejemplo1Scanner {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); // Se crea un objeto Scanner
        String nombre; double radio; int n;
        System.out.print("Introduzca su nombre: "); 
        nombre = teclado.nextLine(); // Leer un String hasta que se introduzca un enter
        System.out.println("El nombre digitado es: " + nombre);
        
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = teclado.nextDouble(); // Leer un double
        System.out.println("Longitud de la circunferencia: " + 2 * Math.PI * radio);
        
        System.out.print("Introduzca un número entero: ");
        n = teclado.nextInt(); // Leer un entero
        System.out.println("El cuadrado es: " + Math.pow(n, 2));
    }
}
