/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yateatiendo;

//import java.io.IOException;


public interface Cola {
	boolean colaVacia ();
	void eliminarCola ();
	int primero () throws ColaVacia;
	void encolar (int x);
	int desencolar () throws ColaVacia;
	void quitarPrimero () throws ColaVacia;
	void mostrarEstadoCola ();
}