/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentos.vect_paralelos;

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
        Venta Obj=new Venta();
        
            for(int i=0; i<=4; i++){
                String Producto=JOptionPane.showInputDialog("Digite el nombre del producto "+i+": ");
                Obj.setProducto(i, Producto);
                
                float Neto= Float.parseFloat(JOptionPane.showInputDialog("Digite el valor neto del producto "+i+": "));
                    Obj.setValor_Neto(i, Neto);
                    
                float Total= Float.parseFloat(JOptionPane.showInputDialog("Digite el Valor Total del La venta: "+i+": "));
                    Obj.setValor_Total(i, Total);
            }
            
        JOptionPane.showMessageDialog(null, "Los porcentajes de descuentos aplicados son: \n"+Arrays.toString(Obj.Descuento()), "Descuentos", 1);
        
        int pos=Obj.BuscarMayor();
        JOptionPane.showMessageDialog(null, "El mayor Valor total es: "+Obj.getValor_Total(pos)+
                "\n El al que coresponde la mayor venta es: "+Obj.getProducto(pos)+
                "\n El valor neto correspondiente a la mayor venta es: "+Obj.getValor_Neto(pos), "Venta mayor", 1);
    }
    
}
