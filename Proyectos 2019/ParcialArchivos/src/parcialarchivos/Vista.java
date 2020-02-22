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
public class Vista {
    
    public int menu(){
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("<<< SELECCIONE UNA OPCION>>>\n"
                    + "1: Apilar datos con tiempo mayor a: y Velocidad menor a:\n"
                    + "2: Reportar competencia que menos demoro y competencia con velocidad mas alta.\n"
                    + "3: Mostrar archivo registros.\n"
                    + "4: Mostrar archivo reportes.\n"
                    + "5: Mostrar pila.\n"
                    + "6: Salir\n"));
        } while (op<1 || op>6);
        
        return op;        
    }
    
    public Pila apilarDatos(LeerArchivo archivo) throws IOException{
        float tiempo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo minimo"));
        float velocidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la velocidad maxima"));
        
        Pila p= archivo.apilarDatos(tiempo, velocidad);
        
        if (p.getTope()!=null) {
            JOptionPane.showMessageDialog(null, "Pila creada");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontraron datos coincidentes");
        }
        return p;
        
    }
    
    public void reporte(LeerArchivo archivo, LeerArchivo reporte) throws IOException{
        archivo.Reporte(reporte);
        
        JOptionPane.showMessageDialog(null, reporte.leerArchivo());
    }
    
}
