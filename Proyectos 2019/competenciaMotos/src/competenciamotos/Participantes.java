/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competenciamotos;

/**
 *
 * @author Diego
 */
public class Participantes {
    private String[] nombre;
    private int[] identificacion;
    private String[] categoria;
    private int[] cilindraje;
    private int tamaño;

    public Participantes(int tamaño) {
        this.tamaño = tamaño;
        this.nombre= new String[tamaño];
        this.identificacion = new int[tamaño];
        this.categoria= new String[tamaño];
        this.cilindraje = new int[tamaño];
    }

    public String getNombre(int pos) {
        return nombre[pos];
    }

    public void setNombre(int pos, String nombre) {
        this.nombre[pos] = nombre;
    }

    public int getIdentificacion(int pos) {
        return identificacion[pos];
    }

    public void setIdentificacion(int pos, int identificacion) {
        this.identificacion[pos] = identificacion;
    }

    public String getCategoria(int pos) {
        return categoria[pos];
    }

    public void setCategoria(int pos, String categoria) {
        this.categoria[pos] = categoria;
    }

    public int getCilindraje(int pos) {
        return cilindraje[pos];
    }

    public void setCilindraje(int pos, int cilindraje) {
        this.cilindraje[pos] = cilindraje;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public boolean comprobarCat(int pos){
        if (getCilindraje(pos)==100 && getCategoria(pos).equals("Primera")) {
            return true;
        }else{
            if ((getCilindraje(pos)>100 && getCilindraje(pos)<=250) && getCategoria(pos).equals("Segunda")) {
                return true;
            }else{
                if ((getCilindraje(pos)>250 && getCilindraje(pos)<=350) && getCategoria(pos).equals("Tercera")) {
                    return true;
                }else{
                    if ((getCilindraje(pos)>350 && getCilindraje(pos)<=500) && getCategoria(pos).equals("Cuarta")) {
                        return true;
                    }else{
                        if (getCilindraje(pos)>500 && getCategoria(pos).equals("Quinta")) {
                             return true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
    }
    
    public String participantesValidos(){
        String datos="";
        for (int i = 0; i < getTamaño(); i++) {
            if (comprobarCat(i)) {
                datos+="Identificacion: "+getIdentificacion(i)+" Nombre: "+getNombre(i)+"\n";
            }
        }
        return datos;
    }
    
    public int totalAceptados(){
        int total=0;
        for (int i = 0; i < getTamaño(); i++) {
            if (comprobarCat(i)) {
                total++;
            }
        }
        return total;
    }
}
