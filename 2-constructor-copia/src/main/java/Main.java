
/* @author IFEE09 */
public class Main {
    
    public static void main(String args[]){
        
        Contador contador_1 = new Contador(20);
        Contador contador_2 = new Contador(-20);
        Contador contador_3 = new Contador();
        Contador contador_4 = new Contador(contador_1);
        
        contador_1.aumentarCuenta();
        contador_2.decrementarCuenta();
        
        System.out.println(contador_1.getCuenta());
        System.out.println(contador_2.getCuenta());
        //aqui vemos que el atributo cuenta de la cuenta 3, se inicializa por defecto en 0 
        System.out.println(contador_3.getCuenta()); 
        //Aqui vemos que a pesar de que se aumento la cuenta 1, no aumenta la cuenta cuatro que contenia
        //como parametro a la cuenta_1, ya que no son el mismo objeto, solo le dio sus valores en ese momento de creacion
        System.out.println(contador_4.getCuenta());
        
    }

}
