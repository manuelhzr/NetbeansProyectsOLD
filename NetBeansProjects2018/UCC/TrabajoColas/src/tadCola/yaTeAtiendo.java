package tadCola;

public class yaTeAtiendo {
    private int Atendidos=0;
    private int tamañoMedio=0;
    private int divisor=0;
    private int tamañoMaximo=0;
    private int tiempoMaxEspera=0;
    private double tiempoCuartoOperador=0;
    
    private TadCola ColaEstudiantes;
    

    public yaTeAtiendo() {
        ColaEstudiantes=new TadCola();
    }

    public int getAtendidos() {
        return Atendidos;
    }

    public void setAtendidos(int Atendidos) {
        this.Atendidos = Atendidos;
    }

    public int getTamañoMedio() {
        return tamañoMedio;
    }

    public void setTamañoMedio(int tamañoMedio) {
        this.tamañoMedio = tamañoMedio;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getTamañoMaximo() {
        return tamañoMaximo;
    }

    public void setTamañoMaximo(int tamañoMaximo) {
        this.tamañoMaximo = tamañoMaximo;
    }

    public int getTiempoMaxEspera() {
        return tiempoMaxEspera;
    }

    public void setTiempoMaxEspera(int tiempoMaxEspera) {
        this.tiempoMaxEspera = tiempoMaxEspera;
    }

    public double getTiempoCuartoOperador() {
        return tiempoCuartoOperador;
    }

    public void setTiempoCuartoOperador(double tiempoCuartoOperador) {
        this.tiempoCuartoOperador = tiempoCuartoOperador;
    }
    
    int inicio;
    public void inicioDeCola(){
        int min=(int) (Math.random()*100);
        inicio=min;
        inicio+=(int)(Math.random()*100);
        setTamañoMedio(inicio);
        for (int i = 0; i < inicio; i++) {
            agregarACola();
        }
    }
    
    private void calcularTamMaximo(int tamAct){
        if (getTamañoMaximo()<=tamAct) {
            setTamañoMaximo(tamAct);
        }
    }
    
    private void setPromedioCola(int tam, int cant){
        setTamañoMedio(getTamañoMedio()+tam);
        setDivisor(cant);
    }
    
    public float getPromedioCola(){
        return (getTamañoMedio()/getDivisor());
    }
    
    int cont=1;
    public void agregarACola(){
        ColaEstudiantes.encolar(ColaEstudiantes.numElemCola()+1, cont);
        cont++;
        calcularTamMaximo(ColaEstudiantes.numElemCola());
        setPromedioCola(ColaEstudiantes.numElemCola(), getDivisor()+1);
        
    }
    
    public void sacarCola() throws ColaVacia{
        ColaEstudiantes.quitarPrimero();
        setAtendidos(getAtendidos()+1);
        setPromedioCola(ColaEstudiantes.numElemCola(), getDivisor()+1);
    }
    
    private void esperaMax(NodoCola nod, int i){
        if (nod.id==inicio) {
            setTiempoMaxEspera(i);
        }
    }
    
    public void correr() throws ColaVacia{
        for (int i = 0; i < 420; i++) {
            agregarACola();
            
            if (i%2==0) {
                esperaMax(ColaEstudiantes.getPrincipio(), i);
                sacarCola();
            }
            if (i%4==0) {
                esperaMax(ColaEstudiantes.getPrincipio(), i);
                sacarCola();
                esperaMax(ColaEstudiantes.getPrincipio(), i);
                sacarCola();
                if (ColaEstudiantes.numElemCola()>20) {
                    esperaMax(ColaEstudiantes.getPrincipio(), i);
                    sacarCola();
                    setTiempoCuartoOperador(getTiempoCuartoOperador()+4);
                }
            }
        }
    }
    
}
