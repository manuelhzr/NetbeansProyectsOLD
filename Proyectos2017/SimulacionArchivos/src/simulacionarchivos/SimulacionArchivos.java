/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionarchivos;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class SimulacionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el fichero a crear\n"
                + "1: Archivo\n"
                + "2: Directorio."));
        if(op==1){
            Archivos obj1=new Archivos();
            int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el identificador del archivo"));
            obj1.setIdentificador(id);
            String nom=JOptionPane.showInputDialog("Ingrese el nombre del archivo");
            obj1.setNombre(nom);
            String permisos=JOptionPane.showInputDialog("Ingrese los permisos");
            obj1.setPermisos(permisos);
            String ext=JOptionPane.showInputDialog("Ingrese la extension del archivo");
            obj1.setExtencion(ext);
            int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de caracteres del archivo"));
            obj1.setNumCaracteres(tam);
            
            JOptionPane.showMessageDialog(null, "El tamaño del archivo "+obj1.getNombre()+"."+obj1.getExtencion()+" es: "+obj1.tamaño());
        }else{
            if(op==2){
                Directorios obj2=new Directorios();
                int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el identificador del directorio"));
                obj2.setIdentificador(id);
                String nom=JOptionPane.showInputDialog("Ingrese el nombre del directorio");
                obj2.setNombre(nom);
                String permisos=JOptionPane.showInputDialog("Ingrese los permisos");
                obj2.setPermisos(permisos);
                int subdir=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de subdirectorios"));
                obj2.setCantDirectorios(subdir);
                
                JOptionPane.showMessageDialog(null, "El tamaño del directorio "+obj2.getNombre()+" es: "+obj2.tamaño());
            }else{
                JOptionPane.showMessageDialog(null, "No se selecciono una opcion valida");
            }
        }
    }
    
}
