/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsos;

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
        CantCuero obj=new CantCuero();
        
        float X=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de x para las medidas del bolso"));
        obj.setX(X);
        JOptionPane.showMessageDialog(null, "La cantidad de cuero usado en la base es: "+obj.Base());
        JOptionPane.showMessageDialog(null, "La cantidad de cuero usado en las 2 caras es: "+obj.Caras());
        JOptionPane.showMessageDialog(null, "La cantidad de cuero usado en las 2 bandas laterales es: "+obj.BandasLaterales());
        JOptionPane.showMessageDialog(null, "La cantidad de cuero usado en la correa es: "+obj.Correa());
        JOptionPane.showMessageDialog(null, "La cantidad total de cuero usado es: "+obj.Total());
        
        
    }
    
}
