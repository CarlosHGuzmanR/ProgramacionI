package paquete;

public class EjemploReturn {
    // Programa Java para ilustrar usando return

    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Antes de return.");

        if (t) {
            return;
        }

        // El compilador eludirá todas las declaraciones
        // después de return
        System.out.println("Esto no se ejecutará.");
    }
}
