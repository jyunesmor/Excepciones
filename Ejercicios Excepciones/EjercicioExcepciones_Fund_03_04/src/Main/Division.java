/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0, num1 = 0;

        boolean flag;

        do {
            flag = false;
            try {
                System.out.println(" Ingrese el primer número ");
                num = Integer.parseInt(leer.next());
                System.out.println(" Ingrese el segundo número ");
                num1 = Integer.parseInt(leer.next());
                int resultado = num / num1;
                System.out.println("El resultado de dividir " + num + " con " + num1 + " es de: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println(" El valor ingresado no es un número ");
                flag = true;
            } catch (ArithmeticException ae) {
                System.out.println(" El Número divisor no puede ser igual a 0 ");
                flag = true;
            }
        } while (flag == true);

        try{
            System.out.println(" Ingrese el primer número ");
            num = leer.nextInt();
        } catch(InputMismatchException i){
            System.out.println("No ingreso un número");
        }
    }

}
