package edu.unicesar.p2.g02;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEste programa recibe dos numeros enteros y da como resultado su suma, producto y diferencia.\n");

        System.out.print("Introduzca el primer entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo entero: ");
        int num2 = entrada.nextInt();
        
        suma(num1,num2);
        producto(num1,num2);
        diferencia(num1,num2);
        
    }
    
    public static void suma(int num1, int num2){
        int sum;
        
        sum = num1 + num2;
        System.out.printf("\nLa suma de los numeros es: %d\n", sum);
    }
    
    public static void producto(int num1, int num2){
        int prod;
        
        prod = num1 * num2;
        System.out.printf("El producto de los numeros es: %d\n", prod);
    }
    
    public static void diferencia(int num1, int num2){
        int dif;
        
        dif = num1 - num2;
        System.out.printf("La diferencia de los numeros es: %d\n", dif);
        
        
    }
}
