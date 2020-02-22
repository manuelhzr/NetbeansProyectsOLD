/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavectoresdeobjetos;

/**
 *
 * @author Manuel
 */
public class VectorObj {

    public VectorObj() {
    }
    
    AgendaTelefonica Vector[];
    int Tam;

    public AgendaTelefonica getVector(int pos) {
        return Vector[pos];
    }

    public void setVector(int Pos, AgendaTelefonica Val) {
        this.Vector[Pos] = Val;
    }

    public int getTam() {
        return Tam;
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
        Vector=new AgendaTelefonica[Tam];
    }
    
    public String MostrarNombre(int pos){
        return Vector[pos].getNombre();
    }
    
    public String MostarCorreo(int pos){
        return Vector[pos].getCorreo();
    }
    
    public String MostrarTelefono(int pos){
        return Vector[pos].getTelefono();
    }
    
}
