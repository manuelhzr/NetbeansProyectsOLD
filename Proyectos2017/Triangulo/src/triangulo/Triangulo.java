/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaApplication7;

import javax.swing.JOptionPane;


public class avaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));
        float lado1, angulo1, lado2, angulo2, lado3, angulo3;
        for (int i = 1; i <= n; i++) {
            lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 1 del triangulo"));
            angulo1 = Float.parseFloat(JOptionPane.showInputDialog(" Ingrese el angulo 1 del triangulo"));
            lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 2 del triangulo"));
            angulo2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese le angulo 2 del triangulo"));
            lado3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 3 del triangulo"));
            angulo3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el angulo 3 del triangulo"));

            if ((angulo1 == angulo2) || (angulo1 == angulo3) || (angulo3 == angulo2)) {
                JOptionPane.showMessageDialog(null, "El tringulo es isosceles");
            }
            if ((angulo1 == angulo2) && (angulo1 == angulo2) && (angulo3 == angulo2)) {
                if ((lado1 == lado2) && (lado1 == lado2) && (lado3 == lado2)) {
                    JOptionPane.showMessageDialog(null, "el trinagulo es equilatero");
                }
            }
            if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
                JOptionPane.showMessageDialog(null, "El tringulo es un poligono");
            }

        }
    }
    
}
