/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calcFactorial obj=new calcFactorial();
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a calcular el factorial"));
        obj.setNumero(num);
        
        
        JOptionPane.showMessageDialog(null, "El factorial del numero es: "+obj.Factorial());
    }
    
}
