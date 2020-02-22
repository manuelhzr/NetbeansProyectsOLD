/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallistas;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class ParcialListas {

    static int menu(){
        int res;
        do{
        res=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n"
                + "1: Agregar\n"
                + "2: Mostrar\n"
                + "3: Salir\n"));
        }while(res<1 || res>3);
        return res;
    }
    
    static void agregar(polinomio obj){
        Nodo aux= new Nodo();
        int coeficiente=Integer.parseInt(JOptionPane.showInputDialog("coeficiente"));
        int exponente=Integer.parseInt(JOptionPane.showInputDialog("exponente"));
        
        aux.setCoeficiente(coeficiente);
        aux.setExponente(exponente);
        
        obj.agregar(aux);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        polinomio obj= new polinomio();
        do {
            op=menu();
            switch(op){
                case 1:
                    agregar(obj);
                    break;
                case 2:
                    obj.calcular();
                    JOptionPane.showMessageDialog(null, obj.Mostrar());
                    break;
            }
        } while (op!=3);
        
    }
    
}
