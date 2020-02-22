package colas;



public class TadCola  {
	private NodoCola principio;
	private NodoCola fin;
        
        private int estAtendidos;
        private int tamMedio;
        private int div;
        private int tamMaximo;
        private int tiempoEspera;
        private int cuartoOP;
        private int inicial;
	
	public TadCola () {
		principio = null;
		fin = null;
                estAtendidos=0;
                tamMedio=0;
                div=0;
                tamMaximo=0;
                tiempoEspera=0;
                cuartoOP=0;
	}

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }
        
        

    public NodoCola getPrincipio() {
        return principio;
    }

    public void setPrincipio(NodoCola principio) {
        this.principio = principio;
    }

    public NodoCola getFin() {
        return fin;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    public int getEstAtendidos() {
        return estAtendidos;
    }

    public void setEstAtendidos(int estAtendidos) {
        this.estAtendidos = estAtendidos;
    }

    public float getTamMedio() {
        return tamMedio/div;
    }

    public void setTamMedio(int tamMedio, int div) {
        this.tamMedio += tamMedio;
        this.div=div;
    }

    public int getTamMaximo() {
        return tamMaximo;
    }

    public void setTamMaximo(int tamMaximo) {
        if (tamMaximo>=this.tamMaximo) {
            this.tamMaximo = tamMaximo;
        }
        
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera, int act) {
        if (principio.dato==act) {
            this.tiempoEspera = tiempoEspera;
        }
        
    }

    public int getCuartoOP() {
        return cuartoOP;
    }

    public void setCuartoOP(int cuartoOP) {
        this.cuartoOP += cuartoOP;
    }

	public boolean colaVacia () {
		return principio==null;	
	}
	
	public int primero () throws ColaVacia {
    	if (colaVacia ())
    		throw new ColaVacia ("La cola est� vac�a");
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
        
            setTamMaximo(numElemCola());
            setTamMedio(numElemCola(), div+1);
        
	}
//	
	public void quitarPrimero () throws ColaVacia {
	    if (colaVacia ()) {  
	    	throw new ColaVacia ("Quitar primero: La cola est� vac�a");
	    }
	    principio = principio.siguiente;
	    if (principio == null){
	    	fin = null;}
            setEstAtendidos(getEstAtendidos()+1);
            setTamMedio(numElemCola(), div+1);
	}
//	
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
//	
}
