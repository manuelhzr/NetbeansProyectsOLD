/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class Vista {
    private ListaParqueadero parqueadero;

    public Vista(ListaParqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
    
    public int menu(){
        int res;
        do {
            res=Integer.parseInt(JOptionPane.showInputDialog(null, "SELECCIONE UNA OPCION:\n\n"
                    + "1: Ingresar Coche\n"
                    + "2: Salida de Coche\n"
                    + "3: Mostrar Cola Actual\n"
                    + "4: Salir\n","Menu",JOptionPane.QUESTION_MESSAGE));
        } while (res<1 || res>4);
        
        return res;
    }
    
    public void agregar(){
        String tipo[]={"Auto","Camioneta"};
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la matricula del coche","Matricula",JOptionPane.QUESTION_MESSAGE));
        String tipoCoche =JOptionPane.showInputDialog(null, "Seleccione el tipo de coche", "Tipo", JOptionPane.QUESTION_MESSAGE,null, tipo, tipo[0]).toString();
        Modelo nuevo = new Modelo(matricula, tipoCoche);
        if (parqueadero.agregar(nuevo)) {
            JOptionPane.showMessageDialog(null, "Vehiculo agregado","Exitoso",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Cola llena.\nNo fue posible agregar el vehiculo","Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void salida(){
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la matricula del coche a sacar","Salida",JOptionPane.QUESTION_MESSAGE));
        Modelo res= parqueadero.buscar(matricula);
        
        if (res!=null) {
            int avance=parqueadero.numeroAvance(res);
            parqueadero.eliminar(res);
            JOptionPane.showMessageDialog(null, "El vehiculo "+res.getNumMatricula()+" avanzo "+avance+" veces al salir", "Salida Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }else JOptionPane.showMessageDialog(null, "Vehiculo no Encontrado","No encontrado",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void estadoActual(){
        JOptionPane.showMessageDialog(null, "Estado de la cola:\n"+parqueadero.colaActual(), "Estado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}


