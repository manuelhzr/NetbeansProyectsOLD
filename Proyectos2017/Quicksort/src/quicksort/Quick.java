/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Manuel
 */
public class Quick {

    public Quick() {
    }
    
    public int vec[];
    public int elm;

    public int[] getVec() {
        return vec;
    }

    public void setVec(int pos, int val) {
        this.vec[pos] = val;
    }

    public int getElm() {
        return elm;
    }

    public void setElm(int elm) { 
        this.elm = elm;
        vec= new int[elm];
    }
    
    public void Quicksort(int izq, int der){
        int pivote=vec[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(vec[i]<=pivote && i<j) {
         i++;           // busca elemento mayor que pivote
     }
     while(vec[j]>pivote) {
         j--;         // busca elemento menor que pivote
     }
     if (i<j) {                      // si no se han cruzado                      
         aux= vec[i];                  // los intercambia
         vec[i]=vec[j];
         vec[j]=aux;
     }
   }
   vec[izq]=vec[j];     // se coloca el pivote en su lugar de forma que tendremos
   vec[j]=pivote;       // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1) {
       Quicksort(izq,j-1); // ordenamos subarray izquierdo
        }
   if(j+1 <der) {
       Quicksort(j+1,der); // ordenamos subarray derecho
        }
    }
    
    
    
}
