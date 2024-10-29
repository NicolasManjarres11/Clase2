
public class Exercise1 {
    public static void main(String[] args) {
        int result = 6/2*(1+2);
        System.out.println(result);
    }
    
}
/* Primero se está eliminando el paréntesis, luego se multiplica este resultado por la fracción, esto da como resultado, el número 9 */
/* También se obtiene el resultado haciendo la operación de corrido luego de "romper el paréntesis", es decir, se hace primero la división y luego la multiplicación*/

/* Pero en la calculadora, rompe el paréntesis, se multiplica el resultado por el denominador de la fracción y se divide, dando como resultado el número 1 */
/* Este resultado está mal, ya que no obedece a las reglas de prioridad de ´las operaciones, por lo tanto, el resultado correcto es 9 */