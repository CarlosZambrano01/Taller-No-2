package edu.unicesar.p2.g02;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nEste programa recibe un caracter e imprime su correspondiente valor numerico.\n");

        System.out.print("\nIntroduzca un caracter: ");
        String caracter = entrada.nextLine();
        
        byte[] bytes = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.print("El valor numerico de su caracter es: "+bytes[0]);
        System.out.println("\n");
    }
    
}
