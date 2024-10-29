
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        
        //Conversor de grados a Fahrenheit y Kelvin

        var sc = new Scanner(System.in);

        double celsius;

        System.out.println("Conversor de tempretaturas\n");
        System.out.println("Ingrese los grados Celsius a convertir");
        celsius = sc.nextDouble();

        double fahrenheit = celsius - 9/5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("La temperatura de grados a Fahrenheit es: %.2f °F\n",fahrenheit);
        System.out.printf("La temperatura de grados a Kelvin es: %.2f K",kelvin);


        sc.close();
    }
}
