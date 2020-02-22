/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_1ercorte;

/**
 *
 * @author Manuel
 */
public class banco {

    public banco() {
    }
    
    private Datos_clientes Vector[];
    private int Numero_Clientes;

    public Datos_clientes getVector(int pos) {
        return Vector[pos];
    }

    public void setVector(int pos, Datos_clientes Val) {
        this.Vector[pos] = Val;
    }

    public int getNumero_Clientes() {
        return Numero_Clientes;
    }

    public void setNumero_Clientes(int Numero_Clientes) {
        this.Numero_Clientes = Numero_Clientes;
    }
    
    private void Cambiar(int p1, int p2){
        Datos_clientes temp= getVector(p1);
        setVector(p1, getVector(p2));
        setVector(p2, temp);
    }
    
    public void Shell(){
        int salto, auxiliar, i;
        boolean cambio;
        
        for(salto=getNumero_Clientes()/2; salto!=0; salto/=2){
            cambio=true;
                for(i=salto; i<getNumero_Clientes(); i++){
                    if(getVector(i-salto).getValorDeuda() < getVector(i).getValorDeuda()){
                        Cambiar(i, (i-salto));
                    }
                }
        }
    }
    
    public float ValorMayor(){
        Shell();
        return getVector(0).getValorDeuda(); 
    }
    
    public int MaximosDeudores(){
        int Deudores=0;
        for(int i=0; i<getNumero_Clientes(); i++){
            if(getVector(i).getValorDeuda()==ValorMayor()){
                Deudores++;
            }
        }
        return Deudores;
    }
    
    public int Lineal(int NumeroDeuda){
        int i, posicion;
        posicion=-1;
        i=0;
        while(i<=getNumero_Clientes()-1 && posicion==-1){
            if(getVector(i).getNumeroDeuda()==NumeroDeuda){
                posicion=i;
            }else{
                i += 1;
            }
        }
        return posicion;
    }
    
    public int BusquedaBinaria(int dato){
        int posicion, izq, der, centro;
        
        Shell();
        
        izq=0;
        der= getNumero_Clientes()-1;
        posicion=-1;
        
        while(izq<=der && posicion==-1){
            centro=(izq+der)/2;
            if(dato==getVector(centro).getNumeroCelular()){
                posicion=centro;
            }else{
                if(dato < getVector(centro).getNumeroCelular()){
                    der=centro-1;
                }else{
                    izq=centro+1;
                }
            }
        }
        return posicion;
    }
    
    public String ListadoMora45(){
        String Listado="";
        for(int i=0; i<getNumero_Clientes(); i++){
            if(getVector(i).getDiasDeudas()>45){
                Listado+= getVector(i).getNombreCliente()+" "+getVector(i).getNumeroCelular()+"\n\n";
            }
        }
        return Listado;
    }
}
