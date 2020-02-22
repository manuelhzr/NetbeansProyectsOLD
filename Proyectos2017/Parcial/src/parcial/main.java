/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

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
        Vectores obj=new Vectores();
        
        int Tam1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño del vector 1"));
        obj.setTam1(Tam1);
        int Tam2=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector 2"));
        obj.setTam2(Tam2);
        
        for(int i=0; i<Tam1; i++){
            int Val=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la posicion ["+i+"] del vector 1"));
            obj.setVect1(i, Val);
        }
        for(int i=0; i<Tam2; i++){
            int Val=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de la posicion ["+i+"] del vector 2"));
            obj.setVect2(i, Val);
        }
        
        JOptionPane.showMessageDialog(null, "El vector ordenado es "+Arrays.toString(obj.OrdenarVector()));
    }
    
}
