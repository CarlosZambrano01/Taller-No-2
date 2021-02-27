package edu.unicesar.p2.g02;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nEste programa recibira tres valores decimales y mostrara la suma, promedio, producto, cociente y modulo.\n");
        
        System.out.print("\nIntroduzca el primer valor decimal: ");
        float num1 = entrada.nextFloat();
        System.out.print("Introduzca el segundo valor decimal: ");
        float num2 = entrada.nextFloat();
        System.out.print("Introduzca el tercer valor decimal: ");
        float num3 = entrada.nextFloat();
        
        suma(num1,num2,num3);
        promedio(num1,num2,num3);
        producto(num1,num2,num3);
        cociente(num1,num2,num3);
        modulo(num1,num2,num3);
    }
    
    public static void suma(float num1, float num2, float num3){
        
        float sum; 
        
        sum = num1 + num2 + num3;
        System.out.printf("\nLa suma de  %.2f + %.2f + %.2f = %.2f\n",num1,num2,num3,sum);
    }
    
    public static void promedio(float num1, float num2, float num3){
        
        float prom; 
        
        prom = (num1 + num2 + num3)/3;
        System.out.printf("El promedio de  %.2f + %.2f + %.2f / 3 = %.2f\n",num1,num2,num3,prom);
    }
    
    public static void producto(float num1, float num2, float num3){
        
        float prod; 
        
        prod = num1 * num2 * num3;
        System.out.printf("El producto de  %.2f * %.2f * %.2f = %.2f\n",num1,num2,num3,prod);
    }
    
    
    public static void cociente(float num1, float num2, float num3){
        
        float coci; 
        
        coci = num1 / num2 / num3;
        System.out.printf("El cociente de  %.2f / %.2f / %.2f = %.2f\n",num1,num2,num3,coci);
    }   
    
    public static void modulo(float num1, float num2, float num3){
        
        float mod; 
        
        mod = (num1 % num2 % num3);
        System.out.printf("El modulo de  %.2f , %.2f , %.2f = %.2f\n",num1,num2,num3,mod);
    }
    
}
