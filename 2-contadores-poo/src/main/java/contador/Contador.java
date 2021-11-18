package contador;

/* @author IFEE09 */
public class Contador {
    
    //Atributo
    
    private long cuenta;
    
    //Constructor por defeco
    public Contador(){
        
    }
    
    //Constructor con parametros
    public Contador(long cuenta){
        
        if(validarCuentaNegativa(cuenta)){
            setCuenta(0);
            return;
        }
        
        this.cuenta = cuenta;
        
    }
    
    //Constructor copia
    public Contador(Contador contador_1) {
        this.cuenta = contador_1.getCuenta();
    }
    
    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        
        if(validarCuentaNegativa(cuenta)){
            this.cuenta = 0;
            return;
        }
        
        this.cuenta = cuenta;
    }
    
    public long incrementarCuenta(){
        return cuenta++;
    }
    
    public long decrementarCuenta(){
        return cuenta--;
    }
    
    private boolean  validarCuentaNegativa(long cuenta){
        
        boolean esNegativo = true;
        
        if (cuenta  < 0){
            System.out.println("Error, no puede ser negativa la cuenta, entonces sera 0.");
            return esNegativo;
        } 
        
        return !esNegativo;
        
    }
        
}
