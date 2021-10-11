package paquete;

public class EjemploBreak {
    public static void main(String[] args) {

        int número = 4557888, dígitos = 0;
        while (número > 0) {
            número /= 10;
            dígitos++;
            if (dígitos == 5) {
                break;
            }
        }
        if (dígitos == 5) {
            System.out.println("El número tiene 5 o más dígitos");
        }
    }
}