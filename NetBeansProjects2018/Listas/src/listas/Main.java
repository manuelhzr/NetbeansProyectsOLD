
package listas;

import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void llenar(Nodo nod){
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite el CODIGO del Estudiante"));
        nod.setCodigo(cod);
        
        String nom=JOptionPane.showInputDialog("Digite NOMBRE del Estudiante");
        nod.setNombre(nom);
        
        float n1= Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 1"));
        nod.setNota1(n1);
        float n2= Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 2"));
        nod.setNota2(n2);
        float n3= Float.parseFloat(JOptionPane.showInputDialog("Digite la NOTA 3"));
        nod.setNota3(n3);
    }
    
    public static void MostrarNodo(Nodo nod){
        String datosNodo="";
        datosNodo = datosNodo+String.valueOf(""+nod.getCodigo()+"\n"+"NOMBRE: "+nod.getNombre()+"\n"+"NOTA 1: ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada lis=new ListaEnlazada();
        Nodo aux;
        int opcion, cod;
        
    }
    
}
