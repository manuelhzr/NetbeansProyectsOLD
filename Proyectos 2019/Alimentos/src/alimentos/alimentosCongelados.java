/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

/**
 *
 * @author manue
 */
public class alimentosCongelados extends Alimento{
    private String tipoCongelacion;
    private String tipoAlimento;
    
    private int pos;
    private alimentosCongelados[] Lista;

    public alimentosCongelados() {
        this.Lista = new alimentosCongelados[30];
        this.pos=0;
    }

    public alimentosCongelados(String valor1, String valor2) {
        this.tipoCongelacion = valor1;
        this.tipoAlimento = valor2;
        setValor(9000);
    }

    public String getTipoCongelacion() {
        return tipoCongelacion;
    }

    public void setTipoCongelacion(String tipoCongelacion) {
        this.tipoCongelacion = tipoCongelacion;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public alimentosCongelados getLista(int p) {
        return Lista[p];
    }

    private void setLista(int p, alimentosCongelados Lista) {
        this.Lista[p] = Lista;
    }
    
    public void insertarLista(alimentosCongelados alimento){
        if (pos<30) {
            setLista(pos, alimento);
            pos++;
        }
    }
    
     public float obtenerTotal(){
        float total=0;
        for (int i = 0; i < pos; i++) {
            total += getLista(i).getValor();
        }
        return total;
    }
    
}
