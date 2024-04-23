/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem3;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un palindromo");
        String frase = entrada.nextLine();
        boolean resultado = CP(frase.toLowerCase());
        System.out.println(resultado);
    }

    public static boolean CP(String f) {
        if (f.length() == 0 || f.length() == 1) {
            return true;
        }
        if (f.charAt(0) == f.charAt(f.length() - 1)) {
            return CP(f.substring(1, f.length() - 1));
        }
        return false;
    }

}
