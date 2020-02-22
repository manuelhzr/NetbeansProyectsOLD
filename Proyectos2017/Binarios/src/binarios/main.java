/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;

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
         Binario bits=new Binario();
        
        for(int i=0; i<=7; i++){
            int val= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de la posicion "+i));
            bits.setBits(i, val);
        }
        
        JOptionPane.showMessageDialog(null, "El valor decimal es: "+bits.conversionDecimal());
    }
    
}
