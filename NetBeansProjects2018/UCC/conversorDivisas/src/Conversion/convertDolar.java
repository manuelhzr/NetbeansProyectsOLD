/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

import Divisas.IConversion;
import Divisas.Dolar;
import Divisas.Euro;
import Divisas.Peso;
import Divisas.Yen;

/**
 *
 * @author manue
 */
public class convertDolar {
    IConversion moneda;
    private double Valor;
    private Peso peso;
    private Euro euro;
    private Dolar dolar;
    private Yen yen;
    

    public convertDolar(double val, Peso div) {
        this.Valor=val;
        this.peso=div;
        this.euro=null;
        this.dolar=null;
        this.yen=null;
    }

    public convertDolar(double Valor, Euro div) {
        this.Valor = Valor;
        this.peso=null;
        this.euro=div;
        this.dolar=null;
        this.yen=null;        
    }

    public convertDolar(double Valor, Dolar div) {
        this.Valor = Valor;
        this.peso=null;
        this.euro=null;
        this.dolar=div;
        this.yen=null;
    }

    public convertDolar(double Valor, Yen div) {
        this.Valor = Valor;
        this.peso=null;
        this.euro=null;
        this.dolar=null;
        this.yen=div;
    }
    
    private void establecerConversion(){
        if (dePeso()) {
            moneda=new Peso(Valor);
        }else{
            if (deEuro()) {
                moneda=new Euro(Valor);
            }else{
                if (deDolar()) {
                    moneda=new Dolar(Valor);
                }else{
                    if (deYen()) {
                        moneda=new Yen(Valor);
                    }
                }
            }
        }
    }
    
    private boolean dePeso(){
        return peso!=null;
    }
    
    private boolean deEuro(){
        return euro!=null;
    }
    
    private boolean deDolar(){
        return dolar!=null;
    }
    
    private boolean deYen(){
        return yen!=null;
    }
    
    public double conversion(){
        establecerConversion();
        return moneda.convertiDolar();
    }
}
