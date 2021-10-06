package Ejercicios2;

import Ejercicios2.LibroCalificaciones;

public class PruebaLibroCalificaciones {
    public static void main(String args[]){
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
        "CS101 Introducción a la programación en java");
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.determinarPromedioClase();
    }
}
