/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocioncamisas;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Promo obj=new Promo();
        
        float precio= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de las camisetas"));
        obj.setPrecio(precio);
        
        int cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de camisetas compradas"));
        obj.setCantidad(cant);
        
        JOptionPane.showMessageDialog(null, "El descuento aplicado es :"+obj.Descuento());
        JOptionPane.showMessageDialog(null, "El total a pagar es: "+obj.totalPagar());
    }
    
}
