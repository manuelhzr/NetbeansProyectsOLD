/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import javax.swing.JOptionPane;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventana ventas=new ventana();
        ventas.obj.setN(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas a registrar")));
        ventas.setVisible(true);
    }
    
}
