/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;


public class Vector {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo obj = new Arreglo();
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        obj.setTam(tam);
        
        for (int i = 0; i < obj.getTam(); i++) {
            int val=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            obj.setArreglo(i, val);
        }
        
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+obj.mayor());
        JOptionPane.showMessageDialog(null, "El promedio de los numeros es: "+obj.promedio());
        JOptionPane.showMessageDialog(null, "La cantidad de numeros menores al promedio son: "+obj.menorpromedio());
        
        String arreglo="";
        for (int i = 0; i < obj.getTam(); i++) {
            arreglo=arreglo+"|"+obj.getArreglo(i)+"| ";
        }
        JOptionPane.showMessageDialog(null, "Arreglo sin ordenar\n"+arreglo+"\n");
        
        obj.ordenar();
        for (int i = 0; i < obj.getTam(); i++) {
            arreglo=arreglo+"|"+obj.getArreglo(i)+"| ";
        }
        JOptionPane.showMessageDialog(null, "Arreglo ordenado\n"+arreglo);
    }
    
}
