/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.Paciente;

/**
 *
 * @author manue
 */
public class ColaPacientes {
    private Paciente frente;
    private Paciente finalCola;
    private int TotalPacientes;

    public ColaPacientes() {
        this.frente = null;
        this.finalCola = null;
        this.TotalPacientes = 0;
    }

    public Paciente getFrente() {
        return frente;
    }

    public void setFrente(Paciente frente) {
        this.frente = frente;
    }

    public Paciente getFinalCola() {
        return finalCola;
    }

    public void setFinalCola(Paciente finalCola) {
        this.finalCola = finalCola;
    }

    public boolean colaVacia(){
        return TotalPacientes==0;
    }
    
    public void agregar(Paciente Nuevo){        
        if(getFrente()==null){
            frente=Nuevo;
        }else{
            getFinalCola().setSiguiente(Nuevo);            
        }
        setFinalCola(Nuevo);
        TotalPacientes++;
    }
    
    public void quitar(){
        Paciente temp;
        if(!colaVacia()){
            temp=getFrente();
            frente=getFrente().getSiguiente();
            if(getFrente()==null){
                setFinalCola(null);
            }
            temp=null;
            TotalPacientes--;
        }
    }
    
    public String consultar(){
        if (!colaVacia()) {
            return "Nombre: "+getFrente().getNombre()+"\n"
                    + "ID: "+getFrente().getID()+"\n"
                    + "Edad: "+getFrente().getEdad()+"\n"
                    + "Sexo: "+getFrente().getSexo()+"\n"
                    + "Celular: "+getFrente().getCelular()+"\n";
        }else{
            return "Cola vacia";
        }
    }
    
}
