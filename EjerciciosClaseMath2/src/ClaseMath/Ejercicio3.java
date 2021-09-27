package ClaseMath;

public class Ejercicio3 {
    public static void main(String[] args){
        double nota1 = 0 + Math.random()*10;
        double nota2 = 0+Math.random()*10;
        double nota3 = 0+Math.random()*10;
        double nota4 = 0+Math.random()*10;
        double nota5 = 0+Math.random()*10;
        double promedioNotas = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Nota 1 = " + nota1 + "\nNota 2 = " + nota2 + "\nNota 3 = " + nota3
        + "\nNota 4 = " + nota4 + "\nNota 5 = " + nota5);
        System.out.println("El promedio de las notas es: " + promedioNotas);
    }
}