/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author manue
 */
public class CalcularPrimo {
    private int Numero;

    public CalcularPrimo() {
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public String Primo(){
        int a=0;
        for(int i=1;i<(getNumero()+1);i++){
         if(getNumero()%i==0){
             a++;
            }
         }
         if(a!=2){
              return "No es Primo";
            }else{
                return "Si es Primo";
    }
    }
    
}
