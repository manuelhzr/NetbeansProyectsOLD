
public class MOVIMIENTOS {
    String fecha;
    String tipo_movimiento;
    String nombre_usuario;
    int identificacion_movimiento;
    float valor;
   

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getidentificacion_movimiento() {
        return identificacion_movimiento;
    }

    public void setidentificacion_movimiento(int identificacion_movimiento) {
        this.identificacion_movimiento = identificacion_movimiento;
    }

    public float getvalor() {
        return valor;
    }

    public void setvalor(float valor) {
        this.valor = valor;
    }
    
    public String getnombre_usuario() {
        return nombre_usuario;
    }

    public void setNombreUsuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    } 

    public String gettipo_movimiento() {
        return tipo_movimiento;
    }

    public void settipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }   
    
}
