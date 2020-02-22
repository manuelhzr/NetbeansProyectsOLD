
package claselogica;


public class Notas {

    public Notas() {
    }
    
    private float notaIndependiente, quiz, parcial;

    public void setNotaIndependiente(float trabajo, float expocicion) {
        notaIndependiente = (trabajo + expocicion)/2;
    }

    public void setQuiz(float quiz) {
        this.quiz = quiz;
    }

    public void setParcial(float parcial) {
        this.parcial = parcial;
    }
    
    public float notafinal(){
        float notafinal;
        notafinal= (float) ((notaIndependiente*0.4)+(quiz*0.3)+(parcial*0.3));
        return notafinal;
    }
    
    public String Mensaje(){
        String sms="";
        if(notafinal()<2){
            sms="Debe dedicarle más tiempo a la asignatura";
        }
        if(notafinal()>=2 && notafinal()<=2.5){
            sms ="Con esfuerzo extra mejorará en el curso";
        }
        if(notafinal()>=2.6 && notafinal()<=2.9){
            sms="Animo usted puede mejorar";
        }
        if(notafinal()>=3 && notafinal()<=3.5){
            sms="Buen trabajo, pero puede ser mejor";
        }
        if(notafinal()>=3.6 && notafinal()<=4){
            sms="Buen trabajo";
        }
        if(notafinal()>=4.1 && notafinal()<=4.5){
            sms="Muy buen trabajo";
        }
        if(notafinal()>4.5){
            sms="Exelente trabajo";
        }
        return sms;
    }
}
