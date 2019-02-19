
package punto2;

import java.util.Scanner;

/**
 *
 * @author Mendoza
 */
public class HexBin {
 private final String[] hexBits = {
        "0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"
    };
        
    
    public static void main(String[] args) {
       
     Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el Hexadecimal: ");
        String hexStr= in.next();
        
        HexBin aHexBin = new HexBin();
        if (!aHexBin.isHex(hexStr))
        
        {
            System.out.println(" Hexadecimal Invalido \n"+hexStr);
            return;
        }
        aHexBin.ConvertHexBi(hexStr);
        
    }
            
  private boolean isHex (String hexStr)
  {
    for (int i=0; i<hexStr.length(); i++){
        if (0> Character.digit(hexStr.toLowerCase().charAt(i),16)){
            return false;
        }
    }
  return true;
  }
        
     private void ConvertHexBi(String hexStr){
         
         System.out.println("El equivalente binario del Hexadecimal de: " +hexStr);
         
         for (int i=0; i<hexStr.length();i++){
             
          int j= Character.digit(hexStr.toLowerCase().charAt(i),16);   
             System.out.println(hexBits[j]);
         }
         System.out.println();
     }   
          
}

