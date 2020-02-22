
package respuesta;

import javax.swing.JOptionPane;


public class Respuesta {

    
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x"));
        
        if (x<0) {
            x=1;
        }else{
            x=(x+(11*3))%(4-(1/(2*2*x)));
        }
        
        JOptionPane.showMessageDialog(null, "el nuevo valor de x es : "+x);
        
    }
    
}
