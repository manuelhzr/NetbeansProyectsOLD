/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author manue
 */
public class calcFactorial {
    private int numero;

    public calcFactorial() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int Factorial(){
        int factorial=1;
        for(int i=1; i<=getNumero(); i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
