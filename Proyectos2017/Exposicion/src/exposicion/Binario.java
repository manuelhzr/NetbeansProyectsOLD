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
public class Binario {

    public Binario() {
        Datos.setBase(2);
    }
    
    private String Numero;
    private Sistema_Base Datos=new Sistema_Base();

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    public String Caracteres(){
        char[] Dig=Datos.getDigitos();
        String Caracteres="";
        for(int i=0; i<Dig.length; i++){
            Caracteres+=Dig[i]+" ";
        }
        return Caracteres;
    }
    
    public int decimal(){
        char[] numero = getNumero().toCharArray();
        int Potencia = 0;
        int num_position;
        int sumatoria = 0;
        for (int i = numero.length - 1; i >= 0; i--) {
            num_position = Datos.numero_actual(numero[i]);
            sumatoria += num_position*Math.pow(Datos.getBase(), Potencia);
            Potencia++;
        }
        return sumatoria;
    }
    
     
}
