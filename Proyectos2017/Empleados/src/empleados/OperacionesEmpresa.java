/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class OperacionesEmpresa {

    public OperacionesEmpresa() {
    }
    
    private int CantidadEmpleados;
    DatosEmpleados Informacion[];

    public int getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(int CantidadEmpleados) {
        this.CantidadEmpleados = CantidadEmpleados;
        Informacion=new DatosEmpleados[CantidadEmpleados];
    }

    public DatosEmpleados getInformacion(int Pos) {
        return Informacion[Pos];
    }

    public void setInformacion(int Pos, DatosEmpleados Val) {
        this.Informacion[Pos] = Val;
    }
    
    private void Cambiar(int pos1, int pos2){
        DatosEmpleados Temp;
        Temp=getInformacion(pos1);
        setInformacion(pos1, getInformacion(pos2));
        setInformacion(pos2, Temp);
    }
    
    public int busqueda(int dato){
        int i, posicion;
        posicion=-1;
        i=0;
        while(i<=getCantidadEmpleados()-1 && posicion==-1){
            if(getInformacion(i).getIdentificacion()==dato || getInformacion(i).getCelular()==dato){
                posicion=i;
            }else{
                i=i+1;
            }
        }
        return posicion;
    }
     
    private void Ordenar(){
        int salto, i;        
        for(salto=getCantidadEmpleados()/2; salto!=0; salto/=2){            
                for(i=salto; i<getCantidadEmpleados(); i++){
                    if(getInformacion(i-salto).getCiudad().compareTo(getInformacion(i).getCiudad()) > 0){
                       Cambiar(i, (i-salto));
                    }
                }
        }
    }
    
    public String ListadoCiudad(){
        Ordenar();
        String Listado="";
        for(int i=0; i<getCantidadEmpleados(); i++){
            Listado+=getInformacion(i).getCiudad()+"    2"+getInformacion(i).getIdentificacion()+"    "+getInformacion(i).getNombre()
            +"    "+getInformacion(i).getCelular()+"    "+getInformacion(i).getEdad()+"\n";
        }
        return Listado;
    }
    
    public String ListadoEdades(){
        String Listado="";
        int cantidadBogotá=0, cantidadBarranquilla=0, cantidadCali=0, cantidadMedellín=0;
        int HBogota=0,MBogota=0, HBarranquilla=0,MBarranquilla=0, HCali=0,MCali=0, HMedellin=0,MMedellin=0;
        for(int i=0; i<getCantidadEmpleados(); i++){
            if((getInformacion(i).getEdad())>=30 && getInformacion(i).getEdad()<=40){
                if(getInformacion(i).getCiudad().equals("Bogotá")){
                    cantidadBogotá++;
                    if(getInformacion(i).getSexo().equals("M")){
                        HBogota++;
                    }else{
                        MBogota++;
                    }
                }if(getInformacion(i).getCiudad().equals("Barranquilla")){
                    cantidadBarranquilla++;
                    if(getInformacion(i).getSexo().equals("M")){
                        HBarranquilla++;
                    }else{
                        MBarranquilla++;
                    }
                }if(getInformacion(i).getCiudad().equals("Cali")){
                    cantidadCali++;
                    if(getInformacion(i).getSexo().equals("M")){
                        HCali++;
                    }else{
                        MCali++;
                    }
                }if(getInformacion(i).getCiudad().equals("Medellín")){
                    cantidadMedellín++;
                    if(getInformacion(i).getSexo().equals("M")){
                        HMedellin++;
                    }else{
                        MMedellin++;
                    }
                }
            }
        }
        
        Listado+= "Bogotá: "+cantidadBogotá+"\n     Hombres: "+HBogota+ " Mujeres: "+MBogota+"\n\n"
                +"Barranquilla: "+cantidadBarranquilla+"\n     Hombres: "+HBarranquilla+ " Mujeres: "+MBarranquilla+"\n\n"
                +"Cali: "+cantidadCali+"\n     Hombres: "+HCali+ " Mujeres: "+MCali+"\n\n"
                +"Medellín: "+cantidadMedellín+"\n     Hombres: "+HMedellin+ " Mujeres: "+MMedellin;
        
        return Listado;
    }
    
    public String listadoJoven(){
        String Listado="";
        int bogota=-1, barranquilla=-1, cali=-1, medellin=-1 ;
        for(int i=1; i<getCantidadEmpleados(); i++){
            if(getInformacion(i-1).getCiudad().equals("Bogotá") && getInformacion(i-1).getEdad()<=getInformacion(i).getEdad()){
                bogota=i-1;
            }
            if(getInformacion(i-1).getCiudad().equals("Barranquilla") && getInformacion(i-1).getEdad()<=getInformacion(i).getEdad()){
                barranquilla=i-1;
            }
            if(getInformacion(i-1).getCiudad().equals("Cali") && getInformacion(i-1).getEdad()<=getInformacion(i).getEdad()){
                cali=i-1;
            }
            if(getInformacion(i-1).getCiudad().equals("Medellín") && getInformacion(i-1).getEdad()<=getInformacion(i).getEdad()){
                medellin=i-1;
            }
        }
        if(bogota!=-1){
            Listado+="Bogota: "+getInformacion(bogota).getNombre()+"   "+getInformacion(bogota).getEdad()+"\n";
        }
        if(barranquilla!=-1){
            Listado+="Barranquilla: "+getInformacion(barranquilla).getNombre()+"   "+getInformacion(barranquilla).getEdad()+"\n";
        }if(cali!=-1){
            Listado+="Cali: "+getInformacion(cali).getNombre()+"   "+getInformacion(cali).getEdad()+"\n";
        }
        if(medellin!=-1){
            Listado+="Medellin: "+getInformacion(medellin).getNombre()+"   "+getInformacion(medellin).getEdad()+"\n";
        }
        return Listado;
    }
    
    public String Listadoviejos(){
        String Listado="";
        int bogota=-1, barranquilla=-1, cali=-1, medellin=-1 ;
        for(int i=1; i<getCantidadEmpleados(); i++){
            if("Bogotá".equals(getInformacion(i-1).getCiudad()) && getInformacion(i-1).getEdad()>=getInformacion(i).getEdad()){
                bogota=i-1;
            }
            if("Barranquilla".equals(getInformacion(i-1).getCiudad()) && getInformacion(i-1).getEdad()>=getInformacion(i).getEdad()){
                barranquilla=i-1;
            }
            if("Cali".equals(getInformacion(i-1).getCiudad()) && getInformacion(i-1).getEdad()>=getInformacion(i).getEdad()){
                cali=i-1;
            }
            if("Medellín".equals(getInformacion(i-1).getCiudad()) && getInformacion(i-1).getEdad()>=getInformacion(i).getEdad()){
                medellin=i-1;
            }
        }
        if(bogota!=-1){
            Listado+="Bogota: "+getInformacion(bogota).getNombre()+"   "+getInformacion(bogota).getEdad()+"\n";
        }
        if(barranquilla!=-1){
            Listado+="Barranquilla: "+getInformacion(barranquilla).getNombre()+"   "+getInformacion(barranquilla).getEdad()+"\n";
        }
        if(cali!=-1){
            Listado+="Cali: "+getInformacion(cali).getNombre()+"   "+getInformacion(cali).getEdad()+"\n";
        }
        if(medellin!=-1){
            Listado+="Medellin: "+getInformacion(medellin).getNombre()+"   "+getInformacion(medellin).getEdad()+"\n";
        }
        return Listado;
    }
    
    public float pocentajeMenores30(){
        float porcentaje; 
        float cantidad=0;
        for(int i=0; i<=getCantidadEmpleados()-1; i++){
            if(getInformacion(i).getEdad()<=30){
                cantidad++;
            }
        }
        porcentaje=cantidad/getCantidadEmpleados();
        porcentaje*=100;
        return porcentaje;
    }
}
