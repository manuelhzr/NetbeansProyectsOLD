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
public class operarios {

    public operarios() {
    }
    
    private String Zona;
    private int Horas;

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    
    public int horasExtra(){
        int horas=0;
        if(getHoras()>40){
            horas=getHoras()-40;
        }
        return horas;
    }
    
    public float salario(){
        float salario;
        if(getHoras()<=40){
            salario=getHoras()*8;
        }else{
            salario=40*8;
            salario+=horasExtra()*12;
        }
        return salario;
    }
}
