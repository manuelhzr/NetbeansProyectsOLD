/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

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
        int val;
        Binario Obj= new Binario();
        
        for(int i=0; i<=7; i++){
            val=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la posicion "+i));
               Obj.setBits(i, val);
        }
        JOptionPane.showMessageDialog(null, "Los bits encendidos son "+Obj.ObtenerBitsEncendidos());
        JOptionPane.showMessageDialog(null, "Los bits Apagados son "+Obj.ObtenerBitsApagados());
        JOptionPane.showMessageDialog(null, "La sumatoria de los componentes es "+Obj.ObtenerSumatoria());
        JOptionPane.showMessageDialog(null, "El valor decimal ingresado es "+Obj.CalcularDecimal());
    }
    
}
