package com.mycompany.fracciones;

import fracciones.Fracciones;

/* @author IFEE09 */
public class Main {
    
    public static void main(String[] args) {
       
        Fracciones fraccion_1 = new Fracciones();
        Fracciones fraccion_2 = new Fracciones();
        Fracciones fraccion_3 = new Fracciones(2,0);
        
        Fracciones.imprimirFraccion(fraccion_3);
        
        fraccion_1.setNumerador();
        fraccion_1.setDenominador();
        Fracciones.imprimirFraccion(fraccion_1);
        
        fraccion_2.setNumerador();
        fraccion_2.setDenominador();
        Fracciones.imprimirFraccion(fraccion_2);
        
        System.out.println(Fracciones.sumar(fraccion_1, fraccion_2));
        System.out.println(Fracciones.restar(fraccion_1, fraccion_2));
        System.out.println(Fracciones.multiplicar(fraccion_1, fraccion_2));
        System.out.println(Fracciones.dividir(fraccion_1, fraccion_2));
        
    }

}
