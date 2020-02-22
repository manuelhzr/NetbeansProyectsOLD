/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retencionfuente;

/**
 *
 * @author manue
 */
public class Fuente {
    private float uvt;

    public Fuente() {
    }

    public float getUvt() {
        return uvt;
    }

    public void setUvt(float uvt) {
        this.uvt = uvt;
    }
    
    public float calcularImpuesto(){
        float ip=0;
        if(uvt >=0 && uvt <=95){
            ip=0;
        }else{
            if(uvt >95 && uvt<=150){
                ip= (float) ((uvt-95)*(uvt*0.19));
            }else{
                if(uvt>150 && uvt <=360){
                    ip= (float) ((uvt - 150)*(uvt*0.28)+10);
                }else{
                    if(uvt>360){
                        ip= (float) ((uvt-360)*(uvt*0.33)+69);
                    }
                }
            }
        }
        return ip;
    }
    
    public float valorPagar(){
        return calcularImpuesto()*31859;
    }
    
    
}
