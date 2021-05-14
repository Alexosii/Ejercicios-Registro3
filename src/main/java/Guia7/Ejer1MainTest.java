/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import static Guia7.MainTestBcrypt.encriptar;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author VMH
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String nombre;
    String fechaVencimiento;
    String numeroTarjeta;
    String pinSeguridad;
       
    Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese el nombre del usuario :");
       nombre = teclado.nextLine();
       System.out.println("Ingrese la fecha de vencimiento de la tarjeta(dd/mm) :");
       fechaVencimiento = teclado.nextLine();
       System.out.println("Ingrese el numero de la tarjeta :");
       numeroTarjeta = teclado.nextLine();
        System.out.println("Ingrese el pin de seguridad de la tarjeta :");
          pinSeguridad = teclado.nextLine();
        
      String oculto;
      String oculto2;
        
        oculto = encriptar(numeroTarjeta);
            oculto2 = encriptar(pinSeguridad);
            
        Ejer1 registro;
        registro = new Ejer1(nombre,fechaVencimiento,oculto,oculto2);
        
            System.out.println("\nLos datos de registro son:");
        System.out.println("Nombre: " + registro.getNombre());
        System.out.println("Fecha de vencimiento: " + registro.getFechavencimiento());
        System.out.println("numero Tarjeta: " + registro.getNumeroTarjeta());
        System.out.println("Pin de seguridad: " + registro.getPinSeguridad());
      
        String  numeroTarjeta_check;
         String  pinSeguridad_check;
         
        System.out.println("Ingrese el numero de la tarjeta a verificar :");
        numeroTarjeta_check = teclado.nextLine();
         System.out.println("Ingrese el pin de seguridad a verificar :");
         pinSeguridad_check = teclado.nextLine();
                
                
        if (BCrypt.checkpw(numeroTarjeta_check, registro.getNumeroTarjeta()) || BCrypt.checkpw(pinSeguridad_check, registro.getPinSeguridad())){
        System.out.println("El numero de la tarjeta es correcto");
  }else {
          System.out.println("El numero de la tarjeta es incorrecta");
        }
            
          
            
        
        
        
    
    }
    
         public static String encriptar(String pass){
    return BCrypt.hashpw(pass,BCrypt.gensalt());
         }

    
}
