/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;

/**
 *
 * @author Manuel
 */
public class Binario {
     private int[] bits;

    public Binario() {
        bits= new int[8];        
    }

    public int getBits(int index) {
        return bits[index];
    }

    public void setBits(int index, int valor) {
        bits[index]=valor;
    }
    
    private int potencia(int exp){
        int pot=1;
        for(int i=1; i<=exp; i++){
            pot=pot*2;
        }
        return pot;
    }
    
    public int conversionDecimal(){
        int decimal=0;
        for(int i=0; i<=7; i++){
            decimal+=potencia(i)*getBits(i);
        }
        return decimal;
    }
}
