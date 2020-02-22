/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.Historial;
import java.util.StringTokenizer;

/**
 *
 * @author manue
 */
public class ListaHistorial {

    private Historial cabeza;

    public ListaHistorial() {
        this.cabeza = null;
    }

    public Historial getCabeza() {
        return cabeza;
    }

    public void setCabeza(Historial cabeza) {
        this.cabeza = cabeza;
    }

    public Historial Ultimo() {
        Historial temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == null) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

    public void agregar(Historial nuevo) {
        if (cabeza == null) {
            setCabeza(nuevo);
        } else {
            Ultimo().setSiguiente(nuevo);
        }
    }
    
    public void agregarHistorial(String lista){
        StringTokenizer listado = new StringTokenizer(lista, "\n");
        while (listado.hasMoreElements()) {            
            StringTokenizer linea = new StringTokenizer(listado.nextToken(), "\t");
            String fecha = linea.nextToken();
            int idpaciente = Integer.parseInt(linea.nextToken());
            int idmedico = Integer.parseInt(linea.nextToken());
            String especialidad = linea.nextToken();
            Historial aux = new Historial(fecha, idpaciente, idmedico, especialidad);
            agregar(aux);
        }
    }

    public String ListadoHistorial() {
        String listado = "";
        Historial temporal = cabeza;

        while (temporal != null) {
            listado += temporal.getFechaCita() + "n"
                    + temporal.getIDPaciente() + "n"
                    + temporal.getIDMedico() + "n"
                    + temporal.getEspecialidadConsulta() + "\n";

            temporal = temporal.getSiguiente();
        }
        
        return listado;
    }

}
