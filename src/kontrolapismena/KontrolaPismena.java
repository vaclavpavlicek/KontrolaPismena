/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontrolapismena;

/**
 *
 * @author Venda
 */
public class KontrolaPismena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         char symbol = 'A' ;
         symbol = (char) (128.0 * Math.random());   //Generuje náhodný znak.
         
         if (symbol >= 'A' ){   //Je to A nebo větší.
         
             if (symbol <= 'Z'){    //ano , a je to Znebo menší ?
                 // Potom to je velké písmeno.
                 
                 System.out.println("Dostali jste velké písmeno " + symbol );
                 
             }else{ // Není to Z nebo menší.
             
                 if (symbol >= 'a' ){   //A je to a nebo větší.
                 
                     if (symbol <= 'z' ){   // Ano ,je to menší než z?
                         // Tak je to malé písmeno.
                         
                         System.out.println("Dostali jste malé písmeno " + symbol);
                         
                     }else{     //Je to více než a a není to písmeno.
                     
                         System.out.println("Kód je větší než a a není to písmeno, je to " + symbol);
                         
                     }
                     }else{     //Není to méně než z.
                     
                         System.out.println("Kód je menší než a a není to písmeno , je to " + symbol);
                         
                     }
                
             }
             
         }else{
         
             System.out.println("Kód je menší než A, takže to není písmeno.");
             
         }
         
    }
    
}
