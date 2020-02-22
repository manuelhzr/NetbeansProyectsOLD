/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author Manuel
 */
public class Binario {
     private int[] Bits;

    public Binario() {
        Bits= new int[8];
    }

    public int getBits(int pos) {
        return Bits[pos];
    }

    public void setBits(int pos, int val) {
        Bits[pos]=val;
    }
     
    public int ObtenerBitsEncendidos(){
        int cont=0;
            for(int i=0; i<=7; i++){
                if(Bits[i]==1){
                    cont+=1;
                        }
                        }
            return cont;
    }
    
    public int ObtenerBitsApagados(){
        int cont=0;
            for(int i=0; i<=7; i++){
                if(Bits[i]==0){
                    cont+=1;
                        }
                        }
            return cont;
    }
    
    public int ObtenerSumatoria(){
        int Sumatoria=0;
            for(int i=0; i<=7; i++){
                if(Bits[i]==1){
                    Sumatoria= Sumatoria + i;
                }
            }
        return Sumatoria;
    } 
        
    public int CalcularDecimal(){
        int decimal=0, comp=1;
            for(int i=0; i<=7; i++){
                decimal+=Bits[i]*comp;
                comp*=2;
            }
            return decimal;            
    }
}
