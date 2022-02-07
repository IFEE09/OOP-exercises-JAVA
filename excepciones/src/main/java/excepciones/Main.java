//Excepciones verificadas (IOException), leyendo un archivo de texto y mostrando su contenido
package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* @author IFEE09 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Leyendo archivo si es que existe, si no existe, tira una excepcion 
        BufferedReader required = new BufferedReader(new FileReader("/home/ifee09/Repositories/ejercicios-poo/excepciones/required.txt"));
        String contenido;
        
        //Checando que el archivo no este vacio
        while((contenido = required.readLine()) != null){
            System.out.println(contenido); //Se imprime el contenido del archivo
        }
        
        
    }

}
