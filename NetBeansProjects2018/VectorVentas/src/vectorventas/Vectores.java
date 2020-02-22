/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorventas;


public class Vectores {
     private int tamaño;
    private double[] Vector;

    public Vectores() {
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        Vector=new double[tamaño];
    }

    public double getVector(int n) {
        return Vector[n];
    }

    public void setVector(int n, double v) {
        this.Vector[n] = v;
    }
    
    public double TotalVentas(){
        double suma=0;
        for (int i = 0; i < getTamaño(); i++) {
            suma+=getVector(i);
        }
        return suma;
    }
    
    public double VentaMayor(){
        double mayor=0;
        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i)>=mayor) {
                mayor=getVector(i);
            }
        }
        return  mayor;
    }
    
    public double VentaMenor(){
        double menor=999999999;
        for (int i = 0; i < getTamaño(); i++) {
            if (getVector(i)<=menor) {
                menor=getVector(i);
            }
        }
        return menor;
    }
    
    public double PromedioVentas(){
        double promedio=0;
        for (int i = 0; i < getTamaño(); i++) {
            promedio+=getVector(i);
        }
        promedio=promedio/getTamaño();
        return promedio;
    }
    
    
}
