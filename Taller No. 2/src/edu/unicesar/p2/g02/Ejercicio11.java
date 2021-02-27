package edu.unicesar.p2.g02;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEste programa leera una cantidad numerica entre 0 y 1000 e imprimira las unidades, decenas y centenas.\n");

        System.out.print("\nIngrese una cantidad numerica entre 0 y 1000: ");
        int num = entrada.nextInt();

        if (num > 0 && num < 1000) {
            int unidades = num % 10;
            int decenas = (num / 10) % 10;
            int centenas = (num / 100) % 10;

            System.out.printf("\n%d tiene %d unidades\n", num, unidades);
            System.out.printf("%d tiene %d decenas\n", num, decenas);
            System.out.printf("%d tiene %d centenas\n", num, centenas);
        }else{
            System.out.println("\nError, el numero no esta dentro del rango indicado.\n");
        }
    }
}
