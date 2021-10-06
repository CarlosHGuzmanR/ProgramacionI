package Ejercicios2;

import java.util.Scanner;

public class LibroCalificaciones {
    private String nombreDelCurso;
    
    public LibroCalificaciones( String nombre ){
        nombreDelCurso = nombre;
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
        int promedio;
        
        total = 0;
        contadorCalif = 1;
        while( contadorCalif <= 10){
            System.out.print("Escribe la calificacion: ");
            calificacion = entrada.nextInt();
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;
        }
        promedio = total / 10;
        System.out.printf("\nEl taotl de las 10 calificaicones es %d\n", total);
        System.out.printf("El prp,dop de la clase es %d\n", promedio);
    }
}
