
package main.recuerdos;
import java.util.Scanner;
/**
 *
 * @author braym
 */
public class Recuerdos {

    private static int edad;
    private static int añoNacimiento;   
    public static void main(String[] args) {
        
     comer();   
        
               
               
    }
    public static void comer(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Agregue su edad\n");
            edad = scanner.nextInt();
            añoNacimiento= 2024-edad;
            
         System.out.println("Usted nacio en el año "+ añoNacimiento);
         
         scanner.close();
        }
    
    
   
}


