/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordivisas;

import Conversion.convertDolar;
import Conversion.convertEuro;
import Conversion.convertPeso;
import Conversion.convertYen;
import Divisas.Dolar;
import Divisas.Euro;
import Divisas.Peso;
import Divisas.Yen;

/**
 *
 * @author manue
 */
public final class Facade {
    private convertDolar aDolar;
    private convertEuro aEuro;
    private convertPeso aPeso;
    private convertYen aYen;
    
    private static Facade singleton=new Facade();

    private Facade() {
        
    }

    public static Facade getSingleton() {
        return singleton;
    }

    public convertDolar getaDolar() {
        return aDolar;
    }

    public void setaDolar(double val, Dolar d, Euro e, Peso p, Yen y) {
        if (d!=null) {
            aDolar=new convertDolar(val, d);
        }else{
            if (e!=null) {
                aDolar=new convertDolar(val, e);
            }else{
                if (p!=null) {
                    aDolar=new convertDolar(val, p);
                }else{
                    if (y!=null) {
                        aDolar=new convertDolar(val, y);
                    }
                }
            }
        }
    }

    public convertEuro getaEuro() {
        return aEuro;
    }

    public void setaEuro(double val, Dolar d, Euro e, Peso p, Yen y) {
        if (d!=null) {
            aEuro=new convertEuro(val, d);
        }else{
            if (e!=null) {
                aEuro=new convertEuro(val, e);
            }else{
                if (p!=null) {
                    aEuro=new convertEuro(val, p);
                }else{
                    if (y!=null) {
                        aEuro=new convertEuro(val, y);
                    }
                }
            }
        }
    }

    public convertPeso getaPeso() {
        return aPeso;
    }

    public void setaPeso(double val, Dolar d, Euro e, Peso p, Yen y) {
        if (d!=null) {
            aPeso=new convertPeso(val, d);
        }else{
            if (e!=null) {
                aPeso=new convertPeso(val, e);
            }else{
                if (p!=null) {
                    aPeso=new convertPeso(val, p);
                }else{
                    if (y!=null) {
                        aPeso=new convertPeso(val, y);
                    }
                }
            }
        }
    }

    public convertYen getaYen() {
        return aYen;
    }

    public void setaYen(double val, Dolar d, Euro e, Peso p, Yen y) {
        if (d!=null) {
            aYen=new convertYen(val, d);
        }else{
            if (e!=null) {
                aYen=new convertYen(val, e);
            }else{
                if (p!=null) {
                    aYen=new convertYen(val, p);
                }else{
                    if (y!=null) {
                        aYen=new convertYen(val, y);
                    }
                }
            }
        }
    }
    
}
