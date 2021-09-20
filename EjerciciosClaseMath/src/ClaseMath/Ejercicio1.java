package ClaseMath;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor ingrese la base: "); float Base = scanner.nextFloat();
        System.out.print("Por favor ingrese el exponente: "); float Exponente = scanner.nextInt();
        
        System.out.println("El numero " + Base + " elevado a " + Exponente + " es = " + Math.pow(Base, Exponente));
    }
}
