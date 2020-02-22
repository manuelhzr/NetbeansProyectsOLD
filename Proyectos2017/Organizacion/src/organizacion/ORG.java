/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizacion;

/**
 *
 * @author manue
 */
public class ORG {
    private int cant;
    private Socio[] socio;
    private Trabajador[] trabajador;

    public ORG() {
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
        trabajador=new Trabajador[cant];
        socio=new Socio[cant];
        
        for (int i = 0; i < cant; i++) {
            setTrabajador(i, null);
            setSocio(i, null);
        }
    }

    public Socio getSocio(int p) {
        return socio[p];
    }

    public void setSocio(int p,Socio socio) {
        this.socio[p] = socio;
    }

    public Trabajador getTrabajador(int p) {
        return trabajador[p];
    }

    public void setTrabajador(int p, Trabajador trabajador) {
        this.trabajador[p] = trabajador;
    }
    
    public boolean validarDepartamento(int ID){
        boolean val=true;
        for (int i = 0; i < getCant(); i++) {
            if (getTrabajador(i)!=null) {
                if (getTrabajador(i).getDepartamento().getID()==ID) {
                    val=false;
                }
            }
        }
        return val;
    }
    
    public boolean ValidarTrabajador(int id){
        boolean val=true;
        for (int i = 0; i < getCant(); i++) {
            if (getTrabajador(i)!=null) {
                if (getTrabajador(i).getCedula()==id) {
                    val=false;
                }
            }
        }
        return val;
    }
    
    
}
