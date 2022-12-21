/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        String cadenaFinal = ""; 
        // forma 1
        int[][] arreglo1 = new int[3][4];
             
        arreglo1[0][2] = 1000;
        
               
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                //System.out.printf("fila[%d] columna[%d] = %d\n", 
                //        fila, col, arreglo1[fila][col]);
                cadenaFinal = String.format ("%sfila[%d] columna[%d] = %d \n"
                        , cadenaFinal, fila, col, arreglo1 [fila][col]);
                
                
            }
        }
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
}
