package Ejercicios1;

import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args){
        // Primera forma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese el valor de x: "); int x = scanner.nextInt();
        System.out.print("Por favor ingrese el valor de y: "); int y = scanner.nextInt();
        if( x > 5){
            if ( y > 5)
                System.out.println("x e y son > 5");
        }
        else 
            System.out.println(" x es <= 5");
    }
}
