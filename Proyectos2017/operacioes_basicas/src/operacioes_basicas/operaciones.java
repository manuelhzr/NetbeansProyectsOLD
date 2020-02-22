/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacioes_basicas;

/**
 *
 * @author ASUS - PC
 */
public class operaciones {

    public operaciones(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    private float num1, num2;
    
    public float suma(){
        return num1 + num2;
    }
    public float resta(){
        return num1 - num2;
    }
    public float producto(){
        return num1 * num2;
    }
    public float cociente(){
        return num2 == 0 ? 0 : num1 / num2;
    }
}
