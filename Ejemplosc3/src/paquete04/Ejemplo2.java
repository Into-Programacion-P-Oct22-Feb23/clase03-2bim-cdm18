/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales de CARLOS MEJIA el 21 de diciembre de 2022

        int[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
         */
        String cadenaFinal = "";
        int[][] datos2 = new int[2][3];

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                int valor = dato1[fila][col];
                if (valor % 2 == 0) {
                    valor = valor * valor;
                    datos2[fila][col] = valor;
                } else {
                    dato1[fila][col] = valor;
                }
            }
        }
        for (int fila = 0; fila < dato1.length; fila++) {
            cadenaFinal = cadenaFinal + "\n";
            for (int col = 0; col < dato1[fila].length; col++) {
                int valor = dato1[fila][col];
                if (valor % 2 == 0) {
                    valor = valor * valor;
                    datos2[fila][col] = valor;
                    cadenaFinal = String.format ("%s%d\t",cadenaFinal, 
                            datos2 [fila][col]);
                } else {
                    dato1[fila][col] = valor;
                    cadenaFinal = String.format ("%s%d\t",cadenaFinal, 
                            dato1 [fila][col]);
                }
            }
        }
        System.out.printf("%s", cadenaFinal);
    }
}