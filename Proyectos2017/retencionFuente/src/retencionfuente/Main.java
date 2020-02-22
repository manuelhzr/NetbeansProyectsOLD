/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retencionfuente;

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
        Fuente obj=new Fuente();
        
        float uvt=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su salario expresado en UVT "
                + "\n tenga en cuenta que 1 uvt = 31859 pesos"));
        obj.setUvt(uvt);
        
        JOptionPane.showMessageDialog(null, "El total de la retencion en la fuente es: $"+obj.valorPagar());
    }
    
}
