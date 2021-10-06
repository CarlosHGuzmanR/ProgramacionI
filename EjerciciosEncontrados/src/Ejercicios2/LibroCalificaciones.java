package Ejercicios2;

import java.util.Scanner;

public class LibroCalificaciones {
    private String nombreDelCurso;
    
    public LibroCalificaciones( String nombre ){
        this.nombreDelCurso = nombre;
    }
    public void establecerNombreDelCurso( String nombre){
        nombreDelCurso = nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.println("Bienvenido al libro de calificaciones para \ns!\n\n"+
                obtenerNombreDelCurso());
    }
    public void determinarPromedioClase(){
        Scanner entrada = new Scanner(System.in);
        int total; 
        int contadorCalif;
        int calificacion;
        double promedio;
        
        total = 0;
        contadorCalif = 1;
        
        System.out.print("Escriba calificacion 0-1 para terminar: ");
        calificacion = entrada.nextInt();
        while( calificacion != -1){
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;
            System.out.println("escriba calificacion 0 -1 para terminar: ");
            calificacion = entrada.nextInt();
        }
        
        if( contadorCalif != 0){
            promedio = (double) total / contadorCalif;
            System.out.printf("\nel total de las %d calificaciones introducidas es %d\n",
                    contadorCalif, total);
            System.out.printf("El promedio de la clase es %.2f\n", promedio);
        }
        
        promedio = total / 10;
        System.out.printf("\nEl total de las 10 calificaicones es %d\n", total);
        System.out.printf("El promedio de la clase es %d\n", promedio);
    }
}
