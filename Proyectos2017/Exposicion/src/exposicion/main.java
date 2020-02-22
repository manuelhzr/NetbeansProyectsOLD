/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exposicion;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] Opciones= {"Binario", "Octal", "Hexadecimal"};
        
        String Eleccion;
        String Numero;
        
        Eleccion= JOptionPane.showInputDialog(null, "Escoja el tipo de numero que desea convertir", "Conversiones", 3, null, Opciones, Opciones[0]).toString();
        
        switch(Eleccion){
            case "Binario":
                Binario Bin=new Binario();
                Numero=JOptionPane.showInputDialog("Digite el numero en Binario\n"
                        + "Los valores soportados son: "+Bin.Caracteres());
                Bin.setNumero(Numero);
                
                JOptionPane.showMessageDialog(null, "El valor Decimal es: "+Bin.decimal());
                break;
            case "Octal":
                Octal Oct=new Octal();
                Numero=JOptionPane.showInputDialog("Digite el numero en Octal\n"
                        + "Los valores soportados son: "+Oct.Caracteres());
                Oct.setNumero(Numero);
                
                JOptionPane.showMessageDialog(null, "El valor Decimal es: "+Oct.decimal());
                break;
            case "Hexadecimal":
                Hexadecimal Hex=new Hexadecimal();
                Numero=JOptionPane.showInputDialog("Digite el numero en Hexadecimal\n"
                        + "Los valores soportados son: "+Hex.Caracteres());
                Hex.setNumero(Numero.toUpperCase());
                JOptionPane.showMessageDialog(null, "El valor Decimal es: "+Hex.decimal());
                break;
        }
    }
    
}
