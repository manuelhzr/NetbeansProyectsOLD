/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donante;


public class DonadorSangre {
    private float peso;
    private int sexo;

    public DonadorSangre() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public boolean PuedeDonar(){
        boolean puede=false;
        if((getSexo()==1 && getPeso() >= 55)||(getSexo()==2 && getPeso()>=50)){
            puede=true;
        }
        return puede;
    }
}
