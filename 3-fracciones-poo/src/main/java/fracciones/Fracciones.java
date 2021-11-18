package fracciones;

import java.util.Scanner;

/* @author IFEE09 */
public class Fracciones {
    
    //atributos
    private double numerador;
    private double denominador;
    private Scanner entrada = new Scanner(System.in);
    
    //metodo constructor sin parametros
    public Fracciones(){
        
    }
    
    //Metodo constructor con parametros
    public Fracciones(double numerador, double denominador){
        
        this.numerador = numerador;
        
        esDenominadorNegativo(denominador);
        
    }

    //metodos Getters y Setters
    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setNumerador() {
        System.out.println("Ingrese el numerador de la fraccion: ");
        numerador = entrada.nextDouble();
    }

    public void setDenominador() {
        System.out.println("Ingrese el denominador de la fraccion: ");
        denominador = entrada.nextDouble();
        
        esDenominadorNegativo(denominador);
        
    }
    
    //Funcion que recibe dos fracciones y las suma en el orden recibido
    public static double sumar(Fracciones fraccion_1, Fracciones fraccion_2){
        double resultado_Suma = (fraccion_1.getNumerador() / fraccion_1.getDenominador()) +
                (fraccion_2.getNumerador() / fraccion_2.getDenominador());
        return resultado_Suma;
    }
    
    //Funcion que recibe dos fracciones y las resta en el orden recibido
    public static double restar(Fracciones fraccion_1, Fracciones fraccion_2){    
        double resultado_Resta = (fraccion_1.getNumerador() / fraccion_1.getDenominador()) -
                (fraccion_2.getNumerador() / fraccion_2.getDenominador());
        return resultado_Resta;
    }
    
    //Funcion que recibe dos fracciones y las multiplica en el orden recibido
    public static double multiplicar(Fracciones fraccion_1, Fracciones fraccion_2){    
        double resultado_Multp = (fraccion_1.getNumerador() / fraccion_1.getDenominador()) *
                (fraccion_2.getNumerador() / fraccion_2.getDenominador());
        return resultado_Multp;
    }
    
    //Funcion que recibe dos fracciones y las divide, validando que el denominador no sea 0
    public static double dividir(Fracciones fraccion_1, Fracciones fraccion_2){
        
        if((fraccion_2.getNumerador()/fraccion_2.getDenominador()) != 0){
            double resultado_Div = (fraccion_1.getNumerador() * fraccion_2.getDenominador())/
                    (fraccion_1.getDenominador()*fraccion_2.getNumerador());
            return resultado_Div;
        }
        
        System.out.println("Error, no se puede divir algo entre 0");
        return Double.NaN;
        
    }
    
    //funcion que recibe una fracion y te dice cual es
    public static void imprimirFraccion(Fracciones fraccion){
        System.out.println("La fraccion es " + fraccion.getNumerador() + "/" + fraccion.getDenominador());
    }
    
    //validador de denominador negativo.  
    private void esDenominadorNegativo(double denominador){
        
        while(denominador == 0){
            System.out.println("Error, denominador no puede ser cero, ingrese de nuevo:");
            denominador = entrada.nextDouble();    
            this.denominador = denominador;
        }
    }
    
}
