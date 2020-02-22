/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas_numeracion;

/**
 *
 * @author Check Personal
 */
public abstract class sistema_base {

    public sistema_base() {
    
    }
    
    private int base;
    private String numero;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero.toUpperCase();
    }
    
    protected abstract boolean validarNumero();
    protected abstract boolean validadCaracter(char x);
    protected abstract int numero_actual(char x);
}
