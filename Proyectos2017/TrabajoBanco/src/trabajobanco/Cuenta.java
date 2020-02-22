/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajobanco;

/**
 *
 * @author manue
 */
public class Cuenta {
    private int numcuenta;
    private String tipocuenta;
    private Clientes datoscliente;
    private float saldo;
    private Movimiento [] transacciones;
    private int  nmovimiento;
    private int posicionactual;

    public Cuenta() {
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public Clientes getDatoscliente() {
        return datoscliente;
    }

    public void setDatoscliente(Clientes datoscliente) {
        this.datoscliente = datoscliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Movimiento getTransacciones(int pos) {
        return transacciones[pos];
    }

    public void setTransacciones(int pos, Movimiento transacciones) {
        this.transacciones[pos] = transacciones;
    }

    public int getNmovimiento() {
        return nmovimiento;
    }

    public void setNmovimiento(int nmovimiento) {
        this.nmovimiento = nmovimiento;
        transacciones=new Movimiento[nmovimiento];
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(int posicionactual) {
        this.posicionactual = posicionactual;
    }
    
    public Movimiento[] movimientos(){
        return transacciones;
    }
    
    public void Consignar(float monto, Movimiento mov){
        if (getPosicionactual()<getNmovimiento()) {
            setSaldo(getSaldo()+monto);
            setTransacciones(getPosicionactual(), mov);
            setPosicionactual(getPosicionactual()+1);
        }
    }
    
    public void Retiro(float monto, Movimiento mov){
        if (monto<=saldo && getPosicionactual()<getNmovimiento()){
                setSaldo(getSaldo()-monto);
                setTransacciones(getPosicionactual(), mov);
                setPosicionactual(getPosicionactual()+1);
        }
    }
    
    public Movimiento consultarMov(int id){
        Movimiento res=null;
        for (int i = 0; i < getPosicionactual(); i++) {
            if (getTransacciones(i).getIdmoviento()==id) {
                res=getTransacciones(i);
            }
        }
        return res;
    }
}
