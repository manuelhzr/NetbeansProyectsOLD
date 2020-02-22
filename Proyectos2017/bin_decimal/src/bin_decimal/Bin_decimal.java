/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin_decimal;

import com.sun.org.apache.bcel.internal.generic.AASTORE;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author ASUS - PC
 */
public class Bin_decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner input = new Scanner(System.in);
        conver_bin_decimal obj = new conver_bin_decimal();
        
        System.out.println("Digite un numero binario entero");
        numero = input.nextInt();
        
        obj.setNumero_binario(numero);
        if(obj.validar()){
            System.out.println("El numero esta en binario");
            System.out.println("El numero en decimal es "+obj.decimal());
        }
        else{
            System.out.println("El numero no esta en binario");
        }
    }
    
}
