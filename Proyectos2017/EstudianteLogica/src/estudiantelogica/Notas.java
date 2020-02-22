package estudiantelogica;

public class Notas {
    private float Np1;
    private float Np2;
    private float Np3;
    private float Examen;
    private float trabajo;

    public Notas() {
    }

    public float getNp1() {
        return Np1;
    }

    public void setNp1(float Np1) {
        this.Np1 = Np1;
    }

    public float getNp2() {
        return Np2;
    }

    public void setNp2(float Np2) {
        this.Np2 = Np2;
    }

    public float getNp3() {
        return Np3;
    }

    public void setNp3(float Np3) {
        this.Np3 = Np3;
    }

    public float getExamen() {
        return Examen;
    }

    public void setExamen(float Examen) {
        this.Examen = Examen;
    }

    public float getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(float trabajo) {
        this.trabajo = trabajo;
    }
    
    public float PromedioParciales(){
        float prom;
        prom=(getNp1()+getNp2()+getNp3())/3;
        return prom;
    }
    
    public float Definitiva(){
        float definitiva;
        definitiva=(float) ((PromedioParciales()*0.55)+(getExamen()*0.3)+(getTrabajo()*0.15));
        return definitiva;
    }
    
}
