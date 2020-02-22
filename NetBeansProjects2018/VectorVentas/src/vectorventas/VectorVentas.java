/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorventas;

import javax.swing.JOptionPane;


public class VectorVentas {

    /**
     * @param args the command line arguments
     */
    
    static int menu(){
        int res;
        do {
            res=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                    + "1: Registrar Ventas\n"
                    + "2: Mostrar Ventas\n"
                    + "3: Total Ventas\n"
                    + "4: Venta Mayor\n"
                    + "5: Venta Menor\n"
                    + "6: Promedio Ventas\n"
                    + "7: Salir"));
        } while (res<1 || res >7);
        return res;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Vectores obj=new Vectores();
        
        obj.setTamaño(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector")));
        
        int op;
        
        do {
            op=menu();
            switch(op){
                case 1:
                    for (int i = 0; i < obj.getTamaño(); i++) {
                        obj.setVector(i, Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta")));
                    }
                    JOptionPane.showMessageDialog(null, "Ventas registradas");
                    break;
                case 2:
                    String datos="";
                    
                    for (int i = 0; i < obj.getTamaño(); i++) {
                        datos+=obj.getVector(i)+"\n";
                    }
                    JOptionPane.showMessageDialog(null, "Ventas:\n"+datos);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Total de las ventas: "+obj.TotalVentas());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Venta mayor: "+obj.VentaMayor());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Venta menor: "+obj.VentaMenor());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Promedio de las ventas: "+obj.PromedioVentas());
                    break;
                    
            }
        } while (op!=7);
        
        
    }
    
}
