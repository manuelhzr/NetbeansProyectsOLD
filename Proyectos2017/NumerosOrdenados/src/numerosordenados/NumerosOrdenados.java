
package numerosordenados;

import javax.swing.JOptionPane;


public class NumerosOrdenados {

    
    public static void main(String[] args) {
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a registrar"));
        
        int vect[]=new int[cant];
        int vect2[]=new int[cant];
        JOptionPane.showMessageDialog(null, "Arreglo 1");
        vect[0]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion 0"));
        for (int i = 1; i < cant; i++) {
            while(vect[i]<vect[i-1]){
                vect[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+i));
            }
        }
        JOptionPane.showMessageDialog(null, "Arreglo 2");
        vect2[0]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion 0 "));
        for (int i = 1; i < cant; i++) {
            while(vect2[i]<vect2[i-1]){
                vect2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posicion "+i));
            }
        }
        
        int ord[]=new int[cant*2];
        
        int p1 = 0, p2 = 0;
        for (int j = 0; j < cant*2; j++) {
            int men1=10000, men2=10000;
            for (int i = 0; i < cant; i++) {
            if (vect[i]<men1 && vect[i]!=-1) {
                men1=vect[i];
                p1=i;
            }
            if (vect2[i]<men2 && vect2[i]!=-1) {
                men2=vect2[i];
                p2=i;
            }
        }
            if (men1< men2) {
                ord[j]=men1;
                vect[p1]=-1;
            }else{
                ord[j]=men2;
                vect2[p2]=-1;
            }
        }
        
        
        String Arreglo="";
        
        for (int i = 0; i < cant*2; i++) {
            Arreglo+=" "+ord[i];
        }
        
        JOptionPane.showMessageDialog(null, Arreglo);
    }
    
}