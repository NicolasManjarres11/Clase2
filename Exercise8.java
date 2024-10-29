
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        
        //Calcularemos área y perímetro

        double length;
        double width;

        var sc = new Scanner(System.in);

        System.out.println("Area y perimetro de un triangulo\n");
        System.out.println("Ingresa la longitud del rectangulo");
        
        length = sc.nextDouble();

        System.out.println("Ingresa el ancho del rectangulo");

        width = sc.nextDouble();

        System.out.printf("El area del rectangulo es de %.2f y el perimetro es de %.2f",(length*width),((2*length)+(2*width)));

        sc.close();



    }
}
