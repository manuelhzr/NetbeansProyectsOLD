/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioes_basicas;

import javax.swing.JOptionPane;


/**
 *
 * @author ASUS - PC
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num1, num2;
        boolean salir = false;
        String opciones[] = {"suma","resta","producto","cociente"};
        String opcion_selected = "", mensaje = "";
        float resultado;
        
        while(!salir){
            num1 = readFloat("el numero uno");
            num2 = readFloat("el numero dos");
            operaciones ope = new operaciones(num1, num2);
            
            try{
                opcion_selected = JOptionPane.showInputDialog(null, "Escoja una operacion", "Operaciones basica", 3, null, opciones, opciones[0]).toString();
            }
            catch(NullPointerException error){
                opcion_selected = "nan";
            }
            
            switch(opcion_selected){
                case "suma":
                    mensaje = "la suma es "+ope.suma();
                    break;
                case "resta":
                    mensaje = "la resta es "+ope.resta();
                    break;
                case "producto":
                    mensaje = "el producto es "+ope.producto();
                    break;
                case "cociente":
                    mensaje = "el cociente es "+ope.cociente();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No selecciono una opcion", "Fatality", JOptionPane.ERROR_MESSAGE);
            }
            if(verificar(opciones, opcion_selected)){
                JOptionPane.showMessageDialog(null, mensaje);
            }
            if(JOptionPane.showConfirmDialog(null, "Desear salir del programa") == JOptionPane.YES_OPTION){
                salir = true;
            }
        }
    }
    
    public static float readFloat(String msm){
        float numero = 0;
        boolean good = false, executed = false;
        String msm_real = "Ingrese "+msm;
        while(!good){
            try{
                if(executed){
                    msm_real = "Ingrese nuevamente "+msm;
                }
                numero = Float.parseFloat(JOptionPane.showInputDialog(null, msm_real));
                good =  true;
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "El dato ingresado no es valido");
                executed = true;
            }
        }
        return numero;
    }
    
    public static boolean verificar(String array[], String dato){
        for (int i = 0; i < array.length; i++) {
            if(dato == array[i]){
                return true;
            }
        }
        return false;
    }
}


