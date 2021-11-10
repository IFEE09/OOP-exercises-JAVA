
/* @author IFEE09 */
public class Libros {

    //atributos
    private long ISBN;
    private String nombre;
    private String autor;
    private short numPaginas;
    private static long contadorLibros = 0;

    //Metodo constructor
    public Libros(int ISBN, String nomb, String autor, short numPaginas) {
        this.ISBN = ISBN;
        this.nombre = nomb;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.contadorLibros++;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public long getContadorLibros() {
        return contadorLibros;
    }
    
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public long getCantidadLibros(){
        return contadorLibros;
    }
    
    @Override
    public String toString(){
        return "\nLibro: " + nombre
                + "\n Autor: " + autor
                + "\n ISBN: " + ISBN
                + "\n Numero de paginas: " + numPaginas;
    }
    
}
