/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exposicion;

/**
 *
 * @author Manuel
 */
public class Sistema_Base {

    public Sistema_Base() {
    }
    
        
    private int base;
    protected char[] digitos;

    protected int getBase() {
        return base;
    }

    protected void setBase(int base) {
        this.base = base;
        
        String digitos = "";
        int pos = 48;
        for (int i = 0; i < base; i++) {
            digitos += (char) pos;
            pos++;
            if(pos == 58){
                pos = 65;
            }
        }
        this.digitos = digitos.toCharArray();
    }

    public char[] getDigitos() {
        return digitos;
    }
    
    public int numero_actual(char x){
      int numero = 0;
        for (int i = 0; i < digitos.length; i++) {
            if(x == digitos[i]){
                numero = i;
            }
        }
        return numero;  
    }
}
