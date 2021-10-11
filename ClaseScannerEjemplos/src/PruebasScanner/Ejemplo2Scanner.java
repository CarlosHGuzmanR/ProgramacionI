package PruebasScanner;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejemplo2Scanner {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N; 
//        do{
//            System.out.print("Introduce un número entero positivo: ");
//            while(!sc.hasNextInt()){
//                System.out.println("Valor no válido");
//                sc.next();
//                System.out.print("Introduce un número entero positivo: ");
//            }
//            N = sc.nextInt();
//            if(N <= 0){
//                System.out.println("El número debe ser positivo");
//            }
//        }while(N <= 0);
//        System.out.println("Número introducido: " + N);
JOptionPane.showMessageDialog(null, "hola", "titulo", 2);JOptionPane.showMessageDialog(null, "hola", "titulo", 1);
JOptionPane.showMessageDialog(null, "hola", "titulo", 3);JOptionPane.showMessageDialog(null, "hola", "titulo", 0);JOptionPane.showMessageDialog(null, "hola", "titulo", 0);
JOptionPane.showMessageDialog(null, "hola", "titulo", -1);JOptionPane.showMessageDialog(null, "hola", "titulo", -2);
    }
}
