
package metododeordenamiento;

import javax.swing.JOptionPane;

public class MetodoDeOrdenamiento {
    public static void mostrar(Metodos met){
        String M="";
        for(int i = 0; i < met.getTamaño(); i++){
            M= M + met.getVector(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, "Vector \n"+M);
    }
    public static void main(String[] args) {
        Metodos met = new Metodos();
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
        met.setTamaño(x);
        met.crearVector();
        JOptionPane.showMessageDialog(null,"Ingrese los datos del vector");
        for(int i = 0; i < met.getTamaño(); i++){
            int s = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+(i+1)));
            met.setVector(i, s);
        }
        mostrar(met);
        met.ordenarburbuja();
        mostrar(met);
        met.intercambio();
        mostrar(met);
        met.ordenarSeleccion();
        mostrar(met);
    }
    
}
