package com.mycompany.complejos.poo;

import Complejos.Complejo;

/* @author IFEE09 */
public class Main {
    public static void main(String args[]){
            
        Complejo complejo_1 = new Complejo(2,4);
        Complejo complejo_2 = new Complejo(3, -6);
        Complejo complejo_3 = new Complejo(0, 0);

        Complejo.sumarComplejos(complejo_1, complejo_2);
        Complejo.restarComplejos(complejo_1, complejo_2);
        Complejo.multiplicarComplejos(complejo_1, complejo_2);
        Complejo.dividirComplejos(complejo_1, complejo_3);
        Complejo.dividirComplejos(complejo_1, complejo_2);

    }
}
