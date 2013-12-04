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
         
        if (symbol >= 'A' && symbol <= 'Z'){    //Je to velké písmeno.
        
            System.out.println("Dostali jste velké písmeno " + symbol);
            
        } else {
        
          if (symbol >= 'a' && symbol <= 'z' )  {   // Nebo malé ?
          
              System.out.println("Dostali jste malé písmeno " + symbol);
          
          } else {      //Není to méně než z
          
              System.out.println("Kód není žádné písmeno");
              
          }
            
        }
        
    }
    
}