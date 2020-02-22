/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemavobjetos1;



public class VectorEstudiantes {
    
    //declaracion del vector
    private Estudiante[] vecest;
    
    public VectorEstudiantes(){
        
    //creacion del vector
        vecest=new Estudiante[3];
    }
    
    public void setVectorEstudiante(int pos, Estudiante est){
        
        vecest[pos]=est;
    }
    
    public Estudiante getVectorEstudiante(int pos){
        
        return vecest[pos];
    }
    
    public int obtenerAprobados(){
        
        
        int cantidad=0;
        
        for(int i=0;i<3;i++){
            
            if(vecest[i].getDefinitiva()>=3 && vecest[i].getDefinitiva()<=5){
                cantidad++;
            }
        }
        
        return cantidad;
        
        
    }
    
    public float ObtenerNotaPromedioGeneral(){
        
        float nota=0;
        
        for(int i=0;i<3; i++){
            
            nota=nota + vecest[i].getDefinitiva();
            
        }
        
        return nota/3;
    }
    
    
    
}
