
package metododeordenamiento;


public class Metodos {

private int tamaño;
private int[] vectorNum;

public Metodos(){
 tamaño = 0;
 vectorNum = null;
}

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

   public void crearVector(){
       vectorNum = new int[getTamaño()];
   }
   
   public void setVector(int p, int dato){
       vectorNum[p]=dato;       
   }
   
   public int getVector(int p){
       return vectorNum[p];
   }
   
   public void Cambiar(int p1, int p2){
       int temp;
       temp = getVector(p1);
       setVector(p1, getVector(p2));
       setVector(p2, temp);
     
   }
           
   public void ordenarburbuja(){
       int i, j;
       for (i = 0; i <= getTamaño()-1; i++){
           for(j=0; j <= getTamaño()-1; j++){
               if(getVector(i) > getVector(j)){
                   Cambiar(i, j);
               }
           }
       }
       
   }
   
   public void intercambio(){
       int i, j;
       for (i = 0; i <= getTamaño()-1; i++){
           for(j=i+1; j <= getTamaño()-1; j++){
               if(getVector(i) > getVector(j)){
                   Cambiar(i, j);
               }
           }
       }
       
   }
   public int posicionMenor(int inicio){
       int posMenor, i, menorElemento;
       posMenor= inicio;
       menorElemento= getVector(inicio);
       for(i=0;i<=getTamaño()-1;i++){
        if(getVector(i)< menorElemento){
            menorElemento = getVector(i);
            posMenor = i;
        }   
       }
        return posMenor;
   }
   public void ordenarSeleccion(){
       for(int k = 0; k <= getTamaño()-1; k++){
           Cambiar(k, posicionMenor(k));
       }
   }
    
}   
