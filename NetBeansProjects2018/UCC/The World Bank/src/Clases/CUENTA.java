package Clases;


public class CUENTA {
    private int Nrocuenta;
    private String tipocuenta;
    private CLIENTE datoscliente;
    private float saldo;
    private MOVIMIENTO [] transacciones;
    private int  Nmovimiento;
    private int Posicionactual;

    public CUENTA() {
        Posicionactual=0;
    }

    public int getNrocuenta() {
        return Nrocuenta;
    }

    public void setNrocuenta(int Nrocuenta) {
        this.Nrocuenta = Nrocuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public CLIENTE getDatoscliente() {
        return datoscliente;
    }

    public void setDatoscliente(CLIENTE datoscliente) {
        this.datoscliente = datoscliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public MOVIMIENTO getTransacciones(int pos) {
        return transacciones[pos];
    }

    public void setTransacciones(int pos, MOVIMIENTO transacciones) {
        this.transacciones[pos] = transacciones;
    }

    public int getNmovimiento() {
        return Nmovimiento;
    }

    public void setNmovimiento(int Nmovimiento) {
        this.Nmovimiento = Nmovimiento;
        transacciones =new MOVIMIENTO[Nmovimiento];
    }

    public int getPosicionactual() {
        return Posicionactual;
    }

    public void setPosicionactual(int Posicionactual) {
        this.Posicionactual = Posicionactual;
    }
    
    public void Consignaciones(float Valor, MOVIMIENTO obj){
        
        if (getPosicionactual()<getNmovimiento()) {
            setSaldo(getSaldo()+Valor);
            setTransacciones(getPosicionactual(), obj);
            setPosicionactual(getPosicionactual()+1);
        }
    }
    
    public void Retiro(float cantidad, MOVIMIENTO obj){
        
        if (cantidad<=saldo){
            if (getPosicionactual()<getNmovimiento()) {
                setSaldo(getSaldo()-cantidad);
                setTransacciones(getPosicionactual(), obj);
                setPosicionactual(getPosicionactual()+1);
            }
        }
    }
    
    public float ConsultarSaldo(int numCuneta){
        float sal=-1;
        if(getNrocuenta()==numCuneta){
            sal=getSaldo();
        }
        return sal;
    }
    
    public MOVIMIENTO[] consultarTransacciones(int numCuenta){
        MOVIMIENTO vect[]=null;
        if(getNrocuenta()==numCuenta){
            vect=transacciones;
        }
        return vect;
    }
    
    
}
