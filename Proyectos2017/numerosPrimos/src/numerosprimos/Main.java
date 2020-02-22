/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

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
        CalcularPrimo obj=new CalcularPrimo();
        int Num=Integer.parseInt(JOptionPane.showInputDialog("Increse un numero para saber si es primo"));
        obj.setNumero(Num);
        JOptionPane.showMessageDialog(null, "El numero "+obj.getNumero()+" "+obj.Primo());
    }
    
}
