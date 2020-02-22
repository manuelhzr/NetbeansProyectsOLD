/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivospilas;

import Modelo.LeerArchivo;
import Modelo.Pila;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class Vista {

    public int menu() {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("<<<SELECCIONE UNA OPCION>>>\n\n"
                    + "1: Crear Pila 1, de Archivo 1\n"
                    + "2: Crear Pila 2, de Archivo 2\n"
                    + "3: Apilar Elementos Comunes En pila 3\n"
                    + "4: Guardar Pila 3 en Archivo\n"
                    + "5: Combinar Pilas en Pila 4\n"
                    + "6: Guardar Pila 4 en Archivo\n"
                    + "7: Mostrar Pila\n"
                    + "8: Mostrar Archivo\n"
                    + "9: Salir\n"));
        } while (op < 1 || op > 9);
        return op;
    }
    
    public int menuMostrar(String tipo){
        int op;
        do {            
            op= Integer.parseInt(JOptionPane.showInputDialog("<<<SELECCIONE ELEMENTO A MOSTRAR>>>\n"
                    + "1: "+tipo+" 1\n"
                    + "2: "+tipo+" 2\n"
                    + "3: "+tipo+" 3\n"
                    + "4: "+tipo+" 4\n"
                    + "5: Volver"));
        } while (op<1 || op>5);
        return op;
    }

    public Pila crearPila(Pila pila, LeerArchivo archivo) {
        try {
            pila = archivo.CrearPila();
            JOptionPane.showMessageDialog(null, "Pila Creada");
        } catch (IOException ex) {
            Logger.getLogger(ArchivosPilas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pila;
    }

    public Pila ApilarComunes(Pila pila1, Pila pila2) {
        Pila pila = null;
        try {
            pila = pila1.elementosComun(pila2);
            JOptionPane.showMessageDialog(null, "Pila 3 creada correctamente");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Pila 1 o Pila 2 no han sido creadas");
        }
        return pila;
    }

    public Pila CombinarPilas(Pila pila1, Pila pila2) {
        Pila pila = null;
        try {
            pila = pila1.combinarPilas(pila2);
            JOptionPane.showMessageDialog(null, "Pila 4 creada correctamente");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Pila 1 o Pila 2 no han sido creadas");
        }
        return pila;
    }

    public void guardarArchivo(Pila pila, LeerArchivo archivo) {
        try {
            archivo.guardarArchivo(pila);
            JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void MostrarPila(Pila pila){
        try {
            JOptionPane.showMessageDialog(null, pila.mostrarPila());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La pila no ha sido creada");
        }
    }
    
    public void MostrarArchivo(LeerArchivo archivo){
        try {
            JOptionPane.showMessageDialog(null, archivo.leerArchivo());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El archivo no ha sido creado");
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
