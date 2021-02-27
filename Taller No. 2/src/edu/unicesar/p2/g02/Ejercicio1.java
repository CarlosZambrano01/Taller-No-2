package edu.unicesar.p2.g02;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEste programa recibe dos datos de tipo entero los almacene y ejecute las instrucciones.\n");

        System.out.print("\nIntroduzca el primer entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo entero: ");
        int num2 = entrada.nextInt();
        
        System.out.printf("\nnum1 = %d\n",num1);
        System.out.printf("El valor de %d + %d es %d\n",num1,num1,(num1+num1));
        System.out.printf("num1 = %.3f\n", (double)num1);
        System.out.printf("%d - %d\n\n",(num1+num2),(num2+num1));
    }
    
}
