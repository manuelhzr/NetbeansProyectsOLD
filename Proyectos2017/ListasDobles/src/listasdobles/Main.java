/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class Main {

    public static void llenar(Nodo nod){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante: "));
        nod.setCodigo(cod);
        String nom= JOptionPane.showInputDialog("Digite NOMBRE del Estidiante: ");
        nod.setNombre(nom);
        float n1=Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 1: "));
        nod.setNota1(n1);
        float n2=Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 2: "));
        nod.setNota2(n2);
        float n3=Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 3: "));
        nod.setNota3(n3);
        
    }
    
public static void mostrar(Nodo nod){
    String datosNodo="";
    datosNodo = datosNodo+String.valueOf(""+"Id: "+nod.getCodigo()+"   " +"Nombre: "+nod.getNombre()+" "+"Extencion: "
            + "Peso: "+nod.get);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
