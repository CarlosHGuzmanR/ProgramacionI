package Ejercicios1;

import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {
        // Primera forma 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una nota por favor: "); int calificacionEstudiante = scanner.nextInt();
        if(calificacionEstudiante >= 90)
            System.out.println("A");
        else 
            if(calificacionEstudiante >= 80)
                System.out.println("B");
            else
                if (calificacionEstudiante >= 70)
                    System.out.println("C");
                else
                    if( calificacionEstudiante >= 60)
                        System.out.println("D");
                    else
                        System.out.println("F");
        // Segunda forma
        if (calificacionEstudiante >= 90 )
            System.out.println("A");
        else if (calificacionEstudiante >= 80)
            System.out.println("B");
        else if ( calificacionEstudiante >= 70)
            System.out.println("C");
        else if(calificacionEstudiante >= 60)
            System.out.println("D");
        else 
            System.out.println("F");
    }
}
