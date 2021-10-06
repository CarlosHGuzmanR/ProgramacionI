package Ejercicios1;

import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese la calificacion: "); int calificacion = scanner.nextInt();
        if( calificacion >= 60)
            System.out.println("Aprobado");
        else
        {
            System.out.println("Reprobado");
            System.out.println("Debe tomar este curso otra vez");
        }
    }
}
