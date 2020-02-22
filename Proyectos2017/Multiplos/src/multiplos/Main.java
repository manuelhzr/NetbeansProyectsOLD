/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuscarMultiplos obj=new BuscarMultiplos();
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n"));
        obj.setN(n);
        int m;
        do{
            m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el balor de m"));
            if(m<=n){
                JOptionPane.showMessageDialog(null, "El valor de m no es valido");
            }
        }while(obj.validarM(m)==false);
        
        JOptionPane.showMessageDialog(null, "los multiplos de 2 y 7 en el intervalo ["+n+","+m+"] son: \n"+obj.multiplos());
    }
    
}
