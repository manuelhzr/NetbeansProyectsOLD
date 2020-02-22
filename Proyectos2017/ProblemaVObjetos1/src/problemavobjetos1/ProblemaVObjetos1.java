/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemavobjetos1;

import javax.swing.JOptionPane;


public class ProblemaVObjetos1 {

    
    
    public static void main(String[] args) {
    
        VectorEstudiantes listado=new VectorEstudiantes();
        
        Estudiante est;
        
        String codigo,apellidos,nombres;
        float nota;
        
        
        for(int i=0;i<3;i++){
            
            
           codigo = JOptionPane.showInputDialog("Digite el codigo del estudiante # " + i );
           apellidos = JOptionPane.showInputDialog("Digite los apellidos del estudiante # " + i );
           nombres = JOptionPane.showInputDialog("Digite los nombres del estudiante # " + i );           
           nota = Float.valueOf(JOptionPane.showInputDialog("Digite la Nota Definitiva del estudiante # " + i ));
           
            est=new Estudiante();
            est.setCodigo(codigo);
            est.setApellidos(apellidos);
            est.setNombres(nombres);
            est.setDefinitiva(nota);
           
           listado.setVectorEstudiante(i, est);
            
            
        }
        
        JOptionPane.showMessageDialog(null, listado.ObtenerNotaPromedioGeneral());
        JOptionPane.showMessageDialog(null, listado.obtenerAprobados());
        
    }
    
}
