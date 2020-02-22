/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Check Personal
 */
public class operacionesBasicas {

    public operacionesBasicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int suma(){
        return num1 + num2;
    }
    
    public int resta(){
        return num1 - num2;
    }
    
    public int multiplicacion(){
        return num1 * num2;
    }
    
    public int division(){
        return num2 != 0 ? num1 / num2 : 0;
    }
            
}
