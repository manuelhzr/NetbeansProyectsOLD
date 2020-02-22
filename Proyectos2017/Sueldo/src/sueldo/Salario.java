/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

/**
 *
 * @author manue
 */
public class Salario {
    private int horas;
    private float salarioBasico;
    private int horaseExtra;

    public Salario() {
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(float salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getHoraseExtra() {
        return horaseExtra;
    }

    public void setHoraseExtra(int horaseExtra) {
        this.horaseExtra = horaseExtra;
    }
    
    public float salarioBruto(){
        return (getHoras()*getSalarioBasico())+(getHoraseExtra()*18000);
    }
    
    public float salarioneto(){
        float desc=(float) (salarioBruto()*0.08);
        float total=salarioBruto()-(desc*2);
        return total;
    }
    
    
}
