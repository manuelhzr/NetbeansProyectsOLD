/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;


public class BuscarMultiplos {
    private int n;
    private int m;

    public BuscarMultiplos() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    public boolean validarM(int m){
        if(getN()<m){
            setM(m);
            return true;
        }else{
            return false;
        }
    }
    
    public String multiplos(){
        String multiplos="";
        for(int i=getN(); i<=getM(); i++){
            if(i%2==0 && i%7==0){
                multiplos+=i+"\n";
            }
        }
        return multiplos;
    }
}
