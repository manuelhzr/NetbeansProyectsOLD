/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosanidados;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class CiclosAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ciclos obj=new ciclos();
        
        float nota=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota para saber su estado actual:"));
        obj.setNota(nota);
        
        JOptionPane.showMessageDialog(null, "Su estado actual es: \n"+obj.Estado());
    }
    
}
