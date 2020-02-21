/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beca;

/**
 *
 * @author manue
 */
public class estacionamiento {
    private int horas;

    public estacionamiento() {
        horas=0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    private float calcularValor(){
        if (horas<=2) {
            return 5000;
        }else{
            if (horas>2 && horas<=5) {
                return 4000;
            }else{
                if (horas > 5 && horas <=10) {
                    return 3000;
                }else{
                    return horas*2000;
                }
            }
        }
    }
    
}
