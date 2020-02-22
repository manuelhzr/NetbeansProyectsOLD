/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas_numeracion;

import javax.swing.JOptionPane;

/**
 *
 * @author Check Personal
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println((char)(86));
        //System.out.println((int)'a');
        
        binario obj = new binario();
        
        String numero = JOptionPane.showInputDialog("Ingrese un numero en binario");
        obj.setNumero(numero);
        
        if(obj.validarNumero()){
            JOptionPane.showMessageDialog(null, "El numero en decimal es: "+obj.decimal());
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no esta en binario");
        }
        
        octal obj2 = new octal();
        
        numero = JOptionPane.showInputDialog("Ingrese un numero en octal");
        obj2.setNumero(numero);
        
        if(obj2.validarNumero()){
            JOptionPane.showMessageDialog(null, "El numero en decimal es: "+obj2.decimal());
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no esta en octal");
        }
        
        hexadecimal obj3 = new hexadecimal();
        
        numero = JOptionPane.showInputDialog("Ingrese un numero en hexadecimal");
        obj3.setNumero(numero);
        
        if(obj3.validarNumero()){
            JOptionPane.showMessageDialog(null, "El numero en decimal es: "+obj3.decimal());
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no esta en hexadecimal");
        }
    }
    
}
