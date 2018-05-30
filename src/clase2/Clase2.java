/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palabra = input.nextLine();

        int hasta = palabra.length() / 2;

        boolean espalindromo = true;
        for (int i = 0, j = palabra.length() - 1; i < hasta; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                espalindromo = false;
                break;

            }
        }
        System.out.println("La palabra " + palabra + (espalindromo ? " es" : " no es") + " palindromo");

    }

}
