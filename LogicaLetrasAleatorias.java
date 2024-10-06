/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeInterfaz;

import Interfaz.Letras;
import java.util.Random;


public class LogicaLetrasAleatorias {
    
    
    public static void main(String[]args){
        
         //objeto del cuadro de diálogo
        Letras objetoLetras = new Letras();
        //llammamos a este método para que se muestre el cuadro
        objetoLetras.setVisible(true);
        //para ponerlo en medio de la pantalla usar null
        objetoLetras.setLocationRelativeTo(null);
        
    }
    
     public String[] pilaB;//almacena 4 letras
     //método llenar pila B
    public String llenarPilaB(int tamaño){
        pilaB = new String[tamaño]; // inicializar el arreglo 
        Random letrasRandom = new Random();
      
        String res="";
        
        for(int j = 0; j < tamaño; j++){
            StringBuilder conjunto4 = new StringBuilder();
            for(int k = 0; k < 4; k++){
                char letras = (char)('a' + letrasRandom.nextInt(26));
                conjunto4.append(letras);
            }
       
        pilaB[j] = conjunto4.toString();//almacena las 4letras generadas en el arregloB
        res=pilaB[j];
        }
        return res;
    }
    
}
