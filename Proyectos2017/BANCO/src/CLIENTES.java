
import javax.swing.JOptionPane;

//clase clientes con sus atributos
public class CLIENTES {
   int dimension=0; 
   String nombre="";
   String identificacion_cliente="";
   String correo="";
   String telefono="";
   CLIENTES datos_clientes[];
   
   public CLIENTES() {
       datos_clientes = new CLIENTES[dimension];
    }
   
//encapsulamiento de la clase clientes con sus metodos get y set 
    public int getdimension() {
        return dimension;
    }

    public void setdimension(int dimension) {
        this.dimension = dimension;
    }

    public String getidentificacion_cliente() {
        return identificacion_cliente;
    }

    public void setidentificacion_cliente(String identificacion_cliente) {
        this.identificacion_cliente = identificacion_cliente;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
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
    //fin del encapsulamiento de la clase clientes
    
  //metodo para pedir los datos del cliente 
   void datos_clientes(){
       
       int dimension= Integer.parseInt(JOptionPane.showInputDialog("Cuantos clientes desea registrar"));
       setdimension(dimension);
       datos_clientes = new CLIENTES[dimension];
       for(int i=0;i<getdimension();i++){
           
       String nombre= JOptionPane.showInputDialog("**DIGITE UN NOMBRE DE CLIENTE**");
       setnombre(nombre);
       
       String identificacion= JOptionPane.showInputDialog("**DIGITE UNA IDENTIFICACION PERSONAL**");
       setidentificacion_cliente(identificacion);
       
       
       String telefono= JOptionPane.showInputDialog("**DIGITE UN TELEFONO**");
       settelefono(telefono);
       
       String correo= JOptionPane.showInputDialog("**DIGITE UN CORREO DE CLIENTE**");
       setcorreo(correo);
       
      
       
       }
   }
}

