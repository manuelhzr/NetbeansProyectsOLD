/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacion_errores;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS - PC
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre1, nombre2;
        int edad;
        
        System.out.println("Ingrese su nombre");
        nombre1 = leer.nextLine();
        System.out.println("\nnombre1 --> "+nombre1);
        
        System.out.println("\nIngrese su apellido");
        nombre2 = leer.nextLine();
        System.out.println("\nnombre2 --> "+nombre2);
        
        try{
            System.out.println("\nIngrese su edad");
            edad = leer.nextInt();
            System.out.println("\nedad -->"+edad);
        }
        catch(Exception error){
            System.out.println("Se produjo un error fatal, el dato ingresado no es numerico");
            System.out.println("Descripcion del error: "+error.getMessage());
            System.out.println("\nReinicie la aplicacion");
        }
    }
    
}
