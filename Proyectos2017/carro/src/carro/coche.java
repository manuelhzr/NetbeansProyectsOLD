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
public class coche {
     
    private int marchas;

    public coche() {
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    
    public void arrancar(){
        System.out.println("Comprobando el sistema de encendido...");
    }
            
    
} 