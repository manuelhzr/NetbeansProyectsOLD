/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author manue
 */
public class CasaBuilder extends Builder{

    private float largo;
    private float ancho;
    private String color;
    private float valor;
    private cliente comprador;

    public CasaBuilder(float largo, float ancho, String color, float valor, cliente comprador) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.valor = valor;
        this.comprador = comprador;
    }
    
    @Override
    public void buildLargo() {
        Casa.setLargo(largo);
    }

    
    @Override
    public void buildAncho() {
        Casa.setAncho(ancho);
    }

    
    @Override
    public void buildTipo() {
        Casa.setTipo("Casa");
    }

    
    @Override
    public void buildColor() {
        Casa.setColor(color);
    }

    
    @Override
    public void buildValor() {
        Casa.setValor(valor);
    }

    @Override
    public void buildComprador() {
        Casa.setComprador(comprador);
    }
    
}
