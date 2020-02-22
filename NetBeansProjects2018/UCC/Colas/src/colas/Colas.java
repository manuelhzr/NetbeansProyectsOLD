/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ColaVacia {
        // TODO code application logic here
        int act=1;
        
        int op=JOptionPane.showConfirmDialog(null, "¿Iniciar Simulacion?", "Simulacion", JOptionPane.YES_NO_OPTION);
        
        if (op==0) {
            TadCola ob=new TadCola();
            
            int rand=(int)(Math.random()*100);
            ob.setInicial(rand);
            ob.setTamMedio(rand, 1);
            
            for (int i = 0; i < rand; i++) {
                ob.encolar(act);
                act++;
            }
            
            for (int i = 0; i < 420; i++) {
            ob.encolar(act);
            act++;
            
            if (i%2==0) {
                ob.setTiempoEspera(i, ob.primero());
                ob.quitarPrimero();
            }
            if (i%4==0) {
                ob.setTiempoEspera(i, ob.primero());
                ob.quitarPrimero();
                ob.setTiempoEspera(i, ob.primero());
                ob.quitarPrimero();
                if (ob.numElemCola()>20) {
                    ob.setTiempoEspera(i, ob.primero());
                    ob.quitarPrimero();
                    ob.setCuartoOP(ob.getCuartoOP()+4);
                }
            }
        }
            
            
            JOptionPane.showMessageDialog(null, "Resultados:\n"
                    + "Estudiantes atendidos durante la simulación: "+ob.getEstAtendidos()+"\n"
                            + "Tamaño medio de la fila de estudiantes: "+String.valueOf(ob.getTamMedio())+"\n"
                                    + "Tamaño máximo de la fila de estudiantes: "+ob.getTamMaximo()+"\n"
                                            + "Tiempo máximo de espera de los estudiantes: "+ob.getTiempoEspera()+"\n"
                                                    + "Tiempo en que está trabajando el cuarto operador: "+ob.getCuartoOP());
            
        }else{
            System.exit(op);
        }
        
    }
    
}
