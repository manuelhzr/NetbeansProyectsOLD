/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serienumerica;

import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Serie obj=new Serie();
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor n para calcular la serie:"));
        obj.setN(n);
        
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: "+obj.sumatoria());
    }
    
}
