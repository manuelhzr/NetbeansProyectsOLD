/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriznotas;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notas obj=new Notas();
        
        int n= Integer.parseInt(JOptionPane.showInputDialog("Diga el numero de estudiantes a ingresar"));
        obj.setN(n);
        
        String nom;
        float not;
        for(int f=0; f<n; f++){
            nom=JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+(f+1));
            obj.setNombres(f, nom);
            for(int c=0; c<3; c++){
                not=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota "+(c+1)+" del estudiante "+(f+1)));
                obj.setNotas(f, c, not);
            }
        }
        nom=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a buscar");
        int pos=obj.buscar(nom);
        
        if(pos!=-1){
            String nots="";
            for(int i=0; i<3; i++){
                nots+=obj.getNotas(pos, i)+"\n";
            }
            JOptionPane.showMessageDialog(null, "Las notas de "+obj.getNombres(pos)+" son: \n"+nots);
        }else{
            JOptionPane.showMessageDialog(null, "El nombre ingresado no se encontro");
        }
    }
    
}
