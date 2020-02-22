
package trabajo_vectores;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
       Vectores Objeto=new Vectores();
       
       for(int i=0; i<=11; i++){
           int Val=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la posicion "+i));
                Objeto.setVector(i, Val);
       }
       
       JOptionPane.showMessageDialog(null, "Los valores positivos son: "+Arrays.toString(Objeto.LlenarPositivos()));
       JOptionPane.showMessageDialog(null, "Los valores negativos son: "+Arrays.toString(Objeto.LlenarNegativos()));
    }
    
}
