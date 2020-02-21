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
public class paquetes {
    private float sueldo;

    public paquetes() {
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String paqueteComprar(){
        if (sueldo >= 6000000) {
            return "Paquete A";
        }else{
            if (sueldo< 6000000 && sueldo >=3000000) {
                return "Paquete B";
            }else{
                if (sueldo <3000000 && sueldo >=1000000) {
                    return "Paquete C";
                }else{
                    return "Paquete D";
                }
            }
        }
    }
}
