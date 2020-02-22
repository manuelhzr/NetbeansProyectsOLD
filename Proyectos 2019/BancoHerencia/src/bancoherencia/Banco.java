/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoherencia;

import Cuentas.CuentaAhorros;
import Cuentas.CuentaInfantil;
import Cuentas.CuentaNomina;

/**
 *
 * @author manue
 */
public class Banco {
    public static final int maxCuentas = 25;
    
    private CuentaAhorros[] Ahorros;
    private CuentaInfantil[] Infantil;
    private CuentaNomina[] Nomina;

    public Banco() {

        Ahorros = new CuentaAhorros[maxCuentas];
        Infantil = new CuentaInfantil[maxCuentas];
        Nomina = new CuentaNomina[maxCuentas];
        
        iniciarCuentas();
    }

    private void iniciarCuentas() {
        for (int i = 0; i < maxCuentas; i++) {
            Ahorros[i] = null;
            Infantil[i] = null;
            Nomina[i] = null;
        }
    }

    public CuentaAhorros getAhorros(int pos) {
        return Ahorros[pos];
    }

    public void setAhorros(int pos, CuentaAhorros Ahorros) {
        this.Ahorros[pos] = Ahorros;
    }

    public CuentaInfantil getInfantil(int pos) {
        return Infantil[pos];
    }

    public void setInfantil(int pos, CuentaInfantil Infantil) {
        this.Infantil[pos] = Infantil;
    }

    public CuentaNomina getNomina(int pos) {
        return Nomina[pos];
    }

    public void setNomina(int pos, CuentaNomina Nomina) {
        this.Nomina[pos] = Nomina;
    }
    
    public int buscarAhorros(int numero){
        for (int i = 0; i < maxCuentas; i++) {
            if (getAhorros(i).getNumero()== numero) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int buscarInfantil(int numero){
        for (int i = 0; i < maxCuentas; i++) {
            if (getInfantil(i).getNumero()== numero) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int buscarNomina(int numero){
        for (int i = 0; i < maxCuentas; i++) {
            if (getNomina(i).getNumero()== numero) {
                return i;
            }
        }
        
        return -1;
    }
    
    public void InsertarAhorros(CuentaAhorros nuevo){
        for (int i = 0; i < maxCuentas; i++) {
            if (Ahorros[i]==null) {
                setAhorros(i, nuevo);
                break;
            }
        }
    }
    
        public void InsertarInfantil(CuentaInfantil nuevo){
        for (int i = 0; i < maxCuentas; i++) {
            if (Infantil[i]==null) {
                setInfantil(i, nuevo);
                break;
            }
        }
    }
            public void InsertarNomina(CuentaNomina nuevo){
        for (int i = 0; i < maxCuentas; i++) {
            if (Nomina[i]==null) {
                setNomina(i, nuevo);
                break;
            }
        }
    }
    
}
