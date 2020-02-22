package tadCola;


class NodoCola 
{
	  // Constructores

	NodoCola (int elemento,int i, NodoCola n)
	{ 
		dato = elemento; 
                id=i;
		siguiente = n; 
	}
	
  // Atributos accesibles desde otras rutinas del paquete
	int dato;
        int id;
	NodoCola siguiente;
}
