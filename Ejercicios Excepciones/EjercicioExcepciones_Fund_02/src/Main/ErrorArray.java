
package Main;

import javax.swing.JOptionPane;


/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/


public class ErrorArray {

    public static void main(String[] args) {
      
        int [] numeros = {1,2,3,4,5,6}; 
    
        System.out.println(" El número ubicado en la Segunda posicion es : " + numeros[2] );
        
        try{
          System.out.println(" El número ubicado en la Seis posicion es : " + numeros[6] );
        } 
        catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println(" Error al querer encontrar un indice fuera del limite ");
            JOptionPane.showMessageDialog(null," Error al querer encontrar un indice fuera del limite");
        }
      
    }
    
}
