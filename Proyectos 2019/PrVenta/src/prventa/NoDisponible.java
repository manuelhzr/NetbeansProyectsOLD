/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prventa;

/**
 *
 * @author JP
 */
public class NoDisponible extends Exception{

    public NoDisponible(Exception ex) {
    super("No esta disponible",ex);
    }
    
}
