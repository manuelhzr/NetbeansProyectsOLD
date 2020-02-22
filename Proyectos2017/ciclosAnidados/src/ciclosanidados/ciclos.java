/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosanidados;

/**
 *
 * @author manue
 */
public class ciclos {
    private float nota;

    public ciclos() {
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public String Estado(){
        String est = null;
        if(getNota()<=2){
            est= "Reprobado";
        }else{
            if(getNota()>2 && getNota()<3){
                est= "Puede nivelar";
            }else{
                if(getNota()>=3 && getNota()<=5){
                    est= "Aprovado";
                }else{
                    if(getNota()>5){
                        est="La nota ingresada es invalida";
                    }
                }
            }
        }
        return est;
    }
    
}
