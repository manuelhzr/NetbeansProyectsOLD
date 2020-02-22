
package trabajo_vectores;


public class Vectores {
    private int[] Vector;
    
    public Vectores() {
        Vector=new int[12];
    }

    public void setVector(int pos, int Val) {
        Vector[pos]=Val;
    }
    
    private int TamPositivos(){
       int Tam=0;
       for(int i=0; i<=11; i++){
           if(Vector[i]>=0){Tam++;}
       }
       return Tam;
    }
    
    private int TamNegativos(){
        int Tam=0;
        for(int i=0; i<=11; i++){
            if(Vector[i]<0){Tam++;}
        }
        return Tam;
    }
    
    private int ObtenerValores(int pos){
        int Valor;
        Valor=Vector[pos];                        
        return Valor;
    }
       
    public int[] LlenarPositivos(){
        int tam = TamPositivos();
        int[] Positivos=new int[tam];
        int pos=0, cont=0, val;
        
        while(cont<12){
            val=ObtenerValores(cont);
            if(val>=0){
                Positivos[pos]=val;
                pos++;
            }
            cont++;
        }        
        return Positivos;
    }
    
    public int[] LlenarNegativos(){
        int tam = TamNegativos();
        int[] Negativos=new int[tam];
       
        int pos=0, cont=0, val;
        
        while(cont<12){
            val=ObtenerValores(cont);
            if(val<0){
                Negativos[pos]=val;
                pos++;
            }
            cont++;
        }
        return Negativos;
    }
}
