package com.mycompany.constructor.copia;

import contador.Contador;


/* @author IFEE09 */
public class Main {
    
    public static void main(String args[]){
        
        Contador farid = new Contador(100);
        Contador teo = new Contador(500);
        Contador diego = new Contador(teo);
        
        System.out.println(farid.getCuenta());
        System.out.println(teo.getCuenta());
        System.out.println(diego.getCuenta());
        
        teo.incrementarCuenta();
        diego.decrementarCuenta();
        
        System.out.println("");
        
        System.out.println(farid.getCuenta());
        System.out.println(teo.getCuenta());
        System.out.println(diego.getCuenta());
        
    }

}
