
package claselogica;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
        Notas obj=new Notas();
        
        JOptionPane.showMessageDialog(null, "A continuacion se calculara la nota programacion. \n"
                + "Tenga en cuenta que solo se aceptan notas comprendidas entre 0.0 y 5.0.");
        float trabajo, expocision;
        trabajo=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del trabajo"));
        expocision=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota de la exposicion"));
        
        if(trabajo <=5 && expocision <=5){
            JOptionPane.showMessageDialog(null, "Las notas son validas.");
            obj.setNotaIndependiente(trabajo, expocision);
            float quiz= Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del quiz"));
                if(quiz<=5){
                    JOptionPane.showMessageDialog(null, "La nota es valida.");
                    obj.setQuiz(quiz);
                    float parcial=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del parcial"));
                        if(parcial<=5){
                            JOptionPane.showMessageDialog(null, "La nota es valida.");
                            obj.setParcial(parcial);                            
                            JOptionPane.showMessageDialog(null, "La nota final es: "+obj.notafinal()+"\n"+obj.Mensaje());
                        }else{
                            JOptionPane.showMessageDialog(null, "La nota ingresada no es valida.\n"
                    + "Saliendo del programa.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La nota ingresada no es valida.\n"
                + "Saliendo del programa.");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Una de las notas ingresadas no es valida.\n"
        + "Saliendo del programa.");
        }
        
        
        
        
        
        
    }
    
}
