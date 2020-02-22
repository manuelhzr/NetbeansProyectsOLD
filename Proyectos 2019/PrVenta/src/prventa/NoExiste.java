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
public class NoExiste extends Exception{

    public NoExiste(Exception ex) {
    super("No existe",ex);
    }
    
}

