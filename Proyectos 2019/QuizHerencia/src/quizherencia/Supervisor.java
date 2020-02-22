/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizherencia;

/**
 *
 * @author Lenovo
 */
public class Supervisor extends Empleado {

    private int vendedores;

    public Supervisor() {
    }

    public int getVendedores() {
        return vendedores;
    }

    public void setVendedores(int vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public float Salario() {
        float sueldo = getSalarioMinimo() * 4;

        if (getEstudios().equals("Tecnologo") || getEstudios().equals("Profesional") || getEstudios().equals("Especialista")) {
            sueldo = (float) (sueldo + sueldo * 0.05);
        }
        sueldo += 45000 * vendedores;
        return sueldo;
    }

}
