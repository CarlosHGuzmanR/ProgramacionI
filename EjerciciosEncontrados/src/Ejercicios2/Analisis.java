package Ejercicios2;

import java.util.Scanner;

public class Analisis {
    public void procesarResultadosExamen()
    {
        Scanner entrada = new Scanner( System.in);
        
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;
        int resultado;
        
        while( contadorEstudiantes <= 10)
        {
            System.out.println("Escriba el resutlado (1 = aprobado, 2 = reprobado): ");
            resultado = entrada.nextInt();
            if( resultado ==1 )
                aprobados = aprobados + 1;
            else 
                reprobados = reprobados + 1;
            
            contadorEstudiantes = contadorEstudiantes + 1;
        }
        
        System.out.printf("Aprobados: %d\nReprobados: %d\n", aprobados, reprobados);
        if ( aprobados > 8)
            System.out.println(" Aumentar colegiatura ");
    }
}
