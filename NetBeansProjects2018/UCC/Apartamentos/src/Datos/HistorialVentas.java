package Datos;

public final class HistorialVentas {
    private casa[] Ventas;
    private int pos;
    
    private static HistorialVentas instancia=new HistorialVentas();

    private HistorialVentas() {
        Ventas=new casa[100];
        pos=0;
        for (int i = 0; i < 100; i++) {
            setVentas(i, null);
        }
    }

    public casa getVentas(int p) {
        return Ventas[p];
    }

    public void setVentas(int p, casa Ventas) {
        this.Ventas[p] = Ventas;
    }
    
    public static HistorialVentas getInstance(){
        return instancia;
    }
    
    public boolean agregar(casa cas){
        if (pos<100) {
            setVentas(pos, cas);
            pos++;
            return true;
        }
        return false;
    }
    
    
    
    
    
}
