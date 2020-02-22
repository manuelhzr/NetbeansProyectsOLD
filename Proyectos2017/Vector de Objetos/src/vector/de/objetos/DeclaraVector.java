
package vector.de.objetos;


public class DeclaraVector extends Estudiantes{
    
    int tamaño;
    private Estudiantes vectorEstudiantes[];
    
    public DeclaraVector(){
        tamaño = 0;
        vectorEstudiantes = null;
    }
    
    public void crearVector(){
        vectorEstudiantes = new Estudiantes[tamaño];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setVectorEstudiantes(int p, Estudiantes dato){
        vectorEstudiantes[p] = dato;
    }
    public Estudiantes getVectorEstudiantes(int p){
    return vectorEstudiantes[p];    
    }
    
}
