package libro;


/* @author IFEE09 */
public class Libro {

    //atributos
    private long ISBN;
    private String nombre;
    private String autor;
    private int numPaginas;
    private static long contadorLibros = 0;

    //Metodo constructor
    public Libro(long ISBN, String nombre, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.nombre = nombre;
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

    public int getNumPaginas() {
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

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public static long getCantidad(){
        return contadorLibros;
    }
    
    @Override
    public String toString(){
        return "Libro: " + nombre
                + "\nAutor: " + autor
                + "\nISBN: " + ISBN
                + "\nNumero de paginas: " + numPaginas
                + "\n";
    }
    
}
