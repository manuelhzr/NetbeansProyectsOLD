/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nomb, genero;
        char sexo = 'M';
        boolean sexo_ = false;
        
        persona obj2 = new persona();
        estudiante obj = new estudiante();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre >> ");
        nomb = input.next();
        
        System.out.print("Ingrese la edad >> ");
        edad = input.nextInt();
        
        System.out.print("Ingrese el genero M/F >> ");
        genero = input.next();
        
        if(genero.equalsIgnoreCase("M")){
            sexo = 'M';
            sexo_ = true;
        }
        else if(genero.equalsIgnoreCase("F")){
            sexo = 'F';
            sexo_ = true;
        }
        else{
            System.out.print("El sexo indicado no es valido.\n\n");
            
            System.out.print("Ingrese nuevamente el genero M/F >>");
            genero = input.next();

            if(genero.equalsIgnoreCase("M")){
                sexo = 'M';
                sexo_ = true;
            }
            else if(genero.equalsIgnoreCase("F")){
                sexo = 'F';
                sexo_ = true;
            }
            else{
                System.out.print("Te fregastes, expulsado... Se denego a definir su sexo");
            }
        }
        
        if(sexo_){
            obj.setNombre(nomb);
            obj.setEdad(edad);
            obj.setGenero(sexo);
            String men_salida = "";
            if(obj.mayorEdad()){
                men_salida = "Eres mayor de edad, por consiguiente \n";
                men_salida += "tienes los siguientes privilegios...\n\n"; // men_salida = men_salida + "... ":
                men_salida += "- Puedes votar\n"; // men_salida = men_salida + "... ":
                men_salida += "- Puedes sacar licencia para conducir\n"; // men_salida = men_salida + "... ":
                men_salida += "- Puedes amancer fuera de la casa\n"; // men_salida = men_salida + "... ":
                men_salida += "- Puedes irte por tres dias\n"; // men_salida = men_salida + "... ":
                men_salida += "- Puedes tomar\n"; // men_salida = men_salida + "... ":
            }
            else{
                men_salida = "No eres mayor de edad, resignate.. por el momento";
            }

            System.out.print(men_salida);
            
            System.out.println("Ahora eres un estudiante\n");
            
            float nota;
            boolean validacionNotas = true;
            
            System.out.println("Ingrese la nota 1");
            nota = input.nextFloat();
            
            validacionNotas = obj.validarNota(nota) ? true : false;
            if(validacionNotas){
                obj.setN1(nota);
            }
            
            System.out.println("Ingrese la nota 2");
            nota = input.nextFloat();
            
            validacionNotas = obj.validarNota(nota) ? true : false;
            if(validacionNotas){
                obj.setN2(nota);
            }
            
            System.out.println("Ingrese la nota 3");
            nota = input.nextFloat();
            
            validacionNotas = obj.validarNota(nota) ? true : false;
            if(validacionNotas){
                obj.setN3(nota);
            }
            
            if(obj.validacionNotas()){
                System.out.println("La nota definitiva es "+obj.definita());
            }
            else{
                System.out.println("Uno o mas notas ingresadas, no se pudo"
                        + " calcular la nota definitiva....");
            }
        }
    }
    
}
