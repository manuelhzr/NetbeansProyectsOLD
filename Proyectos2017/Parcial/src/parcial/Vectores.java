/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Manuel
 */
public class Vectores {
    int[] Vect1, Vect2;
    int Tam1, Tam2;

    public Vectores() {
    }

    public void setTam1(int Tam1) {
        this.Tam1 = Tam1;
        Vect1=new int[Tam1];
    }

    public void setTam2(int Tam2) {
        this.Tam2 = Tam2;
        Vect2=new int[Tam2];
    }

    public void setVect1(int pos, int Val) {
        Vect1[pos]=Val;
    }

    public void setVect2(int pos, int Val) {
        Vect2[pos]=Val;
    }
    
    public int[] unirvectores(){
        int tam=Tam1+Tam2;
        int[] vector=new int[tam];
        int cont=0;
        
        for(int i=0; i<tam; i++){
            if(i<Tam1){
                vector[i]=Vect1[i];
            }else{
                vector[i]=Vect2[cont];
                cont++;
            }
        }
        return vector;
    }
    public int[] OrdenarVector(){
        int tam=Tam1+Tam2;
        int Vect[];
        Vect=unirvectores();
        int pos, aux;
        for(int i=1; i<tam; i++){
            aux=unirvectores()[i];
            pos=i-1;
            while(pos >=0 && Vect[pos]>aux){
                Vect[pos+1]=Vect[pos];
                pos--;
            }
            Vect[pos+1]=aux;
        }
        return Vect;
    }
}
