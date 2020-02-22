package tadCola;

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

        public NodoCola getPrincipio() {
            return principio;
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
    		throw new ColaVacia ("La cola est� vac�a");
    	return principio.dato;
	}
	public void encolar (int x, int id) {
        NodoCola aux;
        aux = new NodoCola(x,id,null);
        if (principio == null) {
        	principio = aux;
        	fin = aux;
        }
        else {
        	fin.siguiente = aux;
        	fin = aux;
        }
	}
	
	public void quitarPrimero () throws ColaVacia {
	    if (colaVacia ()) {  
	    	throw new ColaVacia ("Quitar primero: La cola est� vac�a");
	    }
	    principio = principio.siguiente;
	    if (principio == null)
	    	fin = null;
	}
	public void mostrarEstadoCola () {
		System.out.println("Estado de la cola:");
        System.out.println("Referencia al nodo (cola): "+principio+ "; Clave: "+principio.dato+"; Referencia al siguiente: "+principio.siguiente);
    }
	public void imprimirCola () {
        NodoCola aux;
        System.out.print ("Estado de la cola: ");
        aux = principio;
        while (aux != null) {
          System.out.print (aux.dato + " ");
          aux = aux.siguiente;
        }
        System.out.println ();
      }
	
	public int numElemCola () {
        NodoCola aux;	
        int resul;
        
          aux = principio;
          resul = 0;
          while (aux != null) {
        	++resul;
        	aux = aux.siguiente;
          }
          return resul;
        }
	
}
