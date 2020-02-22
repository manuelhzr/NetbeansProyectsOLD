/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria_indices_negativos;

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
        Indices Sumatoria=new Indices();
        
        for(int i=0; i<=9; i++){
            int Val= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de la posicion "+i, "Llenar vector", JOptionPane.QUESTION_MESSAGE));
            Sumatoria.setVector(i, Val);
        }
        
        JOptionPane.showMessageDialog(null, "La sumatoria de los indices con valores negativos es: "+Sumatoria.CalcularSumatoria(), "Sumatoria", 1);
    }
    
}
