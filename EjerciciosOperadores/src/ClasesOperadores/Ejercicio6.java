package ClasesOperadores;

public class Ejercicio6 {
    public static void main(String[] args){
        int ladoCuadrado = 8;
        double areaCuadrado = Math.pow(ladoCuadrado, ladoCuadrado);
        System.out.println("area Cuadrado = " + areaCuadrado);
        double perimetro = ladoCuadrado*4;
        System.out.println("perimetro Cuadrado = " + perimetro);
        
        int baseTriangulo = 9, alturaTriangulo = 8;
        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("area Triangulo Uno = " + areaTriangulo);
        double perimetroTrianguloUno = baseTriangulo * 3;
        System.out.println("perimetro Triangulo Uno = " + perimetroTrianguloUno);
        
        int ladoUnoTriangulo = 8, ladoDosTriangulo = 8; 
        int areaTrianguloDos = (ladoDosTriangulo * ladoUnoTriangulo) / 2;
        System.out.println("area Triangulo dos = " + areaTrianguloDos);
        double perimetroTriangulo  = ladoDosTriangulo * 3;
        System.out.println("perimetro Triangulo Dos = " + perimetroTriangulo);
        
        int baseRectangulo = 8, alturaRectangulo = 6;
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("area Rectangulo = " + areaRectangulo);
        double perimetroRectangulo = Math.pow(baseRectangulo, 2) + Math.pow(alturaRectangulo, 2);
        System.out.println("perimetroRectangulo = " + perimetroRectangulo);
    }
}
