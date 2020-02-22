/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author Asus
 */
public class medicos {

    private String[] nombre;
    private String[] apellido;

    public medicos() {
        String[] n = {"Diego", "Camilo", "Kelly", "Liliana", "Roxana"};
        String[] a = {"Gonzales", "Ramirez", "Cogollo", "Llorente", "Alvarez"};

        nombre = n;
        apellido = a;
    }

    public String getNombre(int p) {
        return nombre[p];
    }

    public String getApellido(int p) {
        return apellido[p];
    }
    
    

}
