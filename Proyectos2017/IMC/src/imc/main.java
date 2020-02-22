
package imc;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
        MasaCorporal obj=new MasaCorporal();
        
        float Val;
        
        Val= Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese su peso (kg)."));
        obj.setPeso(Val);
        
        Val= Float.parseFloat(JOptionPane.showInputDialog("Por favor dijite su altura (m)."));
        obj.setAltura(Val);
        
        JOptionPane.showMessageDialog(null, "Su indice de masa corporal es: "+obj.IMC());
        
        
    }
    
}
