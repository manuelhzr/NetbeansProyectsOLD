/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizacion;

/**
 *
 * @author manue
 */
public class Asalariado {
    public int HorasTrabajas;
    public float costoHoras;

    public Asalariado() {
    }

    public int getHorasTrabajas() {
        return HorasTrabajas;
    }

    public void setHorasTrabajas(int HorasTrabajas) {
        this.HorasTrabajas = HorasTrabajas;
    }

    public float getCostoHoras() {
        return costoHoras;
    }

    public void setCostoHoras(float costoHoras) {
        this.costoHoras = costoHoras;
    }
    
    public float Salario(){
        float salario=getCostoHoras()*getHorasTrabajas();
        salario=(float) (salario-(salario*0.08));
        return salario;
        
    }
}
