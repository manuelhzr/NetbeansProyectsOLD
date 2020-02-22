/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class EjercicioArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arreglos obj=new Arreglos();
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        obj.setTam(tam);
        int val;
        for (int i = 0; i < obj.getTam(); i++) {
            val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            obj.setArreglo(i, val);
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de numeros pares es: "+obj.totalPares());
        JOptionPane.showMessageDialog(null, "La cantidad de numeros impares es: "+obj.totalImpares());
        JOptionPane.showMessageDialog(null, "El promedio de los multiplos de 5 es: "+obj.promedioMultiplos());
        JOptionPane.showMessageDialog(null, "La suma de los numeros pares es: "+obj.SumaPares());
        JOptionPane.showMessageDialog(null, "El promedio de los numeros impares es: "+obj.PromedioImpares());
        
    }
    
}
