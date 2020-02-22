/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubocumpleaños;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class CuboCumpleaños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cubo obj=new cubo();
        
        obj.setD(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento")));
        obj.setM(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento")));
        obj.setA(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento")));
        
        JOptionPane.showMessageDialog(null, "Su numero magico es: "+obj.NumeroMagico());
        
        obj.cubo();
        
        String cubo="";
        
        for (int f = 0; f < 3; f++) {
            cubo+="[ ";
            for (int c = 0; c < 3; c++) {
                cubo+=obj.getCubo(f, c)+" ";
            }
            cubo+="]\n ";
        }
        
        JOptionPane.showMessageDialog(null, cubo);
    }
    
}
