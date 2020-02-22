/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Check Personal
 */
public class matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x, y, num;
        matriz obj = new matriz();
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
        
        obj.setFil(x);
        obj.setCol(y);
        
        if(obj.createdMatriz()){
            //Llenando la matriz
            for (int i = 0; i < obj.getFil(); i++) {
                for (int j = 0; j < obj.getCol(); j++) {
                    num = Integer.parseInt(JOptionPane.showInputDialog("Elemento en la posicion ["+i+"]["+j+"]"));
                    obj.setMatriz(i, j, num);
                }
            }
            //Mostrando la matriz
            for (int i = 0; i < obj.getFil(); i++) {
                for (int j = 0; j < obj.getCol(); j++) {
                    System.out.print(obj.getMatriz(i, j)+" ");
                }
                System.out.println("");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los tamaños dados no son validos");
        }
    }
    
}
