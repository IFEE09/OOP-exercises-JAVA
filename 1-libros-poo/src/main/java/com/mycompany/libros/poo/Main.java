package com.mycompany.libros.poo;

import javax.management.remote.rmi.RMIConnection;
import libro.Libro;

/* @author IFEE09 */
public class Main {
    
    public static void main(String[] args){
        
        
        Libro libro_1 = new Libro("1273137812879312", "Martin Jesus", "Programacion OO para UADY", 1);
        Libro libro_2 = new Libro("1289712634761234", "Ruth Castro", "La fantastica vida de Ruth en LIS", 1000);
        Libro libro_3 = new Libro("1289712634761234", "Diego Burgos", "La triste vida de Diego en Lineal", 1);

        System.out.println(libro_1);
        System.out.println(libro_2);
        System.out.println(libro_3);

        System.out.println( "La cantidad de libros creadas es: " + Libro.getCantidadLibros());
        
        masPaginas(libro_1, libro_3);
        
    }
    
    public static void masPaginas(Libro libroUno, Libro libroDos){
        
        if (libroUno.getNumPaginas() > libroDos.getNumPaginas()){
            System.out.println("El libro " + libroUno.getNombre()  + " tiene mas paginas");
            return;
        } else if(libroUno.getNumPaginas() < libroDos.getNumPaginas()){
            System.out.println("El libro " + libroDos.getNombre()  + " tiene mas paginas");
            return;
        } 
        
        System.out.println("Ambos libros tiene la misma cantidad de paginas");
        
    }
    
}
