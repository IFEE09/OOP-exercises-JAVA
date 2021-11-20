package Complejos;
/* @author IFEE09 */
public class Complejo {
    
    //atributos
    private double parteReal;
    private double parteImaginaria;
    
    //constructor con parametros
    public Complejo(double parteReal, double parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        
        if(parteImaginaria >= 0){
            System.out.println(parteReal + "+" + parteImaginaria + "i");
        } else {
            System.out.println(parteReal + "" + parteImaginaria + "i");
        }
        
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }
 
    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    //Metodos de la clase
    public static Complejo sumarComplejos(Complejo complejo_1, Complejo complejo_2){
        
        double resultadoReal = complejo_1.getParteReal() +  complejo_2.getParteReal();
        double resultadoImaginario = complejo_1.getParteImaginaria() + complejo_2.getParteImaginaria();
       
        Complejo resultadoComplejo = new Complejo(resultadoReal, resultadoImaginario);
      
        return resultadoComplejo;
    }
    
    public static Complejo restarComplejos(Complejo complejo_1, Complejo complejo_2){
        
        double resultadoReal = complejo_1.getParteReal() -  complejo_2.getParteReal();
        double resultadoImaginario = complejo_1.getParteImaginaria() - complejo_2.getParteImaginaria();
       
        Complejo resultadoComplejo = new Complejo(resultadoReal, resultadoImaginario);
      
        return resultadoComplejo;
    }
    
    public static Complejo multiplicarComplejos(Complejo complejo_1, Complejo complejo_2){
        
        double resultadoReal = complejo_1.getParteReal() *  complejo_2.getParteReal();
        double resultadoImaginario = complejo_1.getParteImaginaria() * complejo_2.getParteImaginaria();
       
        Complejo resultadoComplejo = new Complejo(resultadoReal, resultadoImaginario);
      
        return resultadoComplejo;
    }
    
    public static Complejo dividirComplejos(Complejo complejo_1, Complejo complejo_2){
        
        if(denominadorCero(complejo_2.getParteReal(), complejo_2.getParteImaginaria())){
            System.out.println("Error, el denominador es 0, no existe la dvision");
            return null;
        } 
        
        double resultadoReal = complejo_1.getParteReal() /  complejo_2.getParteReal();
        double resultadoImaginario = complejo_1.getParteImaginaria() / complejo_2.getParteImaginaria();
        
        Complejo resultadoComplejo = new Complejo(resultadoReal, resultadoImaginario);
      
        return resultadoComplejo;
    }
    
    
    private static boolean denominadorCero(double parteReal, double parteImaginaria){
        
        return (parteReal == 0 && parteImaginaria == 0);
        
    }
    
     
}
