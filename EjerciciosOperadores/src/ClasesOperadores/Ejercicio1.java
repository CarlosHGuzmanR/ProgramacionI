package ClasesOperadores;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Carlos Humberto Guzman Ramirez";
        double nota1 = 0 + Math.random()*5;
        double nota2 = 0 + Math.random()*5;
        double nota3 = 0 + Math.random()*5;
        double nota4 = 0 + Math.random()*5;
        double nota5 = 0 + Math.random()*5; 
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("El estudiante: " + nombre + " la nota definitiva es: " + promedio);
    }
}
