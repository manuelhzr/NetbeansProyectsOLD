/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areafinanciera;

import javax.swing.JOptionPane;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matriculas obj=new matriculas();
        int semestre,estrato, modalidad;
        float smlv;
        String Programa;
        
        int tipoPrograma= Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de programa: \n 1: Pregado \n 2: Postgrado "));
        obj.setTipoPrograma(tipoPrograma);
        
        smlv=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del salario minimo legal vigente:"));
            obj.setValorInicial(smlv);
            
            estrato=Integer.parseInt(JOptionPane.showInputDialog("Diga su estrato"));
            obj.setEstrato(estrato);
            
        if(obj.getTipoPrograma()==1){
            semestre= Integer.parseInt(JOptionPane.showInputDialog("Digite el semestre a cursar: "));
            obj.setSemestre(semestre);
            
             String[] cursos={"Ing Sistemas", "Ing Industrial", "Enfermeria", "Bacteriologia", "Matematica", "fisica"};            
            Programa= JOptionPane.showInputDialog(null, "Seleccione un curso", "Programa", JOptionPane.QUESTION_MESSAGE,null , cursos, cursos[0]).toString();
            obj.setPrograma(Programa);
            
            modalidad=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una modalidad; \n 1: presencial \n 2: Distancia"));
            obj.setModalidad(modalidad);
            
            JOptionPane.showMessageDialog(null, "El total a pagar es: "+obj.totalpagopregrado());
        }
        if(obj.getTipoPrograma()==2){
            String Egresado=JOptionPane.showInputDialog("De que univeridad es egresado?");
            obj.setEgresadoDe(Egresado.toUpperCase());
            int trabaja=Integer.parseInt(JOptionPane.showInputDialog("Usted trabaja? \n 1: Si \n 2: No"));
            obj.setTrabjador(trabaja);
            
            JOptionPane.showMessageDialog(null, "El total a pagar es: "+obj.totalpagopostgrado());
            
        }
    }
    
}
