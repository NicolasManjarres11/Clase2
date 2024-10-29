
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Inserte el primer número");
        double num1 = sc.nextDouble();

        System.out.println("Inserte el segundo número");
        double num2 = sc.nextDouble();

        System.out.println("Inserte la operación que desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("El resultado es: "+(num1+num2));
                break;
            case 2:
                System.out.println("El resultado es: "+(num1-num2));
                break;
            case 3:
                System.out.println("El resultado es: "+(num1*num2));
                break;
            case 4:
                System.out.println("El resultado es: "+(num1/num2));
                break;
            default:
                System.out.println("Opción inválida");
        }

        sc.close();

    }
}
