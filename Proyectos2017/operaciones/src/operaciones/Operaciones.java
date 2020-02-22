/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import javax.swing.JOptionPane;


public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        claseoperaciones obj=new claseoperaciones();
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        obj.setNum1(num1);
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        
        JOptionPane.showMessageDialog(null, "La suma es: "+obj.suma());
        JOptionPane.showMessageDialog(null, "La resta es: "+obj.resta());
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+obj.multiplicacion());
        JOptionPane.showMessageDialog(null, "La division es: "+obj.division());
        
    }
    
}
