/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cubo obj=new Cubo();
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del cubo"));
        obj.setTam(tam);
        
        JOptionPane.showMessageDialog(null, obj.Mostrar());
    }
    
}
