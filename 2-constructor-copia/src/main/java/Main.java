
/* @author IFEE09 */
public class Main {
    
    public static void main(String args[]){
        
        Contador cuenta_1 = new Contador(20);
        Contador cuenta_2 = new Contador(-20);
        Contador cuenta_3 = new Contador();
        Contador cuenta_4 = new Contador(cuenta_1);
        
        cuenta_1.aumentarCuenta();
        cuenta_2.decrementarCuenta();
        
        System.out.println(cuenta_1.getCuenta());
        System.out.println(cuenta_2.getCuenta());
        System.err.println(cuenta_3.getCuenta()); //observamos que el constructor sin parametros da por defecto al atributo cuenta el valor de 0
        System.out.println(cuenta_4.getCuenta());
        
    }

}
