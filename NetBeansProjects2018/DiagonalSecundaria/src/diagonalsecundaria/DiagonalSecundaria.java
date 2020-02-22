/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalsecundaria;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class DiagonalSecundaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagonal obj=new Diagonal();
        
        obj.setTam(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de la matriz")));
        
        for (int f = 0; f < obj.getTam(); f++) {
            for (int c = 0; c < obj.getTam(); c++) {
                obj.setMatriz(f, c, Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion ("+f+","+c+")")));
            }
        }
        
        JOptionPane.showMessageDialog(null, "La suma de la diagonal secundaria es: "+obj.SumadiagonalSec());
        
    }
    
    
}
