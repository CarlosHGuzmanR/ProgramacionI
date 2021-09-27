package ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args){
        double numero1 = -100 + Math.random()*100;
        double numero2 = -100 + Math.random()*100;
        numero2 = Math.round(numero2);
        numero1 = Math.floor(numero1);
        numero2 = Math.ceil(numero2);
        System.out.println("Numero 1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        double numeroMayor = Math.max(numero1,numero2);
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
