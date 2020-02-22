/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author manue
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toyota c= new Toyota();
        
        c.setMarchas(5);
        c.setModelo("COROLLA");
        System.out.println("EL coche Toyota modelo ["+c.getModelo()+"] con ["+c.getMarchas()+"] marchas");
        
        c.arrancar();
        
    }
    
}
