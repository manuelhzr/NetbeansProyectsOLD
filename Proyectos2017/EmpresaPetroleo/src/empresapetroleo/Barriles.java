/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapetroleo;

/**
 *
 * @author manue
 */
public class Barriles {
    private float[] barriles;
    private float precio;

    public Barriles() {
        barriles= new float[15];
    }

    public float getBarriles(int pos) {
        return barriles[pos];
    }

    public void setBarriles(int pos, float barriles) {
        this.barriles[pos] = barriles;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    public float promedioPares(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < 15; i++) {
            if (i%2==0) {
                prom+=getBarriles(i);
                cont++;
            }
        }
        prom=prom/cont;
        return prom;
    }
    
    public float promedioImpares(){
        float prom=0;
        int cont=0;
        for (int i = 0; i < 15; i++) {
            if (i%2!=0) {
                prom+=getBarriles(i);
                cont++;
            }
        }
        prom=prom/cont;
        return prom;
    }
    
    public float Perdida(){
        float total=0;
        for (int i = 0; i < 15; i++) {
            total+=getBarriles(i);
        }
        
    total=(float) (total*0.1);
    return total;
        
    }
    
    public float Venta(){
        float venta;
        float total=0;
        for (int i = 0; i < 15; i++) {
            total+=getBarriles(i);
        }
        
        venta=total-Perdida();
        venta=venta*getPrecio();
        return venta;
        
    }
    
    
}
