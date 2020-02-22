/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

/**
 *
 * @author manue
 */
public class trabajador {
    private String nombre;
    private int horas;
    private float valorHora;
    private float salario;

    public trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        int extras = getHoras()-40;
        if (extras >=1) {
            setSalario(40*getValorHora());
            if (extras <= 8 ) {
                setSalario(getSalario()+ ((getValorHora()*2)* extras ) );
            }else{
                setSalario(getSalario()+ ((getValorHora()*3)* extras ) );
            }
        }else{
            setSalario(getHoras()*getValorHora());
        }
    }
    
    
}
