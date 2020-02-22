/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

/**
 *
 * @author manue
 */
public class HistorialCitas implements InterfaceHistorial{
    private pacientes[] historia;
    private static HistorialCitas his=new HistorialCitas();

    public HistorialCitas() {
        historia=new pacientes[200];
        for (int i = 0; i < 200; i++) {
            historia[i]=null;
        }
    }

    public static HistorialCitas getHis() {
        return his;
    }
    
    public pacientes getHistoria(int p) {
        return historia[p];
    }

    public void setHistoria(pacientes historia) {
        for (int i = 0; i < 200; i++) {
            if (getHistoria(i)==null) {
                this.historia[i] = historia;
                break;
            }
        }
    }
    
    
    
}
