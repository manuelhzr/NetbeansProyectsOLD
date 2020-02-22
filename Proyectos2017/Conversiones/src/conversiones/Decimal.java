/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

/**
 *
 * @author Manuel
 */
public class Decimal {
    private int Decimal;

    public Decimal() {
    }

    public void setDecimal(int Decimal) {
        this.Decimal = Decimal;
    }
    
    public String A_Binario(){
        String Binario="";
            int Num=Decimal, res;
            while(Num>0){
                res=Num%2;
                if(res==1){
                    Binario ="1"+Binario;
                }else{
                    Binario ="0" + Binario;
                }
            Num/=2;
            }
        return Binario;
    }
}
