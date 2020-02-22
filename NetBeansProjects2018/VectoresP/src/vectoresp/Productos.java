/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresp;

/**
 *
 * @author manue
 */
public class Productos {
        private int codigoProducto[];
    private String nombreProducto[];
    private float precioProducto[];
    private int cantida[];
    private int tamano; //Atributo para asignar el tamaño de los 4 vectores.
//Método constructor de la clase Productos.
    public void Productos(){
        codigoProducto = null;
        nombreProducto = null;
        precioProducto = null;
        cantida = null;
        tamano = 0;
    }
//Método selector y modificador para asignar el tamaño de los vectores.
    public void setTamano(int n){
        tamano = n;
    }
    public int getTamano(){
        return tamano;
    }
//Método para crear los 4 vectores.
    public void crearVectores(){
        codigoProducto = new int[tamano];
        nombreProducto = new String[tamano];
        precioProducto = new float[tamano];
        cantida = new int[tamano];
    }
//Métodos modificadores para cada vector.
    public void setCodigoProducto(int p, int dato){
        codigoProducto[p] = dato;
    }
    public void setNombreProducto(int p, String dato){
        nombreProducto[p] = dato;
    }
    public void setPrecioProducto(int p, float dato){
        precioProducto[p] = dato;
    }
    public void setCantidad(int p, int dato){
        cantida[p] = dato;
    }

 public int getCodigoProducto(int p){
        return codigoProducto[p];
    }
    public String getNombreProducto(int p){
        return nombreProducto[p];
    }
    public float getPrecioProducto(int p){
        return precioProducto[p];
    }
    public int getCantidad(int p){
        return cantida[p];
    }
//Método que devuelve el mayor precio.
    public float mayorPrecio(){
        float mayor = getPrecioProducto(0); 
        for (int i=0; i<=getTamano()-1; i++){
            if (getPrecioProducto(i) > mayor){
                mayor = getPrecioProducto(i);
            }
        }
        return mayor;
    }
    
    public String Mayores2500(){
        String Prod="";
        for (int i = 0; i < getTamano(); i++) {
            if (getPrecioProducto(i)>=2500 && getCantidad(i)<5) {
                Prod+=getNombreProducto(i)+"  "+getPrecioProducto(i)+"  "+getCantidad(i)+"\n";
            }
        }
        return Prod;
    }
    
    public int Buscar(int cod){
        int res=-1;
        for (int i = 0; i < getTamano(); i++) {
            if (getCodigoProducto(i)==cod) {
                res=i;
                break;
            }
        }
        return res;
    }
    
    public float[] totalCobro(){
        float vect[]=new float[getTamano()];
        for (int i = 0; i < getTamano(); i++) {
            vect[i]=getPrecioProducto(i)*getCantidad(i);
        }
        return vect;
    }

}
