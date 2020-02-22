/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialprog2;

import javax.swing.JOptionPane;


public class ParcialProg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventana obj=new ventana();
        obj.obj.setTam(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de videos a registrar")));
        obj.setVisible(true);
    }
    
}
