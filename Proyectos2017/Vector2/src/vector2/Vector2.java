/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector2;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Vector2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arreglos obj=new arreglos();
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los arreglos a y b"));
        obj.setTam(tam);
        int val;
        for (int i = 0; i < obj.getTam(); i++) {
            val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del arreglo a"));
            obj.setA(i, val);
        }
        for (int i = 0; i < obj.getTam(); i++) {
            val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores del arreglo b"));
            obj.setB(i, val);
        }
        if (obj.iguales()==true) {
                JOptionPane.showMessageDialog(null, "Los arreglos a y b son iguales");
            }else{
                JOptionPane.showMessageDialog(null, "Los arreglos a y b son son diferentes");
            }
        
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una posicion del vector a"));
        if (obj.encontrar(pos)==true) {
            JOptionPane.showMessageDialog(null, "el valor de la posicion "+pos+", del vector a se encuenta en el vector b");
        }else{
            JOptionPane.showMessageDialog(null, "el valor de la posicion "+pos+", no se encuenta en el vector b");
        }
    }
    
}
