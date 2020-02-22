package main;
public class Nodo {
    
    private int codigo;
    private String nombre;
    private float[] nota;
    private Nodo anterior;
    private Nodo siguiente;
        
    public Nodo(){
        codigo = 0;
        nombre = "";
        nota = null;
        anterior = null;
        siguiente = null;
    }
    
    public void crearVectorNotas(){
        nota = new float[3];
    }
    
    public void setCodigo(int cod){
        codigo = cod;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public String getNombre(){
        return nombre;
    }
            
    public void setNota(int pos, float dato){
        nota[pos] = dato;
    } 
    
    public float getNota(int pos){
        return nota[pos];
    }
    
    public float[] mostrarNotas(){
        float[] aux = new float[3];
        for (int i = 0; i < 3; i++) {
            aux[i] = getNota(i);
        }
        return aux;
    }
    
    public float notaDefinitiva(){
        float suma = 0;
        int cont = 0;
            for (int i = 0; i < 3; i++) {
                suma += getNota(i);
                cont++; 
            }
        return suma/cont;
    }
    
    public void setAnterior(Nodo nd){
        anterior = nd;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
    
    public void setSiguiente(Nodo nd){
        siguiente = nd;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
}
