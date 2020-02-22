/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocioncamisas;


public class Promo {
    private float precio;
    private int cantidad;

    public Promo() {
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public float Descuento(){
        float desc;
        if(getCantidad()>=3){
            desc= (float) (getCantidad() *(getPrecio()*0.2));
        }else{
            desc=(float) (getCantidad()*(getPrecio()*0.1));
        }
        return desc;
    }
    
    public float totalPagar(){
        return (getPrecio()*getCantidad())-Descuento();
    }
}
