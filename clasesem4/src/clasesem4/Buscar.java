/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem4;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Buscar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo2 = {3, 7, 2, 9, 8};
        System.out.println("Ingrese el numero");
        int numero = entrada.nextInt();
        int dato = buscar(arreglo2, numero);
        if (dato == -1) {
            System.out.println("El numero no fue encontrado ");
        } else {
            System.out.println("El numero fue encontrado en "
                    + "la posicion[" + dato + "]del arreglo");
        }
    }

    public static int buscar(int[] num, int dato) {
        int indice =-1;
            for (int i = 0; i < num.length; i++) {
                if (num[i]==dato) {
                    indice=i;
                }
        }
       return indice ;
    }
}