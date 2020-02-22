
package invertircadena;

import javax.swing.JOptionPane;


public class InvertirCadena {

    
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Ingrese la cadena");
        
        String invetida="";
        for (int i = frase.length()-1; i >=0; i--) {
            invetida+=frase.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null, invetida);
    }
    
}
