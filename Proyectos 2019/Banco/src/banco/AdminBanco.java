/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author rafael
 */
public class AdminBanco {

    private Cuenta[] cuentas;
    private int tamaño;

    public AdminBanco() {
    }

    public Cuenta getCuentas(int p) {
        return cuentas[p];
    }

    public void setCuentas(int p, Cuenta cuentas) {
        this.cuentas[p] = cuentas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        this.cuentas = new Cuenta[tamaño];
    }

    public boolean consignar(int numCuenta, float valor) {
        int p = buscar(numCuenta);
        if (p != -1) {
            cuentas[p].setSaldo(cuentas[p].getSaldo() + valor);
            return true;
        }
        
        return false;
    }

    public boolean retirar(int numCuenta, float valor) {

        int p = buscar(numCuenta);

        if (p != -1) {
            if (valor <= cuentas[p].getSaldo()) {
                cuentas[p].setSaldo(cuentas[p].getSaldo() - valor);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean editar(int NumCuenta, Cuenta nuevo){
        int p=buscar(NumCuenta);
        if (p!=-1) {
            setCuentas(p, nuevo);
            return true;
        }
        
        return false;
    }
    
    public String consultar(int NumCuenta){
        int p = buscar(NumCuenta);
        String datos="Cuenta no encontrada";
        if (p!=-1) {
            datos="Nombre: "+cuentas[p].getNombre()+"\n"
                    + "Identificacion: "+cuentas[p].getID()+"\n"
                    + "Numeros de cuenta: "+cuentas[p].getNumCuenta()+"\n"
                    + "Saldo: "+cuentas[p].getSaldo();
        }
        return datos;
    }

    private int buscar(int NumCuenta) {
        int p = -1;
        for (int i = 0; i < tamaño; i++) {
            if (NumCuenta == cuentas[i].getNumCuenta()) {
                p = i;
                break;
            }
        }
        return p;
    }

}
