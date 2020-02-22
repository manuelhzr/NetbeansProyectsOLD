/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yateatiendo;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;


public class TadCola implements Cola {
	private NodoCola principio;
	private NodoCola fin;
	
	public TadCola () {
		principio = null;
		fin = null;
	}

	public boolean colaVacia () {
		return principio==null;	
	}
	public void eliminarCola () {
		principio = null;
		fin = null;
	}
	public int primero () throws ColaVacia {
    	if (colaVacia ())
    		throw new ColaVacia ("La cola está vacía");
    	return principio.dato;
	}
	public void encolar (int x) {
        NodoCola aux;
        aux = new NodoCola(x,null);
        if (principio == null) {
        	principio = aux;
        	fin = aux;
        }
        else {
        	fin.siguiente = aux;
        	fin = aux;
        }
	}
	public int desencolar (){
        int resultado=0;
        if (!colaVacia ()) {  
          resultado = principio.dato;
        principio = principio.siguiente;
        if (principio == null)
        	fin = null;
        }
        
        return resultado;
		
	}
	public void quitarPrimero () throws ColaVacia {
	    if (colaVacia ()) {  
	    	throw new ColaVacia ("Quitar primero: La cola está vacía");
	    }
	    principio = principio.siguiente;
	    if (principio == null)
	    	fin = null;
	}
	public void mostrarEstadoCola () {
		System.out.println("Estado de la cola:");
        System.out.println("Referencia al nodo (cola): "+principio+ "; Clave: "+principio.dato+"; Referencia al siguiente: "+principio.siguiente);
    }
	

	
}