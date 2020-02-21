/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelafutbol;

import javax.swing.JOptionPane;

/**
 *
 * @author manuel
 */
public class EscuelaFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes"));
        Principal ver = new Principal();
        ver.setTamaño(tam);
        ver.setVisible(true);
    }
    
}
