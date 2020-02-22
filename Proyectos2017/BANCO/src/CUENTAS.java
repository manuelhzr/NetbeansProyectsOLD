
import javax.swing.JOptionPane;

//clase cuenta con sus atributos
public class CUENTAS {
    
    int dimension=0;
    int numero_cuenta=0;  
    int numero_movimientos=0;
    int posicion_actual=0;
    float saldo=0;
    String tipo_cuenta="";
//vector objeto de la clase MOVIMIENTOD
    MOVIMIENTOS transacciones[];
//clase clientes 
    CLIENTES datos_clientes;
    
//encapsulamiento de la clase clientes metodo get
   public CLIENTES getdatos_clientes() {
        return datos_clientes;
    }
//encapsulamiento de la clase clientes metodo set
    public void setDatosCliente(CLIENTES datos_clientes) {
        this.datos_clientes = datos_clientes;
    } 
//encapsulamiento del vector objeto de la clase MOVINENOS llamado transacciones metodo get
    public MOVIMIENTOS[] gettransacciones() {
        return transacciones;
    }
//encapsulamiento del vector objeto de la clase MOVINENOS llamado transacciones metodo set
    public void settransacciones(int pos,MOVIMIENTOS transacciones) {
        this.transacciones[pos] = transacciones;
    }
//creacion del vector objeto TRANSACCIONES
    public void vector_transacciones() {
        
        transacciones = new MOVIMIENTOS[dimension];
    }

//encapsulamiento de las variables de la clase cuenta con sus metodos get y set 
    public int getnumero_cuenta() {
        return numero_cuenta;
    }

    public void setnumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    } 
    
    public float getsaldo() {
        return saldo;
    }

    public void setsaldo(float saldo) {
        this.saldo = saldo;
    } 
    
    public int getnumero_movimientos() {
        return numero_movimientos;
    }

    public void setnumero_movimientoss(int numero_movimientos) {
        this.numero_movimientos = numero_movimientos;
    }

    public String gettipo_cuenta() {
        return tipo_cuenta;
    }

    public void settipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }
    
    public int getposicion_actual() {
        return posicion_actual;
    }

    public void setposicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }
    public int getdimension() {
        return dimension;
    }

    public void setdimension(int dimension) {
        this.dimension = dimension;
    }
    //final del encapsulamiento de las variables de la clase cuenta

    //creacion del metodo movimiento para almacenar los movimientos de la cuenta
   public void movimientos (MOVIMIENTOS movimiento){
        
       vector_transacciones();
        for(int i=0;i<getdimension();i++){
            movimiento=new MOVIMIENTOS();
            //instancia de la clase movimiento
            int ide_movimiento =Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO PARA EL MOVIMIENTO DE LA CUENTA"));
            movimiento.setidentificacion_movimiento(ide_movimiento);
            
            String fecha_movimiento = JOptionPane.showInputDialog("INGRESE LA FECHA DEL MOVIMIENTO");
            movimiento.setfecha(fecha_movimiento);
            
            String tipo_movimiento = JOptionPane.showInputDialog("INGRESE EL TIPO DE MOVIMIENTO");
            movimiento.settipo_movimiento(tipo_movimiento);
            
             String nombre_usuario = JOptionPane.showInputDialog("DIGITE NOMBRE DE CLIENTE");
            movimiento.setNombreUsuario(nombre_usuario);
            
            float valor_movimiento = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL VALOR DE LA TRANSACCION"));
            movimiento.setvalor(valor_movimiento);
            
            settransacciones(i, movimiento);
            
        }
   }
        //creacion del metodo consignar cuenta el cual agrega saldo a la cuenta buscada
        public void consignar_cuenta (int cuenta, MOVIMIENTOS movimientos, BANCO bancos){
        //parametro de busqueda 
        int buscar= bancos.buscar_cuenta(cuenta);
        float consignar;
        //metodo que suma el saldo ingresado en la variable saldo 
        if(buscar !=  -1){
             movimientos(movimientos);
             for(int i=0;i<getdimension();i++){
             consignar= bancos.lista_cuentas[buscar].getsaldo() + transacciones[i].getvalor();
             bancos.lista_cuentas[buscar].setsaldo(consignar);
             bancos.lista_cuentas[buscar].numero_movimientos++;
             }
             JOptionPane.showMessageDialog(null, "SALDO:: "+bancos.lista_cuentas[buscar].getsaldo());
        }else{
            //retorna un mensaje si la cuenta no es encontrada
            JOptionPane.showMessageDialog(null, "SU CUENTA NO HA SIDO ENCONTRADO" );
        }
    }
      //metodo para retitar saldo de las cuentas por parametro se decuenta el valor pasado por el teclado 
        public void retiro_cuenta(int cuenta, MOVIMIENTOS movimientos, BANCO bancos){
        //parametro de la cuenta a buscar
        int buscar= bancos.buscar_cuenta(cuenta);
        float retirar;
        if(buscar !=  -1){
        movimientos(movimientos);
        //metodo que resta la variable y le suma un punto al numero de movimentos que tenga una cuenta 
           for(int i=0;i<getdimension();i++){
              if(transacciones[i].getvalor()<bancos.lista_cuentas[buscar].getsaldo()){
                retirar= bancos.lista_cuentas[buscar].getsaldo() - transacciones[i].getvalor();
                bancos.lista_cuentas[buscar].setsaldo(retirar);
                bancos.lista_cuentas[buscar].numero_movimientos++;
             }else{
                  //mensaje si no tiene saldo disponible
               JOptionPane.showMessageDialog(null,"NO TIENE SALDO PARA REALIZAR EL RETIRO");
           }
           }
           //mensaje con el saldo actualizado del clliente
             JOptionPane.showMessageDialog(null, "SU SALDO ES: "+bancos.lista_cuentas[buscar].getsaldo());
        }else{
            //mensaje si su cuenta no fue encontrada por el parametro 
            JOptionPane.showMessageDialog(null, "SU CUENTA NO FUE ENCONTRADA" );
        }
    } 
 //metodo para sumar el numero de moviemintos de una cuenta
        public void movimientos(int cuenta, BANCO bancos  ){
        int buscar= bancos.buscar_cuenta(cuenta);
            if(buscar !=  -1){
            JOptionPane.showMessageDialog(null," NUMERO DE MOVIMIENTOS ES:: "+bancos.lista_cuentas[buscar].numero_movimientos);
            //mensaje que muestra el numero de movimientos
        }else{
            JOptionPane.showMessageDialog(null, "NO EXISTE LA CUENTA" );
       }
    }
    
}

