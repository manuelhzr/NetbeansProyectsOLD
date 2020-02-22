/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesherencia;

/**
 *
 * @author manue
 */
public class Egresados extends Estudiante{
    private int añoGraduacion;
    private String CargoACT;

    public Egresados() {
    }

    public int getAñoGraduacion() {
        return añoGraduacion;
    }

    public void setAñoGraduacion(int añoGraduacion) {
        this.añoGraduacion = añoGraduacion;
    }

    public String getCargoACT() {
        return CargoACT;
    }

    public void setCargoACT(String CargoACT) {
        this.CargoACT = CargoACT;
    }
    
    
}
