package com.mycompany.libros.poo;

import libro.Libro;


/* @author IFEE09 */
public class Main {
    
    public static void main(String[] args){
        
        Libro libro_1 = new Libro(451645541, "El condor feliz", "Pedro Launcher", 399);
        Libro libro_2 = new Libro(545454455, "La odisea de julio", "Martin Perez", 299);
       
        System.out.println(libro_1.toString());
        System.out.println(libro_2.toString());
        
        String libroMasPaginas = masPaginas(libro_1, libro_2);
        
        System.out.println(libroMasPaginas);
        
        long cantidadLibros = Libro.getCantidad();
        
        System.out.println("\nSe han creado " + cantidadLibros + " libros");
              
    }
    
    public static String masPaginas(Libro libro_1, Libro libro_2){
        
        if (libro_1.getNumPaginas() > libro_2.getNumPaginas()) {
            return "El libro " + libro_1.getNombre() + " tiene mas paginas";
        } else if (libro_1.getNumPaginas() < libro_2.getNumPaginas()) {
            return "El libro " + libro_2.getNombre() + " tiene mas paginas";
        }
        
        return "Ambos libros tienen " + libro_1.getNumPaginas() + " paginas";
    }
    
}
