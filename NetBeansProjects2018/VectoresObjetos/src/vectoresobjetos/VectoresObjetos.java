/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusDavid
 */
public class VectoresObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        Empresa obj=new Empresa();
        Empleado temp;
        
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de  empleados a registrar"));
        
        obj.setTam(tam);
        
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                    + "1: Registrar empleados\n"
                    + "2: Nombre y apellidos de empleado com mayor sueldo\n"
                    + "3: Promedio de salario de empleados masculinos mayores de 35 y menores de 50 años\n"
                    + "4: Identificacion de empleado con menor salario\n"
                    + "5: Promedio de salario de empleados\n"
                    + "6: Salir"));
            
            switch (op) {
                case 1:
                    String sexo[]={"Femenino", "Masculino"};
                    for (int i = 0; i < tam; i++) {
                        temp=new Empleado();
                        temp.setIdentificacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado "+(i+1))));
                        temp.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado "+(i+1)));
                        temp.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del empleado "+(i+1)));
                        temp.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado "+(i+1))));
                        temp.setSexo(JOptionPane.showInputDialog(null, "Seleccione sexo", "Sexo", 3, null, sexo, sexo[0]).toString());
                        temp.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario del empleado"+(i+1))));
                        obj.setVector(i, temp);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Los nombres y apellidos del empleado con mayor salario son:\n"+obj.empleadoMejorSueldo());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El promedio de los salarios de los empleados seleccionados es:\n"+obj.promedioSalariosMasxlinos());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "La identificacion del empleado con menor salario es:\n"+obj.idMenorSalario());
                    break;
                case 5: 
                    JOptionPane.showMessageDialog(null, "El promedio de salarios de los empleados es:\n "+obj.promedioSalario());
                    break;
            }
        } while (op!=6);
        
    }
    
}
