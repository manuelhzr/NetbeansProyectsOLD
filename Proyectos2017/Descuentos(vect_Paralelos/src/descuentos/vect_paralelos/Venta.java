/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentos.vect_paralelos;

/**
 *
 * @author Manuel
 */
public class Venta {
    private float[] Valor_Neto;
    private float[] Valor_Total;
    private String[] Producto;

    public Venta() {
        Valor_Neto=new float[5];
        Valor_Total=new float[5];
        Producto=new String[5];
    }

    public void setValor_Neto(int pos, float Val) {
        Valor_Neto[pos]= Val;
    }

    public void setValor_Total(int pos, float val) {
        Valor_Total[pos] =val;
    }

    public void setProducto(int pos, String val) {
        Producto[pos] = val;
    }

    public float getValor_Neto(int pos) {
        return Valor_Neto[pos];
    }

    public float getValor_Total(int pos) {
        return Valor_Total[pos];
    }

    public String getProducto(int pos) {
        return Producto[pos];
    }
        
    public float[] Descuento(){
        float[] Descuento= new float[5];
        
        for(int i=0; i<=4; i++){
            Descuento[i]= 100-(100*Valor_Neto[i])/Valor_Total[i];
        }
        return Descuento;
    }
    
    public int BuscarMayor(){
        int Pos=0;
        float Val=0;
        for(int i=0; i<=4; i++){
            if(Valor_Total[i]>Val){
                Pos=i;
                Val=Valor_Total[i];
            }
        }
        return Pos;
    }
}
