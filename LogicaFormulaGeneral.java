
package LogicaDeInterfaz;
import Interfaz.FormulaGeneral;

public class LogicaFormulaGeneral {
    
    public static void main(String[]args){
        
        //objeto del cuadro de diálogo
        FormulaGeneral objetoFormulaGeneral = new FormulaGeneral();
        //llammamos a este método para que se muestre el cuadro
        objetoFormulaGeneral.setVisible(true);
        //para ponerlo en medio de la pantalla usar null
        objetoFormulaGeneral.setLocationRelativeTo(null);
                
        
    }
    
    //metodo para calcular la fórmula general
    
   public String calcularFG(double a, double b, double c){
        
        double d = b * b - 4 * a * c;
       
        
       if(d < 0){         
           return "No puede calcularse."; 
       }
       
           double x1 = (-b + Math.sqrt(d)) / (2 * a);
          double  x2 = (-b - Math.sqrt(d)) / (2 * a);
       
       return "x1: " + x1 + "\n" + " x2: " + x2;     
   }
     
}
