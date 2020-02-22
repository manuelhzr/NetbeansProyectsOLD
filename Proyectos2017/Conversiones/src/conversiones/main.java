/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

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
        // TODO code application logic here
        Decimal Decimales=new Decimal();
        Binario Binarios=new Binario();
        Octal Octales=new Octal();
        Hexadecimal Hexadecimales=new Hexadecimal();
        
        String OpcionEscogida;
        String opciones[] = {"Decimal","Binario","Octal","Hexadecimal"};
        
        OpcionEscogida= JOptionPane.showInputDialog(null, "Escoja el tipo de numero que desea convertir", "Conversiones", 3, null, opciones, opciones[0]).toString();
        
        switch(OpcionEscogida){
            case "Decimal":
                int Decimal=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero", OpcionEscogida, 3));
                Decimales.setDecimal(Decimal);
                break;
            case "Binario":
                int Binario=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero", OpcionEscogida, 3));
                Binarios.setBinario(Binario);
                break;
            case "Octal":
                int Octal=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero", OpcionEscogida, 3));
                Octales.setOctal(Octal);
                break;
            case "Hexadecimal":
                String Hexadecimal= JOptionPane.showInputDialog(null, "Digite el numero", OpcionEscogida, 3);
                Hexadecimales.setHexadecimal(Hexadecimal);
                break;
        }
        switch(OpcionEscogida){
            case "Decimal":
                String Opciones[] = {"Binario", "Octal", "Hexadecimal"};
                String Opc=JOptionPane.showInputDialog(null, "Escoja el tipo de numero al que desea convertir", OpcionEscogida, 3, null, Opciones, Opciones[0]).toString();
                    switch(Opc){
                        case "Binario":
                            JOptionPane.showMessageDialog(null, "El valor "+Opc+" es: "+Decimales.A_Binario(), Opc, 1);
                    }
                break;
        }
    }
    
}
