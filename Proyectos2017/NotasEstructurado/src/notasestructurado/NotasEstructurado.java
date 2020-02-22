/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasestructurado;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class NotasEstructurado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float nota1, nota2, nota3;
        
        nota1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 1"));
        nota2=Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota 2"));
        nota3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota 3"));
        
        float promedio= nota1+nota2+nota3/3;
        
        JOptionPane.showMessageDialog(null, "el promedio es: "+promedio);
        
        
        
        
    }
    
}
