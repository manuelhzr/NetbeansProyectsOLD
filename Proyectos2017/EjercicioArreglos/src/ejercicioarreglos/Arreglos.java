
package ejercicioarreglos;


public class Arreglos {
    private int[] Arreglo;
    private int tam;

    public Arreglos() {
    }

    public int getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos, int Arreglo) {
        this.Arreglo[pos] = Arreglo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        Arreglo=new int[tam];
    }
    
    public int totalPares(){
        int cantidad=0;
        for (int i = 0; i < getTam(); i++) {
            if(getArreglo(i)%2==0){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public int totalImpares(){
        int cantidad=0;
        for (int i = 0; i < getTam(); i++) {
            if(getArreglo(i)%2!=0){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public float promedioMultiplos(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < getTam(); i++) {
            if (getArreglo(i)%5==0) {
                prom=prom+getArreglo(i);
                cont++;
            }
        }
        return prom/cont;
    }
    
    public int SumaPares(){
        int suma=0;
        for (int i = 0; i < getTam(); i++) {
            if (getArreglo(i)%2==0) {
                suma=suma+getArreglo(i);
            }
        }
        return suma;
    }
    
    public float PromedioImpares(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < getTam(); i++) {
            if (getArreglo(i)%2!=0) {
                prom=prom+getArreglo(i);
                cont++;
            }
        }
        return prom/cont;
    }
    
}
