/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapetroleo;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class EmpresaPetroleo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Barriles obj=new Barriles();
        float precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del barril de petroleo"));
        obj.setPrecio(precio);
        for (int i = 0; i < 15; i++) {
            float val=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de barriles del dia "+(i+1)));
            obj.setBarriles(i, val);
        }
        
        JOptionPane.showMessageDialog(null, "El promedio de extraccion en dias pares es: "+obj.promedioPares());
        JOptionPane.showMessageDialog(null, "El promedio de extraccion en dias impares es: "+obj.promedioImpares());
        JOptionPane.showMessageDialog(null, "La cantidad de barriles perdidos es: "+obj.Perdida());
        JOptionPane.showMessageDialog(null, "El ingreso por la extraccion es: "+obj.Venta());
        
        
    }
    
}
