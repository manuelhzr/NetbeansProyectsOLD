package tadCola;

import java.io.IOException;


public interface Cola {
	boolean colaVacia ();
	void eliminarCola ();
	int primero () throws ColaVacia;
//	void encolar (int x);
//	int desencolar () throws ColaVacia;
	void quitarPrimero () throws ColaVacia;
	void mostrarEstadoCola ();
	void imprimirCola ();
//	void leerCola () throws NumberFormatException, IOException;
    int numElemCola ();
//    void invertirCola () throws ColaVacia;
}
