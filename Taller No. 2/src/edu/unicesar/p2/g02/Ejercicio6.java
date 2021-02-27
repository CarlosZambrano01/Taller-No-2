
package edu.unicesar.p2.g02;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("\nEste programa calculará el indice de masa corporal BMI.\n");
        System.out.print("\nIndique el valor de su peso en kg: ");
        float peso = entrada.nextFloat();
        System.out.print("Indique el valor de su altura en metros: ");
        float altura = entrada.nextFloat();
        
        indiceMasaCorporal(peso,altura);
        
    }
    
    public static void indiceMasaCorporal(float peso, float altura){
        
        float imc;
        imc = (peso)/(altura * altura);
        
        System.out.printf("\nSu indice de masa corporal es : %.2f\n",imc);
    }
    
}
