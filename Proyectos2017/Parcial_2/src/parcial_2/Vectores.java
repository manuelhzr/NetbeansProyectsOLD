/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2;

/**
 *
 * @author Manuel
 */
public class Vectores {
    private int Tam;
    private int[] Vector;

    public Vectores() {
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
        Vector=new int[Tam];
    }

    public void setVector(int pos, int Val) {
        Vector[pos]=Val;
    }

    public int getTam() {
        return Tam;
    }

    public int[] getVector() {
        return Vector;
    }
    
    private int[] OrdenarVector(){
        int tam=getTam();
        int Vect[];
        Vect=getVector();
        int Posicion, Auxiliar;
        for(int i=1; i<tam; i++){
            Auxiliar=getVector()[i];
            Posicion=i-1;
            while(Posicion >=0 && Vect[Posicion]>Auxiliar){
                Vect[Posicion+1]=Vect[Posicion];
                Posicion--;
            }
            Vect[Posicion+1]=Auxiliar;
        }
        return Vect;
    }
    private int CalcularTamano(){
        int Tamano=getTam();
        int[] vect=getVector();
            for(int i=0; i<getTam(); i++){
                for(int a=i+1; a<getTam(); a++){
                    if(vect[i]==vect[a]){
                        Tamano--;
                    }
                }
            }
        return Tamano;
    }
    
public int[] LlenarVector(){
    int Vect[]=new int[CalcularTamano()];
    int VectAux[]= OrdenarVector();
    int Posicion1=0,posaux=0, Aux;
    
        for (int a=0; a<CalcularTamano(); a++) {
            Aux = VectAux[posaux];
         for (int i = Posicion1+1; i < getTam(); i++) {
            if (Aux == VectAux[i]) {
                Posicion1++;
            }
            Vect[a] = VectAux[Posicion1];
            posaux=Posicion1+1;
        }
        
            
    }
    return Vect;
    }
}
