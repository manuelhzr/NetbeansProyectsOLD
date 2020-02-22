/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problama.de.jose;

import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class ProblamaDeJose {

    
    public static void MostrarCola(ListaNumeros co){
        ListaNumeros temp=new ListaNumeros();
        String datos="";
        while(! co.ColaVacia()){
            datos+="--> "+co.valorFinal().getDato()+"\n";
            temp.agregar(co.valorFinal());
            co.quitar();
        }
        JOptionPane.showMessageDialog(null, "----- Numeros de la suerte -----\n\n"+datos+"\n");
        while(! temp.ColaVacia()){
            co.agregar(temp.valorFinal());
            temp.quitar();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaNumeros cola= new ListaNumeros();
        int Cantidad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros de la cola"));
        cola.llenarCola(Cantidad);
        
        JOptionPane.showMessageDialog(null, "La cola se ha llenado.\n\nSe calcularan los numeros de la suerte");
        
        cola.setN1(cola.random());
        
        while (cola.getN1()<=cola.getTotalDatos()) {
            cola.CalculoDeJose();
            JOptionPane.showMessageDialog(null, "N1 Actual: "+cola.getN1());
            cola.setN1(cola.random());
        } 
        
        MostrarCola(cola);
        
        
    }
    
}
