/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;


public class Ventas {
    private int n;
    private double[] Ventas;

    public Ventas() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        Ventas=new double[n];
    }

    public double getVentas(int n) {
        return Ventas[n];
    }

    public void setVentas(int n, double ventas) {
        this.Ventas[n] = ventas;
    }
    
    public double promedio(){
        double prom=0;
        for (int i = 0; i < getN(); i++) {
            prom+=getVentas(i);
        }
        prom=prom/getN();
        return prom;
    }
    
    public double notaMayor(){
        double nota=0;
        for (int i = 0; i < getN(); i++) {
            if (getVentas(i)>=nota) {
                nota=getVentas(i);
            }
        }
        return  nota;
    }
    
    public double notaMenor(){
        double nota=getVentas(0);
        for (int i = 0; i < getN(); i++) {
            if (getVentas(i)<=nota) {
                nota=getVentas(i);
            }
        }
        return nota;
    }
    
    public double suma(){
        double suma=0;
        for (int i = 0; i < getN(); i++) {
            suma+=getVentas(i);
        }
        return suma;
    }
    
}
