/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import Ventanas.Principal;

/**
 *
 * @author saray
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    
    public static Control datosInventario;
    
    public static void main(String[] args) {
        // TODO code application logic here
        datosInventario = new Control();
        new Principal().setVisible(true);
        
    }
    
}
