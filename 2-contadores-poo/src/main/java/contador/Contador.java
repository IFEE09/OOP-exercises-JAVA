package contador;


/* @author IFEE09 */
public class Contador {
    
    private long cuenta;
    
    //Constructor por defecto, es decir, sin parametros.
    public Contador(){
        
    }
    
    //Constructor con parametros, en este caso donde empieza la cuenta
    public Contador(long cuenta){
        
        if (cuenta >= 0){
            this.cuenta = cuenta;
        } else {
            System.out.println("La cuenta no puede empezar en negativo, sera 0 por defecto\n");
            this.cuenta = 0;
        }
        
    }
    
    //Constructor copia que admite un objeto de la misma clase como parametro. 
    public Contador(final Contador contador){
        cuenta = contador.cuenta;
    }

    //Getters y Setters
    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }
    
    //Metodos propios
    public void aumentarCuenta(){
        cuenta++;
    }
    
    public void decrementarCuenta(){
        
        if(cuenta <= 0){
            System.out.println("No se puede decrementar una cuenta en ceros");
            return;
        } 
        
        cuenta--;
    }
    
}
