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
public class hexadecimal extends sistema_base{
    public hexadecimal() {
        this.setBase(16);
    }

    @Override
    protected boolean validarNumero() {
        char[] numero = this.getNumero().toCharArray();
        boolean found = true;
        for (int i = 0; i < numero.length && found; i++) {
            found = validadCaracter(numero[i]);
        }
        return found;
    }

    @Override
    protected boolean validadCaracter(char x) {
        boolean found = false;
        for (int i = 0; i < digitos.length && !found; i++) {
            if(x == digitos[i]){
                found = true;
            }
        }
        return found;
    }
    
    public int decimal(){
        char[] numero = this.getNumero().toCharArray();
        int exponente = 0;
        int num_position;
        int sumatoria = 0;
        for (int i = numero.length - 1; i >= 0; i--) {
            num_position = numero_actual(numero[i]);
            sumatoria += num_position*Math.pow(this.getBase(), exponente);
            exponente++;
        }
        return sumatoria;
    }
    
    @Override
    protected int numero_actual(char x) {
        int numero = 0;
        for (int i = 0; i < digitos.length; i++) {
            if(x == digitos[i]){
                numero = i;
            }
        }
        return numero;
    }
}
