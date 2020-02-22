/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author rosa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = true;
        int seguir;
        String[] empleado= {"Ejecutivo", "Operario"};
        String[] riesgo={"Alto", "Bajo"};
        
        while(salir){
            String OP=JOptionPane.showInputDialog(null,"Seleccione el tipo de empleado","Empleado",1,null,empleado,empleado[0]).toString();
            
            if(OP.equals("Ejecutivo")){
                ejecutivos ejec=new ejecutivos();
                String[] nivel={"Profesional","Especialista","Magister"};
                        
                String zona=JOptionPane.showInputDialog(null,"seleccione el riesgo de la zona ","riesgo",1,null,riesgo,riesgo[0]).toString();
                ejec.setZona(zona);
                
                int idiomas =Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de idiomas hablados"));
                ejec.setIdiomas(idiomas);
                
                String Educacion=JOptionPane.showInputDialog(null,"Seleccione el nivel educativo","Nivel educativo",1,null,nivel,nivel[0]).toString();
                ejec.setNivelEducativo(Educacion);
                
                JOptionPane.showMessageDialog(null, "El salario para el empleado es: "+(ejec.SalarioBase()+ejec.AumentoIdiomas()+ejec.riesgo()));
                
                seguir=Integer.parseInt(JOptionPane.showInputDialog("Desea salir\n1: Si\n2: No"));
                salir = seguir != 1;
            }
            
            if(OP.equals("Operario")){
                operarios ope=new operarios();
                
                String zona=JOptionPane.showInputDialog(null,"seleccione el riesgo de la zona ","riesgo",1,null,riesgo,riesgo[0]).toString();
                ope.setZona(zona);
                
                int Horas=Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas durante los ultimos 5 dias"));
                ope.setHoras(Horas);
                
                JOptionPane.showMessageDialog(null, "El salarion para el empleado es: "+ope.salario());
                
                seguir=Integer.parseInt(JOptionPane.showInputDialog("Desea salir\n1: Si\n2: No"));
                salir = seguir != 1;
            }
        }
        
        
    }
    
}
