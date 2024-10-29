public class Exercise6 {
    public static void main(String[] args) {
        
        double pricePants = 34;
        double priceWithoutDiscount = (pricePants/0.85); //Restamos a 1 la cantidad del procentaje y dividimos el precio con descuento por el resultado de la resta

        System.out.printf("El precio de los pantalones sin descuento es de %.0f", priceWithoutDiscount);

    }
}
