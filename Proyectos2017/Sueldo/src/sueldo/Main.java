/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

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
        Salario obj=new Salario();
        
        int horas=Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas trabajadas"));
        obj.setHoras(horas);
        int horasextra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extra"));
        obj.setHoraseExtra(horasextra);
        float Salariobas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de cada hora trabajada"));
        obj.setSalarioBasico(Salariobas);      
        
        JOptionPane.showMessageDialog(null, "El salario bruto es: "+obj.salarioBruto());
        JOptionPane.showMessageDialog(null, "El salario neto es: "+obj.salarioneto());

    }
    
}
