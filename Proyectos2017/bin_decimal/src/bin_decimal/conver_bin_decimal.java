/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin_decimal;

/**
 *
 * @author ASUS - PC
 */
public class conver_bin_decimal {

    public conver_bin_decimal() {
    }
    
    private int numero_binario;

    public int getNumero_binario() {
        return numero_binario;
    }

    public void setNumero_binario(int numero_binario) {
        this.numero_binario = numero_binario;
    }
    
    public boolean validar(){
        boolean estado = true;
        int num = numero_binario;
        int digito = 0;
        while(num / 10 > 0){
            digito = num % 10;
            if(digito != 0 && digito != 1){
                estado = false;
            }
            num = num/10;
        }
        digito = num;
        if(digito != 0 && digito != 1){
            estado = false;
        }
        return estado;
    }
    
    public int decimal(){
        int suma = 0;
        int base = 2;
        int exponente = 0;
        int potencia = 0;
        int num = numero_binario;
        int bit = 0;
        while(num / 10 > 0){
            bit = num % 10; // Tomando el ultimo digito
            potencia = (int) Math.pow(base, exponente); //base* exponente
            suma = suma + potencia * bit ; // Calculando la sumatoria
            exponente++; //incrementando exponente
            num = num / 10; // Elimina el ultimo digito
        }
        bit = num;
        potencia = (int) Math.pow(base, exponente); //base* exponente
        suma = suma + potencia * bit ; // Calculando la sumatoria
        exponente++; //incrementando exponente
        num = num / 10; // Elimina el ultimo digito
        return suma;
    }
}
