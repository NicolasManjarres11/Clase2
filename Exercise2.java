public class Exercise2 {
    public static void main(String[] args) {
        
        float precioPernilxCienGramos = 5.95f;
        float precioPernilXKilo = 29.75f;
        float precioReal = 1000 * precioPernilxCienGramos/100; //Convertimos kilos en gramos

        if(precioReal == precioPernilXKilo){
            System.out.println("El precio es correcto");
        } else {
            System.out.printf("El precio no es correcto, el precio real es %.2f", precioReal);
        }

    }
}
