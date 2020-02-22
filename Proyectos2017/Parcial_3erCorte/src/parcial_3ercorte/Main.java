/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_3ercorte;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */

        
public class Main {

    public static int menu(){
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("<<<< Seleccione una opcion >>>>\n"
                    + "1: Registrar Paciente.\n"
                    + "2: Mostrar numero de personas atendidas por cada especialista.\n"
                    + "3: Mostrar lista de personas atendidas.\n"
                    + "4: Salir."));
        }while(opcion <1 || opcion>4);
        return opcion;
    }
    
    public static void Guardar(Pacientes arch) throws IOException{
        String esp[]={"Pediatria","Radiografia","Ginecologia"};
        String espcialidad=JOptionPane.showInputDialog(null, "Seleccione la Especialidad","Especialidad",1,null,esp,esp[0]).toString();
        String identificacion=JOptionPane.showInputDialog("Ingrese la identificacion");
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
        arch.guardarArchivo(identificacion, nombre, espcialidad);
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Pacientes archivo=new Pacientes();
        archivo.setRutaArchivo("D:\\pacientes.txt");
        int opcion;
        
        do{
            opcion=menu();
            
            switch(opcion){
                case 1:
                    Guardar(archivo);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La lista de pacientes atendidos por cada especialidad es: \n"+archivo.listado());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Pacientes registrados en el archivo\n"
                            + archivo.leerArchivo(archivo.getRutaArchivo())+"\n");
                    break;
                case 4:
                    break;
                    
            }
        }while(opcion!=4);
        
        
    }
    
}
