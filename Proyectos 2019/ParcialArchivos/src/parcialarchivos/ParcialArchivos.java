/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialarchivos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class ParcialArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LeerArchivo registros = new LeerArchivo("src\\Archivo\\registros.txt");
        LeerArchivo reportes = new LeerArchivo("src\\Archivo\\Reportes.txt");
        Pila pila1=null;
        
        Vista v = new Vista();
        
        int op;
        
        do {
            op = v.menu();
            switch(op){
                case 1:
                    pila1 = v.apilarDatos(registros);
                    break;
                case 2:
                    v.reporte(registros, reportes);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, registros.leerArchivo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, reportes.leerArchivo());
                    break;
                case 5:
                    if (pila1!=null) {
                       JOptionPane.showMessageDialog(null, pila1.mostrarPila());
                    }else{
                        JOptionPane.showMessageDialog(null, "Pila no creada");
                    }
                    break;
                    
            }
        } while (op!=6);
        
    }
    
}
