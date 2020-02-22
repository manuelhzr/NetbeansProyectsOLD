
package estudiantelogica;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        Notas obj=new Notas();
        float N;
        N=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota parcial 1"));
        obj.setNp1(N);
        N=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota parcial 2"));
        obj.setNp2(N);
        N=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota parcial 3"));
        obj.setNp3(N);
        N=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del examen final"));
        obj.setExamen(N);
        N=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del trabajo final"));
        obj.setTrabajo(N);
        
        JOptionPane.showMessageDialog(null, "El promedio de las notas parciales es: "+obj.PromedioParciales());
        JOptionPane.showMessageDialog(null, "La nota definitiva es: "+obj.Definitiva());
    }
    
}
