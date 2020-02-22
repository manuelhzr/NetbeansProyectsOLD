/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donante;

import javax.swing.JOptionPane;


public class main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        DonadorSangre obj=new DonadorSangre();
        
        int sex=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el sexo: \n"
                + "1: Masculino\n"
                + "2: Femenino"));
        obj.setSexo(sex);
        
        
        float peso=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso"));
        obj.setPeso(peso);
        
        if(obj.PuedeDonar()==true){
            JOptionPane.showMessageDialog(null, "Puede donar sangre");
        }else{
            JOptionPane.showMessageDialog(null, "No puede danar sangre");
        }
    }
    
}
