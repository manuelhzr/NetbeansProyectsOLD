/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class EstudiantesHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est=new Estudiante();
        Egresados egre=new Egresados();
        Distancia dist=new Distancia();
        Postgrado post=new Postgrado();
        
        int op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de estudiante a registrar\n"
                + "1: Estudiante normal\n"
                + "2: egresado\n"
                + "3:Distancia\n"
                + "4: postgrado"));
        
        if(op==1){
            int numMatricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de matricula"));
            est.setNumMatricula(numMatricula);
            String programa=JOptionPane.showInputDialog("INgrese el programa");
            est.setPrograma(programa);
            String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
            est.setNombre(nombre);
            String ap=JOptionPane.showInputDialog("Ingrese apellido");
            est.setApellido(ap);
            int sem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
            est.setSemestre(sem);
        }else{
            if (op==2) {
                int numMatricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de matricula"));
                egre.setNumMatricula(numMatricula);
                String programa=JOptionPane.showInputDialog("INgrese el programa");
                egre.setPrograma(programa);
                String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
                egre.setNombre(nombre);
                String ap=JOptionPane.showInputDialog("Ingrese apellido");
                egre.setApellido(ap);
                int sem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
                egre.setSemestre(sem);
                int año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de graduacion"));
                egre.setAñoGraduacion(año);
                String cargo=JOptionPane.showInputDialog("Ingrese el cargo actual");
                egre.setCargoACT(cargo);
            }else{
                if (op==3) {
                    int numMatricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de matricula"));
                    dist.setNumMatricula(numMatricula);
                    String programa=JOptionPane.showInputDialog("INgrese el programa");
                    dist.setPrograma(programa);
                    String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
                    dist.setNombre(nombre);
                    String ap=JOptionPane.showInputDialog("Ingrese apellido");
                    dist.setApellido(ap);
                    int sem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
                    dist.setSemestre(sem);
                    int materias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de materias"));
                    dist.setMaterias(materias);
                }else{
                    if (op==4) {
                        int numMatricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de matricula"));
                        post.setNumMatricula(numMatricula);
                        String programa=JOptionPane.showInputDialog("INgrese el programa");
                        post.setPrograma(programa);
                        String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
                        post.setNombre(nombre);
                        String ap=JOptionPane.showInputDialog("Ingrese apellido");
                        post.setApellido(ap);
                        int sem=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre"));
                        post.setSemestre(sem);
                        String nompost=JOptionPane.showInputDialog("Ingrese el nombre del postgrado");
                        post.setNombrePostgrado(nompost);
                        String universidad=JOptionPane.showInputDialog("Ingrese el nombre de la universidad");
                        post.setUniversidad(universidad);
                    }
                }
            }
        }
        
        
    }
    
}
