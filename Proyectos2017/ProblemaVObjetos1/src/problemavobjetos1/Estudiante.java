/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemavobjetos1;



public class Estudiante {
    
    private String codigo;
    private String apellidos;
    private String nombres;
    private float definitiva;
    
    public Estudiante(){
          
    }
    
    //metodos selectores
    
    public String getCodigo(){
        
        return codigo;
    }
    public String getApellidos(){
        
        return apellidos;
    }
    public String getNombres(){
        
        return nombres;
    }
    public float getDefinitiva(){
        
        return definitiva;
    }
    
    //metodos Modificadores
    
    public void setCodigo(String cod){
        
        codigo=cod;
    }
    
    public void setApellidos(String ape){
        
        apellidos=ape;
    }
    
    public void setNombres(String nom){
        
        nombres=nom;
    }
    
    public void setDefinitiva(float def){
        
        definitiva=def;
    }
    
    
    
    
    
}
