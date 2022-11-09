/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Ejercicio6 {

    public void metodoA() {
        int a = 10;
        int b = 2;
        int c = 0, d = 0;
        try {
            c  = a + b;
            d = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(" No se puede");
        }
        System.out.println(a);
    }
}


