/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Juan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

////        int a = 10;
////        int b = 2;
////        int c = 0, d = 0;
////        try {
////            c = a + b;
////            System.out.println(c);
////            d = a / 0;
////            System.out.println(d);
////        } catch (ArithmeticException e) {
////            System.out.println(" No se puede");
////        }
////        System.out.println(a);

        int r = 0, d = 0;
        
        try {
            System.out.println(metodo());
        } catch(Exception e) {
           System.err.println("Excepcion en metodo()") ;
           e.printStackTrace();
        }

        System.out.println("Hola");

    }

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println(" Valor final del try :" + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println(" Valor antes del return: " + valor);
        return valor;
    }
}
