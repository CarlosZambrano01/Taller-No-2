/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g02;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEste programa  leera el peso de un objeto (en kilogramos) e imprimira su equivalencia en: gramos, libras,\n"
                + "toneladas.\n");
        
        System.out.print("\nIndique el peso del objeto en kg: ");
        float peso = entrada.nextFloat();
        
        gramos(peso);
        libras(peso);
        toneladas(peso);
    }
    
    public static void gramos(float peso){
        
        float gr;
        
        gr = peso * 1000;
        System.out.printf("\n%.2f kg son: %.2f gramos \n",peso,gr);
    }
    
    public static void libras(float peso){
        
        double lib;
        
        lib = (peso * 2.20462);
        System.out.printf("%.2f kg son: %.5f libras \n",peso,lib);
    }
    
    public static void toneladas(float peso){
        
        float ton;
        
        ton = peso / 1000;
        System.out.printf("%.2f kg son: %.3f toneladas \n",peso,ton);
    }
    
}
