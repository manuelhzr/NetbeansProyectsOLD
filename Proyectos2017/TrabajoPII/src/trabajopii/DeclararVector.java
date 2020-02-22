package trabajopii;


public class DeclararVector extends Inscripcion{
    
    int tamaño;
    private Inscripcion vectorEstudiantes[];
    
    public DeclararVector(){
        tamaño = 0;
        vectorEstudiantes = null;
    }
    
    public void crearVector(){
        vectorEstudiantes = new Inscripcion[tamaño];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setVectorEstudiantes(int p, Inscripcion dato){
        vectorEstudiantes[p] = dato;
    }
    public Inscripcion getVectorEstudiantes(int p){
    return vectorEstudiantes[p];    
    }
    
    public void cambiar(int p1, int p2){
        Inscripcion temp; 
        temp = getVectorEstudiantes(p1);
        setVectorEstudiantes(p1, getVectorEstudiantes(p2));
        setVectorEstudiantes(p2, temp);
    }

    
    //Se realiza el ordenamiento del vector utilizando el método Shell, y se ordena por nombres.
    public void ordenarShell(){
        int i, n, cont;
        n = (getTamaño()-1)/2;
        while(n != 0){
        cont = 1;
        while(cont != 0){
        cont = 0;
        for(i=n; i<=getTamaño()-1; i++){
        if(getVectorEstudiantes(i-n).getNombre().toLowerCase().compareTo(getVectorEstudiantes(i).getNombre()) > 0){
        cambiar(i, i-n);
        cont = cont + 1;
        }
                }
                    }
        n = n/2;
            }
        }

    
    public void ordenarIntercambio(){
        int i, j;
        for (i=0; i<=getTamaño()-1; i++){
        for (j=i+1; j<=getTamaño()-1; j++){
        if (getVectorEstudiantes(i).getCreditos() < getVectorEstudiantes(j).getCreditos()){
        cambiar(i, j);
        }}}}
    
    public void seleccion() {
          int i, j, menor, pos, tmp;
          for (i = 0; i < getTamaño(); i++) { // tomamos como menor el primero
                menor = getVectorEstudiantes(i).getCreditos(); // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (j = i + 1; j < getTamaño(); j++){ // buscamos en el resto
                      if (getVectorEstudiantes(j).getCreditos() < menor) { // del array algún elemento
                          menor = getVectorEstudiantes(j).getCreditos(); // menor que el actual
                          pos = j;
                          cambiar(i, pos);
                          
                      }
                }
                
          }
}
    
     public void Quicksort(int izq, int der){
        Inscripcion pivote=getVectorEstudiantes(izq); // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  Inscripcion aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(getVectorEstudiantes(i).getCodigo()<=pivote.getCodigo() && i<j) {
         i++;           // busca elemento mayor que pivote
     }
     while(getVectorEstudiantes(j).getCodigo()>pivote.getCodigo()) {
         j--;         // busca elemento menor que pivote
     }
     if (i<j) {                      // si no se han cruzado                      
         aux= getVectorEstudiantes(i);                  // los intercambia
         setVectorEstudiantes(i, getVectorEstudiantes(j));
            setVectorEstudiantes(j, aux);
     }
   }
  
  setVectorEstudiantes(izq, getVectorEstudiantes(j)); // se coloca el pivote en su lugar de forma que tendremos
  setVectorEstudiantes(j, pivote); // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1) {
       Quicksort(izq,j-1); // ordenamos subarray izquierdo
        }
   if(j+1 <der) {
       Quicksort(j+1,der); // ordenamos subarray derecho
        }
    }
 
}