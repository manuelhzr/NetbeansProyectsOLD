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
public class alimentosFrescos extends Alimento{
    private String fechaEnvasado;
    private String paisOrigen;
    
    private int pos;
    private alimentosFrescos[] Lista;
    
    public alimentosFrescos() {
        this.Lista = new alimentosFrescos[30];
        this.pos=0;
    }

    public alimentosFrescos(String valor1, String valor2) {
        this.fechaEnvasado = valor1;
        this.paisOrigen = valor2;
        setValor(12200);
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public alimentosFrescos getLista(int p) {
        return Lista[p];
    }

    private void setLista(int p, alimentosFrescos Lista) {
        this.Lista[p] = Lista;
    }
    
    public void insertarLista(alimentosFrescos alimento){
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
