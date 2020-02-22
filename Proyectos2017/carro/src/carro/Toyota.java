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
public class Toyota extends coche{
    private String modelo;

    public Toyota() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void arrancar(){
        super.arrancar();
        
        System.out.println("El toyota esta en marcha");
    }
}
