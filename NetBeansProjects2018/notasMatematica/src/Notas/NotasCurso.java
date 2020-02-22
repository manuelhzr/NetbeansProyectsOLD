/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

/**
 *
 * @author manue
 */
public class NotasCurso {
    
    private float[] cognitivo;
    private float[] social;
    private float[] personal;
    private float [] definitiva;
    private String[] desempeño;
    private int tamaño;
    private int posActual;

    public NotasCurso(int tam) {
        this.posActual=0;
        this.tamaño = tam;
        this.cognitivo = new float[tam];
        this.personal = new float[tam];
        this.social = new float[tam];
        this.definitiva=new float[tam];
        this.desempeño=new String[tam];
    }

    public float getCognitivo(int pos) {
        return cognitivo[pos];
    }

    public void setCognitivo(int pos, float cognitivo) {
        this.cognitivo[pos] = cognitivo;
    }

    public float getSocial(int pos) {
        return social[pos];
    }

    public void setSocial(int pos, float social) {
        this.social[pos] = social;
    }

    public float getPersonal(int pos) {
        return personal[pos];
    }

    public void setPersonal(int pos, float personal) {
        this.personal[pos] = personal;
    }

    public float getDefinitiva(int pos) {
        return definitiva[pos];
    }

    public void setDefinitiva(int pos, float definitiva) {
        this.definitiva[pos] = definitiva;
    }

    public String getDesempeño(int pos) {
        return desempeño[pos];
    }

    public void setDesempeño(int pos, String desempeño) {
        this.desempeño[pos] = desempeño;
    }
    
    private boolean verificarNotas(float cognitivo, float social, float personal ){
        return !((cognitivo <0 || cognitivo>10) || (social<0 || social>10) || (personal<0 || personal>10));
    }
    
    public boolean agregarNota(float cognitivo, float social, float personal){
        if (verificarNotas(cognitivo, social, personal) && posActual<tamaño) {
            setCognitivo(posActual, cognitivo);
            setSocial(posActual, social);
            setPersonal(posActual, personal);
            setDefinitiva(posActual,  ((float)( (getCognitivo(posActual)*0.6)+(getSocial(posActual)*0.2)+(getPersonal(posActual)*0.2)) ));
            posActual++;
            return true;
        }else{
            return false;
        }
    }
    
    public void calcularDesempeño(){
        for (int i = 0; i < posActual; i++) {
            if (getDefinitiva(i)<6.5) {
                setDesempeño(i, "Bajo");
            }else{
                if (getDefinitiva(i)>=6.5 && getDefinitiva(i)<8) {
                    setDesempeño(i, "Basico");
                }else{
                    if (getDefinitiva(i)>=8 && getDefinitiva(i)<9.5) {
                        setDesempeño(i, "Alto");
                    }else{
                        setDesempeño(i, "Superior");
                    }
                }
            }
        }
    }
    
    public String mostrarResultados() {
        String resultados = "";

        for (int i = 0; i < posActual; i++) {
            resultados += String.valueOf("Estudiante " + (i + 1) + "\n"
                    + "Cognitiva: " + getCognitivo(i) + "\n"
                    + "Social: " + getSocial(i) + "\n"
                    + "Personal: " + getPersonal(i) + "\n"
                    + "Definitiva: " + getDefinitiva(i) + "\n"
                    + "Desempeño: " + getDesempeño(i) + "\n\n");
        }
        return resultados;
    }
    
    
}
