package libro;

/* @author IFEE09 */
public class Libro {
    
    //UpperCamelCase Clases
    //lowerCamelCase atributos y variables, metodos
    //Atributos
    private String ISBN;
    private String autor;
    private String nombre;
    private int numPaginas;
    
    //contador de libros global
    private static int contadorLibros;
    
    //constructor default
    public Libro(){
        contadorLibros++;
    }
    
    //Metodo constructor con parametros
    public Libro(String ISBN, String autor, String nombre, int numPaginas){
        this.ISBN = ISBN;
        this.autor = autor;
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        contadorLibros++;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public static int getCantidadLibros(){
        return contadorLibros;
    }
    
    @Override
    public String toString(){
        return "\nAutor: " + autor 
                + "\nNombre: " + nombre
                + "\nISBN: " + ISBN
                + "\nNumero Paginas: " + numPaginas;
    }
    
}
