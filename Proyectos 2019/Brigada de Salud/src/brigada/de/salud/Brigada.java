/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brigada.de.salud;

import java.time.LocalDate;

/**
 *
 * @author lenovo
 */
public class Brigada {

    private String nombre;
    private String eps;
    private String sexo;
    private LocalDate nacimiento;
    private float peso;
    private float estatura;
    private float glucosa;
    private float hemoglobina;

    public Brigada() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(float glucosa) {
        this.glucosa = glucosa;
    }

    public float getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(float hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public int edad() {
        LocalDate hoy = LocalDate.now();

        return hoy.getYear() - getNacimiento().getYear();
    }

    public float IMC() {
        return (float) (getPeso() / Math.pow(getEstatura(), 2));
    }

    public String clasificacionIMC() {
        float imc = IMC();

        if (imc < 16) {
            return "Infrapeso";
        } else {
            if (imc >= 16 && imc < 25) {
                return "Normal";
            } else {
                if (imc >= 25 && imc < 30) {
                    return "Sobrepeso";
                } else {
                    return "Obesidad";
                }
            }
        }
    }

    public String nivelGlucosa() {
        float g = getGlucosa();
        if (g >= 70 && g <= 100) {
            return "Optimo";
        } else {
            if (g > 100 && g <= 125) {
                return "Prediabetes";
            } else {
                return "Diabetico";
            }
        }
    }

    public String nivelHemoglobina() {
        float H = getHemoglobina();
        String sex = getSexo();

        if (sex.equals("Masculino")) {
            if (H < 13) {
                return "Bajo";
            } else {
                if (H >= 13 && H <= 17) {
                    return "Optimo";
                } else {
                    return "Alto";
                }
            }
        } else {
            if (H < 12) {
                return "Bajo";
            } else {
                if (H >= 12 && H <= 15) {
                    return "Optimo";
                } else {
                    return "Alto";
                }
            }
        }

    }

}
