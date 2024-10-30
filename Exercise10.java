import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Calculadora de la media arimética");

        System.out.println("\nInserte el primer número");
        double num1 = sc.nextInt();

        System.out.println("Inserte el segundo número");
        double num2 = sc.nextInt();

        System.out.println("Inserte el tercer número");
        double num3 = sc.nextInt();

        double media = (num1+num2+num3)/3;

        System.out.printf("\nLa media de los números ingresados es: %.1f", media);

        sc.close();

    }
}
