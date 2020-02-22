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
public class Vendedor extends Empleado {

    private String TipoTransporte;
    private float ventas;

    public Vendedor() {
    }

    public String getTipoTransporte() {
        return TipoTransporte;
    }

    public void setTipoTransporte(String TipoTransporte) {
        this.TipoTransporte = TipoTransporte;
    }

    public float getVentas() {
        return ventas;
    }

    public void setVentas(float ventas) {
        this.ventas = ventas;
    }

    @Override
    public float Salario() {
        float sueldo = getSalarioMinimo() * 4;
        float transporte = 0;
        switch (TipoTransporte) {
            case "Moto":
                transporte = (float) (sueldo * 0.02);
                break;
            case "Bicicleta":
                transporte = (float) (sueldo * 0.01);
                break;
            case "Motocarro":
                transporte = (float) (sueldo * 0.05);
                break;
            default:
                break;
        }
        sueldo += transporte;
        sueldo += ventas * 0.05;
        return sueldo;
    }

}
