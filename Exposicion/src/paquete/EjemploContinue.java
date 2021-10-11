package paquete;


public class EjemploContinue {
    //ejemplo de continue

    public class ejemplotaller {
        public static void main(String[] args) {
            for (int m = 1; m <= 10; m++) {
                if (m == 8) {
                    System.out.println(" ");
                    continue;
                }
                System.out.println(" " + m);
            }
        }
    }

}
