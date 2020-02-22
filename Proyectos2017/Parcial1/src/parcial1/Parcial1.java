
package parcial1;

import javax.swing.JOptionPane;


public class Parcial1 {

    
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese x"));
        
        if (x>=0) {
            x=9%3/2*4-(3+(3-4%2)*40-2);
        }
        
        JOptionPane.showMessageDialog(null, x);
        
    }
    
}
