/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;


public class Vector {

    
    public static void main(String[] args) {
        
        Arreglos obj=new Arreglos();
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        obj.setN(n);
        
        int val;
        for (int i = 0; i < obj.getN(); i++) {
            val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            obj.setArreglo(i, val);
        }
        
        if (obj.getN()%2==0) {
            JOptionPane.showMessageDialog(null, "Mostrando datos de la primera mitad: "+ obj.Mostrar());
            JOptionPane.showMessageDialog(null, "Suma de los datos de la segunda mitad: "+ obj.operaciones());
        }else{
            JOptionPane.showMessageDialog(null, "Mostrando datos de la segunda mitad: "+ obj.Mostrar());
            JOptionPane.showMessageDialog(null, "Multiplicacion de la primera mitad: "+obj.operaciones());
        }
        
        
        
        
    }
    
}
