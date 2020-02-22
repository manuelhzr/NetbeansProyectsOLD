/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionarchivos;

/**
 *
 * @author manue
 */
public class Archivos extends Ficheros{
    private String Extencion;
    private int numCaracteres;

    public Archivos() {
    }

    public String getExtencion() {
        return Extencion;
    }

    public void setExtencion(String Extencion) {
        this.Extencion = Extencion;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }
    
    public int tamaño(){
        return getNumCaracteres()*3;
    }
}
