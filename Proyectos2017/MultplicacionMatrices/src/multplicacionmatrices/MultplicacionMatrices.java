
package multplicacionmatrices;

import javax.swing.JOptionPane;


public class MultplicacionMatrices {

    
    public static void main(String[] args) {
        Matrices obj=new Matrices();
        
        int fm1, cm1, fm2, cm2;
        fm1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las filas de la matriz 1"));
        obj.setFm1(fm1);
        cm1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las columnas de la matriz 1"));
        obj.setCm1(cm1);
        fm2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las filas de la matriz 2"));
        obj.setFm2(fm2);
        cm2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las columnas de la matriz 2"));
        obj.setCm2(cm2);
        
        obj.CrearMatrices();
        if (obj.validarMultiplicacion() == true) {
            for (int fil = 0; fil < fm1; fil++) {
                for (int col = 0; col < cm1; col++) {
                    obj.setMatriz1(fil, col, Integer.parseInt(JOptionPane.showInputDialog("Matriz 1\nIngrese el valor de la posicion [" + fil + " " + col + "] ")));
                }
            }

            for (int fil = 0; fil < fm2; fil++) {
                for (int col = 0; col < cm2; col++) {
                    obj.setMatriz2(fil, col, Integer.parseInt(JOptionPane.showInputDialog("Matriz 2\nIngrese el valor de la posicion [" + fil + " " + col + "] ")));
                }
            }
            
        int res[][]=obj.Multiplicar();
        String mat="";
            for (int fil = 0; fil < fm1; fil++) {
                mat+="[";
                for (int col = 0; col < cm2; col++) {
                    mat+=res[fil][col]+" ";
                }
                mat+="]\n";
            }
            
        JOptionPane.showMessageDialog(null, "El resultado es:\n"+mat);
        }else{
            JOptionPane.showMessageDialog(null, "La multiplicacion no se puede realizar");
        }
        
        
    }
    
}
