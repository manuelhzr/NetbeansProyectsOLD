
package imc;


public class MasaCorporal {

    public MasaCorporal() {
    }
    private float Peso, Altura;

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getPeso() {
        return Peso;
    }

    public float getAltura() {
        return Altura;
    }
    
    public float IMC(){
        float IMC;
        IMC= Peso/(Altura*Altura);
        return IMC;
    }
    
   }
