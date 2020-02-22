/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolas;


public class Nodo {
    String idProducto;
    String nomProducto;
    float precio;
    Nodo sig, ant;

    public Nodo(String idProducto, String nomProducto, float precio) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

     
}
