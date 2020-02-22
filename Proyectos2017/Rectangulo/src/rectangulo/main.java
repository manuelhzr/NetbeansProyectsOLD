
package rectangulo;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
        A_P obj=new A_P();
        
        float Datos;
        Datos=Float.parseFloat(JOptionPane.showInputDialog("Digite la medida del lado 'a'"));
        obj.setA(Datos);
        Datos=Float.parseFloat(JOptionPane.showInputDialog("Digite la medida del lado 'b'"));
        obj.setB(Datos);
        
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+obj.Area());
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+obj.Perimetro());
    }
    
}
