/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author rosa
 */
public class ejecutivos {

    public ejecutivos() {
        
    }
    
    private String zona;
    private String nivelEducativo;
    private int idiomas;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public int getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(int idiomas) {
        this.idiomas = idiomas;
    }
    
    public float SalarioBase(){
        float salario=0;
        if(getNivelEducativo().equals("Profesional")){
            salario=2000;
        }
        if(getNivelEducativo().equals("Especialista")){
            salario=3000;
        }if(getNivelEducativo().equals("Magister")){
            salario=4000;
        }
        return salario;
    }
    
    public float AumentoIdiomas(){
        return getIdiomas()*100;
    }
    
    public float riesgo(){
        if(getZona().equals("Alto")){
            return 50;
        }else{
            return 20;
        }
    }
}
