package nomina;



public class nomina_1 {

    private String empleado[];
    private int horas[];
    private float hvalor[];
    float salario[];
    float[] SalarioTotal;
    
    int tamaño;
    
    public void setsalario(int pos,float ele){
        salario[pos] =ele;
    }
    public float getsalario(int pos){
        return salario[pos];
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tam) {
        this.tamaño = tam;
        this.empleado =new String[tam];
        this.horas=new int[tam];
        this.hvalor =new float[tam];
        this.salario=new float[tam];
        this.SalarioTotal=new float[tam];
    }

    public String getEmpleado(int pos) {
        return empleado[pos];
    }

    public void setEmpleado(int pos, String val) {
        empleado[pos] = val;
    }

    public int gethoras(int pos) {
        return horas[pos];
    }

    public void sethoras(int pos, int val) {
        horas[pos] = val;
    }

    public float gethvalor(int pos) {
        return hvalor[pos];
    }

    public void sethvalor(int pos, float val) {
        hvalor[pos] = val;

    }
    public void setSalarioTotal(int pos,float val){
        SalarioTotal[pos]=val;
    }
    public float getSalarioTotal(int pos){
        return SalarioTotal[pos];
    }
    

    
     public void calcularsalario(){
        float sal;
         for(int i=0;i<getTamaño();i++){
             sal=(gethoras(i)*gethvalor(i));
             setsalario(i,sal);
         }
         
     }
      //METODO PARA ASIGNAR EL VALOR DEL SUBSIDIO DE TRANSPORTE POR EMPLEADO
    public void salariototal(){
        float temp;
        for(int i=0;i<getTamaño();i++){
           temp=(getsalario(i)+83140)-Descuento(i);
            setSalarioTotal(i, temp);
                      
        }    
         
     }
    
    private float Descuento(int pos){
        float Descuento=(float) (getsalario(pos)*0.8);
        return  Descuento;
    }

    
 public float totalnomina(){
    float total=0;            
    for(int i=0; i<getTamaño(); i++){
        total+=getSalarioTotal(i);
    }
    return total;
 }
 
 public int Buscar(String dato){
     int Pos=-1;
     for(int i=0; i<getTamaño(); i++){
         if(dato.toUpperCase().equals(getEmpleado(i).toUpperCase())){
             Pos=i;
         }
     }
     return Pos;
 }
 
}
 
    