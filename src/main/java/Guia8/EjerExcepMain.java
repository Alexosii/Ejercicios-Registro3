/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author VMH
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner teclado = new Scanner(System.in);
        boolean stop;
        do{
        try{
            stop = false;
        System.out.println("Ingrese la cantidad de numeros enteros que quiera mostrar en pantalla:");
        num = teclado.nextInt();
        
       
        for(int i = 0 ; i<= num ; i++){
        
            
           System.out.print(i);
           
        
           if(i < num){
           
           System.out.print(",");
           }
          
        }
        
       
               
            }
           
        catch(InputMismatchException ex){
                
                   System.out.print("Ingrese por obligacion un numero entero:");
                   teclado.next();
                   stop = true;
                   
              }
           finally{
        
        System.out.println("\nSe cierran los recursos");
        }
    
        }
        while(stop);
         
        
    
        
    }
    
}
