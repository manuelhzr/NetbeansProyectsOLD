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
public class Planta extends Empleado {

    private float sueldo;
    private int supervisores;

    public Planta() {
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getSupervisores() {
        return supervisores;
    }

    public void setSupervisores(int supervisores) {
        this.supervisores = supervisores;
    }

    private int años() {
        return 2019 - getAñoVinculacion();
    }

    @Override
    public float Salario() {
        float bonoAntiguedad;
        float Salario = getSalarioMinimo() * 5;
        if (años() < 1) {
            bonoAntiguedad = (float) (Salario * 0.02);
        } else if (años() >= 1 && años() < 5) {
            bonoAntiguedad = (float) (Salario * 0.03);
        } else if (años() >= 5 && años() < 10) {
            bonoAntiguedad = (float) (Salario * 0.05);
        } else {
            bonoAntiguedad = (float) (Salario * 0.1);
        }

        float bonoEstudios = 0;

        if (getEstudios().equals("Especializacion") || getEstudios().equals("Maestria") || getEstudios().equals("Doctorado")) {
            bonoAntiguedad = supervisores * 50000;
        }

        return Salario + bonoAntiguedad + bonoEstudios;
    }
}
