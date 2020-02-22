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
public class Yen implements IConversion{
    private final double ValDolar=113.83;
    private double Valor;

    public Yen(double Valor) {
        this.Valor = Valor;
    }
  
    @Override
    public double convertir() {
        return Valor*ValDolar;
    }


    @Override
    public double convertiDolar() {
        return  Valor/ValDolar;
    }
    
    
    
    
}
