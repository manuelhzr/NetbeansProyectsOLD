
package vector;



public class Arreglos {
    
    private int N;
    private int[] Arreglo;

    public Arreglos() {
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
        Arreglo=new int[N];
    }

    public int getArreglo(int pos) {
        return Arreglo[pos];
    }

    public void setArreglo(int pos,int Vector) {
        this.Arreglo[pos] = Vector;
    }
    
    public String Mostrar(){
        String lista="";
        int mitad=getN()/2;
        if (getN()%2==0) {
            for (int i = 0; i < mitad; i++) {
                lista+=getArreglo(i)+" ";
            }
        }else{
            for (int i = mitad; i < getN(); i++) {
                lista+=getArreglo(i)+" ";
            }
        }
        return lista;
    }
    
    public int operaciones(){
        int operaciones=0;
        int mitad=getN()/2;
        if (getN()%2==0) {
            for (int i = 0; i < mitad; i++) {
                operaciones+=getArreglo(i);
            }
        }else{
            operaciones=1;
            for (int i = 0; i < mitad; i++) {
                operaciones*=getArreglo(i);
            }
        }
        return operaciones;
    }
    
}
