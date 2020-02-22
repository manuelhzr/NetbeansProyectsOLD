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

public class TClinica {

    private int totalNodos;
    private Nodo frente;
    private Nodo finalCola;

    private final int maxPacientes  = 75;
    private int medicoActual=0;

    private medicos medico;

    public TClinica() {
        this.totalNodos = 0;
        this.frente = null;
        this.finalCola = null;
        medico = new medicos();
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public void setTotalNodos(int totalNodos) {
        this.totalNodos = totalNodos;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(Nodo finalCola) {
        this.finalCola = finalCola;
    }

    public boolean colavacia() {
        return getTotalNodos() == 0;
    }

    public boolean InsertarEnClinica(Nodo temp) {
        
        if (totalNodos<=maxPacientes) {
            if (getFrente() == null) {
            frente = temp;
        } else {
            getFinalCola().setSiguiente(temp);
        }
        setFinalCola(temp);
        totalNodos++;
        
        return true;
        
        }
        
        return false;
        
    }
    
    public String ConsultarMedico(){
        
        if (medicoActual>4) {
            medicoActual=0;
        }
        
        String datos;
        Nodo temp=valorFinal();
        
        datos="Paciente "+temp.getNombre()+"\n"
                + "Identificacio: "+temp.getId()+"\n"
                + "Edad: "+temp.getEdad()+"\n"
                + "MEDICO: \n"
                + "nombre: "+medico.getNombre(medicoActual)+"\n"
                + "Apellido: "+medico.getApellido(medicoActual)+"\n";
        medicoActual++;
        quitar();
        
        return datos;
        
    }
    
    public String ConsultarPrimero(){
        Nodo temp=valorFinal();
        
        return "Paciente "+temp.getNombre()+"\n"
                + "Identificacion: "+temp.getId()+"\n"
                + "Edad: "+temp.getEdad()+"\n";
                
    }

    public void quitar() {
        Nodo temp;
        if (!colavacia()) {
            temp = getFrente();
            frente = getFrente().getSiguiente();
            if (getFrente() == null) {
                setFinalCola(null);
            }
            temp = null;
            totalNodos--;
        }
    }

    public Nodo valorFinal() {
        return getFrente();
    }
    
    
    public String MostrarClinica(TClinica colaAux){
        TClinica cola=colaAux;
        String datos="";
        
        while (!cola.colavacia()) {
            datos+="\n"
                    + "Nombre: "+cola.valorFinal().getNombre()+"\n"
                    + "Identificacion: "+cola.valorFinal().getId()+"\n"
                    + "Edad: "+cola.valorFinal().getEdad()+"\n";
            
            cola.quitar();
        }
        
        return datos;
    }

}
