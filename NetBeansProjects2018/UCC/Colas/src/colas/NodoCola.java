package colas;


class NodoCola 
{
	  // Constructores

	NodoCola (int elemento, NodoCola n)
	{ 
		dato = elemento; 
		siguiente = n; 
	}
	
  // Atributos accesibles desde otras rutinas del paquete
	int dato;
	NodoCola siguiente;
}
