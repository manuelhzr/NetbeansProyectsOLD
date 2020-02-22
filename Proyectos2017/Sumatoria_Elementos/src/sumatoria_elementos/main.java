/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria_elementos;

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
        Vectores Obj=new Vectores();
        
        for(int i=0; i<=9; i++){
            int val= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de la posicion "+i, "Llenar vector", 3));
                Obj.setVector(i, val);
        }
        
        JOptionPane.showMessageDialog(null, "La sumatoria de los elementos del vector es: "+Obj.Sumatoria(), "Sumatoria", 1);
    }
    
}
