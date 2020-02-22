
package zodiaco;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
       Signos obj=new Signos();
       
       String Mes=JOptionPane.showInputDialog("Diga el mes de nacimiento");
       obj.setMes(Mes.toUpperCase());
               
       int dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de nacimiento"));
       obj.setDia(dia);
       
       JOptionPane.showMessageDialog(null, "Su signo zodiacal es: "+obj.Signo());
        
    }
    
}
