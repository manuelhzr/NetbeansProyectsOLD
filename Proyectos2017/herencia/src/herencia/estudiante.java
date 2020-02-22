/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Manuel
 */
public class estudiante extends persona{
    public estudiante() {
        
    }
    
    private float n1, n2, n3;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public float definita(){
        return (n1 + n2 + n3)/3;
    }
    
    public boolean validarNota(float nota){
        return nota>=0 && nota<=5;
    }
    
    public boolean validacionNotas(){
        return validarNota(n1) && validarNota(n2) && validarNota(n3);
    }
}
