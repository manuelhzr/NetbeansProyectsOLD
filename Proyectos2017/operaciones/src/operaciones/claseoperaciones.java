/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;


public class claseoperaciones {
    private int num1;
    private int num2;

    public claseoperaciones() {
    }

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
        int suma;
        suma=num1+num2;
        return suma;
    }
    
    public int resta(){
        int resta;
        resta=num1-num2;
        return resta;
    }
    
    public int multiplicacion(){
        int multiplicacion;
        multiplicacion=num1*num2;
        return multiplicacion;
    }
    
    public float division(){
        float division;
        division=num1/num2;
        return division;
    }
}
