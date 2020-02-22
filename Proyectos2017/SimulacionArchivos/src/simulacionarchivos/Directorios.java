/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionarchivos;

/**
 *
 * @author manue
 */
public class Directorios extends Ficheros{
    private int cantDirectorios;

    public Directorios() {
    }

    public int getCantDirectorios() {
        return cantDirectorios;
    }

    public void setCantDirectorios(int cantDirectorios) {
        this.cantDirectorios = cantDirectorios;
    }
    
    public int tamaño(){
        return getCantDirectorios()*2;
    }
}
