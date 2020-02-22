/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo.casi.instantaneo;

import javax.swing.JOptionPane;


public class CuboCasiInstantaneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo obj=new Cubo();
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para hacer el cubo magico"));
        obj.setN(n);
        obj.Iniciar();
        
        int res=(obj.getN()-30)%4;
        
        if (res==0) {
            obj.Exacta();
        }else{
            obj.Inexacta();
        }
        
        String mat="";        
        for (int fil = 0; fil < 4; fil++) {
            mat+="[ ";
            for (int col = 0; col < 4; col++) {
                mat+=obj.getMat(fil, col)+" ";
            }
            mat+="]\n";
        }
        
        JOptionPane.showMessageDialog(null, mat);
    }
    
}
