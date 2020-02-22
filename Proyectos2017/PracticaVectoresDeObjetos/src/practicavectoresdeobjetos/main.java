/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavectoresdeobjetos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VectorObj Vector=new VectorObj();
        
        AgendaTelefonica Obj;
        
        String Nombre, Correo, Telefono;
        
        int Tam=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de registros a guardar"));
            Vector.setTam(Tam);
            
        for (int i = 0; i < Tam; i++) {
            Nombre=JOptionPane.showInputDialog("Digite el nombre de la persona "+(i+1));
            Correo=JOptionPane.showInputDialog("Digite el Correo de la persona "+(i+1));
            Telefono=JOptionPane.showInputDialog("Digite el Telefono de la persona "+(i+1));
            
            Obj=new AgendaTelefonica();
            Obj.setNombre(Nombre);
            Obj.setCorreo(Correo);
            Obj.setTelefono(Telefono);
            Vector.setVector(i, Obj);
        }
        
//        for (int i = 0; i < Tam; i++) {
//            JOptionPane.showMessageDialog(null, "Los elementos son: \n"
//                    + Vector.MostrarNombre(i)+"\n"
//                            + Vector.MostarCorreo(i)+"\n"
//                                    + Vector.MostrarTelefono(i));
//        }
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de persona de la cual desea informacion"));
            
        if(pos>0 && pos<=Tam){
            JOptionPane.showMessageDialog(null, "Los datos de la persona escogida son: \n"
                   + "Nombre: "+Vector.MostrarNombre(pos-1)+"\n"
                           + "Correo: "+Vector.MostarCorreo(pos-1)+"\n"
                                   + "Telefono: "+Vector.MostrarTelefono(pos-1));
        }else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra en el registro");
        }
    }
    
}
