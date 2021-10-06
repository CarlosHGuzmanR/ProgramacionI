package Ejercicios1;

public class ContadorFor {

    public static void main(String[] args) {
        for( int contador = 1; contador <= 10; contador++)
            System.out.printf("%d ", contador);
        
        System.out.println();
        
        // Segunda forma
        int x = 10, y = 2;
        for( int j = x; j <= 4 * x * y; j += y / x)
            System.out.printf("%d ", j);
        
        // Tercera Forma
        for( int j = 2; j <= 80; j += 5)
            System.out.printf("%d ", j);
        
        for( int i = 1; i <= 100; i++)
            System.out.println(i);
        
        for( int i = 100; i >= 1; i--)
            System.out.println(i);
        
        for(int i = 7; i <= 77; i += 7)
            System.out.println(i);
        
        for( int i = 20; i >= 2; i -= 2){
            System.out.println(i);
        }
        
        for( int i = 2; i <= 20; i += 3){
            System.out.println(i);
        }
        
        for (int i = 99; i >= 0; i -= 11) {
            System.out.println(i);
        }
    }
}
