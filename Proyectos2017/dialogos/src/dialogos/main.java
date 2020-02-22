/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

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
        /*String nombre = "elena";
        
        JOptionPane.showMessageDialog(null, "Mi nombre es "+nombre);
        JOptionPane.showMessageDialog(null, "Mensaje 1", "Ventana 1", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje 2", "Ventana 2", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje 3", "Ventana 3", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje 4", "Ventana 4", JOptionPane.QUESTION_MESSAGE);*/
        
        /*String nombre;
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        System.out.println("nombre --> "+nombre);*/
        
        /*
        int cant = 0;
        
        boolean control = false;
        
        while(!control){
            try{
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos", "1"));
                System.out.println("cantidad -> "+cant);
                control = true;
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Dato invalido", "Fatal error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        */
        /*
        int cant = 0;
        
        boolean control = false, executed = false;
        String mensaje = "Ingrese la cantidad de articulos";
        
        while(!control){
            try{
                if(executed){
                    mensaje = "Ingrese nuevamente la cantidad de articulos";
                }
                cant = Integer.parseInt(JOptionPane.showInputDialog(mensaje, "1"));
                System.out.println("cantidad -> "+cant);
                control = true;
            }
            catch(Exception error){
                JOptionPane.showMessageDialog(null, "Dato invalido", "Fatal error", JOptionPane.ERROR_MESSAGE);
                executed = true;
            }
        } */
        
        /*
        String opciones[] = {"suma","resta","multiplicacion","division"};
        String opcion = JOptionPane.showInputDialog(null, "Seleccione una operacion", "Operacioneas basica", 3, null, opciones, opciones[0]).toString();
        System.out.println("opcion --> "+opcion);
        */
        
        int  respuesta = JOptionPane.showConfirmDialog(null, "su correo asda@asda.es ?");
        System.out.println("respuesta -> "+respuesta);
    }
    
}
