/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class FiltroWhithArray {

    public FiltroWhithArray() {
        Vector=new ArrayList<>();
    }
    
    private ArrayList<Integer> Vector ;
    
    public void Agregar(int Num){
        this.Vector.add(Num);
    }
    
    public int Obtener(int Pos){
        return this.Vector.get(Pos);
    }
    
    public void Modificar(int Pos, int Val){
        this.Vector.set(Pos, Val);
    }
    
    public void Eliminar(int Pos){
        this.Vector.remove(Pos);
    }
    
    public int GetTamaño(){
        return this.Vector.size();
    }
    
    public boolean isPar(int Num){
        return Num%2 == 0;
    }
    
    public boolean isImpar(int Num){
        return Num%2 == 1;
    }
    
    public boolean isMultipleX(int X, int Num){
        return Num%X == 0;
    }
    
    public boolean isPrimo(int Num){
        for (int i = 2; i < Num; i++) {
            if(Num % i ==0){
                return false;
            }
        }
        return true;
    }
}
