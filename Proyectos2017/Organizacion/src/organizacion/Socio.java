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
public class Socio extends Participantes{
    private String municpioRes;
    private float sueldoB;
    private String direccion;

    public Socio() {
    }

    public String getMunicpioRes() {
        return municpioRes;
    }

    public void setMunicpioRes(String municpioRes) {
        this.municpioRes = municpioRes;
    }

    public float getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(float sueldoB) {
        this.sueldoB = sueldoB;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public float sueldoNeto(){
        float sueldo=(float) (getSueldoB()- (getSueldoB()*0.05));
        return sueldo;
    }
    
    
}
