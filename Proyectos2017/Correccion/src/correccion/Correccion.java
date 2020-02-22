/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccion;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Correccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cad = JOptionPane.showInputDialog("Ingresa una frase o palabra");
        String aux = "";
        for (int i = cad.length() - 1; i >= 0; i--) {
            aux = aux + cad.charAt(i);
        }
        JOptionPane.showMessageDialog(null,aux);


    }
    
}
