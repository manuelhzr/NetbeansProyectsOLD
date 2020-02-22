/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Divisas;

/**
 *
 * @author manue
 */
public class Dolar implements IConversion{
    
    private double Valor;

    public Dolar(double Valor) {
        this.Valor = Valor;
    }
    
    @Override
    public double convertir() {
        return Valor;
    }

    @Override
    public double convertiDolar() {
        return Valor;
    }
    
}
