/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;


import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author VMH
 */
public class MainTestBcrypt {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String nombre;
        String apellidos;
        float edad;
        String departamento;
        String email;
        String id_usuario;
        String password;
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Ingrese el nombre del usuario :");
       nombre = teclado.nextLine();
       System.out.println("Ingrese el apellido del usuario :");
       apellidos = teclado.nextLine();
       System.out.println("Ingrese la edad :");
       edad = Float.parseFloat(teclado.nextLine());
        System.out.println("Ingrese el departamento :");
        departamento = teclado.nextLine();
        System.out.println("Ingrese el email :");
        email = teclado.nextLine();
        System.out.println("Ingrese el Id :");
        id_usuario = teclado.nextLine();
        System.out.println("Ingrese el paswword :");
        password = teclado.nextLine();
        
        String pass_hash;
        
        pass_hash = encriptar(password);
        
        Login registro;
        registro = new Login(nombre,apellidos,edad,departamento,email,id_usuario,pass_hash);
        
        System.out.println("Los datos de registro son:");
        System.out.println("Nombre: " + registro.getNombre());
        System.out.println("Apellidos: " + registro.getApellidos());
        System.out.println("edad: " + registro.getEdad());
        System.out.println("Departamento: " + registro.getDepartamento());
        System.out.println("Email: " +  registro.getEmail());
        System.out.println("Id: " + registro.getId_usuario());
        System.out.println("Password: " + registro.getPassword());
        
        
        String  password_check;
        System.out.println("Ingrese el password a verificar :");
        password_check = teclado.nextLine();
        
        if (BCrypt.checkpw(password_check, registro.getPassword())){
        System.out.println("El password es correcto");
    }else{
         System.out.println("El password es incorrecto");
        }
  
            
          
        
    }
    
     public static String encriptar(String pass){
    return BCrypt.hashpw(pass,BCrypt.gensalt());
    }
}
