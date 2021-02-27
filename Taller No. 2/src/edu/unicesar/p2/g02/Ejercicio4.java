
package edu.unicesar.p2.g02;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nEste programa calculará la longitud y el area de una circunferencia.\n");
        
        System.out.print("\nIntroduzca el valor del radio de la circunferencia: ");
        double radio = entrada.nextDouble();
        
        longitud(radio);
        area(radio);
    }
    
    public static void longitud(double radio){
        
        double longi;
        
        longi = 2 * Math.PI * radio;
        System.out.printf("\nLa longitud de la circunferencia es: %.2f\n",longi);
    }
    
    public static void area(double radio){
        
        double a;
        
        a = Math.PI * radio*radio;
        System.out.printf("\nEl area de la circunferencia es: %.2f\n",a);
    }
    
}
