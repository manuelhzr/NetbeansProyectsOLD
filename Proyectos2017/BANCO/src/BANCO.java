
import javax.swing.JOptionPane;

//clase banco con los atributos de la clase 
public class BANCO { 
    int dimension=0;
    String direccion="";
    String nom_gerente="";
    String correo="";
    String telefono="";
    //vector objeto de la CLASE CUENTAS
    CUENTAS lista_cuentas[];


//dimension de la clase
public int getdimension() {
        return dimension;
    }

    public void setdimension(int dimension) {
         this.dimension = dimension; 
    }
//encapsulamiento del vector objeto lista cuentas
    public CUENTAS getlista_cuenta(int pos) {
        return lista_cuentas[pos];
    }
//encapsulamiento de la clase CLIENTES
    public void setlista_cuentas(int pos, CLIENTES datos_clientes) {
      
        this.lista_cuentas[pos].datos_clientes= datos_clientes;
    }
//encapsulamiento de la clase cuentas
    public void setlista_cuentas(int pos, CUENTAS lista_cuentas) {
        this.lista_cuentas[pos] = lista_cuentas;
      
    }
//creacon del vector listacuentas
    public void vector_lista_cuentas(){
      
         lista_cuentas = new CUENTAS[getdimension()];
    }
//encapsulamiento de los atributos de la clase BANCO  
    public String getnom_gerente() {
        return nom_gerente;
    }

    public void setnom_gerente(String nom_gerente) {
        this.nom_gerente = nom_gerente;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }
    
      public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
//fin del encapsulamiento de los atributos de la CLASE BANCO
    
//metodo para ver los datos del BANCO
      public void ver_datos_banco(){
        String banco = "";
        banco = banco + String.valueOf("NOMBRE DEL GERENTE:: "+getnom_gerente()+"\n" +"TELEFONO:: "+gettelefono()+"\n"+"CORREO ELECTRONICO:: "+getcorreo()+"\n" +"DIRECCION:: "+getdireccion());
        JOptionPane.showMessageDialog(null, "INFORMACION DEL BANCO"+"\n"+banco );
    }
      
//metodo para pedir los datos del banco y guardarlos por teclado con la interface JoptionPane
      public void datos_banco(){
        
        String nombre=JOptionPane.showInputDialog("**DIGITE EL NOMBRE DEL GERENTE**");
        setnom_gerente(nombre);
        
        String telefono=JOptionPane.showInputDialog("**DIGITE UN NUMERO TELEFONICO**");
        settelefono(telefono);
        
        String direccion=JOptionPane.showInputDialog("**DIGITE LA DIRECCION**");
        setdireccion(direccion);
        
        String correo=JOptionPane.showInputDialog("**DIGITE SU E_MAIL**");
        setcorreo(correo);   
    } 

//metodo para crear cuentas y suarios a la vez

    public void crear_cuentas(CUENTAS cuentas, CLIENTES clientes){
    CUENTAS aux = new CUENTAS();
    vector_lista_cuentas();
  
        for(int i = 0;i<getdimension();i++){
         cuentas = new CUENTAS();
         clientes = new CLIENTES();
         
        int numero_cuenta = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA CUENTA"));
        cuentas.setnumero_cuenta(numero_cuenta);
        
        String tipo_cuenta = JOptionPane.showInputDialog("QUE TIPO DE CUENTA ES");
        cuentas.settipo_cuenta(tipo_cuenta);
           
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL MONTO INICIAL EN PESOS CON EL QUE SE INICIARA SU CUENTA"));
        cuentas.setsaldo(saldo);
        
        String nombre= JOptionPane.showInputDialog("DIGITE NOMBRE DEL CLIENTE");
        clientes.setnombre(nombre);
        
        String identificacion = JOptionPane.showInputDialog("DIGITE IDENTIFICACION DEL CLIENTE");
        clientes.setidentificacion_cliente(identificacion);
        
        String telefono= JOptionPane.showInputDialog("DIGITE EL TELEFONO DEL CLIENTE");
        clientes.settelefono(telefono);
        
        String correo= JOptionPane.showInputDialog("DIGITE EL CORREO DEL CLIENTE");
        clientes.setcorreo(correo);
        //en el metodo set se pasan las posiciones y los datos de cuentas y clientes
        setlista_cuentas(i, cuentas);
        setlista_cuentas(i, clientes);
    }
}
   //metodo al cual se le pasa por parametro el metodo buscar_cuenta y el numero de la cuenta
    public int  buscar_cuenta(int parametro){
    
        //se declara pos en -1 para q siempre busque valores positivos
        int pos=-1;
        int i=0;
        //se inicilaiza i desde cero para realizar las iteraciones
        while(i<= getdimension()-1 && (pos==-1)){
        //mientras i sea menor igual que el grande del vector y la posicion sea positivo
            if(lista_cuentas[i].getnumero_cuenta() == parametro){
                pos=i;
            }else{
                i=i+1;
            }
        }return pos;
        //se retorna la posicion encontrada
    }
    
  //metodo para consultar cuentas 
    public void consultar_cuentas(BANCO bancos){
        bancos = new BANCO();
        //se pasa el paramtro de busqueda en este caso el numero de la cuenta 
        int parametro = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LA CUENTA A BUSCAR:: ")); 
        int pos = bancos.buscar_cuenta(parametro); 
                     String datos_cuenta="";      
         if(pos != -1){ 
         //se muestrab los datos en un valueOf de java con todos los datos necesarios en el numero de cuenta encontrado
         datos_cuenta = datos_cuenta + String.valueOf("NUMERO DE LA CUENTA: "+bancos.lista_cuentas[pos].getnumero_cuenta()+"\n" +"TIPO DE CUENTA: "+bancos.lista_cuentas[pos].gettipo_cuenta()+"\n"
         +"SALDO DE LA CUENTA: "+bancos.lista_cuentas[pos].getsaldo()+"\n" +"NMBRE CLIENTE: "+bancos.lista_cuentas[pos].datos_clientes.getnombre()+"\n" +"NUMERO DE MOVIMIENTOS::"+bancos.lista_cuentas[pos].numero_movimientos);
        JOptionPane.showMessageDialog(null,"IMFORMACION DE LA CUENTA"+"\n" +datos_cuenta);
             }else{ 
        //si el parametro no es encontrado se retorna un mensaje de cuenta no encontrada
        JOptionPane.showMessageDialog(null,"EL NUMERO DE LA CUENTA NO SE ENCUENTRA EN EL SISTEMA"); 
}       
}
    //metodo para eliminar cuenta de tipo booleano true or false 
      public boolean eliminar_cuenta() {
        
       //se inicializa un parametro booleano en false 
        boolean parametro = false;
       //se inicializa el vector hasta q sea menor q la dimension 
        for (int i = 0; i < getdimension(); i++) {            
                for (int j = i; j < getdimension() - 1; j++) {
                    lista_cuentas[j] = lista_cuentas[j+1];
                }
                    lista_cuentas[getdimension() - 1] = null;
                    //retorna el parametro verdadero 
                    parametro = true;
            }return parametro;
    }
}