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
public class sueldos {
    private int años;
    private float sueldo;

    public sueldos() {
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    private float BonoAños(){
        if (años > 2 && años<5) {
            return (float) (sueldo*0.15);
        }else{
            if (años>=5) {
                return (float) (sueldo*0.25);
            }else{
                return 0;
            }
        }
    }
    
    private float BonoSueldo(){
        if (sueldo<=1000000) {
            return (float) (sueldo*0.35);
        }else{
            if (sueldo>1000000 && sueldo <=3500000) {
                return (float) (sueldo*0.25);
            }else{
                return (float) (sueldo*0.15);
            }
        }
    }
    
    public float bono(){
        if (BonoAños()>BonoSueldo()) {
            return BonoAños();
        }else{
            return BonoSueldo();
        }
    }
}
