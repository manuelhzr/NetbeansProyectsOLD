/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo.instantaneo;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class CuboInstantaneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo obj=new Cubo();
        int n; 
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 23 y 100"));
        if (n>=23 && n<=100) {
            obj.setN(n);
            obj.LlenarCubo();
        
        String mat="";
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                mat+=" "+obj.getCubo(f, c)+" ";
            }
            mat+="\n";
        }
        
        JOptionPane.showMessageDialog(null, "El cubo magico es:\n"+mat);
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es vlido");
        }
        
                
    }
    
    
}
