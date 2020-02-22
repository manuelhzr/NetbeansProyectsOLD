/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresobjetos;

/**
 *
 * @author JesusDavid
 */
public class Empresa {
    private int tam;
    private Empleado[] vector;

    public Empresa() {
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
        vector=new Empleado[tam];
    }

    public Empleado getVector(int pos) {
        return vector[pos];
    }

    public void setVector(int pos, Empleado vector) {
        this.vector[pos] = vector;
    }

    public String empleadoMejorSueldo(){
        int pos=-1;
        float mayor=0;
        String info="";
        
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i).getSalario()>=mayor) {
                mayor=getVector(i).getSalario();
                pos=i;
            }
        }
        
        info="Nombre: "+getVector(pos).getNombre()+" Apellido: "+getVector(pos).getApellidos();
        return info;
    }
    
    public float promedioSalariosMasxlinos(){
        float prom=0;
        int cont=0;
        
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i).getSexo().equals("Masculino")) {
                if (getVector(i).getEdad()>35 && getVector(i).getEdad()<50) {
                    prom+=getVector(i).getSalario();
                    cont++;
                }
            }
        }
        
        return prom/cont;
    }
    
    public int idMenorSalario(){
        float menor=getVector(0).getSalario();
        int pos=0;
        
        for (int i = 0; i < getTam(); i++) {
            if (getVector(i).getSalario()<=menor) {
                menor=getVector(i).getSalario();
                pos=i;
            }
        }
        
        return getVector(pos).getIdentificacion();
    }
    
    public float promedioSalario(){
        float promedio=0;
        
        for (int i = 0; i < getTam(); i++) {
            promedio+=getVector(i).getSalario();
        }
        
        return promedio/getTam();
    }
    
    
}
