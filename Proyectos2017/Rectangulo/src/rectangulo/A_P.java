
package rectangulo;


public class A_P {
    private float A;
    private float B;

    public A_P() {
    }

    public float getA() {
        return A;
    }

    public void setA(float A) {
        this.A = A;
    }

    public float getB() {
        return B;
    }

    public void setB(float B) {
        this.B = B;
    }
    
    public float Area(){
        return getA()*getB();
    }
    
    public float Perimetro(){
        return 2*(getA()+getB());
    }
}
