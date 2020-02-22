/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2;

import java.util.Arrays;
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
        Vectores Objeto=new Vectores();
        
        int Tam=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamano del vector"));
            Objeto.setTam(Tam);
            
        for(int i=0; i<Tam; i++){
            int Val=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor "+(i+1)+":"));
                Objeto.setVector(i, Val);
        }
        
        JOptionPane.showMessageDialog(null, "El vector resultante es: "+Arrays.toString(Objeto.LlenarVector()));
    }
    
}
