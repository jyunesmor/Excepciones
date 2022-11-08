/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumeroMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num = (int) (Math.random() * 500 + 1);
        int intentos = 0;
        int op = 0;
        System.out.println(num);

        do {
            try {
                System.out.println("Ingrese el número a adivinar");
                op = leer.nextInt();
                if (num > op) {
                    System.out.println(" El número a adivinar es mayor al ingresado");
                } else if ( num < op) {
                    System.out.println(" El número a adivinar es menor al ingresado");
                }
                if (num == op) {
                    System.out.println(" El numero ingresado es correcto");
                }
            } catch (Exception e) {
                System.out.println(" el valor ingresado no es un número ");
                leer.nextLine();
            } 

            intentos++;
        } while (op != num);

        System.out.println(" La cantidad de Intentos es de : " + intentos);

    }

}
