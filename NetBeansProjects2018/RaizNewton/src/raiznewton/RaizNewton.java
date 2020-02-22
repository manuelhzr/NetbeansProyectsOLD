/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiznewton;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class RaizNewton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Raiz obj=new Raiz();
        boolean valido;
        float x;
        do {
            x=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de x para a ecuacion (1/x)"));
            valido=obj.validar(x);
            if (valido==false) {
                JOptionPane.showMessageDialog(null, "El numero cero (0) no es valido.\nIngrese otro numero");
            }
        } while (valido==false);
        
        JOptionPane.showMessageDialog(null , "La raiz de la ecuacion 1/"+obj.getX()+" es: "+obj.Raiz());
        
        
    }
    
}
