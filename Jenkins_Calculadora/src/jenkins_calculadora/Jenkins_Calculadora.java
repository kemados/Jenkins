
package jenkins_calculadora;

import static Entidades.Calculadora.dividir;
import static Entidades.Calculadora.multiplicar;
import static Entidades.Calculadora.restar;
import static Entidades.Calculadora.sumar;
import java.util.Scanner;
/**
 *
 * @author Emanuel
 */
public class Jenkins_Calculadora{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));

        try {
            System.out.println("División: " + dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
   
