
package fibonacci1;

import javax.swing.JOptionPane;


public class Fibonacci1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrse los numeros de la serie fibonacci a mostrar"));
        int a, b=0, val=1;
        String serie="1";
        for (int i = 1; i < num; i++) {
            a=b;
            b=val;
            val=a+b;
            serie=serie+" "+val;
        }
        JOptionPane.showMessageDialog(null, serie);
    }
    
}
