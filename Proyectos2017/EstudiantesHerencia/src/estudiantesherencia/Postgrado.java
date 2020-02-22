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
public class Postgrado extends Estudiante{
    private String NombrePostgrado;
    private String Universidad;

    public Postgrado() {
    }

    public String getNombrePostgrado() {
        return NombrePostgrado;
    }

    public void setNombrePostgrado(String NombrePostgrado) {
        this.NombrePostgrado = NombrePostgrado;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }
    
}
