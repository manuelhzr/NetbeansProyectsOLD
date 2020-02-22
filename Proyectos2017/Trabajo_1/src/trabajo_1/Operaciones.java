/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_1;

/**
 *
 * @author elena
 */
public class Operaciones {

    public Operaciones() {
    }
    
    private Datos_profesor Vector[];
    private int Tam;

    public Datos_profesor getVector(int pos) {
        return Vector[pos];
    }

    public void setVector(int pos, Datos_profesor Valor) {
        this.Vector[pos] = Valor;
    }

    public int getTam() {
        return Tam;
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
        Vector=new Datos_profesor[Tam];
    }
    
    private void cambiar(int pos1, int pos2){
        Datos_profesor obj=new Datos_profesor();
        
        obj.setNombre(this.Vector[pos1].getNombre());
        obj.setIdentificacion(this.Vector[pos1].getIdentificacion());
        obj.setTelefono(this.Vector[pos1].getTelefono());
        obj.setAsignatura(this.Vector[pos1].getAsignatura());
        
        this.Vector[pos1].setNombre(this.Vector[pos2].getNombre());
        this.Vector[pos1].setIdentificacion(this.Vector[pos2].getIdentificacion());
        this.Vector[pos1].setTelefono(this.Vector[pos2].getTelefono());
        this.Vector[pos1].setAsignatura(this.Vector[pos2].getAsignatura());
        
        this.Vector[pos2].setNombre(obj.getAsignatura());
        this.Vector[pos2].setIdentificacion(obj.getIdentificacion());
        this.Vector[pos2].setTelefono(obj.getTelefono());
        this.Vector[pos2].setAsignatura(obj.getAsignatura());
        
    }
    
    private void OrdenalShell(){
        int salto, auxiliar, i;
        boolean cambio;
        
        for(salto=this.Vector.length/2; salto!=0; salto/=2){
            cambio=true;
                for(i=salto; i<this.Vector.length; i++){
                    if(this.Vector[(i-salto)].getIdentificacion() > this.Vector[i].getIdentificacion()){
                        cambiar(i, (i-salto));
                    }
                }
        }
    }

    public int BusquedaBinaria(int dato){
        int posicion, izq, der, centro;
        
        OrdenalShell();
        
        izq=0;
        der= getTam()-1;
        posicion=-1;
        
        while(izq<=der && posicion==-1){
            centro=(izq+der)/2;
            if(dato==this.Vector[centro].getIdentificacion()){
                posicion=centro;
            }else{
                if(dato < this.Vector[centro].getIdentificacion()){
                    der=centro-1;
                }else{
                    izq=centro+1;
                }
            }
        }
        return posicion;
    }
    
    public int busquedaSecuencia(int dato){
        int i, posicion;
        posicion=-1;
        i=0;
        while(i<=getTam()-1 && posicion==-1){
            if(this.Vector[i].getTelefono()==dato){
                posicion=i;
            }else{
                i=i+1;
            }  
        }
        return posicion;
    }
    
    public void OrdenarBurbuja(){
        int i,j;
        for(i=0; i<=getTam()-1; i++){
            for(j=0; j<=(getTam()-i)-2; j++){
                if(this.Vector[j].getNombre().compareTo(this.Vector[j+1].getNombre())>0){
                    cambiar(j, j+1);
                }
            }
        }
    }
    
    private int PosicionMenor(int inicio){
        int i, PosMenor;
        String Elementomenor;
        PosMenor = inicio;
        Elementomenor=this.Vector[inicio].getAsignatura();
        
        for(i=inicio; i<=getTam()-1; i++){
            if(this.Vector[i].getAsignatura().compareTo(Elementomenor)<0){
                Elementomenor=this.Vector[i].getAsignatura();
                PosMenor=i;
            }
        }
        return PosMenor;
    }
    
    public void OrdenarSeleccion(){
        for(int i=0; i<=getTam()-1; i++){
            cambiar(i, PosicionMenor(i));
        }
    }
    
}
